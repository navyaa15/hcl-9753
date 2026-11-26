package com.example.hrms.model;

import com.example.hrms.repository.EmpRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoEmployee {

    @Autowired
    private EmpRepoImp empRepo;

    public int add(){
      return empRepo.add(20,40);
    }

    public double squareroot(){
        return empRepo.squareroot(200);
    }

    public int gtn(){
        return empRepo.gtn(20, 40);
    }
}
