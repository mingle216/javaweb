package com.soft2176.domain;
/**
 * @author mingle
 * @date 2022/2/20 18:00
 * @description Person类
 */
public class Person {
    private String name;
    private int age;
    public String a;
    protected String b;
    String c;
    private String d;
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
    public void eat(){
        System.out.println("eat.....");
    }
    public void eat(String food){
        System.out.println("eat....."+food);
    }
}

