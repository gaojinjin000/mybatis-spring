package com.gao.mytatis;

import com.gao.mybatis.dao.UserMapper;
import com.gao.mybatis.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 20170707365 on 2018/4/17.
 */
public class UserTest extends MybatisBase {


    @Autowired
    private UserMapper userMapper;

    @Test
    public void test_insertUser() {
        User user = new User();
        user.setUserName("gao");
        List<Integer> hobbiesList = new ArrayList<Integer>();
        hobbiesList.add(3);
        hobbiesList.add(4);
        user.setHobbiesList(hobbiesList);
//        String hobbies = "[\"1\",\"2\"]";
//        String hobbies = "[1,2]";
//        String hobbies = "数学";
//        user.setHobbies(hobbies);

        userMapper.insertUser(user);
    }

    @Test
    public void test_getUserById() {
        User user = userMapper.getUserById(3);
        System.out.println(user);
    }


}
