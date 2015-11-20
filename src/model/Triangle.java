/**
 * 
 */
package model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

/**
 * @author nchinthakindi
 *
 */
public class Triangle implements InitializingBean,DisposableBean,Shape{
	
	
	private Point pointA;
	private Point pointB;
	private Point pointC;

	/**
	 * @return the pointA
	 */
	public Point getPointA() {
		return pointA;
	}

	/**
	 * @param pointA the pointA to set
	 */
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	/**
	 * @return the pointB
	 */
	public Point getPointB() {
		return pointB;
	}

	/**
	 * @param pointB the pointB to set
	 */
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	/**
	 * @return the pointC
	 */
	public Point getPointC() {
		return pointC;
	}

	/**
	 * @param pointC the pointC to set
	 */
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Triangle(String name)
	{
		this.name = name;
	}
	
	public Triangle(String name,Double height)
	{
		this.height = height;
		this.name = name;
	}

	private String name;
	private Double height;

	/**
	 * @return the height
	 */
	public Double getHeight() {
		return height;
	}

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 *//*
	public void setName(String name) {
		this.name = name;
	}*/
	
	public void draw()
	{
		System.out.println(getName() +" Draw Triangle height ");
		
		System.out.println(getPointA().getX() +" Draw Triangle A "+getPointA().getY());
		
		System.out.println(getPointB().getX() +" Draw Triangle B "+getPointB().getY());
		
		System.out.println(getPointC().getX() +" Draw Triangle C "+getPointC().getY());
	}

	@Override
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("Initializing bean init method called for Triangle");
		
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("destroy bean init method called for Triangle");
	}

	public void myInit()
	{
		System.out.println("Initializing bean init method called for Triangle2");
	}
	
	public void destroy2()
	{
		System.out.println("destroy bean init method called for Triangle2");
	}
}
