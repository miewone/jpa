package com.miewone.jpastudy.domain.repository;

import com.miewone.jpastudy.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wgPark on 2021-06-18.
 */
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud()
    {
        userRepository.save(new User());

//        System.out.println(">>> "+userRepository.findAll());
        userRepository.findAll().forEach(System.out::println);
    }
}