package com.aprendendo.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClasseDeNegocio {

    Dependencia1 dependencia1;

    Dependencia2 dependencia2;

    //Não precisa de autowired, o Spring cria o objeto quando utilizamos esse tipo de injecao.
    public ClasseDeNegocio(Dependencia1 dependencia1, Dependencia2 dependencia2) {
        super();
        System.out.println("Injecao de construtor para a Classe de Negocio");
        this.dependencia1 = dependencia1;
        this.dependencia2 = dependencia2;
    }

    //    @Autowired
//    public void setDependencia1(Dependencia1 dependencia1) {
//        System.out.println("Injetando o setter da Dependencia1");
//        this.dependencia1 = dependencia1;
//    }
//
//    @Autowired
//    public void setDependencia2(Dependencia2 dependencia2) {
//        System.out.println("Injetando o setter da Dependencia2");
//        this.dependencia2 = dependencia2;
//    }

    public String toString() {
        return "Estou usando: " + dependencia1 + " e " + dependencia2;
    }
}

@Component
class Dependencia1 {

}

@Component
class Dependencia2{

}


@Configuration
@ComponentScan("com.aprendendo.springframework")
    public class Fliperama02 {

        public static void main(String[] args) {

            try (var context = new AnnotationConfigApplicationContext(Fliperama02.class)) {

                Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

                System.out.println(context.getBean(ClasseDeNegocio.class));
            }
        }
    }
