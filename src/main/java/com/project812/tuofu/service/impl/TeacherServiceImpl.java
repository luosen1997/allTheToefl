package com.project812.tuofu.service.impl;

import com.project812.tuofu.dao.TeacherDao;
import com.project812.tuofu.pojo.Education;
import com.project812.tuofu.pojo.Teacher;
import com.project812.tuofu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherDao teacherDao;
    @Override
    public List<Teacher> getTeachers(Teacher teacher) {
        return teacherDao.getTeachers(teacher);
    }

    @Override
    public void freezeTeachers(String ids) {
        teacherDao.freezeTeachers(ids);
    }

    @Override
    public void thawTeachers(String ids) {
        teacherDao.thawTeachers(ids);
    }

    @Override
    public void addTeacher(Teacher teacher) {
        int status =2;
        teacher.setStatus(status);
        Date date = new Date();
        teacher.setCreateTime(date);
        teacherDao.addTeacher(teacher);
    }

    @Override
    public void deleteTeachers(String ids) {
        teacherDao.deleteTeachers(ids);
    }

    @Override
    public void updatePassword(Teacher teacher) {
        teacherDao.updatePassword(teacher);
    }

    @Override
    public Teacher getTeacherById(Integer teacherId) {
        return teacherDao.getTeacherById(teacherId);
    }


}
