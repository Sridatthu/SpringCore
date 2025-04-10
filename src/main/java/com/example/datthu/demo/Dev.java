package com.example.datthu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    // Laptop laptop=new Laptop(); manual way of cration of object

    // private Laptop laptop; //by keeping the Laptop component class also Component it gives us null pointer exception
    // @Autowired  //FIELD INJECTION
    // private Laptop laptop;

    // public Dev(Laptop laptop){ CONSTRUCTOR INJECTION
    //     this.laptop = laptop;
    // }
// @Autowired
    // private  Laptop laptop;
    // public  void setLaptop(Laptop laptop){ SETTER INJECTION BUT WE HAVE TO KEPT THE @AUTOWIRED ON IT 
    //     this.laptop=laptop;
    // }
    public void build(){
        // laptop.compile();
        System.out.println("building the application");
    }
}
