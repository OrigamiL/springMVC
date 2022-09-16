package com.zhezhi.mapper;

import com.zhezhi.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> selectUserPage(
            @Param("userName")
            String userName,
            @Param("userSex")
            String userSex,
            @Param("startRow")
            int startRow);
    //startRow需要算出来，(页数-1)*每页条数
    int createUser(User user);
    int deleteUserById(String userId);
    int getRowCount(
            @Param("userName")
            String userName,
            @Param("userSex")
            String userSex);
}
