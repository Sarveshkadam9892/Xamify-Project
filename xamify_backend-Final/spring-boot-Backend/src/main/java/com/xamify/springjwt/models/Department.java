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
@Table(name = "add_department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "departmentname")
	private String departmentname;
	@Column(name = "departmentid")
	private String departmentid;

	@Column(name = "collegeid")
	private String collegeid;

	@CreationTimestamp
	private LocalDateTime dateCreated;
	@UpdateTimestamp
	private LocalDateTime dateUpdated;

	public Department(String departmentname, String departmentid, String collegeid) {
		this.departmentname = departmentname;
		this.departmentid = departmentid;
		this.collegeid = collegeid;

	}

	public long getId() {
		return id;
	}

	public String getdepartmentname() {
		return departmentname;
	}

	public void setdepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getdepartmentid() {
		return departmentid;
	}

	public void setdepartmentid(String departmentid) {
		this.departmentid = departmentid;
	}

	public String getcollegeid() {
		return collegeid;
	}

	public void setCollegeid(String collegeid) {
		this.collegeid = collegeid;
	}

	@Override
	public String toString() {
		return "Tutorial [departmentname=" + departmentname + ",departmentid=" + departmentid + " collegeid="
				+ collegeid + "" + "]";
	}

}
