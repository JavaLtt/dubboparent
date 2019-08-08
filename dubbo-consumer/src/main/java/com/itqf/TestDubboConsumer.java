package com.itqf;

import com.itqf.pojo.User;
import com.itqf.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author: liutong
 * @date: 2019-07-26 17:29
 */
public class TestDubboConsumer {
    public static void main(String[] args) throws Exception{
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dubboConsumer.xml");
        UserService userService = (UserService) ac.getBean("userService");
        List<User> users = userService.findAll();
        System.out.println(users);

        System.in.read();


    }
}
