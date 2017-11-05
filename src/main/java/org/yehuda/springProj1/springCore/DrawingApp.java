package org.yehuda.springProj1.springCore;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		/**
		 * Without Spring	 
		Triangle triangle = new Triangle();
		triangle.draw();
		*/
		
		/**
		 * ApplicationContext and Property Initialization
		 */
		ApplicationContext apContext = new ClassPathXmlApplicationContext("springCore.xml");
		Triangle triangle = (Triangle) apContext.getBean("triangle_setter_injection");
		triangle.draw();
		
		Triangle triangle2 = (Triangle) apContext.getBean("triangle_constructor_injection");
		triangle2.draw();
		
		TriangleWithPoints triangle3 = (TriangleWithPoints) apContext.getBean("triangle_bean_injection");
		triangle3.draw();
		
		TriangleWithList triangle4 = (TriangleWithList) apContext.getBean("triangle_list_injection");
		triangle4.draw();
		
		TriangleWithAutoWire triangle5 = (TriangleWithAutoWire) apContext.getBean("triangle_autowire_injection");
		triangle5.draw();
		
		TriangleApplicationContextAware triangle6 = (TriangleApplicationContextAware) apContext.getBean("triangle_aware_injection");
		triangle6.draw();
		
		TriangleWithPoints triangle7 = (TriangleWithPoints) apContext.getBean("triangle_inhertiance_child1");
		triangle7.draw();
		
		TriangleWithPoints triangle8 = (TriangleWithPoints) apContext.getBean("triangle_inhertiance_child2");
		triangle8.draw();
		
		/** 
		 * Coding to interface means that we has a reference to the interface and not to the implementing class
		 */
		Shape shape = (Shape) apContext.getBean("circle1");
		shape.draw();
		
	}
	
}
