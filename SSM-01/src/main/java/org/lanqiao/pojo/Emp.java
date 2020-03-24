package org.lanqiao.pojo;

import lombok.*;

import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp implements Serializable {
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private Double sal;
    private Double COMM;
    private Integer deptno;

    public Emp(String ename, String job, Date hiredate, Double sal) {
        this.ename = ename;
        this.job = job;
        this.hiredate = hiredate;
        this.sal = sal;
    }
    public Emp(Integer empno,String ename, String job, Date hiredate, Double sal) {
        this.ename = ename;
        this.job = job;
        this.hiredate = hiredate;
        this.sal = sal;
        this.empno = empno;
    }


}
