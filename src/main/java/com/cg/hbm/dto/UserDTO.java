package com.cg.hbm.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDTO {
	private int id;

	@NotEmpty
	@Size(min = 4, message = "user email must be of minimum 4 characters")
	private String username;

	@Email(message = "Email address is not valid")
	private String email;

	@NotNull
	@Size(min = 3, max = 10, message = "Password must be minimum of 3 chars and maximum of 10")
	private String password;

	@NotNull
	private long mobile;
	
	@NotNull @NotEmpty
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
