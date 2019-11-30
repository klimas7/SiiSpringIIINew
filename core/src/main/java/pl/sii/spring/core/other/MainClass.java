package pl.sii.spring.core.other;

import org.springframework.boot.SpringApplication;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("----------------------");
        SpringApplication.run(AppConfiguration.class);
        System.out.println("----------------------");
    }
}
