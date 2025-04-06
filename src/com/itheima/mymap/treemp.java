package com.itheima.mymap;

import java.util.TreeMap;
// import java.util.function.Consumer;
import java.util.Comparator;
// import java.util.Map;
// import java.util.Set;

public class treemp {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> tr1 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        tr1.put(4, 1);
        tr1.put(3, 3);
        tr1.put(2, 2);
        tr1.put(4, 4);

        System.out.println(tr1);

        // 2.获取键值对entry，通过getKey和getValue
        // Set<Map.Entry<String, String>> entries = tr1.entrySet();
        // for (Map.Entry<String, String> entry : entries) {
        // System.out.println(entry.getKey() + ":" + entry.getValue());
        // }
        // //3.用lambda表达式,
        // tr1.forEach((key, value) -> System.out.println(key + ":" + value));

        // 降序排列,在TreeMap中传入Comparator对象，重写compare方法
        TreeMap<String, String> tr2 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        tr2.put("14", "14");
        tr2.put("3", "3");
        tr2.put("2", "2");
        tr2.put("41", "41");

        System.out.println(tr2);

    }
}

// public static int compare(int x, int y) {
// return (x < y) ? -1 : ((x == y) ? 0 : 1);
// }
