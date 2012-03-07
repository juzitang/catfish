package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.ApplicationSecurityManager;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import domain.User;

public class HttpRequestInterceptor extends HandlerInterceptorAdapter {
	
	private ApplicationSecurityManager applicationSecurityManger;
	private String loginPage;
	
	public ApplicationSecurityManager getApplicationSecurityManger() {
		return applicationSecurityManger;
	}

	public void setApplicationSecurityManger(
			ApplicationSecurityManager applicationSecurityManger) {
		this.applicationSecurityManger = applicationSecurityManger;
	}

	public String getLoginPage() {
		return loginPage;
	}

	public void setLoginPage(String loginPage) {
		this.loginPage = loginPage;
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception
		{
			User user=applicationSecurityManger.getUser(request);
			if(user==null){
				response.sendRedirect(this.loginPage);
				return false;
			}
			return true;
		}

}
