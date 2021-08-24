package com.project812.tuofu.service.impl;

import com.project812.tuofu.dao.GroupDao;
import com.project812.tuofu.pojo.Group;
import com.project812.tuofu.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    GroupDao groupDao;
    @Override
    public String selectGroupId(Integer userId) {
        return groupDao.selectGroupId(userId);
    }

    @Override
    public List<Group> selectGroup(String ids) {
        return groupDao.selectGroup(ids);
    }
}
