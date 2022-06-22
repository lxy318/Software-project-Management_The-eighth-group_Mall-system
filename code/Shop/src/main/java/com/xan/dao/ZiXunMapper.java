package com.xan.dao;

import com.xan.pojo.ZiXun;
import com.xan.pojo.ZiXunExample;
import java.util.List;

public interface ZiXunMapper extends CrudDao<ZiXun> {

    List<ZiXun> selectByExample(ZiXunExample example);

    /**
     * 资讯审核
     * @param zid
     */
    void shenhe(int zid);

}