package com.askp.springbootcasandra;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;



@Table
public class Employee {
    @PrimaryKey
    private String id;
    private String name;
    private String dept;

    public Employee() {

    }
    public Employee(String id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }


}
