package com.hspedu.generic;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class GenericDetail {
    public static void main(String[] args) {
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        Pig<A> aPig2 = new Pig<A>(new B());
        aPig2.f();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        //在实际开发中，我们往往简写
        // 编译器会进行类型推断，老师推荐使用下面的写法
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();

        ArrayList<Pig> pigs = new ArrayList<>();


    }
}

class Tiger<E> {
    E e;
    public Tiger() {}

    public Tiger(E e) {
        this.e = e;
    }
}

class A {}
class B extends A {}

class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public void f() {
        System.out.println(e.getClass());
    }
}