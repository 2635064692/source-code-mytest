package com.zhang.hai.feign.controller;

import com.zh.hai.jpatest.dto.PersonDTO;
import com.zhang.hai.feign.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin_z by 2020/1/2
 * @ClassName PersonController
 */
@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping("/test")
    public String test(@RequestBody PersonDTO personDTO){
        personService.getPerson(personDTO);
        return "success";
    }
}
