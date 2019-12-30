package com.peter.zh.person.model.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * @author admin_z by 2019/12/13
 * @ClassName Person
 */
@Data
@Entity
@Table(name = "PERSON")
@EntityListeners(AuditingEntityListener.class)
public class Person {
    private String name;

    private Integer age;

    private String sex;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    private Date createTime;
}
