package domain;

import java.util.Date;

import domain.base.DomainObj;

public class BrowserHistory extends DomainObj {

	private static final long serialVersionUID = -8650410999671950946L;

	private User user;
	
	private PageInfo page;
	
	private Date browserTime;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PageInfo getPage() {
		return page;
	}

	public void setPage(PageInfo page) {
		this.page = page;
	}

	public Date getBrowserTime() {
		return browserTime;
	}

	public void setBrowserTime(Date browserTime) {
		this.browserTime = browserTime;
	}
	
	
}
