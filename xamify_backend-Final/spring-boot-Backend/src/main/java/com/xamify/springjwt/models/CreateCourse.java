package com.xamify.springjwt.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "add_course")
public class CreateCourse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "coursenname")
	private String coursename;
	@Column(name = "courseid")
	private String courseid;
	@Column(name = "Duration")
	private String Duration;
	@Column(name = "collegeid")
	private String collegeid;

	@CreationTimestamp
	private LocalDateTime dateCreated;
	@UpdateTimestamp
	private LocalDateTime dateUpdated;

	public CreateCourse(String coursenname, String courseid, String Duration, String collegeid) {
		this.coursename = coursenname;
		this.courseid = courseid;
		this.Duration = Duration;
		this.collegeid = collegeid;

	}

	public long getId() {
		return id;
	}

	public String getcoursename() {
		return coursename;
	}

	public void setcoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getcourseid() {
		return courseid;
	}

	public void setcourseid(String courseid) {
		this.courseid = courseid;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String Duration) {
		this.Duration = Duration;
	}

	public String getcollegeid() {
		return collegeid;
	}

	public void setCollegeid(String collegeid) {
		this.collegeid = collegeid;
	}

	@Override
	public String toString() {
		return "Tutorial [coursename=" + coursename + ",courseid=" + courseid + " collegeid=" + collegeid
				+ ", Duration=" + Duration + "" + "]";
	}

}
