package com.netceler.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class Server2710Application {
    public static void main(final String[] args) {
        SpringApplication.run(Server2710Application.class, args);
    }

}