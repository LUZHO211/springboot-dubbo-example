package com.pandaq.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 启动类
 * @author Luz.Ho211
 * @date 2019-12-13 23:33
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:spring/dubbo-provider.xml"})
public class Launcher {

    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }

}
