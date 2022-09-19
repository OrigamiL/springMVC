package com.zhezhi.service;

import com.zhezhi.pojo.User;

import java.util.List;

public interface UserService {
    List<User> selectUserPage(String userName, String userSex, int startRow);
}
