package com.example.form.Register;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity
//@Table(name="Reply1")
public class Reply {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private int id;
private String reply;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getReply() {
	return reply;
}
public void setreply(String reply) {
	this.reply = reply;
}
}
