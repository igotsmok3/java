package com.itheima.mymap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;

public class question2 {
    public static void main(String[] args) {
        // 创建一个ArrayList集合，并添加以下字符串，字符串中前面是姓名，后面是年龄
        // “zhangsan，23’
        // “lisi，24”
        // wangwu，25”
        // 保留年龄大于等于24岁的人，
        // 并将结果收集到Map集合中
        // 姓名为键，年龄为值

        ArrayList<String> arr1 = new ArrayList<>();
        Collections.addAll(arr1, "1-1", "2-2", "3-3");

        Map<String, Integer> map1 = arr1.stream()
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[1])));

        System.out.println(map1);

        // 现在有两个ArrayList集合:
        // 第一个集合中:存储6名男演员的名字和年龄。第二个集合中:存储6名女演员的名字和年龄。姓名和年龄中间用逗号隔开。比如:张三,23要求完成如下的操作:
        // 1，男演员只要名字为3个字的前两人
        // 2，女演员只要姓杨的，并且不要第一个
        // 3，把过滤后的男演员姓名和女演员姓名合并到一起
        // 4，将上一步的演员信息封装成Actor对象
        // 将所有的演员对象都保存到List集合中。备注:演员类Actor，属性只有一个:name，age

        ArrayList<String> men = new ArrayList<>();
        ArrayList<String> women = new ArrayList<>();

        Collections.addAll(men, "张三,23", "张4,24", "张5,25", "张六六,26");
        Collections.addAll(women, "杨三,23", "杨4,24", "张把,25");

        System.err.println(men);
        System.out.println(women);

        List<String> list1 = men.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .collect(Collectors.toList());

        System.out.println(list1);

        List<String> list2 = women.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .collect(Collectors.toList());

        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);
    }
}
