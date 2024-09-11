package com.aop.aop_demo.Aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

import com.aop.aop_demo.Controller.DemoController;


@Aspect
@Component
public class DetailsAspect {

    private Logger logger = LoggerFactory.getLogger(DemoController.class);
    
    @Before("execution (* com.aop.aop_demo.Controller.DemoController.getDetails(..))")
    public void beforeFunction(JoinPoint jp){
        System.out.println("before called");
    }

    @After("execution (* com.aop.aop_demo.Controller.DemoController.getDetails(..))")
    public void afterFunction(JoinPoint jp){
        System.out.println("after called");
    }
}
