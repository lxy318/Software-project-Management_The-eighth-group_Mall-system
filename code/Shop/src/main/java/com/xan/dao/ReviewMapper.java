package com.xan.dao;

import com.xan.pojo.Review;
import com.xan.pojo.ReviewExample;
import java.util.List;

public interface ReviewMapper extends CrudDao<Review>{

    List<Review> selectByExample(ReviewExample example);

}