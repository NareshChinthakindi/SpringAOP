/**
 * 
 */
package com;

import model.Triangle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * @author nchinthakindi
 *
 */
public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		ctx.registerShutdownHook();
		
		//BeanFactory ctx = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		Triangle triangle = ctx.getBean("triangle",Triangle.class);
		
		triangle.draw();
		
		triangle.getPointA().setX(2222);
		
		/*System.out.println("triangle "+triangle.hashCode());
		
		triangle = ctx.getBean("triangle",Triangle.class);
		triangle.draw();
		
		System.out.println("triangle "+triangle.hashCode());*/
	}

}
