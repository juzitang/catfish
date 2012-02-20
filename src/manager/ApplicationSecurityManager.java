package manager;

import javax.servlet.http.HttpServletRequest;

import model.User;


public class ApplicationSecurityManager {
	
	private final String USER="user";

	public User getUser(HttpServletRequest request) {
		User user=(User)request.getSession().getAttribute(USER);
		if(user != null){
			return user;
		}
		return null;
	}
	public void saveUser(HttpServletRequest request){
		
	}

}
