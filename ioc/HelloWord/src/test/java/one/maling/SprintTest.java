package one.maling;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SprintTest {
    @Test
    public void test1(){
        //1 获取到了Spring 上下文对象，通过上下文可以获取 IOC 中的 bean 对象
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2 通过 API 获取到 bean 对象
        IUserDao userDao = (IUserDao) classPathXmlApplicationContext.getBean("userDao");
        //3 调用方法
        userDao.save();
    }
}
