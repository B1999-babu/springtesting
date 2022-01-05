package com.testcase.testing;


import myPackage.dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.Date;

@Configuration
@ComponentScan(basePackages = {"myPackage"})
public class myconfig {


    @Bean("student1")
    @Lazy
    public Student getStudent(){
        System.out.println("Creating first Student Object");
    return new Student("student1");
}

     @Bean("student2")
     @Lazy
     public Student createStudent(){
        System.out.println("Creating Second Student Object");
        return new Student("student2");
     }


    @Bean
    public Date getDate(){
        System.out.println("Creating new Date");
        return  new Date();
}

@Bean
    public Emp getEmp(){

        return new Emp();
}

    @Bean
    public dog dog() {
        return new dog();
    }

}
