package com.demo.app;

import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

	@SubscribeMapping("/topic/greeting")
	public Greeting greeting1() throws Exception {
		Thread.sleep(1000); // simulated delay
		HelloMessage message= new HelloMessage();
		message.setName("Amit kumar ");
		return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
	}
}
