package org.yehuda.springProj1.springCore;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent {

	public DrawEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {	
		// TODO Auto-generated method stub
		return "Draw Event! " + this.getTimestamp();
	}

}
