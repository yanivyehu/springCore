package org.yehuda.springProj1.springCore;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener<ApplicationEvent> {
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(event.toString());
	}
}
