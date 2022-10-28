package com.example.project.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String patientname;
	private int patientage;
	private String vaccinetype;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(Long id, String patientname, int patientage, String vaccinetype) {
		super();
		this.id = id;
		this.patientname = patientname;
		this.patientage = patientage;
		this.vaccinetype = vaccinetype;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public int getPatientage() {
		return patientage;
	}
	public void setPatientage(int patientage) {
		this.patientage = patientage;
	}
	public String getVaccinetype() {
		return vaccinetype;
	}
	public void setVaccinetype(String vaccinetype) {
		this.vaccinetype = vaccinetype;
	}
	
	

}
