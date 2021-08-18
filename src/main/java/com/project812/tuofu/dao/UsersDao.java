package com.project812.tuofu.dao;

import com.project812.tuofu.pojo.Users;

import java.util.List;

public interface UsersDao {

    public List<Users> getUsers(Users users);

    public void deleteUsers(String ids);

    public void freezeUsers(String ids);

    public void thawUsers(String ids);
}
