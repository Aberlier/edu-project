package com.zjc.edu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */
@Controller
@RequestMapping("/salary")
public class SalaryController {

    /**
     * @return
     */
    @RequestMapping("/manage")
    public String salaryManage() {
        return "Salary/SalaryManage";
    }

    /**
     * @return
     */
    @RequestMapping("/info")
    public String info() {
        return "Salary/SalaryInfo";
    }

    /**
     * @return
     */
    @RequestMapping("/otherInfo")
    public String otherInfo() {
        return "Salary/SalaryOtherInfo";
    }

    /**
     * @return
     */
    @RequestMapping("/addSalary")
    public String addUser() {
        return "/Salary/SalaryAdd";
    }

}

