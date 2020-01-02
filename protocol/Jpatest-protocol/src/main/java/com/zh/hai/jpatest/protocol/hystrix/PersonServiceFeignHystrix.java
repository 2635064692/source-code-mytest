package com.zh.hai.jpatest.protocol.hystrix;

import com.zh.hai.jpatest.protocol.PersonServiceFeign;
import com.zh.hai.jpatest.dto.PersonDTO;
import com.zh.hai.jpatest.vo.PersonVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonServiceFeignHystrix extends Throwable  implements PersonServiceFeign {

	private Throwable cause = this;

	public PersonVO queryPerson(PersonDTO request) {
		log.info(cause.getLocalizedMessage());
		return null;
	}

	public PersonVO getPersonByName(PersonDTO request) {
		return null;
	}
}
