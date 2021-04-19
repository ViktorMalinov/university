package main.dataaccess.lecturer;

public class Lecturer {

	private Long id;
	private Long code;
	private String name;
	private String description;
	private String familyName;
	private Long apiUserId;
	private Long departmentId;
	
	
	public Long getApiUserId() {
		return apiUserId;
	}
	public void setApiUserId(Long apiUserId) {
		this.apiUserId = apiUserId;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
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
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	
}
