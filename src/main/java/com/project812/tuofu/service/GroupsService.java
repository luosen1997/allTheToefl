package com.project812.tuofu.service;

import com.project812.tuofu.pojo.Groups;

import java.util.List;

public interface GroupsService {
    List<Groups> getGroups(Groups groups);

    void deleteGroups(String ids);
}
