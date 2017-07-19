package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;

public class SpringTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		User user=(User) context.getBean("user");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
	}

}
