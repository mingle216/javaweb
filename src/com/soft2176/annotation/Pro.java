package com.soft2176.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author mingle
 * @date 2022/2/20 21:55
 * @description 自定义注解：描述需要执行的类名和方法名
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Pro {
    String className();

    String methodName();
}
