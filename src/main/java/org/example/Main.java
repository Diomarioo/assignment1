package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
          AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Parrot parrot = context.getBean("parrotKesha" ,Parrot.class);
//        System.out.println(parrot.getName());

        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getParrot().getName());

    }
}