package com.example.spring_wiki.config;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;


@ComponentScan("com.example")
@SpringBootApplication
public class SpringWikiApplication {

        public static final Logger LOG= LoggerFactory.getLogger(SpringWikiApplication.class);

    public static void main(String[] args) {
//        SpringApplication.run(SpringWikiApplication.class, args);
        SpringApplication app=new SpringApplication(SpringWikiApplication.class);

        Environment env=app.run(args).getEnvironment();
        LOG.info("启动成功！");
        LOG.info("地址：\thttp://127.0.0.1:{}",env.getProperty("server.port"));


    }

}
