package com.kh.pre3;

public class Person {
    // 필드(속성)
    String name;
    int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드(기능)
    public void introduce() {
        System.out.println("안녕하세요, 저는 " + name + "이고, " + age + "살입니다.");
    }
}
