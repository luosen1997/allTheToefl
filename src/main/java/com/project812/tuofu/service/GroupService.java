package com.project812.tuofu.service;

import com.project812.tuofu.pojo.Group;

import java.util.List;

public interface GroupService {
    String selectGroupId(Integer userId);

    List<Group> selectGroup(String ids);
}
