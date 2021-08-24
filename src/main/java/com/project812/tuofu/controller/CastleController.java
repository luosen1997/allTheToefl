package com.project812.tuofu.controller;

import com.project812.tuofu.pojo.Castle;
import com.project812.tuofu.service.CastleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/castle")
public class CastleController {

    @Autowired
    CastleService castleService;

    @GetMapping("/getCastle")
    public  String getCastle(String classTitle, String userName, String castleTypeName, Model model){
        Castle castle = new Castle();

        castle.setClassTitle(classTitle);
        castle.setUserName(userName);
        castle.setCastleTypeName(castleTypeName);

        List<Castle> list = castleService.getCastle(castle);
        model.addAttribute("list",list);
        return "systemManagePeople/systemManage-welfareCastleList";
    }

    @GetMapping(value = {"/deleteCastle"})
    public String deleteCastle(String ids){
        castleService.deleteCastle(ids);

        return "redirect:/castle/getCastle";
    }

 @GetMapping(value = {"/close"})
    public String closeCastle(String ids){
        castleService.closeCastle(ids);

        return "redirect:/castle/getCastle";
    }

 @GetMapping(value = {"/recovery"})
    public String recoveryCastle(String ids){
        castleService.recoveryCastle(ids);

        return "redirect:/castle/getCastle";
    }

}
