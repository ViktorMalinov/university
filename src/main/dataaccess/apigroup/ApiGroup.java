package main.dataaccess.apigroup;

public class ApiGroup {

	private Long id;
	private Long code;
	private String name;
	private String description;
	
	
	
	public ApiGroup() {
		this.id = 0L;
		this.code = 0L;
		this.name = "";
		this.description = "";
	}


	public ApiGroup(Long id, Long code, String name, String description) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.description = description;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getCode() {
		return code;
	}


	public void setCode(Long code) {
		this.code = code;
	}


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
