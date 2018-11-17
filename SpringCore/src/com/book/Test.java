package com.book;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args){
		Resource rs=new ClassPathResource("com/book/bean.xml");
		BeanFactory beanFactory=new XmlBeanFactory(rs);
		Object o=beanFactory.getBean("id1");
		Category c=(Category) o;
		//System.out.println();
		c.show();
	/*	Notes: We called id1 from test.java and in bean.xml we have written autowire=byName,
	 *  so first it will checks for the class with id name bk
	 *   [as we have written private Book bk in Categories.java ]
	 *    and inserts bk class [ jaa4s.Book ] properties into that object
	 *     and then injects value “programming book
	 *    ” into name property of Categories class.


*/	}

}
