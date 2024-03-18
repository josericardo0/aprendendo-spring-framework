package exercicios.mundo.real.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@ComponentScan("exercicios.mundo.real.spring")
@Configuration
public class SpringContextoMundoReal {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(SpringContextoMundoReal.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(CalculoDeNegociosService.class).acharOMaior());

        }
    }
}
