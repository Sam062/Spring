package base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("Config.xml");
		SpringBean s=(SpringBean)ac.getBean("obj");
		System.out.println(s);
	}

}
