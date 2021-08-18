package com.project812.tuofu.service.impl;

import com.project812.tuofu.dao.EducationDao;
import com.project812.tuofu.pojo.Education;
import com.project812.tuofu.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EducationImpl implements EducationService {
    @Autowired
    EducationDao educationDao;

    @Override
    public List<Education> getEducation() {
        return educationDao.getEducation();
    }
}
