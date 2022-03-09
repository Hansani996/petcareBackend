package com.bolton.HappyPetCare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="owner")
public class Owner implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ownerId",nullable = false , updatable = false)
	private int ownerId;
	
	@Column(name="nic")
	private String nic;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email")
	private String email;

	@JsonIgnore
	@OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
	private List<Pet> pets;
	public Owner() {
		
	}
	
	
	public Owner(int ownerId, String nic, String firstName, String lastName, String email) {
		super();
		this.ownerId = ownerId;
		this.nic = nic;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Owner{" +
				"ownerId=" + ownerId +
				", nic='" + nic + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				'}';
	}

	

	public void setOwnerId(String string) {
		// TODO Auto-generated method stub
		
	}
	
	

}
