package com.gao.mybatis.model;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * Created by 20170707365 on 2018/4/17.
 */
public class User {
    private int userId;
    private String userName;
    private List<Integer> hobbiesList;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHobbies() {
        return JSON.toJSONString(hobbiesList);
    }

    public void setHobbies(String hobbies) {
        this.hobbiesList = JSON.parseArray(hobbies,Integer.class);
    }

    public List<Integer> getHobbiesList() {
        return hobbiesList;
    }

    public void setHobbiesList(List<Integer> hobbiesList) {
        this.hobbiesList = hobbiesList;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", hobbiesList=" + hobbiesList +
                '}';
    }
}
