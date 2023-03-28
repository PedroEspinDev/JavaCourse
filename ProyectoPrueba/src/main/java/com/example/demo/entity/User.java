package com.example.demo.entity;

public class User {

    private Long id;
    private Integer age;
    private String gender;
    private String name;

    public User(Long id, int age, String gender, String name) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
