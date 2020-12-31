package org.github.hephaistos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {LiquibaseAutoConfiguration.class, SecurityAutoConfiguration.class,
        ManagementWebSecurityAutoConfiguration.class})
public class HephaistosApplication {

    public static void main(String[] args) {
        SpringApplication.run(HephaistosApplication.class, args);
    }

}
