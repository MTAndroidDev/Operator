package com.example.yoush.operator;

/**
 * Created by yoush on 2018/3/12.
 */

public abstract class Counter {
    private int figure1;
    private int figure2;

    public Counter(int figure1, int figure2) {
        this.figure1 = figure1;
        this.figure2 = figure2;
    }

    public int getFigure1() {
        return figure1;
    }

    public void setFigure1(int figure1) {
        this.figure1 = figure1;
    }

    public int getFigure2() {
        return figure2;
    }

    public void setFigure2(int figure2) {
        this.figure2 = figure2;
    }

    public abstract int counterResult();
}
