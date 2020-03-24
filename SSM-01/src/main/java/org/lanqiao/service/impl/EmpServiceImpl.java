package org.lanqiao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lanqiao.dao.IEmpDao;
import org.lanqiao.pojo.Emp;
import org.lanqiao.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("empService")
public class EmpServiceImpl implements IEmpService {
    @Autowired
    private IEmpDao empDao;

    @Override
    public List<Emp> findAll(Integer pageNum,Integer pageSize) {
        //设置分页的相关参数
        PageHelper.startPage(pageNum,pageSize);
        List<Emp> emps = empDao.findAll();
        System.out.println("业务层。。。查询所有用户");
        return emps;
    }

    @Override
    public void insertOne(Emp emp) {
        System.out.println("业务层。。。插入用户");
        empDao.insertOne(emp);
    }

    @Override
    public void update(Emp emp) {
        System.out.println("业务层。。。更新用户");
        empDao.update(emp);
    }

    @Override
    public void delete(Integer id) {
        System.out.println("业务层。。。删除用户");
        empDao.delete(id);
    }
}
