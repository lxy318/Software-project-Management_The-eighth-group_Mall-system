package com.xan.dao;

import com.xan.pojo.Permission;
import com.xan.pojo.PermissionExample;
import java.util.List;

public interface PermissionMapper extends SysDao<Permission>{

    List<Permission> selectByExample(PermissionExample example);

}