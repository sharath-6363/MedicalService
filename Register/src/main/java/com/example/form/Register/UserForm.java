package com.example.form.Register;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 60)
    private String email;
    private int id;
    
    @Column(length = 60)
    private String name;
    
    @Column(length = 60)
    private String password;
    
    @Column(length = 20) // Adjust length as needed
    private String phone;

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


    // Getters and setters
}
