package me.study.modernjava;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModernJavaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ModernJavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
