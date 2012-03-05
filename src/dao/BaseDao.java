package dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.base.DomainObj;

public abstract class BaseDao<T extends DomainObj> extends HibernateDaoSupport {
	
	protected String domainName;

	@SuppressWarnings("unchecked")
	public List<T> find(String queryString) {
		return getHibernateTemplate().find(queryString);
	}

	public void delete(T obj) {
		getHibernateTemplate().delete(obj);
	}

	public void deleteAll(Collection<T> c) {
		getHibernateTemplate().deleteAll(c);
	}

	@SuppressWarnings({ "unchecked" })
	public List<T> find(String queryString, Object param) {
		return getHibernateTemplate().find(queryString, param);
	}

	@SuppressWarnings({ "unchecked" })
	public List<T> find(String queryString, Object[] params) {
		return getHibernateTemplate().find(queryString, params);
	}

	public List<T> find(String queryString, int first, int max) {
		return find(queryString, new Object[] {}, first, max);
	}

	public List<T> find(String queryString, Object param, int first, int max) {
		return find(queryString, new Object[] { param }, first, max);
	}

	@SuppressWarnings("unchecked")
	public List<T> find(String queryString, Object[] params, int first, int max) {
		Query query = getSession().createQuery(queryString);
		for (int i = 0; i < params.length; i++)
			query.setParameter(i, params[i]);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}

	@SuppressWarnings("unchecked")
	public T get(Class<T> classz, Serializable pk) {
		return (T) getHibernateTemplate().get(classz, pk);
	}

	public void save(T obj) {
		getHibernateTemplate().save(obj);

	}

	public Serializable saveObject(T obj) {
		return getHibernateTemplate().save(obj);

	}

	public void saveOrUpdate(T obj) throws DataAccessException {
		getHibernateTemplate().saveOrUpdate(obj);
	}

	public void saveOrUpdateAll(Collection<T> c) {
		getHibernateTemplate().saveOrUpdateAll(c);

	}

	public void update(T obj) {
		getHibernateTemplate().update(obj);

	}

	public long getCount(String queryString, Object[] params) {
		@SuppressWarnings("rawtypes")
		List list = find(queryString, params);
		if (list == null) {
			return 0;
		}
		long count = 0;
		try {
			count = (Long) list.get(0);
		} catch (Exception e) {
			//do nothing, just keep the original 0 value
		}
		return count;

	}

	public long getCount(String queryString) {
		return getCount(queryString, new Object[] {});

	}

	public void merge(T obj) {
		getHibernateTemplate().merge(obj);
	}

	public void flush() {
		getHibernateTemplate().flush();
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
}
