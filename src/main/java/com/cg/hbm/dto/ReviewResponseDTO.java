package com.cg.hbm.dto;


public class ReviewResponseDTO {
	private int id;
	private String reviewContent;
	private double rating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public ReviewResponseDTO(int id, String reviewContent, double rating) {
		super();
		this.id = id;
		this.reviewContent = reviewContent;
		this.rating = rating;
	}
	public ReviewResponseDTO() {
		super();
	}
	
	
	
	
	

}
