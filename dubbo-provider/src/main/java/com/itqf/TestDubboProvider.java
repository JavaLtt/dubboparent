package com.itqf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: liutong
 * @date: 2019-07-26 17:05
 */
public class TestDubboProvider {
    public static void main(String[] args) throws Exception{
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dubboprovider.xml");

        System.in.read();//等待一个键盘录入
    }
}
