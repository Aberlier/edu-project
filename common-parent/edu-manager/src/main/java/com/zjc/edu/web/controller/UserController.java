package com.zjc.edu.web.controller;

import com.zjc.edu.Service.IUserService;
import com.zjc.edu.model.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")

public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public String login() {
        return "Default";
    }

    /**
     * @param id
     * @return
     */
    @RequestMapping("/find")
    public String findById(Integer id) {
        System.out.println(id);
        User user = userService.findById(id);
        System.out.println(user);
        return null;
    }

    /**
     * @return
     */
    @RequestMapping("/manage")
    public String manage() {
        return "User/UserManage";
    }

    /**
     * @return
     */
    @RequestMapping("/info")
    public String info() {
        return "User/UserInfo";
    }

    /**
     * @return
     */
    @RequestMapping("/otherInfo")
    public String otherInfo() {
        return "User/UserOtherInfo";
    }

    /**
     * @return
     */
    @RequestMapping("/addUser")
    public String addUser() {
        return "/User/UserAdd";
    }
}
