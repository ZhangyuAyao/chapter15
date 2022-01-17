package com.hspedu.generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenericExercise01 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        MyDate birthday1 = new MyDate(12, 8, 2001);
        MyDate birthday2 = new MyDate(11, 6, 2001);
        MyDate birthday3 = new MyDate(10, 8, 2001);
        employees.add(new Employee("tom", 20000, birthday1));
        employees.add(new Employee("tom", 30000, birthday2));
        employees.add(new Employee("tom", 40000, birthday3));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee && o2 instanceof Employee))
                    return 0;

                int cpr = o1.getName().compareTo(o2.getName());
                if (cpr != 0)
                    return cpr;

                //下面是对birthday的比较，因此，我们最好把这个比较，放在MyDate类里面
                //放在MyDate里面
                return o1.getBirthday().compareTo(o2.getBirthday());

            }
        });

        System.out.println(employees);
    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;


    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {

        int yearMinus = year - o.getYear();
        if (yearMinus != 0)
            return yearMinus;

        int monthMinus = month - o.getMonth();
        if (monthMinus != 0)
            return monthMinus;

        int dayMinus = day - o.getDay();
        if (dayMinus != 0)
            return dayMinus;

        return 0;
    }
}