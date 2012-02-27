package controller;

import manager.ApplicationSecurityManager;

import org.springframework.web.servlet.ModelAndView;
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
	 protected ModelAndView onSubmit(Object command)
			    throws Exception
	{
		 return new ModelAndView(getSuccessView());
	}
	
	
	
	

}
