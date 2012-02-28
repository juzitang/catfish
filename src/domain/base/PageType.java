package domain.base;

public enum PageType {

	Hub(0),
	Subject(1);
	
	private int value;

	private PageType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	
}
