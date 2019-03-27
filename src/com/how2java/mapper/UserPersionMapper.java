package com.how2java.mapper;

import com.how2java.pojo.UserPersion;
import com.how2java.pojo.UserPersionExample;
import java.util.List;

public interface UserPersionMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(UserPersion record);

    int insertSelective(UserPersion record);

    List<UserPersion> selectByExample(UserPersionExample example);

    UserPersion selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(UserPersion record);

    int updateByPrimaryKey(UserPersion record);
}