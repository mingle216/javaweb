package com.soft2176.reflect;

import com.soft2176.domain.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author mingle
 * @date 2022/2/20 20:52
 * @description 反射练习四----执行指定的方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        //1.获取Person的Class对象
        Class<Person> personClass = Person.class;
        //2.获取指定名称的方法eat(无参的)
        Method eatMethod = personClass.getMethod("eat");
        Person p = new Person();
        //3.通过invoke执行目标方法
        eatMethod.invoke(p);
        //4.获取带String 类型参数的eat方法
        Method eatmethod2 = personClass.getMethod("eat",String.class);
        //5.执行带参数的eat方法
        eatmethod2.invoke(p,"饭");
        //System.out.println("=========================“);
        //6.获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for(Method method:methods){
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
            method.setAccessible(true);
        }
        //7.获取类名
        String className = personClass.getName();
        System.out.println(className);
    }
}
