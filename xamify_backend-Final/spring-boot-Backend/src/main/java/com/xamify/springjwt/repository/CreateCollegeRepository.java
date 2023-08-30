package com.xamify.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xamify.springjwt.models.CreateCollege;


public interface CreateCollegeRepository extends JpaRepository<CreateCollege, Integer> {
	Boolean existsBycollegename(String collegename);

}
