package com.itheima.mymap;

import java.util.*;
// import java.util.Collection;

public class collectiondemo1 {
    public static void main(String[] args) {
        // 使用Collection类中的静态方法，往集合对象中添加元素。
        // Collections类中的方法：
        // addAll（list，element）
        // shuffle（list）打乱
        // sort（list）排序
        // sort（list，comparator指定规则排序）
        // binarySearch（list，key）二分法查找元素
        // fill（list，obj）
        // max/min（collection）
        // swap（list，int i，int j）

        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.println();

        Collections.addAll(arr1, 1, 2, 3, 4, 5, 6);
        System.out.println(arr1);

        Collections.shuffle(arr1);
        System.out.println(arr1);

        Collections.sort(arr1);
        System.out.println(arr1);

        ArrayList<String> arr2 = new ArrayList<>();

        Collections.addAll(arr2, "1", "22", "111", "3");

        Collections.sort(arr2, new Comparator<String>() {
            @Override
            public int compare(String i1, String i2) {
                return i2.length() - i1.length();
            }
        });
        System.out.println(arr2);

        int i = Collections.binarySearch(arr2, "111");
        System.out.println(i);

        // Collections.fill(arr2, "x");
        // System.out.println(arr2);

        Collections.swap(arr2, 1, 2);
        System.out.println(arr2);

    }

}
