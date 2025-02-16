package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballClub {
    private final FootballTeam team;

    @Autowired  // Внедрение зависимости команды
    public FootballClub(FootballTeam team) {
        this.team = team;
    }

    public void startTraining() {
        System.out.println("Футбольный клуб организует тренировку.");
        team.practice();
    }
}

