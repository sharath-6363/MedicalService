package com.example.form.Register;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//import jakarta.persistence.Table;

@Entity
//@Table(name = "Qurey4")

public class Qurey {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	private String Email;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getQurey() {
		return Qurey;
	}

	public void setQurey(String qurey) {
		Qurey = qurey;
	}

	private String Name;
	private String Qurey;
	private String doctor;
	private String hospital;

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getReplies() {
		return Replies;
	}

	public void setReplies(String replies) {
		Replies = replies;
	}

	private String Replies;

}
