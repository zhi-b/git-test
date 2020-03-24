package org.lanqiao.dao;

import org.apache.ibatis.annotations.*;
import org.lanqiao.pojo.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("empDao")
public interface IEmpDao {
    //查询所有用户
    @Select("select * from emp")
    List<Emp> findAll();
    //插入一条数据
    @Insert("insert into emp(ename,deptno,hiredate) " +
            "values(#{ename},#{deptno},#{hiredate})")
    void insertOne(Emp emp);
    //更新数据
    @Update("update emp set ename = #{ename} where empno = #{empno}")
    void update(Emp emp);
    //删除数据
    @Delete("delete from emp where empno = #{empno}")
    void delete(Integer id);

}
