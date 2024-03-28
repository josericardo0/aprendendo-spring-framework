package recursosavancados.spring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
class ClasseNormal {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class ClassePrototipo {

}
@Configuration
@ComponentScan
public class EscoposDoSpring {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(recursosavancados.spring.EscoposDoSpring.class)) {

            System.out.println(context.getBean(ClasseNormal.class));
            System.out.println(context.getBean(ClasseNormal.class));

            System.out.println(context.getBean(ClassePrototipo.class));
            System.out.println(context.getBean(ClassePrototipo.class));
            System.out.println(context.getBean(ClassePrototipo.class));
            System.out.println(context.getBean(ClassePrototipo.class));

        }
    }
}
