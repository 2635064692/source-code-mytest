package com.zh.jpatest;

import com.zh.jpatest.model.entity.Person;
import com.zh.jpatest.model.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpatestApplicationTests {

    @Autowired
    PersonRepository personRepository;

    @Test
    void contextLoads() {
        Person person = new Person();
        person.setAge(23);
        person.setName("xinogh");
        person.setSex("男");
        personRepository.save(person);
    }

}
