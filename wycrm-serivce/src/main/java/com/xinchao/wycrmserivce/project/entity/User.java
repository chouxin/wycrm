package com.xinchao.wycrmserivce.project.entity;

import lombok.Data;


import java.io.Serializable;

@Data
public class User implements Serializable{

    private Integer id;
    //@NotBlank(message = "名字不能为空")
    private String name;
    //@NotBlank(message = "年龄不能为空")
    private Integer age;
}
