package com.soft2176.junit;

/**
 * @author mingle
 * @date 2022/2/19 20:56
 * @description 计算机类
 */
public class Calculator {
    /**
     * 加法
     * @param  a 整数
     * @param  b 整数
     * @return  两数之和
     */
    public int add(int a,int b){
        //故意的bug
        return a-b;
    }
    /**
     * 减法
     * @param  a 整数
     * @param  b 整数
     * @return  两数之差
     */
    public int sub(int a,int b){
        return a-b;
    }
}
