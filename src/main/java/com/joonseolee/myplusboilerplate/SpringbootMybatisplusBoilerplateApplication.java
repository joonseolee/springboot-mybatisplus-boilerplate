package com.joonseolee.myplusboilerplate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.joonseolee.myplusboilerplate.mapper")
public class SpringbootMybatisplusBoilerplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisplusBoilerplateApplication.class, args);
    }

}
