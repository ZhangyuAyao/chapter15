package com.hspedu.generic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class GenericExercise {
    public static void main(String[] args) {
        Student s1 = new Student("tom", 12);
        Student s2 = new Student("lily", 13);
        Student s3 = new Student("mary", 15);

        HashMap<String, Student> students = new HashMap<>();
        students.put("tom", s1);
        students.put("lily", s2);
        students.put("mary", s3);

        for (String o : students.keySet()) {
            System.out.println(students.get(o));
        }

        Iterator<Map.Entry<String, Student>> iterator = students.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> entry =  iterator.next();
            System.out.println(entry.getValue());

        }


    }
}

class Student {
    public String name;
    public int age;
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

