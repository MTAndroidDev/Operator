package com.example.yoush.operator;

/**
 * Created by yoush on 2018/3/12.
 */

public class Add extends Counter {

    public Add(int figure1, int figure2) {
        super(figure1, figure2);
    }

    @Override
    public int counterResult() {
        return getFigure1() + getFigure2();
    }
}
