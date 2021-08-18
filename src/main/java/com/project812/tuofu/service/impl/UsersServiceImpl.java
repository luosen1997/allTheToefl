package com.project812.tuofu.service.impl;

import com.project812.tuofu.dao.UsersDao;
import com.project812.tuofu.pojo.Admin;
import com.project812.tuofu.pojo.Teacher;
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

    @Override
    public Users login(Users user) {
        return usersDao.login(user);
    }

    @Override
    public Teacher login1(Teacher teacher) {
        return  usersDao.login1(teacher);
    }

    @Override
    public Admin login2(Admin admin) {
        return usersDao.login2(admin);
    }

    @Override
    public String register(Users user) {
        return usersDao.register(user);
    }

    @Override
    public Users getUserById(Integer id) {
        return usersDao.getUserById(id);
    }

    @Override
    public void updateUser(Users user) {
        usersDao.updateUser(user);
    }

    @Override
    public void updatePassword(Users user) {
        usersDao.updatePassword(user);
    }
}
