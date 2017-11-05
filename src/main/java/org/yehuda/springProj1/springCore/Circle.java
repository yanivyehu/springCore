package org.yehuda.springProj1.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	Point center;
	
	public Point getCenter() {
		return center;
	}

	@Required
	@Autowired
	@Qualifier("cir1")
	public void setCenter(Point center) {
		this.center = center;
	}
	public void draw() {
		System.out.println("Circle: Point is" + center.getX() + "," + center.getY());
	}

}
