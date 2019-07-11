package com.demo.dateconverter.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: Milan Paudyal
 * @Date: 4/23/19,Tue
 **/

public class Java8MapDemo {
    private static List<Users> usersList = Arrays.asList(new Users(1, "Sujan", 25),
            new Users(2, "Mohendra", 23),
            new Users(3, "Bipin", 27),
            new Users(4, "Dharma", 26),
            new Users(5, "Rajan", 26));

    public static void main(String[] args) {
        printUpdatedData(processData(usersList));
    }

    private static List<Users> processData(List<Users> users) {
        return null;

    }


    private static void printUpdatedData(List<Users> users) {
        users.forEach(System.out::print);
    }
}
