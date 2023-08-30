package com.xamify.springjwt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xamify.springjwt.models.CreateCollege;
import com.xamify.springjwt.models.CreateCourse;
import com.xamify.springjwt.models.Department;
import com.xamify.springjwt.models.Subject;
import com.xamify.springjwt.repository.CourseRepository;
import com.xamify.springjwt.repository.CreateCollegeRepository;
import com.xamify.springjwt.repository.DepartmentRepository;
import com.xamify.springjwt.repository.SubjectRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}

	@GetMapping("/user")
	@PreAuthorize("hasRole('SuperAdmin') or hasRole('CollegeAdmin') or hasRole('Faculty') or hasRole('Student')")
	public String userAccess() {
		return "User Content.";
	}

	@GetMapping("/SuperAdmin")
	@PreAuthorize("hasRole('SuperAdmin')")
	public String superAdminAccess() {
		return "SuperAdmin Board.";
	}

	@GetMapping("/CollegeAmin")
	@PreAuthorize("hasRole('CollegeAdmin')")
	public String adminAccess() {
		return "CollegeAdmin Board.";
	}

	@GetMapping("/Faculty")
	@PreAuthorize("hasRole('Faculty')")
	public String facultyAccess() {
		return "Faculty Board.";
	}

	@GetMapping("/Student")
	@PreAuthorize("hasRole('Student')")
	public String studentAccess() {
		return "Student Board.";
	}

	@Autowired
	CreateCollegeRepository CreateCollegeRepository;

	@PostMapping("/superAdmin/write")
	@PreAuthorize("hasRole('SuperAdmin')")
	public ResponseEntity<CreateCollege> createSuperAdmin(@RequestBody CreateCollege tutorial) {
		try {
			CreateCollege _tutorial = CreateCollegeRepository.save(new CreateCollege(tutorial.getCollegeName(),
					tutorial.getcollegeid(), tutorial.getCollegeLocation(), tutorial.getCollegeEmaill()));
			return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@Autowired
	SubjectRepository subjectRepository;

	@PostMapping("/subject/write")
	@PreAuthorize("hasRole('SuperAdmin')")
	public ResponseEntity<Subject> createSubject(@RequestBody Subject tutorial) {
		try {
			Subject _tutorial = subjectRepository.save(new Subject(tutorial.getsubjectname(), tutorial.getsubjectid(),
					tutorial.getcourseid(), tutorial.getcollegeid()));
			return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@Autowired
	DepartmentRepository departmentRepository;

	@PostMapping("/department/write")
	@PreAuthorize("hasRole('CollegeAdmin')")
	public ResponseEntity<Department> createDepartment(@RequestBody Department tutorial) {
		try {
			Department _tutorial = departmentRepository.save(
					new Department(tutorial.getdepartmentname(), tutorial.getdepartmentid(), tutorial.getcollegeid()));
			return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@Autowired
	CourseRepository CourseRepository;

	@PostMapping("/course/write")
	@PreAuthorize("hasRole('SuperAdmin')")
	public ResponseEntity<CreateCourse> createCourse(@RequestBody CreateCourse tutorial) {
		try {
			CreateCourse _tutorial = CourseRepository.save(new CreateCourse(tutorial.getcoursename(),
					tutorial.getcourseid(), tutorial.getDuration(), tutorial.getcollegeid()));
			return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
