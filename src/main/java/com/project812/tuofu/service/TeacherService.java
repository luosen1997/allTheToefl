package com.project812.tuofu.service;

import com.project812.tuofu.pojo.Teacher;

import java.util.List;

public interface TeacherService {
    public List<Teacher> getTeachers(Teacher teacher);

    public void freezeTeachers(String ids);

    public void thawTeachers(String ids);

    public void addTeacher(Teacher teacher);

    public void deleteTeachers(String ids);

    List<Teacher> getTeachers();
}
