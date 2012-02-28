package domain;

import domain.base.DomainObj;
import domain.base.PageType;

public class PageInfo extends DomainObj {

	private String url;
	
	private PageType pageType;
	
	private String title;
	
	private Category category;
	
	private String content;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public PageType getPageType() {
		return pageType;
	}

	public void setPageType(PageType type) {
		this.pageType = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
