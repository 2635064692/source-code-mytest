package com.zhang.hai.feign;

import com.zh.hai.jpatest.protocol.PersonServiceFeign;
import com.zh.hai.jpatest.dto.PersonDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FeignApplicationTests {

    @Autowired
    PersonServiceFeign personServiceFeign;

    @Test
    void contextLoads() {
        personServiceFeign.queryPerson(new PersonDTO());
    }

}
