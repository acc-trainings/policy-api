package com.acc.training.policyapi.controller;

import com.acc.training.policyapi.model.Policy;
import com.acc.training.policyapi.service.PolicyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyController {

    @Autowired
    PolicyService policyService;

    @RequestMapping("/hello")
    public String hello(){
        return "Greetings from SpringBoot Policy API";
    }

    @RequestMapping(value="/policy", method = RequestMethod.POST)
	public Policy createPolicy(@RequestBody Policy policy) {
		return policyService.createPolicy(policy);
		
	}

    
}
