package com.zh.hai.feign.service.impl;

import com.zh.hai.feign.service.PersonService;
import com.zh.hai.jpatest.JpatestServiceFeign;
import com.zh.hai.jpatest.dto.PersonDTO;
import com.zh.hai.jpatest.vo.PersonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author admin_z by 2019/12/17
 * @ClassName PersonServiceImpl
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    JpatestServiceFeign jpatestServiceFeign;

    @Override
    public PersonVO queryPersonById(PersonDTO person) {
        return null;
    }

    @Override
    public PersonVO queryPersonByName(PersonDTO person) {
        return null;
    }
}
