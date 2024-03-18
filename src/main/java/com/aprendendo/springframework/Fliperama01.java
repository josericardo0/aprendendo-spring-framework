package com.aprendendo.springframework;

import com.aprendendo.springframework.jogos.JogoDoPacman;
import com.aprendendo.springframework.jogos.RodarJogo;


public class Fliperama01 {

    public static void main(String[] args) {
        //var jogoDoContra = new JogoDoContra();
        //var jogoDoMario = new JogoDoMario();
        var jogoDoPacman = new JogoDoPacman();
        var rodarJogo = new RodarJogo(jogoDoPacman);
        rodarJogo.rodar();

    }

}
