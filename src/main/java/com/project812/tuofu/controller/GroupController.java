package com.project812.tuofu.controller;

import com.project812.tuofu.pojo.Group;
import com.project812.tuofu.pojo.Users;
import com.project812.tuofu.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/group")
public class GroupController {
    @Autowired
    GroupService groupService;

    @GetMapping("/selectGroup")
    public String selectGroup(HttpSession session, Model model){
        Users user = (Users) session.getAttribute("user");
        String ids=groupService.selectGroupId(user.getUserId());
        List<Group> groupList =groupService.selectGroup(ids);
        model.addAttribute("groupList",groupList);
        return "success";
    }
}
