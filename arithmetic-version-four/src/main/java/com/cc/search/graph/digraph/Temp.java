package com.cc.search.graph.digraph;

import com.cc.search.basedatastrusts.Stack;
import com.cc.search.sort.SelectSort;
import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: DataStructuresAndAlgorithms
 * @description:
 * @author: SunChao
 * @create: 2020-10-19 16:58
 **/
public class Temp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        Stack<Object> objects = new Stack<>();

        Person person1 = new Person("张三", 45);
        Person person2 = new Person("李四", 23);
        Person person3 = new Person("王五", 56);
        Person person4 = new Person("赵六", 34);
        Person[] personArr = new Person[4];
        personArr[0] = person1;
        personArr[1] = person2;
        personArr[2] = person3;
        personArr[3] = person4;
        SelectSort.sort(personArr);
        for (Person person : personArr) {
            System.out.println(person);
        }
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        return person.age > this.age ? 1 : -1;
    }
}
