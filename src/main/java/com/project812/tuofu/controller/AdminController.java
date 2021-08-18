package com.project812.tuofu.controller;

import com.project812.tuofu.pojo.Actives;
import com.project812.tuofu.pojo.Links;
import com.project812.tuofu.service.ActivesService;
import com.project812.tuofu.service.WebLinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    ActivesService activesService;

    @Autowired
    WebLinksService webLinksService;

    @GetMapping(value = {"/getActives"})
    public String getActives(Model model){

            List<Actives> list =activesService.getActives() ;

            model.addAttribute("actives",list);
            return "systemManagePeople/systemManage-activity";
    }
    //@ResponseBody
    @PostMapping(value = "/addActive")
    public String addActive(String activeName,String classTitle,String activeDesc, MultipartFile file){
        Actives actives = new Actives();
        actives.setActiveName(activeName);
//        actives.setClassId();
        actives.setActiveDesc(activeDesc);
        activesService.addActive(actives);
        System.out.println(activeName);
        String oldName = file.getOriginalFilename();
        System.out.println(oldName);
        return "success";
    }

    @GetMapping(value = {"/deleteActive"})
    public String deleteActive(String ids){
        activesService.deleteActive(ids);
        return "redirect:/admin/getActives";
    }
    @GetMapping(value = {"/getWebLinks"})
    public String getWebLinks(Model model){

        List<Links> list =webLinksService.getWebLinks() ;
        model.addAttribute("links",list);
        return "systemManagePeople/systemManage-webLinks";

    }

    @ResponseBody
    @PostMapping(value = "/addLink")
    public String addLink(String linkName,String linkUrl,String relateUnit,String linkDesc){
        System.out.println(linkName);
        System.out.println(linkUrl);
        System.out.println(relateUnit);
        Links links = new Links();
        links.setLinkName(linkName);
        links.setLinkUrl(linkUrl);
        links.setRelateUnit(relateUnit);
        links.setLinkDesc(linkDesc);
        Date lastModify = new Date();
        links.setLastModify(lastModify);
        webLinksService.addLink(links);
        return "success";
    }
    @GetMapping(value = {"/deleteLink"})
    public String deleteLink(String ids){
        webLinksService.deleteLink(ids);

        return "redirect:/admin/getWebLinks";
    }

}
