package ru.kata.spring.boot_security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.kata.spring.boot_security.demo.properties.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class SpringBootSecurityDemoApplication {
	public static void main(String[] args) {

		SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
	}
}
