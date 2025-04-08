
package com.itheima.mymap.functiondemo;

import java.util.ArrayList;
import java.util.Collections;

import com.itheima.mymap.functiondemo1;
import com.itheima.mymap.stream1;

public class Myclass {
    // 使用本类的方法(不能在静态方法中使用)
    public void ListPrint(String s) {
        System.out.println(s);
        ;
    }

    public void func1() {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "1", "2", "3");
        strings.stream().forEach(this::ListPrint);
    }

    public static void main(String[] args) {
        new Myclass().func1();
    }

}
