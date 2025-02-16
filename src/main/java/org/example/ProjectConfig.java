package org.example;

import org.springframework.stereotype.Component;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot(){
        Parrot parrot  =new Parrot();
        parrot.setName("Mike");
        return parrot;
    }
    @Bean
    Parrot parrotKesha(){
        Parrot parrot  =new Parrot();
        parrot.setName("Kesha");
        return parrot;
    }

    @Bean
    @Primary
    Parrot parrotRoma(){
        Parrot parrot  =new Parrot();
        parrot.setName("Roma");
        return parrot;
    }

//    @Bean
//    Person personJohn(){
//        Person person = new Person();
//        person.setName("John");
//        person.setParrot(parrotRoma());
//        return person;
//    }



}
