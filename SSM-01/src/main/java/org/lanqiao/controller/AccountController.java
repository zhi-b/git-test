package org.lanqiao.controller;

import org.lanqiao.pojo.Account;
import org.lanqiao.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.net.InetAddressCachePolicy;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(){
        List<Account> accounts = accountService.findAll();
        System.out.println("表现层。。。查询所有账户");
        for (Account account : accounts) {
            System.out.println(account);
        }
        return "list";
    }
}

