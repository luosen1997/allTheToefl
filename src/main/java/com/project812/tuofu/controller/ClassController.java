package com.project812.tuofu.controller;

import com.project812.tuofu.pojo.Classes;
import com.project812.tuofu.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/class")
public class ClassController {

    @Autowired
    ClassesService classesService;

    @GetMapping(value = {"/getClasses"})
    public String getClasses(String classTitle, String userName,Integer classType,Model model){
        //@RequestParam(value="page", required = false,defaultValue = "1")
        Classes classes = new Classes();

        classes.setClassTitle(classTitle);
        classes.setUserName(userName);
        classes.setClassType(classType);

        List<Classes> list =classesService.getClasses(classes);
        model.addAttribute("list",list);

        return "systemManagePeople/systemManage-openClassList";

    }

    @GetMapping("/deleteClasses")
    public String deleteClasses(String ids){
        classesService.deleteClasses(ids);
        return "redirect:/class/getClasses";
    }

    @GetMapping("/close")
    public String closeClasses(String ids){
        classesService.closeClasses(ids);
        return "redirect:/class/getClasses";
    }

    @GetMapping("/recovery")
    public String recoveryClasses(String ids){
        classesService.recoveryClasses(ids);
        return "redirect:/class/getClasses";
    }

}
