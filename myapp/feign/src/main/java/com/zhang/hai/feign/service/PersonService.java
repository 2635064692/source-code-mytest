package com.zhang.hai.feign.service;

import com.zh.hai.jpatest.dto.PersonDTO;
import com.zh.hai.jpatest.vo.PersonVO;

/**
 * @author admin_z by 2019/12/31
 * @ClassName PersonService
 */
public interface PersonService {
    PersonVO getPerson(PersonDTO personDTO);

}
