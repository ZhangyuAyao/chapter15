package com.hspedu.generic;

public class Generic03 {
    public static void main(String[] args) {
        Person<String> person = new Person<>("韩顺平教育");
        person.show();

        Person<Integer> integerPerson = new Person<Integer>(100);
        integerPerson.show();

    }
}

class Person<E> {
    E s ;//E表示 s的数据类型，该数据类型是在定义 Person 对象的时候指定的，即在编译期间，就确定了E是什么类型

    public Person(E s) {// E也可以是参数类型
        this.s = s;
    }

    public E f() {// 返回类型使用E
        return s;
    }

    public void show() {
        System.out.println(s.getClass()); // 显示s的运行类型
    }
}
