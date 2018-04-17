package com.gao.mybatis.dao;

import com.gao.mybatis.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 20170707365 on 2018/4/17.
 */
public interface UserMapper {
        int insertUser(@Param("user") User user);

        User getUserById(@Param("id") int id);
}
