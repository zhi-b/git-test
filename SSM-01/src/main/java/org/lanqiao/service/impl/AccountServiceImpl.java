package org.lanqiao.service.impl;

import org.lanqiao.dao.IAccountDao;
import org.lanqiao.pojo.Account;
import org.lanqiao.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询所有");
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }

    @Override
    public void insertOne() {
        accountDao.insertOne("大马猴", 100000.0);
        System.out.println("业务层，插入一条信息");
    }
}
