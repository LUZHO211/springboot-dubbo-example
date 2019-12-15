package com.pandaq.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @author Luz.Ho211
 * @date 2019-12-14 11:11
 */
@SpringBootApplication
@DubboComponentScan(basePackages = {"com.pandaq.dubbo.provider.service"})
public class Launcher {

    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }

}
