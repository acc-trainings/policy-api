package com.acc.training.policyapi.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Policy")
public class Policy {

    @Id
    private String policyId;
    private String policyType;
    private Date policyEffectiveDate;
    private Date policyEndDate;

    public String getPolicyId() {
        return policyId;
    }

    public Date getPolicyEndDate() {
        return policyEndDate;
    }

    public void setPolicyEndDate(Date policyEndDate) {
        this.policyEndDate = policyEndDate;
    }

    public Date getPolicyEffectiveDate() {
        return policyEffectiveDate;
    }

    public void setPolicyEffectiveDate(Date policyEffectiveDate) {
        this.policyEffectiveDate = policyEffectiveDate;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }
    

}
