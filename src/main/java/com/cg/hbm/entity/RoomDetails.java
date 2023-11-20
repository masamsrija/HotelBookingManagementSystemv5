package com.cg.hbm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@Entity
@ApiModel("Details of rooms")
public class RoomDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty("unique id of room")
	private int roomId;
	
	@Column(unique = true)
	@ApiModelProperty("unique roomNo of room")
	private String roomNo;
	
	@ApiModelProperty("unique roomType of room")
	private String roomType;
	
	@ApiModelProperty("unique ratePerDay of room")
	private double ratePerDay;
	
	@ApiModelProperty("status of room")
	private boolean isavailable;
	
	//image name
	@ApiModelProperty("unique fileName of room")
	private String fileName;
	
	//image type
	@ApiModelProperty("fileType of room")
    private String fileType;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER )
	@JoinColumn(name = "hotel_id")
	@JsonIgnore
	private Hotel hotel;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getRatePerDay() {
		return ratePerDay;
	}

	public void setRatePerDay(double ratePerDay) {
		this.ratePerDay = ratePerDay;
	}

	public boolean isIsavailable() {
		return isavailable;
	}

	public void setIsavailable(boolean isavailable) {
		this.isavailable = isavailable;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public RoomDetails(int roomId, String roomNo, String roomType, double ratePerDay, boolean isavailable,
			String fileName, String fileType, Hotel hotel) {
		super();
		this.roomId = roomId;
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.ratePerDay = ratePerDay;
		this.isavailable = isavailable;
		this.fileName = fileName;
		this.fileType = fileType;
		this.hotel = hotel;
	}
	
	
	
	
	

}
