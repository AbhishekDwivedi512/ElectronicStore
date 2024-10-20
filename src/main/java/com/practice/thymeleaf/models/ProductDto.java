package com.practice.thymeleaf.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class ProductDto {
	@NotEmpty(message ="The name is Required")
	private String name;
	
	@NotEmpty(message ="The Brand is Required")
	private String brand;
	
	@NotEmpty(message ="The category is Required")
	private String category;
	
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MultipartFile getImageFile() {
		return imageFile;
	}

	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}
	@Min(0)
	private double price;
	
	@Size(min =10, message ="The description should be at least 10 charater")
	@Size(max =2000,message ="The description cannot exceed 2000 charater")
	private String description;
	
	private MultipartFile imageFile;
}
