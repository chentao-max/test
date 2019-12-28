package com.spring.test;

import com.spring.bean.Cat;
import com.spring.bean.Student;
import com.spring.bean.Wo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringFramework {
    @Test
    public void testInstance(){
        //1、实例化bean
        Student student = new Student();
        //2、调用当前实例的成员(属性或方法)
        student.setStuName("李明明");
        student.setStuNo("S0001");
        //3、执行输出学员信息
        System.out.println(student);
    }
    @Test
    public void testAssicaction(){
        //1)构建一个wo的实例
        Wo wo = new Wo("W0001","安乐窝");
        //2)构建一个cat的实例
        Cat cat = new Cat("C0001","崽崽",wo);
        //3)构建学生的实例
        Student student = new Student("S0008","宝宝",cat);
        //对象导航(OGNL语言:对象导航图语言)
        System.out.println("一个叫:" + student.getStuName()+"\t养了一只叫:" + student.getCat().getCatName()+"猫\t猫住了一个叫:" + student.getCat().getWo().getWoName()+"的窝!");
    }
    @Test
    public void testIOCAndDI(){
        //1、加载且读取配置文件进行bean实例化及完成依赖注入
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");

        //2、从spring bean容器中获取想要的对象(根据配置文件中的id属性值获取)
        Student student =(Student)applicationContext.getBean("student");

        //3、调用bean
        System.out.println(student.getStuName() +"\t" + student.getCat().getCatName() +"\t" + student.getCat().getWo().getWoName());

    }
}