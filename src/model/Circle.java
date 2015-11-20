/**
 * 
 */
package model;

/**
 * @author nchinthakindi
 *
 */
public class Circle implements Shape{
	private String name;
	private Point center;

	public Point getCenter() {
		return center;
	}

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
		
	}
}
