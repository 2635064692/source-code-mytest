package com.zh.jpatest.model.service;

import com.zh.jpatest.model.entity.Person;
import com.zh.jpatest.model.protocol.dto.PersonDTO;
import com.zh.jpatest.model.protocol.vo.PersonVO;

import java.util.Optional;

/**
 * @author admin_z by 2019/12/17
 * @ClassName PersonService
 */
public interface PersonService {
    /**
     * 通过id获取
     * @param person
     * @return
     */
    PersonVO queryPersonById(PersonDTO person);

    PersonVO queryPersonByName(PersonDTO person);
}
