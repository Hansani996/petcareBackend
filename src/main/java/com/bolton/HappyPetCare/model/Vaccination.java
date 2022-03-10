package com.bolton.HappyPetCare.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

//@Getter
//@Setter
@Entity
public class Vaccination {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String vaccineCode;
    private String vaccineName;
    private LocalDateTime date;
    private String doseNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVaccineCode() {
        return vaccineCode;
    }

    public void setVaccineCode(String vaccineCode) {
        this.vaccineCode = vaccineCode;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDoseNumber() {
        return doseNumber;
    }

    public void setDoseNumber(String doseNumber) {
        this.doseNumber = doseNumber;
    }
}
