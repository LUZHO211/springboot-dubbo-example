package com.pandaq.dubbo.provider.service;

import com.pandaq.dubbo.api.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Luz.Ho211
 * @date 2019-12-13 23:38
 */
@Service
@Slf4j
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello(String name) {
        log.info("Hello, {} !", name);
        return "Hello, " + name + " !";
    }

}
