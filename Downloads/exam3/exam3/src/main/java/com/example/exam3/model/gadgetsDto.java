package com.example.exam3.model;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;


public class gadgetsDto
{
	@NotEmpty(message = "The name is required")
	private String name;

	@NotEmpty(message = "The brand is required")
	private String brand;

	@NotEmpty(message = "The category is required")
	private String category;

	@Min(0)
	private double price;

	private MultipartFile imageFile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public MultipartFile getImageFile() {
		return imageFile;
	}

	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}
	
	
}
