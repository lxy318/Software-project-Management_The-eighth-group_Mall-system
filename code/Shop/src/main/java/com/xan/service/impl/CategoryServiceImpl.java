package com.xan.service.impl;

import com.xan.dao.CategoryMapper;
import com.xan.dao.ProductMapper;
import com.xan.pojo.Category;
import com.xan.service.CategoryService;
import com.xan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private ProductService productService;

    @Override
    public List<Category> list() {
        List<Category> categoryList = categoryMapper.selectByExample(null);
        return categoryList;
    }

    @Override
    public void save(Category category) {
        categoryMapper.insert(category);
    }

    @Override
    public void del(int id) {
        boolean cunzai = productService.findProByCid(id);
        if(!cunzai){
            categoryMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public Category get(int id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Category category) {
        categoryMapper.updateByPrimaryKeySelective(category);
    }


}
