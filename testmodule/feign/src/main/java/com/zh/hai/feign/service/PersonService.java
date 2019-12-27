package com.zh.hai.feign.service;

import com.zh.hai.jpatest.dto.PersonDTO;
import com.zh.hai.jpatest.vo.PersonVO;

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
