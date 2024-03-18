package com.aprendendo.springframework.jogos;


import org.springframework.stereotype.Component;

@Component
public class JogoDoPacman implements JogoConsole{
    public void cima() {
        System.out.println("Mover para cima");
    }

    public void baixo() {
        System.out.println("Mover para baixo");
    }

    public void esquerda() {
        System.out.println("Mover para a esquerda");
    }

    public void direita(){
        System.out.println("Mover para a direita");
    }
}
