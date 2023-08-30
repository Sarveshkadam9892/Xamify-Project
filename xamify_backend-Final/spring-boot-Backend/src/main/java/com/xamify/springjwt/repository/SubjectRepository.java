package com.xamify.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xamify.springjwt.models.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
