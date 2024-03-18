package exercicios.mundo.real.spring;


import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CalculoDeNegociosService {
    private DataService dataService;

    public CalculoDeNegociosService(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int acharOMaior(){
        return Arrays.stream(dataService.buscarDados()).max().orElse(0);
    }
}
