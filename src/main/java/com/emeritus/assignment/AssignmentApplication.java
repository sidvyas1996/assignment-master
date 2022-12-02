package com.emeritus.assignment;

import com.emeritus.assignment.config.RsaKeyProperties;
import com.emeritus.assignment.entity.User;
import com.emeritus.assignment.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository users)
	{
		return args -> {
			users.save(new User("Sid","password","ROLE_ADMIN"));
		};
	}

}
