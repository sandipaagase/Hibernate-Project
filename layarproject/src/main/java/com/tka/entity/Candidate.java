package com.tka.entity;

public class Candidate {
	
	
	private String name;
	private int age;
	private String Adress;
	public Candidate() {
		super();
	}
	
	public Candidate(String name, int age, String adress) {
		super();
		this.name = name;
		this.age = age;
		Adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", age=" + age + "]";
	}

	
	
	
	

}
