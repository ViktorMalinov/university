package main.dataaccess.lecturer;

import main.dataaccess.apiuser.ApiUser;
import main.dataaccess.department.Department;

public class Lecturer {

	private Long id;
	private Long code;
	private String name;
	private String description;
	private String familyName;
	
	private ApiUser apiUser;
	private Department department;
	
	
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
	public ApiUser getApiUser() {
		return apiUser;
	}
	public void setApiUser(ApiUser apiUser) {
		this.apiUser = apiUser;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}


	
}
