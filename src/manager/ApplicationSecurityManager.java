package manager;

import javax.servlet.http.HttpServletRequest;

import domain.User;


public class ApplicationSecurityManager {
	
	private final String USER="user";

	public User getUser(HttpServletRequest request) {
		User user=(User)request.getSession().getAttribute(USER);
		if(user != null){
			return user;
		}
		return null;
	}
	public void saveUser(HttpServletRequest request,User user){
		request.getSession().setAttribute(USER,user);
	}

}
