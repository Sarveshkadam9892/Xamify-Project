package com.xamify.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xamify.springjwt.models.CreateCourse;

public interface CourseRepository extends JpaRepository<CreateCourse, Integer> {

}
