/**
 * 
 */
package com;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author nchinthakindi
 *
 */
public class DisplayNameBeanPostProcessor implements BeanPostProcessor
{

	@Override
	public Object postProcessAfterInitialization(Object beanObject, String beanName)
			throws BeansException
	{
		System.out.println("After Initialization "+beanName);
		return beanObject;
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanObject, String beanName)
			throws BeansException 
	{
		System.out.println("Before Initialization "+beanName);
		return beanObject;
	}

}
