package com.demo.dateconverter;

/**
 * @Author: Milan Paudyal
 * @Date: 1/27/19,Sun
 **/

public class InvalidBsDayOfMonthException extends RuntimeException{

    private static final long serialVersionUID = 2360070484241288062L;

    public InvalidBsDayOfMonthException(String message) {
        super(message);
    }
}
