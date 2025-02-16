package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballTeam {
    private final Coach coach;

    @Autowired  // Внедрение зависимости тренера
    public FootballTeam(Coach coach) {
        this.coach = coach;
    }

    public void practice() {
        coach.trainTeam();
        System.out.println("Футбольная команда тренируется.");
    }
}

