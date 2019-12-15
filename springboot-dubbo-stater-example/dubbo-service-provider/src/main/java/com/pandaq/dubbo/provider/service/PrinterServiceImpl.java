package com.pandaq.dubbo.provider.service;

import com.panda.dubbo.api.PrinterService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author Luz.Ho211
 * @date 2019-12-14 11:12
 */
@Service(version = "${printer.service.version}")
@Slf4j
public class PrinterServiceImpl implements PrinterService {

    @Override
    public String print(String text) {
        log.info("Printer service: {}", text);
        return "Printer service: " + text;
    }

}