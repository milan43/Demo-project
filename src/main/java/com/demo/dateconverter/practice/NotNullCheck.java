package com.demo.dateconverter.practice;

import org.jetbrains.annotations.NotNull;

/**
 * @Author: Milan Paudyal
 * @Date: 4/16/19,Tue
 **/

public class NotNullCheck {
    public static void main(String[] args) {
        System.out.println(getLength("hello"));
    }

    private static int getLength(@NotNull String str) {
        return str.length();
    }
}
