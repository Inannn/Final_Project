package com.example.project.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

import com.example.project.domain.Patient;
import com.example.project.service.PatientService;



@Controller
public class PatientController {

	
	@Autowired
	private PatientService service;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		List<Patient> listpatient = service.listAll();
		model.addAttribute("listpatient", listpatient);
		System.out.println("Get / ");
		return "index";
	}
	
	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("patient", new Patient());
		return "new";
		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String savePatient(@ModelAttribute("patient") Patient std) {
		service.save(std);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/(id)")
	public ModelAndView showEditPatientPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("new");
		Patient std = service.get(id);
		mav.addObject("patient", std);
		return mav;
	}
	
}
