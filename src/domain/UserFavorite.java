package domain;

import domain.base.DomainObj;

public class UserFavorite extends DomainObj {

	private static final long serialVersionUID = -5558562381521462062L;

	private User user;
	
	private Category category;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
