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
@Table(name = "add_college")
public class CreateCollege {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "collegename")
	private String collegename;
	@Column(name = "collegeid")
	private String collegeid;
	@Column(name = "collegelocation")
	private String collegelocation;
	@Column(name = "collegeemail")
	private String collegeemail;

	@CreationTimestamp
	private LocalDateTime dateCreated;
	@UpdateTimestamp
	private LocalDateTime dateUpdated;

	public CreateCollege(String collegename, String collegeid, String collegelocation, String collegeemail) {
		this.collegename = collegename;
		this.collegeid = collegeid;
		this.collegelocation = collegelocation;
		this.collegeemail = collegeemail;

	}

	public long getId() {
		return id;
	}

	public String getCollegeName() {
		return collegename;
	}

	public void setCollegeName(String collegename) {
		this.collegename = collegename;
	}

	public String getcollegeid() {
		return collegeid;
	}

	public void setCollegeid(String collegeid) {
		this.collegeid = collegeid;
	}

	public String getCollegeLocation() {
		return collegelocation;
	}

	public void setCollegeLocation(String collegelocation) {
		this.collegelocation = collegelocation;
	}

	public String getCollegeEmaill() {
		return collegeemail;
	}

	public void setCollegeEmaill(String collegeemail) {
		this.collegeemail = collegeemail;

	}

	@Override
	public String toString() {
		return "Tutorial [collegename=" + collegename + ", collegeid=" + collegeid + ", collegelocation="
				+ collegelocation + ", collegeemail=" + collegeemail + "]";
	}

}
