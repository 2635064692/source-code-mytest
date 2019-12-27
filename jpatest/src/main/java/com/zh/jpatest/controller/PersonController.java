package com.zh.jpatest.controller;

import com.zh.jpatest.model.protocol.ResultModel;
import com.zh.jpatest.model.protocol.dto.PersonDTO;
import com.zh.jpatest.model.protocol.vo.PersonVO;
import com.zh.jpatest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin_z by 2019/12/17
 * @ClassName PersonController
 */
@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping(value = "/getPersonById", consumes = "application/json")
    public ResultModel<PersonVO> getPersonById(@RequestBody PersonDTO personDTO) {
        ResultModel<PersonVO> msgReturn = new ResultModel<>();
        PersonVO personVO = personService.queryPersonById(personDTO);
        msgReturn.setData(personVO);
        return msgReturn;
    }

    @PostMapping(value = "/getPersonByName", consumes = "application/json")
    public ResultModel<PersonVO> getPersonByName(@RequestBody PersonDTO personDTO) {
        ResultModel<PersonVO> msgReturn = new ResultModel<>();
        PersonVO personVO = personService.queryPersonByName(personDTO);
        msgReturn.setData(personVO);
        return msgReturn;
    }

    public static void main(String[] args) {
        String name = "  ";
        System.out.println(StringUtils.hasText(name));
    }
}
