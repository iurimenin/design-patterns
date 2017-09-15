package banco;

import dao.Conta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class FiltroMenorQue100Reais extends Filtro {

    public FiltroMenorQue100Reais(Filtro outroFiltro) {
        super(outroFiltro);
    }

    public FiltroMenorQue100Reais() {
        super();
    }

    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> filtrada = new ArrayList<>();
        for(Conta c : contas) {
            if(c.getSaldo() < 100) filtrada.add(c);
        }

        filtrada.addAll(proximo(contas));
        return filtrada;
    }
}
