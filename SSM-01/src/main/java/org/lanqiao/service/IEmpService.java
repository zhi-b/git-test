package org.lanqiao.service;

import org.lanqiao.pojo.Emp;

import java.util.List;

public interface IEmpService {
    //查询所有用户
    List<Emp> findAll(Integer pageNum,Integer pageSize);
    //插入一条数据
    void insertOne(Emp emp);
    //更新数据
    void update(Emp emp);
    //删除数据
    void delete(Integer id);

}
