package com.springmvc.proj.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="tbl_user")
@XmlRootElement
public class User {
	
	@Id
	private String id;
	private String username;
	private String password;
	private String email;
	private String accessType;
	private Boolean isActivated;
	
	public User(){
		super();
	}
	
	public User(String id, String username, String password, String email, 
			String accessType, Boolean isActivated) {
		this();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.accessType = accessType;
		this.isActivated = isActivated;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAccessType() {
		return accessType;
	}
	
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}
	
	public Boolean getIsActivated() {
		return isActivated;
	}
	
	public void setIsActivated(Boolean isActivated) {
		this.isActivated = isActivated;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", accessType=" + accessType + ", isActivated=" + isActivated + "]";
	}
}
