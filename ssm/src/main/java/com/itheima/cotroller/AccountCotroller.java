package com.itheima.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Account")
public class AccountCotroller {
    @RequestMapping("findAll")
    public String findAccount(){
        System.out.println ("查询成功");
        return "succese";
    }
}
