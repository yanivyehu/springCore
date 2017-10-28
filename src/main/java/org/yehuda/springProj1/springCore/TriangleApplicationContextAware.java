package org.yehuda.springProj1.springCore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TriangleApplicationContextAware implements ApplicationContextAware, BeanNameAware {
	
	/** 
	 * context information
	 */
	ApplicationContext myContext;
	String beanName;
	
	
	Point pointA;
	Point pointB;
	Point pointC;
	
	public TriangleApplicationContextAware() {
		// TODO Auto-generated constructor stub
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("Print a Triangle with Context Aware--> " + pointA + "|" + pointB + "|" + pointC);
	}

	/**
	 * this method will be called by the framework 
	 */
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.myContext = applicationContext;		
	}

	/**
	 * this method will be called by the framework.
	 *actually the id
	 */
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		this.beanName = beanName;
		System.out.println("bean name:" + beanName);
	}

}
