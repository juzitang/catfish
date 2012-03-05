package di;

import java.util.List;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import dao.AdminDao;
import domain.Admin;

public class DaoDITest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext(
				new String[] {"WebContent/WEB-INF/spring.xml", "WebContent/WEB-INF/database.xml", "WebContent/WEB-INF/dao.xml"});
		
		AdminDao adminDao = (AdminDao)fileSystemXmlApplicationContext.getBean("adminDao");
		
		List<Admin> admins = adminDao.find("from Admin as domain ");
		
		for(Admin domainObj : admins){
			System.out.println("-----------------------");
			System.out.println("Admin id is " + domainObj.getId());
			System.out.println("Admin name is " + domainObj.getName());
			System.out.println("Admin login name is " + domainObj.getLoginName());
		}
		
		Admin adminById = adminDao.getAdminById(1L);
		System.out.println("Admin's name is " + adminById.getName());
		
		adminById = adminDao.getAdminByLoginName("loginName29");
		System.out.println("Admin's name is " + adminById.getName());
	}
}
