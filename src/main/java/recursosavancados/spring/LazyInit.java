package recursosavancados.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClasseA {

}

@Component
@Lazy
class ClasseB {

    private ClasseA classeA;
    public ClasseB(ClasseA classeA) {
        this.classeA = classeA;
    }
    public void facaAlgumaCoisa() {
        System.out.println("Estou fazendo alguma coisa");
    }
}

@ComponentScan("recursosavancados.spring")
@Configuration
public class LazyInit {



    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(recursosavancados.spring.LazyInit.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println("A inicialização do contexto foi concluída");

            context.getBean(ClasseB.class).facaAlgumaCoisa();
        }
    }
}