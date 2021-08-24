package com.project812.tuofu.controller;

import com.project812.tuofu.pojo.Group;
import com.project812.tuofu.pojo.Users;
import com.project812.tuofu.service.GroupService;
import com.project812.tuofu.pojo.Groups;
import com.project812.tuofu.service.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/group")
public class GroupController{
    @Autowired
    GroupService groupService;
    @Autowired
    GroupsService groupsService;

    @GetMapping("/selectGroup")
    public String selectGroup(HttpSession session, Model model) {
        Users user = (Users) session.getAttribute("user");
        String ids = groupService.selectGroupId(user.getUserId());
        List<Group> groupList = groupService.selectGroup(ids);
        model.addAttribute("groupList", groupList);
        return "success";


    }
    @GetMapping("/getGroups")
    public String getGroups(String groupName, Date createTime, Model model){
        //@RequestParam(value="page", required = false,defaultValue = "1")

        Groups groups = new Groups();

        groups.setGroupName(groupName);
        groups.setCreateTime(createTime);

        List<Groups> list =groupsService.getGroups(groups);

        model.addAttribute("list",list);
        System.out.println(list);
        return "systemManagePeople/systemManage-groupList";
    }

    @GetMapping("/deleteGroups")
    public String deleteGroups(String ids){
        groupsService.deleteGroups(ids);

        return "redirect:/group/getGroups";
    }
}
