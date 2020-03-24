package org.lanqiao.service;

import org.lanqiao.pojo.Account;

import java.util.List;

public interface IAccountService {
    //查询所有
    List<Account> findAll();

    //插入一条信息
    void insertOne();
}
