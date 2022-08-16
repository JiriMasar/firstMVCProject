package com.example.firstmvcproject.config;


import com.example.firstmvcproject.model.User;
import com.example.firstmvcproject.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return args -> {
            var tomas = new User(
                    "Tomas",
                    "Svojanovsky",
                    "tomas.svojanovsky11@gmail.com",
                    "123456"
            );

            userRepository.save(tomas);
        };

    }

}
