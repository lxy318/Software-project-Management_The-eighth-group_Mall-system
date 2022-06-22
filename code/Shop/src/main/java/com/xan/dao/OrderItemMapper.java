package com.xan.dao;

import com.xan.pojo.OrderItem;
import com.xan.pojo.OrderItemExample;
import java.util.List;

public interface OrderItemMapper extends CrudDao<OrderItem>{

    List<OrderItem> selectByExample(OrderItemExample example);

}