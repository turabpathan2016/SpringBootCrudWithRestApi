package com.capgemini;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource rs=new ClassPathResource("com/capgemini/bean.xml");
		BeanFactory beanFactory=new XmlBeanFactory(rs);
		Object o=beanFactory.getBean("id1");
		Student s=(Student)o;
		System.out.println(s.getId());
		System.out.println(s.getName());
		Object o1=beanFactory.getBean("address");
		Address add=(Address) o1;
	System.out.println(add.getAreaname());
	System.out.println(add.getCityname());
		
}
}
