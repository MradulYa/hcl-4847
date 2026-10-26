package com.example.hrmsdatabase.repository;

import com.example.hrmsdatabase.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeerepo extends JpaRepository<Employe, Long> {
}
