package com.project812.tuofu.dao;

import com.project812.tuofu.pojo.Education;
import com.project812.tuofu.pojo.Teacher;

import java.util.List;

public interface TeacherDao {

    public List<Teacher> getTeachers(Teacher teacher);

    public void freezeTeachers(String ids);

    public void thawTeachers(String ids);

    public void addTeacher(Teacher teacher);

    public void deleteTeachers(String ids);


    public void updatePassword(Teacher teacher);

    public Teacher getTeacherById(Integer teacherId);
}
