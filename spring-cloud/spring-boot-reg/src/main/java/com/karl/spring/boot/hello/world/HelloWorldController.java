package com.karl.spring.boot.hello.world;

import com.karl.spring.boot.data.jpa.User;
import com.karl.spring.boot.data.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by karl on 4/8/17.
 */
@RestController
public class HelloWorldController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/hello1")
    public String hello1() {
        User user = new User("karl", 30);
        userRepository.save(user);
        List<User> usersWithNameOfKarl = userRepository.findByNameLike("karl");
        System.out.println(usersWithNameOfKarl.get(0).getId());

        return "Hello World";
    }

    @RequestMapping("/hello2")
    public List<String> hello2() {
        return Arrays.asList(new String[]{"A", "B", "C"});
    }
}