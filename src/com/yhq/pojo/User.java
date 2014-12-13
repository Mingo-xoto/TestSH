package com.yhq.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="my_test")
public class User {
    private String id;
    private String name;

    //主键值
    @GeneratedValue(generator="generator")
    @GenericGenerator(name="generator",strategy="uuid")
    @Id
    @Column(name="id",unique=true,nullable=false,length=256)
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @Column(name="name",nullable=true,length=256)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
