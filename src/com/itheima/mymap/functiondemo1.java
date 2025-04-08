package com.itheima.mymap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class functiondemo1 {
    public static void main(String[] args) {
        Integer[] arr1 = { 1, 2, 3, 4, 6, 5, };
        // Arrays.sort(arr1, new Comparator<Integer>() {// Integer表示你要排序的数据类型,根据arr1决定
        // @Override
        // public int compare(Integer o1, Integer o2) {
        // return o2 - o1;
        // }
        // });

        // Arrays.sort(arr1, (o1, o2) -> {
        // return o2 - o1;
        // });

        // 方法引用，使用：：
        Arrays.sort(arr1, functiondemo1::substraction);

        System.out.println(Arrays.toString(arr1));
    }

    // 方法引用，我们定义一个静态方法，这样就可以不用写compare了

    public static int substraction(int a, int b) {
        return b - a;
    }

}
