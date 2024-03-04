package com.example.form.Register;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ContactusRepo extends JpaRepository<Contactus, Integer> {

}
