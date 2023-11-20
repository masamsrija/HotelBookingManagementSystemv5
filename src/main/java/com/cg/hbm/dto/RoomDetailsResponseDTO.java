package com.cg.hbm.dto;

public class RoomDetailsResponseDTO {
	private int id;
	private String roomNo;
	private String roomType;
	private double ratePerDay;
	private boolean isavailable;
	private String fileName;
    private String fileType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public RoomDetailsResponseDTO(int id, String roomNo, String roomType, double ratePerDay, boolean isavailable,
			String fileName, String fileType) {
		super();
		this.id = id;
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.ratePerDay = ratePerDay;
		this.isavailable = isavailable;
		this.fileName = fileName;
		this.fileType = fileType;
	}
	public RoomDetailsResponseDTO() {
		super();
	}
	
	
    
    
    

}
