package domain;

import domain.base.DomainObj;

public class Category extends DomainObj {

	private static final long serialVersionUID = 6412866201306962299L;

	private String name;
	
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
