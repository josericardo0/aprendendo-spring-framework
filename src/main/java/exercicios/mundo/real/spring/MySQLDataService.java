package exercicios.mundo.real.spring;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {
    @Override
    public int[] buscarDados() {
        return new int[] {1,2,3,4,5};
    }
}
