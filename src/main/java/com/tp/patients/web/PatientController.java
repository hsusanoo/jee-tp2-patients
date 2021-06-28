package com.tp.patients.web;

import com.tp.patients.dao.PatientRepository;
import com.tp.patients.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping(path="/index")
    public String index() {
        return "index";
    }
    @GetMapping(path="/patients")
    public String patientsList(Model model) {
        List<Patient> patients = patientRepository.findAll();
        model.addAttribute("patients", patients);
        return "patients";
    }

}
