package com.example.yoush.operator;

/**
 * Created by yoush on 2018/3/12.
 */

public class CounterFactory {
    public static Counter createCounter(String[] operationAndNum) {
        Counter counter = null;
        switch (operationAndNum[1]) {
            case "+":
                counter = new Add(Integer.parseInt(operationAndNum[0]), Integer.parseInt(operationAndNum[2]));
                break;
            case "-":
                counter = new Sub(Integer.parseInt(operationAndNum[0]), Integer.parseInt(operationAndNum[2]));
                break;
            default:
                counter = new Add(Integer.parseInt(operationAndNum[0]), Integer.parseInt(operationAndNum[2]));
                break;
        }
        return counter;
    }
}
