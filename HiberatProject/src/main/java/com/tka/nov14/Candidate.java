package com.tka.nov14;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate" ,schema="batch1194")
public class Candidate {
	@Id
    @Column(name = "eid")
	private int eid;
	
    @Column(name = "name")
	private String name;
    
    @Column(name = "partyname")
	private String partyname;
    
    @Column(name = "assembly")
	private String assembly;
    
    @Column(name = "statename")
	private String statename;
    
	 @Column(name = "gender")
	private String gender;
	 
    @Column(name = "age")
    private int age;
	
	public Candidate() {
		super();
	}
	
	
	public Candidate(int eid, String name, String partyname, String assembly, String statname, String gender, int age) {
		super();
		this.eid = eid;
		this.name = name;
		this.partyname = partyname;
		this.assembly = assembly;
		this.statename = statename;
		this.gender = gender;
		this.age = age;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPartyname() {
		return partyname;
	}


	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}


	public String getAssembly() {
		return assembly;
	}


	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}


	public String getStatename() {
		return statename;
	}


	public void setStatname(String statename) {
		this.statename = statename;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Candidate [name=" + name + ", age=" + age + "]";
	}

	
	
	
}
