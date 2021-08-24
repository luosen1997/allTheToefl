package com.project812.tuofu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project812.tuofu.pojo.OpenClass;
import com.project812.tuofu.pojo.Teacher;
import com.project812.tuofu.pojo.Users;
import com.project812.tuofu.service.OpenClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/openClass")
public class OpenClassController {
    @Autowired
    OpenClassService openClassService;
    @GetMapping("/getClassById")
    public String getClassById(HttpSession session, Model model, Integer currPage,Integer currPageAll){
        if (currPage == null) {
            currPage = 1;
        }
        Users user = (Users) session.getAttribute("user");
        OpenClass openClass = new OpenClass();
        openClass.setUserId(user.getUserId());
        PageHelper.startPage(currPage, 2);
        List<OpenClass> openClassList=openClassService.getClassById(openClass);
        PageInfo<OpenClass> pi = new PageInfo<>(openClassList,3);
        int pages = pi.getPages();
        int[] navigatepageNums = pi.getNavigatepageNums();
        model.addAttribute("totalPage", pages);
        model.addAttribute("openClass", pi.getList());
        model.addAttribute("startPage", currPage);
        model.addAttribute("navigatepageNums", navigatepageNums);

        if (currPageAll == null) {
            currPageAll = 1;
        }
        PageHelper.startPage(currPageAll, 2);
        List<OpenClass> openClassListAll=openClassService.getClassList();
        PageInfo<OpenClass> piAll = new PageInfo<>(openClassListAll,3);
        int pagesALL = piAll.getPages();
        int[] navigatepageNumsAll = piAll.getNavigatepageNums();
        model.addAttribute("totalPageAll", pagesALL);
        model.addAttribute("openClassAll", piAll.getList());
        model.addAttribute("startPageAll", currPageAll);
        model.addAttribute("navigatepageNumsAll", navigatepageNumsAll);

        return "personalData/myCourse";
    }

    @GetMapping("/getClassList")
    public String getClassList(Model model){
        List<OpenClass> openClassList=openClassService.getClassList();
        model.addAttribute("openClassList", openClassList);
        return "openClass/latestOpenClass";
    }

    @GetMapping("/getTeacherList")
    public String getTeacherList(Model model, Integer currPage){
        if (currPage == null) {
            currPage = 1;
        }

        PageHelper.startPage(currPage, 2);
        List<OpenClass> openTeacherList=openClassService.getClassList();
        PageInfo<OpenClass> pi = new PageInfo<>(openTeacherList,3);
        int pages = pi.getPages();
        int[] navigatepageNums = pi.getNavigatepageNums();
        model.addAttribute("totalPage", pages);
        model.addAttribute("openTeacherList", pi.getList());
        model.addAttribute("startPage", currPage);
        model.addAttribute("navigatepageNums", navigatepageNums);
        return "openClass/teacherIntroduction";
    }

    @PostMapping("/addPhraseNum")
    @ResponseBody
    public Integer addPhraseNum(HttpSession session,Integer teacherId,Integer phraseNum){
        Users user = (Users) session.getAttribute("user");
        OpenClass openClass = new OpenClass();
        openClass.setUserId(user.getUserId());
        openClass.setTeacherId(teacherId);
        //查询是否点赞
        if(openClassService.addPhraseNum(openClass)==false){
            return 0;
        }
        //增加user和teacher关联
        openClassService.addPhraseNumTrue(openClass);
        //增加点赞数
        int phraseNumNew = phraseNum+1;
        openClass.setPhraseNum(phraseNumNew);
        openClassService.addPhrase(openClass);

        return phraseNumNew;
    }

    @GetMapping(value = {"/selectThree"})
    public String selectThree(HttpSession session) {
        List<OpenClass> openClassList=openClassService.selectThree();
        session.setAttribute("openClassThree",openClassList);
        return "home";
    }
}
