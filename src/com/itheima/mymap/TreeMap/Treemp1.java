package com.itheima.mymap.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;
import com.itheima.mymap.TreeMap.Student;

public class Treemp1 {
    public static void main(String[] args) {
        Student st1 = new Student("1", 1);
        Student st2 = new Student("2", 2);
        Student st3 = new Student("3", 3);
        Student st4 = new Student("4", 4);
        Student st5 = new Student("1", 1);

        TreeMap<Student, String> tr1 = new TreeMap<>();

        tr1.put(st1, "1");
        tr1.put(st2, "2");
        tr1.put(st3, "3");
        tr1.put(st4, "4");
        tr1.put(st5, "1");
        System.out.println();

        System.out.println(tr1);

    }
}
