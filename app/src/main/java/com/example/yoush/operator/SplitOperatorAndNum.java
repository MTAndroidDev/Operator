package com.example.yoush.operator;

/**
 * Created by yoush on 2018/3/12.
 */

public class SplitOperatorAndNum {

    public static String[] result(String str) {
        int countNotNum = 0;
        int operatorIndex = 0;
        String[] operatorAndNum = new String[3];

        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) > '0' && str.charAt(i) < '9')) {
                operatorIndex = i;
                countNotNum += 1;
                operatorAndNum[1] = String.valueOf(str.charAt(i));
            }
        }
        if (countNotNum > 1) {
            throw new IllegalArgumentException();
        }
        operatorAndNum[0] = str.substring(0, operatorIndex);
        operatorAndNum[2] = str.substring(operatorIndex + 1, str.length());
        return operatorAndNum;
    }
}
