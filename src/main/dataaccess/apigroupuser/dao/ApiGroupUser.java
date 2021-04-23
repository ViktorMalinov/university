package main.dataaccess.apigroupuser.dao;

import main.dataaccess.apigroup.dao.ApiGroup;
import main.dataaccess.apiuser.dao.ApiUser;

public class ApiGroupUser {

	private Long id;
	
	private ApiGroup apiGroup;
	private ApiUser apiUser;

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public ApiGroup getApiGroup() {
		return apiGroup;
	}


	public void setApiGroup(ApiGroup apiGroup) {
		this.apiGroup = apiGroup;
	}


	public ApiUser getApiUser() {
		return apiUser;
	}


	public void setApiUser(ApiUser apiUser) {
		this.apiUser = apiUser;
	}



	
	

}
