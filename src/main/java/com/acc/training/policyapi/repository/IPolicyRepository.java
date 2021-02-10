package com.acc.training.policyapi.repository;

import com.acc.training.policyapi.model.Policy;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPolicyRepository extends MongoRepository<Policy, String> {
    
}
