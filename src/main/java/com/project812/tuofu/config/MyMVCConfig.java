package com.project812.tuofu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyMVCConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/home.html").setViewName("home");
        registry.addViewController("/footer.html").setViewName("footer");
        registry.addViewController("/main.html").setViewName("main");

        registry.addViewController("托福人/托福人.html").setViewName("托福人/托福人");
        registry.addViewController("公开课/main.html").setViewName("公开课/main");
        registry.addViewController("群组聊/组群聊-组群聊.html").setViewName("群组聊/组群聊-组群聊");
        registry.addViewController("福利城堡/福利城堡-福利城堡.html").setViewName("福利城堡/福利城堡-福利城堡");
        registry.addViewController("公开课/最新公开课.html").setViewName("公开课/最新公开课");
        registry.addViewController("公开课/名师推荐.html").setViewName("公开课/名师推荐");


        registry.addViewController("登陆注册/登录页.html").setViewName("登陆注册/登录页");
        registry.addViewController("登陆注册/注册页.html").setViewName("登陆注册/注册页");



        registry.addViewController("systemManagePeople/login-admin.html").setViewName("systemManagePeople/login-admin");
        registry.addViewController("systemManagePeople/systemManagePeople-activity.html").setViewName("systemManagePeople/systemManage-activity");
        registry.addViewController("systemManagePeople/systemManage-webLinks.html").setViewName("systemManagePeople/systemManage-webLinks");
        registry.addViewController("systemManagePeople/systemManage-teacherList.html").setViewName("systemManagePeople/systemManage-teacherList");
        registry.addViewController("systemManagePeople/systemManage-userList.html").setViewName("systemManagePeople/systemManage-userList");
        registry.addViewController("systemManagePeople/systemManage-tuoFuPeopleList.html").setViewName("systemManagePeople/systemManage-tuoFuPeopleList");
        registry.addViewController("systemManagePeople/systemManage-groupList.html").setViewName("systemManagePeople/systemManage-groupList");
        registry.addViewController("systemManagePeople/systemManage-openClassList.html").setViewName("systemManagePeople/systemManage-openClassList");
        registry.addViewController("systemManagePeople/systemManage-welfareCastleList.html").setViewName("systemManagePeople/systemManage-welfareCastleList");

    }


}
