package com.tka.client;

import java.util.List;

import com.tka.controller.ECIController;
import com.tka.entity.Candidate;
import com.tka.service.Service;

public class ECIClient {

	public static void main(String[] args) {
		
	

		System.out.println("this is client");
		
		ECIController ecicontroller = new ECIController();
        List<Candidate> allCandidates = ecicontroller.getAllCandidates();

	}}