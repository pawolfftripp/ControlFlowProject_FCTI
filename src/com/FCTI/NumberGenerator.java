package com.FCTI;

public class NumberGenerator {

    public static int magicBall(int num) {
        int ranNum = (int)(Math.random() * num);
            if (ranNum > 75) {
                int x = ranNum - 75;
                return x;
            }
        return ranNum;
    }

    public static int lotteryAdd2(int num1, int num2) {
        int lottery2 = num1 + num2;
        return lottery2;
    }

    public static int lotteryAdd3(int num1, int num2, int num3) {
        int lottery3 = num1 + num2 + num3;
        return lottery3;
    }


    public static int lotteryLetter(String text, int num) {
        char[] newStr = text.toCharArray();
        int value = newStr[num];
        return value;
    }

}
