package com.hspedu.customgeneric;

public class CustomGeneric_ {
    public static void main(String[] args) {

    }
}

//1. Tiger 后面泛型，所以我们把 Tiger 就称为自定义泛型类
//2. T，R，M 泛型的标识符，一般是单个大写字母
//3. 标识符可以有多个
//4. 普通成员可以使用泛型（属性、方法）
//5.
class Tiger<T, R, M> {
    String name;
    //只能被定义，不能被初始化
    R r;
    T t;
    M m;
    //因为数组在new的时候，编译器不能确定T的类型，就无法在内存开空间
    //T[] ts = new T[8];

    public Tiger(String name, R r, T t, M m) {//构造器使用泛型
        this.name = name;
        this.r = r;
        this.t = t;
        this.m = m;
    }

    //因为静态是和类相关的，在类加载时，对象还没有创建，因此泛型还没有确定是什么类型
    //所以，如果静态方法和静态属性使用了泛型，JVM就无法完成初始化
    //static R r2;
//    public static void m1(M m) {
//
//    }

    public String getName() {
        return name;
    }

    public R getR() { //方法有9哦那个到泛型
        return r;
    }

    public T getT() {
        return t;
    }

    public M getM() {
        return m;
    }
}
