package com.hspedu.customgeneric;

public class CustomInterfaceGeneric {

}


interface IA extends IUsb<String, Double> {
}

//当我们去实现 IA 接口时，因为 IA 在继承 IUsb 接口时，制订了U 为String R为Double
//因此在实现 IUsb 接口的方法时，使用 String 替换U，是 Double 替换 R
class AA implements IA {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double aDouble, String u1, String u2) {

    }
}

//实现接口时，直接指定泛型接口的类型
//给U 制订了Integer 给 R 指定了Float
//所以，当我们实现了IUsb方法时，会使用Integer替换U，使用Float替换R
class BB implements IUsb<Integer, Float> {

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float aFloat, Integer u1, Integer u2) {

    }
}

//没有指定类型，默认为Object
//建议直接写成 IUsb<Object, Object>
//class CC implements IUsb {//等价于 class CC implements IUsb<Object, Object>
//}

interface IUsb<U, R> {

    int n = 10;
    //U name = "hsp";静态成员不能使用泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r, U u1, U u2);

    static void method1(int i) {

    }
    default R method(U u) {
        return null;
    }

}
