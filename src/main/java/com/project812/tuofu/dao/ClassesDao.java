package com.project812.tuofu.dao;

import com.project812.tuofu.pojo.Classes;

import java.util.List;

public interface ClassesDao {

    List<Classes> getClasses(Classes classes);

    void deleteClasses(String ids);

    void closeClasses(String ids);

    void recoveryClasses(String ids);
}
