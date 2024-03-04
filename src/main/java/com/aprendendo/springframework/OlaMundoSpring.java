package com.aprendendo.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OlaMundoSpring {

    public static void main (String [] args) {
        var context = new AnnotationConfigApplicationContext(OlaMundoConfig.class);
        System.out.println(context.getBean("nome"));
        System.out.println(context.getBean("idade"));
        System.out.println(context.getBean("pessoa"));
        System.out.println(context.getBean("endereco1"));
        System.out.println(context.getBean("pessoaParChamadoDeMetodoTresParametros"));
        
    }
}