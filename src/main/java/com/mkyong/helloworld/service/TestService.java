package com.mkyong.helloworld.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private static final Logger logger = LoggerFactory.getLogger(TestService.class);

    public String getDetails() {

        logger.debug("getDetails() is executed!");

        return "This is a test by Denise Lim";
    }
}
