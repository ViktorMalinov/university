package main.dataaccess.apiuser.dao;

import main.dataaccess.common.NamePersistent;

public class ApiUser extends NamePersistent {
	
	private String displayName;
	private String email;
	private String password;
	private String username;
	

	public String getDisplayName() {
		return displayName;
	}


	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	
	
	
}
