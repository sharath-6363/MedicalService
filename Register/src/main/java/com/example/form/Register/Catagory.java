package com.example.form.Register;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Catagory {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private int id;
@Column(columnDefinition = "VARCHAR(200)")
private String Category;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCategory() {
	return Category;
}
public void setCategory(String category) {
	Category = category;
}
}
