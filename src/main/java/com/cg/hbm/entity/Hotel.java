package com.cg.hbm.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@ApiModel("detals of hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty("unique hotel id of hotel")
	private int hotelId;
	
	@ApiModelProperty("city of hotel")
	private String city;
	
	@ApiModelProperty("unique hotel hotelName of hotel")
	private String hotelName;
	
	@ApiModelProperty("unique hotel address of hotel")
	private String address;
	
	@ApiModelProperty("unique hotel description of hotel")
	private String description;
	
	@ApiModelProperty("unique hotel average rate per day of hotel")
	private double averageRatePerDay;
	
	@ApiModelProperty("unique hotel emailof hotel")
	private String email;
	
	@ApiModelProperty("unique hotel phone number of hotel")
	private String phone1;
	
	@ApiModelProperty("unique hotel phone number of hotel")
	private String phone2;
	
	@ApiModelProperty("unique hotel website  of hotel")
	private String website;
	
	@ApiModelProperty("booking status of file")
	private boolean isBooked;
	
	@OneToMany(mappedBy = "hotel", cascade = CascadeType.PERSIST)
	private List<RoomDetails> roomDetailsList;
	
	@OneToMany(mappedBy = "hotel",cascade = CascadeType.PERSIST)
	private List<BookingDetails> bookingDetails;
	
	@OneToMany(mappedBy = "hotel",cascade = CascadeType.PERSIST)
	private Set<Review> reviews;

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

	public List<RoomDetails> getRoomDetailsList() {
		return roomDetailsList;
	}

	public void setRoomDetailsList(List<RoomDetails> roomDetailsList) {
		this.roomDetailsList = roomDetailsList;
	}

	public List<BookingDetails> getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(List<BookingDetails> bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}
	
	
}
