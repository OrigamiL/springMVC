package com.zhezhi.service;

import com.zhezhi.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    List<User> selectUserPage(String userName, String userSex, int startRow);
    int createUser(User user);
    int deleteUserById(String userId);
    int getRowCount(String userName, String userSex);
}
