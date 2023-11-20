package com.cg.hbm.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

public class RoomDetailsRequestDTO {
	
	@Pattern(regexp = "[A-Z]\\d{3}")
	private String roomNo;
	
	@Pattern(regexp = "^(Premium|Suites|Deluxe|Double Deluxe)$")
	private String roomType;
	
	@Positive
	private double ratePerDay;
	
	@NotNull
	private boolean isavailable;
	
	@NotBlank
	private String fileName;
	
	@NotBlank
    private String fileType;

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
	
	
	
	
}
