package controller;

import manager.ApplicationSecurityManager;

import org.springframework.web.servlet.mvc.SimpleFormController;

public class LoginController extends SimpleFormController {
	private ApplicationSecurityManager applicationSecurityManager;

	public ApplicationSecurityManager getApplicationSecurityManager() {
		return applicationSecurityManager;
	}

	public void setApplicationSecurityManager(
			ApplicationSecurityManager applicationSecurityManager) {
		this.applicationSecurityManager = applicationSecurityManager;
	}
	
	
	
	

}
