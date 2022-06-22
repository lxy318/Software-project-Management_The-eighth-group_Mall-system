package com.xan.dao;

import com.xan.pojo.Permission;
import com.xan.pojo.Role;
import com.xan.pojo.RoleExample;
import java.util.List;

public interface RoleMapper extends SysDao<Role> {

    List<Role> selectByExample(RoleExample example);

}