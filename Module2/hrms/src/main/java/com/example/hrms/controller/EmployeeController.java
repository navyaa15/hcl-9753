package com.example.hrms.controller;

import com.example.hrms.model.DemoEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private DemoEmployee demoEmployee;

    @GetMapping("/")
    public String welcome(){
        return "<h2 style='color:red'>Welcome to HRMS App</h2>" +
                "";
    }
    @GetMapping("/add")
    public int sum(){
        System.out.println("inside /add controller point");
        int result = demoEmployee.add();
        System.out.println("result from model="+result);
        return result;
    }

    @GetMapping("/squareroot")
    public double squareroot(){
        System.out.println("Inside /squareroot controller point");
        double result = demoEmployee.squareroot();
        System.out.println("Result of square root is" + result);
        return result;
    }

    @GetMapping("/gtn")
    public int gtn(){
        System.out.println("Inside /gtn controller point");
        int result = demoEmployee.gtn();
        System.out.println("Result of gtn is" + result);
        return result;
    }


}
