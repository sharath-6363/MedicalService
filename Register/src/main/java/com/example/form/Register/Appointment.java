package com.example.form.Register;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "VARCHAR(100)")
    private String service;

    @Column(columnDefinition = "VARCHAR(100)")
    private String doctorname;	

    @Column(columnDefinition = "VARCHAR(100)")
    private String hospitalname;

    @Column(columnDefinition = "VARCHAR(100)")
    private String aname;

    @Column(columnDefinition = "VARCHAR(100)")
    private String gender;

    @Column(columnDefinition = "VARCHAR(100)")
    private String atimeslot;

    @Column(columnDefinition = "VARCHAR(100)")
    private String date;
    @Column(columnDefinition = "VARCHAR(100)")
    private String email;
    @Column(columnDefinition = "VARCHAR(100)")
    private String status;

    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Getters and setters
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

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAtimeslot() {
        return atimeslot;
    }

    public void setAtimeslot(String atimeslot) {
        this.atimeslot = atimeslot;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
