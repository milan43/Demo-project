package com.demo.dateconverter.practice;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Milan Paudyal
 * @Date: 4/17/19,Wed
 **/

public class LambdaThrow {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person(1, "name")
                , new Person(2, null));
        if (personList.stream().anyMatch(p -> p.getName() == null)) {
            throw new NullPointerException("null value");

        }
    }
}

class Person {
    private int id;
    private String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class MyException extends RuntimeException {
    private String message;

    MyException(String message) {
        this.message = message;
    }
}