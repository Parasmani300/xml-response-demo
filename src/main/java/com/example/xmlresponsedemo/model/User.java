package com.example.xmlresponsedemo.model;

public class User {
    String user;
    Integer age;
    Integer salary;

    public User() {
    }

    public User(String user, Integer age, Integer salary) {
        this.user = user;
        this.age = age;
        this.salary = salary;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
