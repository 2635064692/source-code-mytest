package com.zh.jpatest.model.repository;

import com.zh.jpatest.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author admin_z by 2019/12/13
 * @ClassName PersonRepository
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByName(String name);
}
