package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.base.DomainObj;

public class BaseDao extends HibernateDaoSupport {

	@SuppressWarnings("unchecked")
	public List<DomainObj> find(String queryString) {
		return getHibernateTemplate().find(queryString);
	}
}
