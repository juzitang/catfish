package controller;

import java.net.BindException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.ApplicationSecurityManager;
import manager.UserManager;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import domain.User;

public class LoginController extends SimpleFormController {
	private ApplicationSecurityManager applicationSecurityManager;
	private UserManager userManager;
	private String errorView;

	public ApplicationSecurityManager getApplicationSecurityManager() {
		return applicationSecurityManager;
	}

	public void setApplicationSecurityManager(
			ApplicationSecurityManager applicationSecurityManager) {
		this.applicationSecurityManager = applicationSecurityManager;
	}
	
	 public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public String getErrorView() {
		return errorView;
	}

	public void setErrorView(String errorView) {
		this.errorView = errorView;
	}

	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors)
			    throws Exception
	{
		if(userManager.userIsValidation((User)command)){
			applicationSecurityManager.saveUser(request, (User)command);
			return new ModelAndView(getSuccessView());
		}
		return new ModelAndView(getErrorView());
	}
	
	

}
