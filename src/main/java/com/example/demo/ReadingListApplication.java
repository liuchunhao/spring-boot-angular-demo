package com.example.demo;

import com.example.demo.user.entity.Skill;
import com.example.demo.user.entity.User;
import com.example.demo.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.PostConstruct;
import java.util.Arrays;


/**
 * ex.
 * http://localhost:8080/readingList
 *
 */
@SpringBootApplication
public class ReadingListApplication extends WebMvcConfigurerAdapter {
    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(ReadingListApplication.class, args);
    }
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
      registry.addRedirectViewController("/", "/readingList");
    }

    @PostConstruct
    public void setupDbWithData(){
        User user= new User("Ashish", null);
        user.setSkills(Arrays.asList(new Skill("java"), new Skill("js")));
        user= userRepository.save(user);
    }
}