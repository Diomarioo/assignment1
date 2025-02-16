package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
          AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        FootballAgency agency = context.getBean(FootballAgency.class);

        // 3. Запускаем метод, который вызовет цепочку действий
        agency.managePlayer();

    }
}
