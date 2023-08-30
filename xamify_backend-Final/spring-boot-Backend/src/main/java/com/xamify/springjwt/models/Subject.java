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
@Table(name = "add_subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "subjectname")
	private String subjectname;
	@Column(name = "subjectid")
	private String subjectid;
	@Column(name = "courseid")
	private String courseid;
	@Column(name = "collegeid")
	private String collegeid;
	
	
	@CreationTimestamp
	private LocalDateTime dateCreated;
	@UpdateTimestamp
	private LocalDateTime dateUpdated;

	public Subject(String subjectname, String subjectid, String courseid, String collegeid
			) {
		this.subjectname = subjectname;
		this.subjectid = subjectid;
		this.courseid = courseid;
		this.collegeid = collegeid;
		
	}

	public long getId() {
		return id;
	}

	public String getsubjectname() {
		return subjectname ;
	}

	public void setsubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public String getsubjectid() {
		return subjectid;
	}

	public void setsubjectid(String subjectid) {
		this.subjectid = subjectid;
	}
	public String getcourseid() {
		return courseid;
	}

	public void setcourseid(String courseid) {
		this.courseid = courseid;
	}
	

	public String getcollegeid() {
		return collegeid;
	}

	public void setCollegeid(String collegeid) {
		this.collegeid = collegeid;
	}

	

	

	
	@Override
	public String toString() {
		return "Tutorial [subjectname=" + subjectname + ",subjectid=" + subjectid+",courseid="+courseid +", collegeid=" + collegeid 
			  +""
			  + "]";
	}

}
