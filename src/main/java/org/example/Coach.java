package org.example;

import org.springframework.stereotype.Component;

@Component
public class Coach {
    public void trainTeam() {
        System.out.println("Тренер проводит тренировку для команды.");
    }
}

