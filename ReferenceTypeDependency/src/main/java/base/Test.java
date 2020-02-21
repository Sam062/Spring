package base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("Config.xml");
		Account a=(Account)ac.getBean("accObj");
		System.out.println(a);
	}

}
