package com.example.form.Register;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Service {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private int id;
@Column(columnDefinition = "VARCHAR(100)")
private String service;
@Column(columnDefinition = "VARCHAR(100)")
private String doctor;
@Column(columnDefinition = "VARCHAR(100)")
private String hospital;
@Column(columnDefinition = "VARCHAR(100)")
private String price;
@Column(columnDefinition = "VARCHAR(1000)")
private String description;
@Column(columnDefinition = "LONGTEXT")
private String image;
@Column(columnDefinition = "VARCHAR(1000)")
private String Category;
public String getCategory() {
	return Category;
}
public void setCategory(String category) {
	Category = category;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getService() {
	return service;
}
public void setService(String service) {
	this.service = service;
}
public String getDoctor() {
	return doctor;
}
public void setDoctor(String doctor) {
	this.doctor = doctor;
}
public String getHospital() {
	return hospital;
}
public void setHospital(String hospital) {
	this.hospital = hospital;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}

}