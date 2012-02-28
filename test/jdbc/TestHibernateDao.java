package jdbc;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Admin;


public class TestHibernateDao extends HibernateDaoSupport{
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SessionFactory buildSessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		
		Transaction tx = null;
		tx = session.beginTransaction();
		
		String select = "from Admin as domain ";
		String hql = select;

		Query query = session.createQuery(hql);
		List<Admin> list = query.list();
		session.flush();
		
		tx.commit();
		
		session.close();
		
		System.out.println("List size is " + list.size());
		for(Admin admin : list){
			System.out.println("--------------------------------------");
			System.out.println("Admin id is " + admin.getId());
			System.out.println("Admin loginName is " + admin.getLoginName());
			System.out.println("Admin name is " + admin.getName());
			System.out.println("Admin plainPwd is " + admin.getPlainPassword());
			System.out.println("Admin enPwd is " + admin.getEncrytedPassword());
		}
		
	}

}
