package org.lanqiao.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lanqiao.pojo.Account;
import org.lanqiao.pojo.Emp;
import org.lanqiao.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private IEmpService empService;

    @RequestMapping("/findAll")
    public String findAll(@RequestParam(name="pageNum",required = true,defaultValue = "1")Integer pageNum,@RequestParam(name="pageSize",required = true,defaultValue = "6")Integer pageSize,Model model){
        List<Emp> emps = empService.findAll(pageNum,pageSize);
        PageInfo<Emp> pageInfo = new PageInfo<>(emps);
        model.addAttribute("emps", emps);
        model.addAttribute("pageInfo", pageInfo);
        return "list";
    }

    @RequestMapping("/insertOne")
    public String insertOne(Emp emp){
        empService.insertOne(emp);
        System.out.println(emp);
        System.out.println("表现层。。。插入用户");
        return "redirect:/emp/findAll";
    }

    @RequestMapping("/update")
    public String update(Emp emp){
        empService.update(emp);
        System.out.println("表现层。。。更新用户");
        return "redirect:/emp/findAll";
    }

    @RequestMapping("/delete")
    public String delete(Integer empno){
        empService.delete(empno);
        System.out.println("表现层。。。删除用户");
        return "redirect:/emp/findAll";
    }
}
