package com.cg.hbm.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class UserRequestDTO {
	
	@NotBlank
    @Size(min = 3, max = 50)
	private String username;
	
	@NotBlank
	@Email
	private String email;
	
	@Pattern(regexp = "^[A-Z][A-Za-z]{3}\\d{3}$")
	private String password;
	
	@NotBlank
	private long mobile;
	
	@NotBlank
	private String address;

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
