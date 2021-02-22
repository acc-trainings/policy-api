package com.acc.training.policyapi.service;

import com.acc.training.policyapi.model.Customer;
import com.acc.training.policyapi.model.Policy;
import com.acc.training.policyapi.repository.IPolicyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PolicyService {

    @Autowired
    IPolicyRepository policyRepository;

    @Autowired
    WebClient customerWebClient;

    public Policy createPolicy(Policy policy) {
        return policyRepository.save(policy);
    }

    public Policy getPolicy(String policyId) {
        Policy result = policyRepository.findByPolicyId(policyId);
        if (result == null) {
            return null;
        }

        String customerId = result.getCustomer().getCustomerId();

        Customer customer = customerWebClient.get().uri("/customer/"+ customerId).retrieve().bodyToMono(Customer.class).block();

        result.setCustomer(customer);
        return result;
    }

}
