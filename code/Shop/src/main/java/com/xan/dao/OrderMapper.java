package com.xan.dao;

import com.xan.pojo.Order;
import com.xan.pojo.OrderExample;
import java.util.List;

public interface OrderMapper extends CrudDao<Order>{

    List<Order> selectByExample(OrderExample example);

}