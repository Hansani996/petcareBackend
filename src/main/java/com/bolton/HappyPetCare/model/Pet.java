package com.bolton.HappyPetCare.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pet")
public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int petId;
	
	@Column(name="petName")
	private String petName;
	@Column(name="breed")
	private String breed;
	@Column(name="color")
	private String color;
	@Column(name="dob")
	private String dob;
	@Column(name = "female")
	private boolean femaie;
	@Column(name = "male")
	private boolean male;
	@Column(name = "specialMarkings")
	private String specialMarkings;

	public Pet() {
		
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public boolean isFemaie() {
		return femaie;
	}

	public void setFemaie(boolean femaie) {
		this.femaie = femaie;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public String getSpecialMarkings() {
		return specialMarkings;
	}

	public void setSpecialMarkings(String specialMarkings) {
		this.specialMarkings = specialMarkings;
	}

	@Override
	public String toString() {
		return "Pet{" +
				"petId=" + petId +
				", petName='" + petName + '\'' +
				", breed='" + breed + '\'' +
				", color='" + color + '\'' +
				", dob='" + dob + '\'' +
				", femaie=" + femaie +
				", male=" + male +
				", specialMarkings='" + specialMarkings + '\'' +
				'}';
	}
}
