package com.pandaq.dubbo.consumer.web.controller;

import com.panda.dubbo.api.PrinterService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Luz.Ho211
 * @date 2019-12-15 11:27
 */
@RestController
@RequestMapping(path = "/test")
public class TestController {

    @Reference(version = "${print.service.version}")
    private PrinterService printerService;

    @GetMapping(path = "/print")
    public String print(@RequestParam String text) {
        return printerService.print(text);
    }

}
