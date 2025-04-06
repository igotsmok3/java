package com.itheima.mymap;

public class argsdemo1 {
    public static void main(String[] args) {
        int sum = getSum(1, 2, 3, 4, 5);
        System.out.println(sum);
    }

    public static int getSum(int... args) {
        int sum = 0;
        for (int i : args) {
            sum = sum + i;
        }
        return sum;
    }
}
