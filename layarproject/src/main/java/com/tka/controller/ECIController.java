package com.tka.controller;

import java.util.List;

import com.tka.dao.Dao;
import com.tka.entity.Candidate;
import com.tka.service.Service;

public class ECIController {
	
	public List<Candidate> getAllCandidates(){
		System.out.println("this is controller");
		
		Service service=new Service();
		
		List<Candidate> allCandidates =service.getAllCandidates();
		return null;
	}

}
