package one.maling.advice;

public class MyAdvice {
    public void before() {
        System.out.println("前置增强...");
    }
    public void afterReturning() {
        System.out.println("后置增强...");
    }
    public void afterThrowing() {
        System.out.println("异常增强...");
    }
    public void after() {
        System.out.println("最终增强...");
    }
}
