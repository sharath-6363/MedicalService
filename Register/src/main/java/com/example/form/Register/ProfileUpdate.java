package com.example.form.Register;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity
//@Table(name = "Profilee2")

public class ProfileUpdate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	@Column(columnDefinition = "LONGTEXT")
	private String image;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAboutdoctor() {
		return aboutdoctor;
	}
	public void setAboutdoctor(String aboutdoctor) {
		this.aboutdoctor = aboutdoctor;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	private String aboutdoctor;
	private String doctorname;
	private BigInteger contact;
	public BigInteger getContact() {
		return contact;
	}
	public void setContact(BigInteger contact) {
		this.contact = contact;
	}
}