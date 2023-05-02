package com.mysite.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
 
import javax.inject.Inject;
import java.util.List;
 
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class StudentInfoNoComposite {
 
    @Inject
    private String name;
 
    @Inject
    private String id;
 
    @Inject
    private List<String> hobby;


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<String> getHobby() {
        return hobby;
    }

}