package com.xan.dao;

import com.xan.pojo.RolePermission;
import com.xan.pojo.RolePermissionExample;
import java.util.List;

public interface RolePermissionMapper extends SysDao<RolePermission>{

    List<RolePermission> selectByExample(RolePermissionExample example);

}