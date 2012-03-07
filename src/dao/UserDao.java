package dao;

import java.util.List;

import domain.User;

public class UserDao extends BaseDao<User>{

	public User getUserById(long id){
		return get(User.class, id);
	}
	
	public User getUserByLoginName(String loginName){
		List<User> userList = find("from " + domainName + " where loginName=?", loginName);
		if(userList.size()==0){
			return null;
		}
		return userList.get(0);
	}	
}
