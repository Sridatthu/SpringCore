package com.example.datthu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
//     //here autowired is cheked byType of class
// @Autowired
//     private Laptop laptop;
@Autowired
@Qualifier("desktop")
private Computer comp;//here Computer is interface has two class implements it so they are samet TYPE we get this error Field comp in com.example.datthu.demo.Dev required a single bean, but 2 were found: ,because we have kept the component on both class ,so it  has two objects in IOC so it gets confuse to over come 1.delete one class of it or 2.remove @COmponent on one of class or 3.@primary on of the class so it can have the priorty in both of class or 4.use Qualifer("laptop") it checks ByName ,so keep at @Autowired 

// so if you keep both primary it gives error has No qualifying bean of type 'com.example.datthu.demo.Computer' available: more than one 'primary' bean found among candidates: [desktop, laptop]
// Qualifer has more prefernce then Primary
// @Autowired should be kept on setter function
    public void build(){
         comp.compile();
        System.out.println("building the application");
    }
}
