package com.hspedu.generic;

import java.util.ArrayList;

public class Generic02 {
    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("小黄", 5));

/*      这里添加Cat类型会报错
        arrayList.add(new Cat("招财猫", 8));*/

        /*遍历的时候能够直接取出 Dog 类型*/
        System.out.println("========使用泛型========");
        for (Dog dog : arrayList) {
            System.out.println(dog.getName() + "-" + dog.getAge());
        }


    }
}
