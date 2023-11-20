package com.cg.hbm.dto;

import java.util.List;
import java.util.Set;

import com.cg.hbm.entity.BookingDetails;
import com.cg.hbm.entity.Review;
import com.cg.hbm.entity.RoomDetails;


public class HotelResponseDTO {
	
	private int hotelId;
	private String city;
	private String hotelName;
	private String address;
	private String description;
	private double averageRatePerDay;
	private String email;
	private String phone1;
	private String phone2;
	private String website;
	private boolean isBooked;
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
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
	public HotelResponseDTO(int hotelId, String city, String hotelName, String address, String description,
			double averageRatePerDay, String email, String phone1, String phone2, String website, boolean isBooked) {
		super();
		this.hotelId = hotelId;
		this.city = city;
		this.hotelName = hotelName;
		this.address = address;
		this.description = description;
		this.averageRatePerDay = averageRatePerDay;
		this.email = email;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.website = website;
		this.isBooked = isBooked;
	}
	public HotelResponseDTO() {
		super();
	}
	
	
	
	
	
}
