package com.batal.demo.quarkus;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@QuarkusMain
public class App implements QuarkusApplication {

    @ConfigProperty(name = "example.username")
    String username;

    @ConfigProperty(name = "example.password")
    String password;

    @Override
    public int run(String... args) throws Exception {
        Logger logger = LoggerFactory.getLogger(App.class);

        logger.info("----------------------------------------");
        logger.info("Configuration properties");
        logger.info("  example.username is {}", username);
        logger.info("  example.password is {}", password);
        logger.info("----------------------------------------");

        return 0;
    }
}