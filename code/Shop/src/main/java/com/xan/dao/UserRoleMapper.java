package com.xan.dao;

import com.xan.pojo.UserRole;
import com.xan.pojo.UserRoleExample;
import java.util.List;

public interface UserRoleMapper extends SysDao<UserRole>{

    List<UserRole> selectByExample(UserRoleExample example);

}