package com.zh.hai.jpatest;

import com.zh.hai.jpatest.dto.PersonDTO;
import com.zh.hai.jpatest.vo.PersonVO;
import feign.Headers;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author admin_z by 2019/12/27
 * @ClassName JpatestServiceFeign
 */
@Component
@FeignClient(name = "JpaTestService")
public interface JpatestServiceFeign {
    @RequestLine("POST /person/getPersonById")
    @Headers({"Content-Type: application/json","Accept: application/json"})
    public PersonVO queryPerson(@RequestBody PersonDTO request);
}
