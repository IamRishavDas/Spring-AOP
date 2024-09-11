package com.aop.aop_demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.aop.aop_demo.Model.Details;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {

    ArrayList<Details> list = new ArrayList<>(Arrays.asList(
        new Details("Rishav Das", 16, "CSE"),
        new Details("Satarupa Das", 15, "CSE"),
        new Details("Modon Das", 14, "ECE")
    ));
    
    @GetMapping("/get")
    public List<Details> getDetails() {
        System.out.println("get details called");
        return list;
    }
    

}
