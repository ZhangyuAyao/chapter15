package com.hspedu.junit_;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework01 {
    public static void main(String[] args) {
//        DAO<User> dao = new DAO<>();
//        dao.save("1000", new User(1000, 28, "tom"));
//        dao.save("1001", new User(1001, 30, "milan"));
//        dao.get("1000");
//        dao.update("1000", new User(1000, 19, "tony"));
//        System.out.println(dao.list());
//        dao.delete("1000");
    }

    @Test
    public void testList() {
        //说明
        //这里我们给T 指定类型
        DAO<User> dao = new DAO<>();
        dao.save("001", new User(1, 10, "tom"));
        dao.save("002", new User(2, 18, "king"));
        dao.save("003", new User(3, 38, "smith"));

        List<User> list = dao.list();

        System.out.println("list=" + list);

        dao.update("003", new User(3, 58, "milan"));
        dao.delete("001");
        System.out.println("===修改后=====");
        list = dao.list();
        System.out.println("list=" + list);

        System.out.println("id=003 " + dao.get("003"));//?
    }


}

class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        for (String key : map.keySet()) {
            list.add(map.get(key));
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}