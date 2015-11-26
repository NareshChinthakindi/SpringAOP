/**
 * 
 */
package service;

import org.springframework.stereotype.Component;

import aspect.Loogable;
import model.Circle;
import model.Triangle;

/**
 * @author nchinthakindi
 *
 */
@Component
public class ShapeService {

	private Circle circle;
	private Triangle triangle;
	/**
	 * @return the circle
	 */
	@Loogable
	public Circle getCircle() {
		return circle;
	}
	/**
	 * @param circle the circle to set
	 */
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	/**
	 * @return the triangle
	 */
	public Triangle getTriangle() {
		return triangle;
	}
	/**
	 * @param triangle the triangle to set
	 */
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
}
