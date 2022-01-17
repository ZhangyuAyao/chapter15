package com.hspedu.customgeneric;

import java.util.ArrayList;

@SuppressWarnings({"all"})
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马", 100);//当调用方法时，传入参数，编译器，就会确定类型
        System.out.println("===========");
        car.fly(300, 100.1);//当调用方法时，传入参数，编译器，就会确定类型

        //测试
        //T->String , R->ArrayList
        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(), 11.3f);
    }
}

//泛型方法，可以定义在普通类中，也可以定义在泛型类中
class Car {//普通类
    public void run() {//普通方法

    }

    //1. <T, R> 就是泛型
    //2. 提供给fly使用的
    public<T,R> void fly(T t, R r) {//泛型方法
        System.out.println(t.getClass());
        System.out.println(r.getClass());//Integer
    }
}

class Fish<T, R> {
    public void run() {

    }
    //泛型方法
    public<U, M> void eat(U u, M m) { }

    //1. 下面的hi方法不是泛型方法
    //2. 是hi方法使用了类声明的 泛型
    public void hi(T t) { }
    //泛型方法，可以使用类声明的泛型，也可以使用自己声明的泛型
    public<K> void hello(R r, K k) {
        System.out.println(r.getClass());//ArrayList
        System.out.println(k.getClass());//Float
    }
}
