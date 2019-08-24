package com.learning.logging.loggingLevels;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {


    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String hello() {


        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);

        logger.trace("Hello from Logback {} trace ", data);

        logger.debug("Hello from Logback {} debug ", data);

        logger.info("Hello from Logback {} info ", data);

        logger.warn("Hello from Logback {} warn ", data);

        logger.error("Hello from Logback {} error ", data);


        return "index"; // index.html
    }
}
