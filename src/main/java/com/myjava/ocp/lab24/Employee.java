package com.myjava.ocp.lab24;

import java.io.Serializable;

public class Employee implements Serializable {
    public static final long serialVersionUID = 1L;
    private String name;
    private int salary;
    private int age;
    
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + '}';
    }
    
}
