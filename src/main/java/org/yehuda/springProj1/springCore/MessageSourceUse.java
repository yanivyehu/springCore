package org.yehuda.springProj1.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class MessageSourceUse implements Shape {
	
	@Autowired
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void draw() {
		System.out.println("MessageSourceUse: " + this.messageSource.getMessage("greeting", null, "Default greeting", null));
	}
}
