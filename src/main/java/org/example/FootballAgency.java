package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballAgency {
    private final FootballPlayer player;

    @Autowired
    public FootballAgency(FootballPlayer player) {
        this.player = player;
    }

    public void managePlayer() {
        System.out.println("Футбольное агентство управляет игроком.");
        player.signContract();
    }
}

