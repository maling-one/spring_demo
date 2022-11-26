package one.maling.advice;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* one.maling..*.*(..))")
    public void myPoint(){}

    @Before("MyAdvice.myPoint()")
    public void before() {
        System.out.println("前置增强2...");
    }

    @AfterReturning("MyAdvice.myPoint()")
    public void afterReturning() {
        System.out.println("后置增强2...");
    }

    @AfterThrowing("MyAdvice.myPoint()")
    public void afterThrowing() {
        System.out.println("异常增强2...");
    }

    @After("MyAdvice.myPoint()")
    public void after() {
        System.out.println("最终增强2...");
    }
}