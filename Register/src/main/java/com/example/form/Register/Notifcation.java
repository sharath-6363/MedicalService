package com.example.form.Register;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity
//@Table(name="Notification")
public class Notifcation {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private int id;
@Column(columnDefinition = "VARCHAR(5000)")
private String notification;
@Column(columnDefinition = "VARCHAR(500)")
private String email;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNotification() {
	return notification;
}
public void setNotification(String notification) {
	this.notification = notification;
}


}
