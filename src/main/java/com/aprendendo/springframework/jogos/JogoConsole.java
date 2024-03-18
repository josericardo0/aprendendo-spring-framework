package com.aprendendo.springframework.jogos;

import org.springframework.stereotype.Component;

@Component
public interface JogoConsole {
    void cima();
    void baixo();
    void esquerda();
    void direita();

}
