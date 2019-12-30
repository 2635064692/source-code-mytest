package com.zh.hai.jpatest;

import com.zh.hai.jpatest.dto.PersonDTO;
import com.zh.hai.jpatest.vo.PersonVO;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author admin_z by 2019/12/27
 * @ClassName JpatestServiceFeign
 */
@FeignClient(name = "JpaTestService")
public interface JpatestServiceFeign {
    @RequestMapping(value="/person/getPersonById",method= RequestMethod.POST,consumes = "application/json")
    @Headers({"Content-Type: application/json","Accept: application/json"})
    public PersonVO queryPerson(@RequestBody PersonDTO request);
}
