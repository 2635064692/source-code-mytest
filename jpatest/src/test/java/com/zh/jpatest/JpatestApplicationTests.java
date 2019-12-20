package com.zh.jpatest;

import com.zh.jpatest.model.entity.Person;
import com.zh.jpatest.model.entity.RequiredArgsConstructorTestModel;
import com.zh.jpatest.model.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class JpatestApplicationTests {

    @Autowired
    PersonRepository personRepository;

    @Test
    public void contextLoads() {
        Person person = new Person();
        person.setAge(23);
        person.setName("xinogh");
        person.setSex("男");
        personRepository.save(person);
    }

    /**
     * RequiredArgsConstructor 注解测试
     */
    @Test
    void requiredArgsConstructorTest(){
        List<String> stringList = new ArrayList<>();

        new RequiredArgsConstructorTestModel(stringList);
    }

    @Test
    void peekTest(){
        List<String> list = new ArrayList<>();
        list.add("132");
        list.add("135");
        list.add("133");
        list.stream().peek(System.out::println).count();
    }

    @Test
    void findTest(){
        personRepository.findById(1L);
    }
}
