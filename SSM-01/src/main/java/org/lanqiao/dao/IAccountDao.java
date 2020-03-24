package org.lanqiao.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.lanqiao.pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public interface IAccountDao {
    //查询所有
    @Select("select * from account")
    List<Account> findAll();

    //插入一条信息
    @Insert("insert into account(name,money) values(#{name},#{money})")
    void insertOne(@Param("name") String name, @Param("money")Double money);
}
