package org.warnier.zhang.notes.mybatis3.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.warnier.zhang.notes.mybatis3.generator.dao.LinkMapper;

@SpringBootApplication
@ComponentScan(basePackages = "org.warnier.zhang.notes.mybatis3.generator")
@MapperScan(basePackages = "org.warnier.zhang.notes.mybatis3.generator.dao")
public class GeneratorApplication {
    @Autowired
    private LinkMapper linkMapper;

    public static void main(String[] args) {
        SpringApplication.run(GeneratorApplication.class, args);
        
    }
}
