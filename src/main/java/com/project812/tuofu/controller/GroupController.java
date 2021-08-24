package com.project812.tuofu.controller;

import com.project812.tuofu.pojo.Groups;
import com.project812.tuofu.service.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/group")
public class GroupController {

    @Autowired
    GroupsService groupsService;

    @GetMapping(value = {"/getGroups"})
    public String getGroups(String groupName, Date createTime, Model model){
        //@RequestParam(value="page", required = false,defaultValue = "1")

        Groups groups = new Groups();

        groups.setGroupName(groupName);
        groups.setCreateTime(createTime);

        List<Groups> list =groupsService.getGroups(groups);

        model.addAttribute("list",list);

        return "systemManagePeople/systemManage-groupList";
    }

    @GetMapping("/deleteGroups")
    public String deleteGroups(String ids){
        groupsService.deleteGroups(ids);

        return "redirect:/group/getGroups";
    }
}
