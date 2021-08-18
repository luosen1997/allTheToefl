package com.project812.tuofu.dao;

import com.project812.tuofu.pojo.Admin;
import com.project812.tuofu.pojo.Teacher;
import com.project812.tuofu.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersDao {

    public List<Users> getUsers(Users users);

    public void deleteUsers(String ids);

    public void freezeUsers(String ids);

    public void thawUsers(String ids);

    public Users login(Users user);

    public Teacher login1(Teacher teacher);

    public Admin login2(Admin admin);

    public String register(Users user);

    Users getUserById(@Param("userId") Integer id);

    void updateUser(Users user);

    void updatePassword(Users user);

}
