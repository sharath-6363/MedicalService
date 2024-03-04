package com.example.form.Register;

import org.springframework.data.jpa.repository.JpaRepository;


@org.springframework.stereotype.Repository

public interface Repository extends JpaRepository<UserForm, String> {

}
