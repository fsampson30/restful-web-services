package com.sampson.restfulwebservices.user;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class UserTest {

    User user;

    @BeforeEach
    public void createUser(){
        user = new User(1,"Flavio", LocalDate.of(2000,1,1));
    }


    @Test
    public void validateTypes(){
        Assertions.assertInstanceOf(Integer.class,user.getId());
        Assertions.assertInstanceOf(String.class, user.getName());
        Assertions.assertInstanceOf(LocalDate.class, user.getBirthDate());
    }

    @Test
    public void testNameSize(){
        Assertions.assertNotEquals(0,user.getName().length());
    }

    @Test
    public void testBirthDate(){
        Assertions.assertTrue(user.getBirthDate().isBefore(LocalDate.now()));
    }



}