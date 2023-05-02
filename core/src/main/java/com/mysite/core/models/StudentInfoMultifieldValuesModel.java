package com.mysite.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
 
import javax.inject.Inject;
 
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class StudentInfoMultifieldValuesModel {
 
    @Inject
    private String hobby;

    @Inject
    private String interest;

    public String getHobby() {
        return hobby;
    }

    public String getInterest() {
        return interest;
    }

    
}
