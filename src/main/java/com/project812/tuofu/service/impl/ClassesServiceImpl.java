package com.project812.tuofu.service.impl;

import com.project812.tuofu.dao.ClassesDao;
import com.project812.tuofu.pojo.Classes;
import com.project812.tuofu.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesServiceImpl implements ClassesService {

    @Autowired
    ClassesDao classesDao;


    @Override
    public List<Classes> getClasses(Classes classes) {
        return classesDao.getClasses(classes);
    }

    @Override
    public void deleteClasses(String ids) {
        classesDao.deleteClasses(ids);
    }

    @Override
    public void closeClasses(String ids) {
        classesDao.closeClasses(ids);
    }

    @Override
    public void recoveryClasses(String ids) {
        classesDao.recoveryClasses(ids);
    }
}
