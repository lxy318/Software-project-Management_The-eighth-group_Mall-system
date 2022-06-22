package com.xan.dao;

import com.xan.pojo.Category;
import com.xan.pojo.CategoryExample;
import java.util.List;

public interface CategoryMapper extends CrudDao<Category>{

     List<Category> selectByExample(CategoryExample example);

}