package org.lanqiao.pojo;

import java.io.Serializable;


public class Account implements Serializable {
    private Integer id;
    private String name;
    private String money;


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
