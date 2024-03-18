package exercicios.mundo.real.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService {
    @Override
    public int[] buscarDados() {
        return new int[] {11,22,33,44,55};
    }
}
