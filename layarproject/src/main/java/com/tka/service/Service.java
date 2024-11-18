package com.tka.service;

import java.util.List;

import com.tka.dao.Dao;
import com.tka.entity.Candidate;

public class Service {

	public List<Candidate> getAllCandidates(){
		System.out.println("this is service");
		
		Dao dao=new Dao();
		
		List<Candidate> allCandidates =dao.getAllCandidates();
		 return null;
	}
}
