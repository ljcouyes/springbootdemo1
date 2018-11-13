package com.unicom.microserv.peixun.peixun_38016.Controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="user对象",description="用户对象user")
public class User {
    private Long id;
    @ApiModelProperty(value="用户名",name="username",example="zuoww")
    private String name;
    @ApiModelProperty(value="年龄",name="age",example="666")
    private int age;
    @ApiModelProperty(value="邮箱",name="email",example="zuoww@neusoft.com")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

