package com.tp.patients;

import com.tp.patients.dao.PatientRepository;
import com.tp.patients.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PatientsApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(PatientsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "Haitam", new Date(), false));
        patientRepository.save(new Patient(null, "ハイタム", new Date(), false));
        patientRepository.save(new Patient(null, "Hamza", new Date(), false));
        patientRepository.save(new Patient(null, "Hachim", new Date(), false));
        patientRepository.findAll().forEach(System.out::println);
    }
}
