package manager;

import dao.UserDao;
import domain.User;

public class UserManager {
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public boolean userIsValidation(User userToBeChecked){
		User userFromDB=userDao.getUserByLoginName(userToBeChecked.getLoginName());
		if(userFromDB == null){
			return false;
		}
		if(userToBeChecked.getPlainPassword().equals(userFromDB.getPlainPassword())){
			return true;
		}
		return false;
	}
}
