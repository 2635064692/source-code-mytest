package com.zh.jpatest.model.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author admin_z by 2019/12/13
 * @ClassName Person
 */
@Data
@Entity
@Table(name = "PERSON")
public class Person {
    private String name;

    private Integer age;

    private String sex;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
