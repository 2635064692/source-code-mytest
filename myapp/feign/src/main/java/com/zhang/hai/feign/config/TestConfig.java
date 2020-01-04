package com.zhang.hai.feign.config;

import com.zhang.hai.feign.service.PersonService;
import com.zhang.hai.feign.service.impl.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author admin_z by 2020/1/4
 * @ClassName TestConfig
 */
@Configuration
public class TestConfig {

    @Bean
    public PersonService personService(){
       return new PersonServiceImpl();
    }

}
