package main.service.apigroupuser;

public class ApiGroupUserResult {

	private Long id;
	private Long apiGroupId;
	private Long apiUserId;
	
	private String apiGroupDisplayName;
	private String apiUserDisplayName;

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getApiUserId() {
		return apiUserId;
	}


	public void setApiUserId(Long apiUserId) {
		this.apiUserId = apiUserId;
	}


	public Long getApiGroupId() {
		return apiGroupId;
	}


	public void setApiGroupId(Long apiGroupId) {
		this.apiGroupId = apiGroupId;
	}


	public String getApiGroupDisplayName() {
		return apiGroupDisplayName;
	}


	public void setApiGroupDisplayName(String apiGroupDisplayName) {
		this.apiGroupDisplayName = apiGroupDisplayName;
	}


	public String getApiUserDisplayName() {
		return apiUserDisplayName;
	}


	public void setApiUserDisplayName(String apiUserDisplayName) {
		this.apiUserDisplayName = apiUserDisplayName;
	}
	
	
	
	
	
}
