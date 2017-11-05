package org.yehuda.springProj1.springCore;

import javax.annotation.Resource;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.beans.ConstructorProperties;

import org.springframework.stereotype.Component;

/**
 * with @Component annotation we tell spring to create a bean with name "rectangle"
 * @author yaniv
 *
 */
@Component
public class Rectangle implements Shape{


	Point leftUp;
	Point leftDown;
	Point rigthUp;
	Point rigthDown;
	
	public Point getLeftUp() {
		return leftUp;
	}

	@Resource
	public void setLeftUp(Point leftUp) {
		this.leftUp = leftUp;
	}

	public Point getLeftDown() {
		return leftDown;
	}

	public void setLeftDown(Point leftDown) {
		this.leftDown = leftDown;
	}

	public Point getRigthUp() {
		return rigthUp;
	}

	
	public void setRigthUp(Point rigthUp) {
		this.rigthUp = rigthUp;
	}

	public Point getRigthDown() {
		return rigthDown;
	}

	public void setRigthDown(Point rigthDown) {
		this.rigthDown = rigthDown;
	}

	@PostConstruct
	public void init() {
		System.out.println("init rectangle");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy rectangle");
	}
	
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle:" + leftDown + leftUp + rigthDown + rigthDown);
	}

}
