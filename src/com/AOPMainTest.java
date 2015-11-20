/**
 * 
 */
package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.ShapeService;

/**
 * @author nchinthakindi
 *
 */
public class AOPMainTest 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		ShapeService shapeService = ctx.getBean(ShapeService.class);
		
		shapeService.getCircle().getName();
		
	//	shapeService.getCircle().setName("Ramesh",28);
		
		//System.out.println("Circle "+shapeService.getCircle().getName());
		
		//System.out.println("Triangle "+shapeService.getTriangle().getName());
	}

}
