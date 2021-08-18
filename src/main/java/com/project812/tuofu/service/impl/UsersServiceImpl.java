package com.project812.tuofu.service.impl;

import com.project812.tuofu.dao.UsersDao;
import com.project812.tuofu.pojo.Users;
import com.project812.tuofu.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersDao usersDao;
    @Override
    public List<Users> getUsers(Users users) {
        return usersDao.getUsers(users);
    }

    @Override
    public void deleteUsers(String ids) {
        usersDao.deleteUsers(ids);
    }

    @Override
    public void freezeUsers(String ids) {
        usersDao.freezeUsers(ids);
    }

    @Override
    public void thawUsers(String ids) {
        usersDao.thawUsers(ids);
    }
}
