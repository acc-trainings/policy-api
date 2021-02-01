package com.acc.training.policyapi.service;

import com.acc.training.policyapi.model.Policy;
import com.acc.training.policyapi.repository.IPolicyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {

    @Autowired
    IPolicyRepository policyRepository;

    public Policy createPolicy(Policy policy) {

        //TODO: Add code to fetch customer details.
		return policyRepository.save(policy);
	}
    
}
