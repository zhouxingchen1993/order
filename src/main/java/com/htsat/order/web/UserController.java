package com.htsat.order.web;

import com.htsat.order.dao.UsersMapper;
import com.htsat.order.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    UsersMapper usersMapper;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://CART-SERVICE/add?a=10&b=20", String.class).getBody();
    }

    @RequestMapping(value = "/getUser")
    public Users getUser(){
        return usersMapper.selectByPrimaryKey(38L);
    }

    @RequestMapping(value = "/delete")
    public int delete(){
        return usersMapper.deleteByPrimaryKey(37L);
    }

}
