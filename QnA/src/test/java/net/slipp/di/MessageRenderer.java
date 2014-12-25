package net.slipp.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRenderer {
	private static final Logger log = LoggerFactory.getLogger(MessageRenderer.class);

	private MessageProvider messageProvider;

	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

	public void render() {
		log.debug("message : {}", messageProvider.getMessage());
	}

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("di.xml");
		MessageRenderer renderer = (MessageRenderer)ac.getBean("messageRenderer");
		renderer.render();
	}
}
