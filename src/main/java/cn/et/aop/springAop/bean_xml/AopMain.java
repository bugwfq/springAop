package cn.et.aop.springAop.bean_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
	ApplicationContext ac = new GenericXmlApplicationContext("classpath:cn/et/aop/springAop/bean_xml/spring.xml");
		UserManager manager = ac.getBean("userManager",UserManager.class);
		manager.add();
		manager.delete();
		manager.update();
		manager.query();
	}
}
