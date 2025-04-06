package com.itheima.mymap;

import java.util.Map;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

//第四种遍历方式，使用lambda表达式，调用forEach方法，传入一个Consumer类型的接口指向的实例，并override这个接口中的方法accept
// public class mymap4 {
//     public static void main(String[] args) {
//         HashMap<String, Integer> maps = new HashMap<>();
//         maps.put("张三", 23);
//         maps.put("李四", 24);
//         maps.put("王五", 25);
//         maps.put("赵六", 26);

//         maps.keySet().forEach(new Consumer<String>() {
//             @Override
//             public void accept(String key) {
//                 System.out.println(key + "=");
//             }
//         });

//     }
// }

public class mymap4 {

    public static void main(String[] args) {
        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("张三", 23);
        maps.put("李四", 24);
        maps.put("王五", 25);
        maps.put("赵六", 26);

        maps.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key + "=" + value);
            }
        });

        maps.forEach((String key, Integer value) -> {
            System.out.println(key + "=" + value);
        });
    }
}
