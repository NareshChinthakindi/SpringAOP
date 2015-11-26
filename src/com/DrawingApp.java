/**
 * 
 */
package com;

import model.Circle;
import model.Shape;
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
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		

		//BeanFactory ctx = new XmlBeanFactory(new FileSystemResource("spring.xml"));

		Shape shape = ctx.getBean("circle",Shape.class);

		shape.draw();
		
		//System.out.println(ctx.getMessage("greeting", null, null));
	}

}
