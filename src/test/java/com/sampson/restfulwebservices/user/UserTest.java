package com.sampson.restfulwebservices.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    @BeforeEach
    public void createUser(){
        user = new User(1,"Flavio", LocalDate.of(2000,1,1));
    }


    @Test
    public void validateTypes(){
        assertInstanceOf(Integer.class,user.getId());
        assertInstanceOf(String.class, user.getName());
        assertInstanceOf(LocalDate.class, user.getBirthDate());
    }

    @Test
    public void testNameSize(){
        assertNotEquals(0,user.getName().length());
    }

    @Test
    public void testBirthDate(){
        assertTrue(user.getBirthDate().isBefore(LocalDate.now()),"Date should br in the past");
    }



}