package org.example;

import org.springframework.stereotype.Component;

@Component
public class Agent {
    public void negotiateContract() {
        System.out.println("Агент ведёт переговоры о новом контракте.");
    }
}

