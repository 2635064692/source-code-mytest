package com.zhang.hai.feign.service.impl;

import com.zh.hai.jpatest.dto.PersonDTO;
import com.zh.hai.jpatest.protocol.PersonServiceFeign;
import com.zh.hai.jpatest.vo.PersonVO;
import com.zhang.hai.feign.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author admin_z by 2019/12/31
 * @ClassName PersonServiceImpl
 */
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonServiceFeign personServiceFeign;
    @Override
    public PersonVO getPerson(PersonDTO personDTO) {
        personServiceFeign.queryPerson(personDTO);
        return null;
    }

    @Override
    public PersonVO getPersonByName(PersonDTO personDTO) {
        personServiceFeign.getPersonByName(personDTO);
        return null;
    }
}
