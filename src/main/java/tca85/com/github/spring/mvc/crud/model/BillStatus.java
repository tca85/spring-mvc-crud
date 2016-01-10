package tca85.com.github.spring.mvc.crud.model;

public enum BillStatus {
	PENDING("Pendent"),
	RECEIVED("Received");
	
	private String description;
	
	BillStatus(String description){
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}