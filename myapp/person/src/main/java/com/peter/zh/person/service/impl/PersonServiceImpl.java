package com.peter.zh.person.service.impl;

import com.peter.zh.person.model.entity.Person;
import com.peter.zh.person.model.entity.repository.PersonRepository;
import com.peter.zh.person.service.PersonService;
import com.zh.hai.jpatest.dto.PersonDTO;
import com.zh.hai.jpatest.vo.PersonVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author admin_z by 2019/12/17
 * @ClassName PersonServiceImpl
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepository;

    @Override
    public PersonVO queryPersonById(PersonDTO person) {
        Optional<Person> byId = personRepository.findById(person.getId());
        PersonVO personVO = null;
        if (byId.isPresent()) {
            personVO = new PersonVO();
            BeanUtils.copyProperties(byId.get(), personVO);
        }
        return personVO;
    }

    @Override
    public PersonVO queryPersonByName(PersonDTO person) {
        Person byName = personRepository.findByName(person.getName());
        PersonVO personVO = null;
        if (byName != null) {
            personVO = new PersonVO();
            BeanUtils.copyProperties(byName, personVO);
        }
        return personVO;
    }
}
