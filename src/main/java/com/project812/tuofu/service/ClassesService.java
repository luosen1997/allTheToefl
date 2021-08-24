package com.project812.tuofu.service;

import com.project812.tuofu.pojo.Classes;

import java.util.List;

public interface ClassesService {
    List<Classes> getClasses(Classes classes);

    void deleteClasses(String ids);

    void closeClasses(String ids);

    void recoveryClasses(String ids);
}
