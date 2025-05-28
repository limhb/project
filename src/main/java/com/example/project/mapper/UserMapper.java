package com.example.project.mapper;

import java.util.List;

import com.example.project.vo.UserVO;

public interface UserMapper {
  List<UserVO> selectUsers();
  UserVO selectUser(int uiNum);
  UserVO selectUserById(String uiId);
  int insertUser(UserVO user);
  int updateUser(UserVO user);
  int deleteUser(int uiNum);
}
