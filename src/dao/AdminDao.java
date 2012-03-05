package dao;

import java.util.List;

import domain.Admin;

public class AdminDao extends BaseDao<Admin> {

	public Admin getAdminById(long id){
		return get(Admin.class, id);
	}
	
	public Admin getAdminByLoginName(String loginName){
		
		List<Admin> adminList = find("from " + domainName + " where loginName=?", loginName);
		if(adminList.size()==0){
			return null;
		}
		return adminList.get(0);
	}
}
