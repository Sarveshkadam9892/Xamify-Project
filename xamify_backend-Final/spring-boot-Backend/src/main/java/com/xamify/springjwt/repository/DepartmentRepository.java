package com.xamify.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xamify.springjwt.models.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
