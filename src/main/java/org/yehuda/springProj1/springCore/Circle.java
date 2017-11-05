package org.yehuda.springProj1.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Circle implements Shape, ApplicationEventPublisherAware {

	Point center;
	private ApplicationEventPublisher publisher;
	
	public Point getCenter() {
		return center;
	}

	@Required
	@Autowired
	@Qualifier("cir1") //must be a bean with this qualifier value 
	public void setCenter(Point center) {
		this.center = center;
	}
	public void draw() {
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
		System.out.println("Circle: Point is:" + center.getX() + "," + center.getY());
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;		
	}

}
