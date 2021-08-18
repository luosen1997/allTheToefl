package com.project812.tuofu.service;

import com.project812.tuofu.pojo.Users;

import java.util.List;

public interface UsersService {
    public List<Users> getUsers(Users users);

    public void deleteUsers(String ids);

    public void freezeUsers(String ids);

    public void thawUsers(String ids);
}
