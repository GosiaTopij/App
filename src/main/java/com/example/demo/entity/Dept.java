package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "DEPT")
public class Dept {
    @Column(name = "ID")
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NAME", nullable = true, length = 255)
    private String name;

    @Override
    public String toString() {
        return "Department{ " +
                "id = " + id +
                ", name = " + name  +
                '}'  ;
    }

    public Dept(int id, String name) {
        this.id=id;
        this.name=name;
    }
    public Dept(){};
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}

