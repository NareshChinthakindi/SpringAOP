/**
 * 
 */
package model;

import org.springframework.context.ApplicationEvent;

/**
 * @author nchinthakindi
 *
 */
public class DrawEvent extends ApplicationEvent{

	public DrawEvent(Object source) 
	{
		super(source);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return "I am in to String DrawEvent";
	}

}
