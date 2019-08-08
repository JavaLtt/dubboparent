package com.itqf.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: liutong
 * @date: 2019-07-26 12:14
 */
@Data
public class User implements Serializable {
    private  int id;
    private String username;
    private String password;

    public User(int id,String username,String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
