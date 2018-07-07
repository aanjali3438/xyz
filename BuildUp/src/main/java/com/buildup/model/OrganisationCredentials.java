package com.buildup.model;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class OrganisationCredentials {

@Column
private String password;

@Id
private String username;

public String getPassword() {
	return password;
}



public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public void setPassword(String password) {
	
	this.password = password;
}


}


