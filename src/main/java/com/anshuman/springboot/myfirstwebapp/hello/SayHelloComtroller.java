package com.anshuman.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloComtroller {

	// http://localhost:8080/sayhello
	@RequestMapping("/sayhello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today?";
	}

	// http://localhost:8080/sayhellohtml
	@RequestMapping("/sayhellohtml")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My First HTML Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first html page with body");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}

	// http://localhost:8080/sayhellojsp
	// /src/main/resources/META_INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("/sayhellojsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}