package com.book.bytype;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args){
		Resource rs=new ClassPathResource("com/book/bytype/bean.xml");
		BeanFactory beanFactory=new XmlBeanFactory(rs);
		Object o=beanFactory.getBean("id1");
		Category c=(Category) o;
		//System.out.println();
		c.show();
	}

}
