package com.example.form.Register;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Update {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

@Column(columnDefinition = "INT")
private int id;
@Column(columnDefinition = "LONGTEXT")
private String location;
@Column(columnDefinition = "VARCHAR(200)")
private String contect;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getContect() {
	return contect;
}
public void setContect(String contect) {
	this.contect = contect;
}

}
