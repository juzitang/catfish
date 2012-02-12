package test;

import org.springframework.web.servlet.mvc.SimpleFormController;

public class test extends SimpleFormController {
	
	public test() {
		setCommandClass(Object.class);
	}
}
