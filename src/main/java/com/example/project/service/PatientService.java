package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.domain.Patient;
import com.example.project.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
private PatientRepository repo;
	
	public List<Patient> listAll() {
		return repo.findAll();
	}
	
	public void save(Patient std) {
		repo.save(std);
	}
	
	public Patient get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}
