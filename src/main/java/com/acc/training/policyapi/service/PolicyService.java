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
        return policyRepository.save(policy);
    }

    public Policy getPolicy(String policyId) {
        Policy result = policyRepository.findByPolicyId(policyId);

        //TODO: add web-client code for microservice communication

        if (result == null) {
            return null;
        }
        return result;
    }

}
