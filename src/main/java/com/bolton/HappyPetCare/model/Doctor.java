package com.bolton.HappyPetCare.model;

import javax.persistence.*;

@Entity
@Table(name = "veterinarian")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vetId;
    @Column(name="vetFirstName")
    private String vetFirstName;
    @Column(name="vetLastName")
    private String vetLastName;
    @Column(name="vetNic")
    private String vetNic;
    @Column(name="vetEmail")
    private String vetEmail;
    @Column(name="vetMobileNum")
    private String vetMobileNum;

    public int getVetId() {
        return vetId;
    }

    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

    public String getVetFirstName() {
        return vetFirstName;
    }

    public void setVetFirstName(String vetFirstName) {
        this.vetFirstName = vetFirstName;
    }

    public String getVetLastName() {
        return vetLastName;
    }

    public void setVetLastName(String vetLastName) {
        this.vetLastName = vetLastName;
    }

    public String getVetNic() {
        return vetNic;
    }

    public void setVetNic(String vetNic) {
        this.vetNic = vetNic;
    }

    public String getVetEmail() {
        return vetEmail;
    }

    public void setVetEmail(String vetEmail) {
        this.vetEmail = vetEmail;
    }

    public String getVetMobileNum() {
        return vetMobileNum;
    }

    public void setVetMobileNum(String vetMobileNum) {
        this.vetMobileNum = vetMobileNum;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "vetId=" + vetId +
                ", vetFirstName='" + vetFirstName + '\'' +
                ", vetLastName='" + vetLastName + '\'' +
                ", vetNic='" + vetNic + '\'' +
                ", vetEmail='" + vetEmail + '\'' +
                ", vetMobileNum='" + vetMobileNum + '\'' +
                '}';
    }
}
