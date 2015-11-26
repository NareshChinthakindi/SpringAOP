/**
 * 
 */
package model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @author nchinthakindi
 *
 */
@Component
public class Circle implements Shape,ApplicationEventPublisherAware{
	private String name;
	
	
	private Point center;
	
	private ApplicationEventPublisher publisher;

	public Point getCenter() {
		return center;
	}

	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		System.out.println("Method execu");
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
		System.out.println("Returning");
	}
	
	public void setName(String name,int age)
	{
		
	}

	@Override
	public void draw()
	{
	   System.out.println("Drwaing Circle ("+center.getX() +", "+center.getY()+")");	
	   
	   publisher.publishEvent(new DrawEvent(this));
		
	}
	
	@PostConstruct
	public void initializeCircle()
	{
		System.out.println("Init of Circle");
	}
	
	@PreDestroy
	public void destroyCircle()
	{
		System.out.println("destroy of Circle");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}
}
