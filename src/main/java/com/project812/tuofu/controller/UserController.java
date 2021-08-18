package com.project812.tuofu.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project812.tuofu.pojo.*;
import com.project812.tuofu.service.EducationService;
import com.project812.tuofu.service.LevelService;
import com.project812.tuofu.service.TeacherService;
import com.project812.tuofu.service.UsersService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UsersService usersService;

    @Autowired
    LevelService levelService;

    @Autowired
    TeacherService teacherService;

    @Autowired
    EducationService educationService;

    @GetMapping(value = {"/getUsers"})
    public String getUsers(String loginName,Integer status,Integer userLevel,Model model,Integer currPage){
      //@RequestParam(value="page", required = false,defaultValue = "1")
        if(currPage==null){
            currPage=1;
        }
        Users users = new Users();
        users.setLoginName(loginName);
        users.setStatus(status);
        users.setUserLevel(userLevel);

        PageHelper.startPage(currPage,2);
        List<Users> list =usersService.getUsers(users);
        PageInfo<Users> pi = new PageInfo<>(list);
        int pages = pi.getPages();
        List<Level> levelList=levelService.getLevels();

        model.addAttribute("levelList",levelList);
        model.addAttribute("userLevel",userLevel);
        model.addAttribute("status",status);
        model.addAttribute("loginName",loginName);
        model.addAttribute("users",pi.getList());
        model.addAttribute("startPage",currPage);
        model.addAttribute("totalPage", pages);


        return "systemManagePeople/systemManage-userList";

    }
    @GetMapping(value = {"/deleteUsers"})
    public String deleteUsers(String ids){
        usersService.deleteUsers(ids);

        return "redirect:/user/getUsers";
    }
    @GetMapping(value = {"/freeze"})
    public String freezeUsers(String ids){
        usersService.freezeUsers(ids);

        return "redirect:/user/getUsers";
    }

    @GetMapping(value = {"/thaw"})
    public String thawUsers(String ids){
        usersService.thawUsers(ids);

        return "redirect:/user/getUsers";
    }
    @GetMapping(value = {"/getTeachers"})
    public String getTeachers(String userName,Model model,Integer currPage){
        if(currPage==null){
            currPage=1;
        }
        Teacher teacher = new Teacher();
        teacher.setLoginName(userName);

        PageHelper.startPage(currPage,2);
        List<Teacher> list =teacherService.getTeachers(teacher);
        PageInfo<Teacher> pi = new PageInfo<>(list,3);
        int pages = pi.getPages();

//        pi.setNavigatePages(3);
        int[] navigatepageNums = pi.getNavigatepageNums();


        List<Education> educationList=educationService.getEducation();
        model.addAttribute("userName",userName);
        model.addAttribute("teachers",pi.getList());
        model.addAttribute("startPage",currPage);
        model.addAttribute("totalPage", pages);
        model.addAttribute("educationList", educationList);
        model.addAttribute("navigatepageNums", navigatepageNums);
        return "systemManagePeople/systemManage-teacherList";

    }

    @GetMapping(value = {"/freezeTeacher"})
    public String freezeTeachers(String ids){
        teacherService.freezeTeachers(ids);
        System.out.println(ids);
        return "redirect:/user/getTeachers";
    }

    @GetMapping(value = {"/thawTeacher"})
    public String thawTeachers(String ids){
        teacherService.thawTeachers(ids);

        return "redirect:/user/getTeachers";
    }

    @PostMapping(value = "/addTeacher")
    public String addTeacher(String loginName,String userName,Integer sex,Integer educationId,String email,String phoneNum,String birthday,String introduce) throws ParseException {
        Teacher teacher = new Teacher();
        teacher.setLoginName(loginName);
        teacher.setUserName(userName);
        teacher.setSex(sex);
        teacher.setEducationId(educationId);
        teacher.setEmail(email);
        teacher.setPhoneNum(phoneNum);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday01 = simpleDateFormat.parse(birthday);
        teacher.setBirthday(birthday01);
        teacher.setIntroduce(introduce);

        teacherService.addTeacher(teacher);

        return "redirect:/user/getTeachers";
    }

    @GetMapping(value = {"/deleteTeachers"})
    public String deleteTeachers(String ids){
        teacherService.deleteTeachers(ids);

        return "redirect:/user/getTeachers";
    }
}
