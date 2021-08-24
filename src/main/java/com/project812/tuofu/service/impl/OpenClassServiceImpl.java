package com.project812.tuofu.service.impl;

import com.project812.tuofu.dao.OpenClassDao;
import com.project812.tuofu.pojo.OpenClass;
import com.project812.tuofu.service.OpenClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpenClassServiceImpl implements OpenClassService {
    @Autowired
    OpenClassDao openClassDao;
    @Override
    public List<OpenClass> getClassById(OpenClass openClass) {
        return openClassDao.getClassById(openClass);
    }

    @Override
    public List<OpenClass> getClassList() {
        return openClassDao.getClassList();
    }

    @Override
    public boolean addPhraseNum(OpenClass openClass) {
        if(openClassDao.addPhraseNum(openClass)== null){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public void addPhraseNumTrue(OpenClass openClass) {
        openClassDao.addPhraseNumTrue(openClass);
    }

    @Override
    public void addPhrase(OpenClass openClass) {
        openClassDao.addPhrase(openClass);
    }

    @Override
    public List<OpenClass> selectThree() {
        return openClassDao.selectThree();
    }
}
