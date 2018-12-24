package com.sino.demo.entity;

import lombok.Data;

import java.io.Serializable;


/**
 * 数据库实体类
 */
@Data
public class User implements Serializable
{
    private String name;

    private int age;

    private String passWord;

    private String id;
}
