package org.yehuda.springProj1.springCore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("[DisplayNameBeanPostProcessor]: bean Initialized:" + beanName);
		return bean;
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println("In postProcessBeforeInitialization. beanName is:" + beanName);
		return bean;
	}
}
