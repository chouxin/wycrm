package com.xinchao.wycrmserivce.project.entity;

public class UserRole {
    private Integer id;

    private String role;

    private Integer userId;

    public UserRole(Integer id, String role, Integer userId) {
        this.id = id;
        this.role = role;
        this.userId = userId;
    }

    public UserRole() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}