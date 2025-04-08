package com.itheima.mymap.functiondemo;

import java.util.ArrayList;
import java.util.Collections;

import com.itheima.mymap.functiondemo.Parent;

public class Child extends Parent {

    public void tos() {
        ArrayList<String> arr1 = new ArrayList<>();
        Collections.addAll(arr1, "1", "2", "3");

        arr1.stream().forEach(super::stringPrint);
    }

    public static void main(String[] args) {
        new Child().tos();
    }
}
