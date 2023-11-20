package com.cg.hbm.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;


public class HotelRequestDTO {
	@NotBlank
	private String city;
	
	@NotBlank
	private String hotelName;
	
	@NotBlank
	private String address;
	
	private String description;
	
	@Positive
	private double averageRatePerDay;
	
	@Email
	private String email;
	
	@Pattern(regexp = "\\d{10}")
	private String phone1;
	
	@Pattern(regexp = "\\d{10}")
	private String phone2;
	
	@Pattern(regexp = "www\\.[a-zA-Z0-9]+\\.[a-zA-Z]{2,}")
	private String website;
	
	private boolean isBooked;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAverageRatePerDay() {
		return averageRatePerDay;
	}

	public void setAverageRatePerDay(double averageRatePerDay) {
		this.averageRatePerDay = averageRatePerDay;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	
	
	
}
