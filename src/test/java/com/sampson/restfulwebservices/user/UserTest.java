package com.sampson.restfulwebservices.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void validateTypes(){
        User user = new User(1,"Flavio", LocalDate.of(2000,1,1));
        Assertions.assertInstanceOf(Integer.class,user.getId());
        Assertions.assertInstanceOf(String.class, user.getName());
        Assertions.assertInstanceOf(LocalDate.class, user.getBirthDate());
    }

}