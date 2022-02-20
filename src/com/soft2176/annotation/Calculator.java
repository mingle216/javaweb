package com.soft2176.annotation;
/**
 * @author mingle
 * @date 2022/2/20 21:30
 * @description 自定义计算器类，每个方法都用自定义都Check注解来检查是否有运行异常
 */
public class Calculator {
    @Check
    public void add(){
        String str = null;
        int length=str.length();
        System.out.println("1+0="+(1+0));
    }
    @Check
    public void sub(){
        System.out.println("1-0="+(1-0));
    }
    @Check
    public void mul(){
        System.out.println("1*0="+(1*0));
    }
    @Check
    public void divl(){
        System.out.println("1/0="+(1/0));
    }
    public void show(){
        System.out.println("永无bug....");
    }
}
