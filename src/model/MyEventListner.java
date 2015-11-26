/**
 * 
 */
package model;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author nchinthakindi
 *
 */
@Component
public class MyEventListner implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		
		System.out.println("Event "+event.toString());
		
	}

}
