/**
 * 
 */
package model;

/**
 * @author nchinthakindi
 *
 */
public class Circle {
	private String name;

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
}
