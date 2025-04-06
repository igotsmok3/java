package com.itheima.mymap.question;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import com.itheima.mymap.question.Student;

public class question1 {

    // 班级里有N学生，实现随机点名
    public static void main(String[] args) {
        Student s1 = new Student("1", 1);
        Student s2 = new Student("2", 2);
        Student s3 = new Student("3", 3);
        Student s4 = new Student("4", 4);

        // ArrayList<Student> students = new ArrayList<>();
        // students.add(s1);
        // students.add(s2);
        // students.add(s3);
        // students.add(s4);

        // int size = students.size();
        // Random r = new Random();
        // int i = r.nextInt(size);
        // Student student = students.get(i);
        // System.out.println();
        // System.out.println(student);

        // 30概率随机到女生，70概率随机到男生
        // 对我来说可以新建一个Map，把Student作为键，把男女作为值，男为1，女为0，（第一个map）
        // 然后，再建立一个有7个1和3个0的list，collections.shuffle一下，然后去取第一个(List)

        LinkedHashMap<Student, Integer> map1 = new LinkedHashMap<Student, Integer>();
        map1.put(s1, 1);
        map1.put(s2, 1);
        map1.put(s3, 1);
        map1.put(s4, 0);

        System.out.println(map1);

        // 转换map为list,先获取所有的键值对， 然后把键值对存储在list里面
        Set<Map.Entry<Student, Integer>> entries = map1.entrySet();
        ArrayList<Map.Entry<Student, Integer>> list_students = new ArrayList<>();
        list_students.addAll(entries); // list继承自collection接口，所以addAll传入的collection，可以传入list

        // 第二个list，保存概率。
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Collections.addAll(list1, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list1, 0, 0, 0);
        Collections.shuffle(list1);

        System.out.println(list1.get(0));

        int count1 = 0;
        int count0 = 0;

        for (Map.Entry<Student, Integer> entry : entries) {
            if (entry.getValue() == 1) {
                count1++;// 获取男生数量
            } else {
                count0++;// 获取女生数量
            }
        }
        System.err.println("count1:" + count1);
        System.err.println("count0:" + count0);

        System.out.println("list1.get(0) = " + list1.get(0));

        if (list1.get(0) == 1) {// 如果发现要找的是男生,就在男生中挑选
            // 再新建一个list，存储男生对象
            List<Student> maleStudents = new ArrayList<>();
            for (Map.Entry<Student, Integer> entry : map1.entrySet()) {
                if (entry.getValue() == 1) {
                    maleStudents.add(entry.getKey());
                }
            }
            Random r = new Random();
            int index = r.nextInt(maleStudents.size());
            System.out.println("随机点名的男生：" + maleStudents.get(index).getName());
        } else {// 如果发现要找的是女生
            // 再新建一个list，存储女生对象
            List<Student> femaleStudents = new ArrayList<>();
            for (Map.Entry<Student, Integer> entry : map1.entrySet()) {
                if (entry.getValue() == 0) {
                    femaleStudents.add(entry.getKey());
                }
            }
            Random r = new Random();
            int index = r.nextInt(femaleStudents.size());
            System.out.println("随机点名的女生：" + femaleStudents.get(index).getName());
        }

        // 问题三，要求点到的同学不会再点到，也就是，如果被点到了，那就删除这一项。

        // 1、先获取总共有多少项，定义为count

        int count = 0;
        for (Map.Entry<Student, Integer> entry : entries) {
            count++;
        }

        int man = count;

        // 2、每次点到的时候，就在list_students中删除掉那个项，然后再在一个新的list中插入那个项。
        // 所以，我们需要定义一个空list。
        ArrayList<Map.Entry<Student, Integer>> list_students2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {// 循环十次
            while (count != 0) {
                // 如果list_student2是空的话，那就放到list-student。反过来也是这样。
                if (list_students2.isEmpty()) {
                    if (list1.get(0) == 1) {// 如果发现要找的是男生,就在男生中挑选
                        // 再新建一个list，存储男生对象
                        List<Student> maleStudents = new ArrayList<>();
                        for (Map.Entry<Student, Integer> entry : map1.entrySet()) {
                            if (entry.getValue() == 1) {
                                maleStudents.add(entry.getKey());
                            }
                            // 删除list_student中的这一项(这个键值对(Student,Integer))，把这一项添加到list_student2中。
                            list_students2.add(entry);
                            list_students.remove(entry);
                        }
                        Random r = new Random();
                        int index = r.nextInt(maleStudents.size());
                        System.out.println("随机点名的男生：" + maleStudents.get(index).getName());
                    } else {// 如果发现要找的是女生
                        // 再新建一个list，存储女生对象
                        List<Student> femaleStudents = new ArrayList<>();
                        for (Map.Entry<Student, Integer> entry : map1.entrySet()) {
                            if (entry.getValue() == 0) {
                                femaleStudents.add(entry.getKey());
                            }
                            // 删除list_student中的这一项(这个键值对(Student,Integer))，把这一项添加到list_student2中。
                            list_students2.add(entry);
                            list_students.remove(entry);
                        }
                        Random r = new Random();
                        int index = r.nextInt(femaleStudents.size());
                        System.out.println("随机点名的女生：" + femaleStudents.get(index).getName());
                    }
                } else {// 如果list_student是空的话，那就放到list-student2。反过来也是这样。
                    if (list1.get(0) == 1) {// 如果发现要找的是男生,就在男生中挑选
                        // 再新建一个list，存储男生对象
                        List<Student> maleStudents = new ArrayList<>();
                        for (Map.Entry<Student, Integer> entry : map1.entrySet()) {
                            if (entry.getValue() == 1) {
                                maleStudents.add(entry.getKey());
                            }
                            // 删除list_student中的这一项(这个键值对(Student,Integer))，把这一项添加到list_student2中。
                            list_students.add(entry);
                            list_students2.remove(entry);
                        }
                        Random r = new Random();
                        int index = r.nextInt(maleStudents.size());
                        System.out.println("随机点名的男生：" + maleStudents.get(index).getName());
                    } else {// 如果发现要找的是女生
                        // 再新建一个list，存储女生对象
                        List<Student> femaleStudents = new ArrayList<>();
                        for (Map.Entry<Student, Integer> entry : map1.entrySet()) {
                            if (entry.getValue() == 0) {
                                femaleStudents.add(entry.getKey());
                            }
                            // 删除list_student中的这一项(这个键值对(Student,Integer))，把这一项添加到list_student2中。
                            list_students.add(entry);
                            list_students2.remove(entry);
                        }
                        Random r = new Random();
                        int index = r.nextInt(femaleStudents.size());
                        System.out.println("随机点名的女生：" + femaleStudents.get(index).getName());
                    }
                }
                count--;
            }
            count = man;
        }
    }
}

// 这里是正确的代码
// package com.itheima.mymap.question;

// import java.util.ArrayList;
// import java.util.Random;
// import java.util.LinkedHashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Collections;
// import com.itheima.mymap.question.Student;

// public class question1 {

// // 班级里有N学生，实现随机点名且已点到的同学不再被点到
// public static void main(String[] args) {
// Student s1 = new Student("1", 1);
// Student s2 = new Student("2", 2);
// Student s3 = new Student("3", 3);
// Student s4 = new Student("4", 4);

// // 定义学生与性别的对应关系：男生标记为1，女生标记为0
// // 这里假设 s1, s2, s3 为男生，s4 为女生
// LinkedHashMap<Student, Integer> map1 = new LinkedHashMap<>();
// map1.put(s1, 1);
// map1.put(s2, 1);
// map1.put(s3, 1);
// map1.put(s4, 0);

// System.out.println("初始学生信息：" + map1);

// // 提取男生和女生到两个 List 中
// List<Student> maleStudents = new ArrayList<>();
// List<Student> femaleStudents = new ArrayList<>();
// for (Map.Entry<Student, Integer> entry : map1.entrySet()) {
// if (entry.getValue() == 1) {
// maleStudents.add(entry.getKey());
// } else {
// femaleStudents.add(entry.getKey());
// }
// }

// // 模拟多次点名（比如点名10次）
// Random r = new Random();
// int totalAttempts = 10;
// for (int i = 0; i < totalAttempts; i++) {
// // 若所有学生都已被点到，则结束
// if (maleStudents.isEmpty() && femaleStudents.isEmpty()) {
// System.out.println("所有同学都已被点到！");
// break;
// }

// // 使用随机数决定选择男生还是女生
// // 0~9 随机数，小于7时表示70%概率选择男生
// int prob = r.nextInt(10);
// if (prob < 7) { // 70%选择男生
// if (!maleStudents.isEmpty()) {
// int index = r.nextInt(maleStudents.size());
// Student selected = maleStudents.remove(index);
// System.out.println("随机点名的男生：" + selected.getName());
// } else if (!femaleStudents.isEmpty()) { // 男生已空则选择女生
// int index = r.nextInt(femaleStudents.size());
// Student selected = femaleStudents.remove(index);
// System.out.println("男生已全部点到,随机点名的女生：" + selected.getName());
// }
// } else { // 30%选择女生
// if (!femaleStudents.isEmpty()) {
// int index = r.nextInt(femaleStudents.size());
// Student selected = femaleStudents.remove(index);
// System.out.println("随机点名的女生：" + selected.getName());
// } else if (!maleStudents.isEmpty()) { // 女生已空则选择男生
// int index = r.nextInt(maleStudents.size());
// Student selected = maleStudents.remove(index);
// System.out.println("女生已全部点到,随机点名的男生：" + selected.getName());
// }
// }
// }
// }
// }
