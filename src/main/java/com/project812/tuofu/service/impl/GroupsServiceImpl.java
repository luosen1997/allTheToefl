package com.project812.tuofu.service.impl;

import com.project812.tuofu.dao.GroupsDao;
import com.project812.tuofu.pojo.Groups;
import com.project812.tuofu.service.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupsServiceImpl implements GroupsService {

    @Autowired
    GroupsDao groupsDao;

    @Override
    public List<Groups> getGroups(Groups groups) {
        return groupsDao.getGroups(groups);
    }

    @Override
    public void deleteGroups(String ids) {
        groupsDao.deleteGroups(ids);
    }
}
