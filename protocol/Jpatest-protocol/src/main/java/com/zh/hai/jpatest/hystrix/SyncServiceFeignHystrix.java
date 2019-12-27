package com.zh.hai.jpatest.hystrix;

import com.zh.hai.jpatest.JpatestServiceFeign;
import com.zh.hai.jpatest.dto.PersonDTO;
import com.zh.hai.jpatest.vo.PersonVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SyncServiceFeignHystrix extends Throwable  implements JpatestServiceFeign {

	private Throwable cause = this;

	public PersonVO queryPerson(PersonDTO request) {
		log.info(cause.getLocalizedMessage());
		return null;
	}
}
