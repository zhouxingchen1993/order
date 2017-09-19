package com.htsat.order.dao;

import com.htsat.order.model.Money;
import com.htsat.order.model.MoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoneyMapper {
    int countByExample(MoneyExample example);

    int deleteByExample(MoneyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Money record);

    int insertSelective(Money record);

    List<Money> selectByExample(MoneyExample example);

    Money selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Money record, @Param("example") MoneyExample example);

    int updateByExample(@Param("record") Money record, @Param("example") MoneyExample example);

    int updateByPrimaryKeySelective(Money record);

    int updateByPrimaryKey(Money record);
}