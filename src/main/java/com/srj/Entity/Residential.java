package com.srj.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Residential {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
  
	private String name;
	
	private Long mobile;
	
	private String email;
	
	private String country;
	
	private String state;
	
	private String city;
	
	private int pc;
	
	private int average;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	@Override
	public String toString() {
		return "Residential [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", country="
				+ country + ", state=" + state + ", city=" + city + ", pc=" + pc + ", average=" + average + "]";
	}
	
	
	

}
