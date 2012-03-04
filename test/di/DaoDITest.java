package di;

import java.util.List;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import dao.BaseDao;
import domain.base.DomainObj;

public class DaoDITest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext(
				new String[] {"WebContent/WEB-INF/spring.xml", "WebContent/WEB-INF/database.xml", "WebContent/WEB-INF/dao.xml"});
		
		BaseDao baseDao = (BaseDao)fileSystemXmlApplicationContext.getBean("baseDao");
		
		List<DomainObj> admins = baseDao.find("from Admin as domain ");
		
		for(DomainObj domainObj : admins){
			System.out.println("Admin id is " + domainObj.getId());
		}
	}
}
