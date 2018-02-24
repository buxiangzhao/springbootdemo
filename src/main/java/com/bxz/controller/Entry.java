package com.bxz.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by SQ_BXZ on 2018-02-24.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.bxz")
public class Entry {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Entry.class, args);
    }
}
