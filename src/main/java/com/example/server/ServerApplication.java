package com.example.server;

import com.example.server.enumeration.Status;
import com.example.server.model.Server;
import com.example.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    // this project was bootstrapped at
    // https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.7.0&packaging=jar&jvmVersion=11&groupId=com.example&artifactId=server&name=server&description=Serve%20manager%20application&packageName=com.example.server&dependencies=web,mysql,validation,data-jpa,lombok

    @Bean
    CommandLineRunner run(ServerRepo serverRepo) {
        return args -> {
            serverRepo.save(
                    new Server(
                            null,
                            "192.168.1.168",
                            "Ubuntu Linux",
                            "16 GB",
                            "personal PC",
                            "http://",
                            Status.SERVER_UP
                    )
            );
            serverRepo.save(
                    new Server(
                            null,
                            "192.168.1.58",
                            "Fedora Linux",
                            "64 GB",
                            "Dell workstation",
                            "http://",
                            Status.SERVER_UP
                    )
            );
        };
    }
}
