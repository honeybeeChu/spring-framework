package com.max;

import com.max.config.MyConfig;
import com.max.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mymainer {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.register(MyConfig.class);
//		context.refresh();
//		User user = (User) context.getBean("user");
//		System.out.println(user.getName());


		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("application.xml");
		context1.refresh();
		User user = (User) context1.getBean("user");
		System.out.println(user.getName());

	}
}
