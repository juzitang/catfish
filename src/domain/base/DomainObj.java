package domain.base;

import java.io.Serializable;

public class DomainObj implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5936410245992031286L;

	protected long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
