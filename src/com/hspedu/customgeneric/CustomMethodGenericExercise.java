package com.hspedu.customgeneric;

import java.util.ArrayList;
import java.util.List;

public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        Object o = new String("xx");

        //泛型没有继承性
        //List<Object> list = new ArrayList<String>();

        //举例说明下面三个方法的使用
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA_> list3 = new ArrayList<>();
        List<BB_> list4 = new ArrayList<>();
        List<CC_> list5 = new ArrayList<>();

        //如果是 List<?> c, 可以接受任意的泛型
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //List<? extends AA> c: 支持AA类以及AA类的父类，不限于直接父类
//        printCollection2(list1);//x
//        printCollection2(list2);//x
//        printCollection2(list3);//dui
//        printCollection2(list4);//dui
//        printCollection2(list5);//dui

        //List<? super AA> c：支持AA类以及AA类的父类，不限于直接父类
//        printCollection3(list1);//✓
//        printCollection3(list2);//x
//        printCollection3(list3);//✓
//        printCollection3(list4);//×
//        printCollection3(list5);//×


    }

    //? super 子类类名AA： 支持AA类以及AA类的父类，不限于直接父类
    //规定了泛型的下限
    public static void printCollection3(List<? super AA_> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }

    //? exntend AA 表示上限，可以接受AA或者AA子类
    public static void printCollection2(List<? extends AA_> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }

    public static void printCollection1(List<?> c) {
        for (Object object : c) { // 通配符，取出时，就是Object
            System.out.println(object);
        }
    }


}

class AA_ {

}

class BB_ extends AA_ {}

class CC_ extends BB_ {

}
