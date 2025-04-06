package com.itheima.mymap;

import java.util.stream.*;

public class stream3 {
    public static void main(String[] args) {
        // 针对零散数据，使用Stream接口中的静态方法Stream.of

        Stream.of(1, 2, 3, 4, 5).forEach(s -> System.out.println(s));
    }

}
    