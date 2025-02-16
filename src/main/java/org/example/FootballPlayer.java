package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballPlayer {
    private final Agent agent;

    @Autowired
    public FootballPlayer(Agent agent) {
        this.agent = agent;
    }

    public void signContract() {
        System.out.println("Футболист хочет подписать контракт.");
        agent.negotiateContract();
        System.out.println("Футболист подписал контракт!");
    }
}

