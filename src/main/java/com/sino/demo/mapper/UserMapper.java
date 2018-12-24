package com.sino.demo.mapper;

import com.sino.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper
{
    /**
     * 查询用户信息
     * @return
     */
    User queryUsersById(String id);
}
