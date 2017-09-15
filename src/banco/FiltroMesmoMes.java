package banco;

import dao.Conta;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class FiltroMesmoMes extends Filtro {

    public FiltroMesmoMes(Filtro outroFiltro) {
        super(outroFiltro);
    }

    public FiltroMesmoMes() {
        super();
    }

    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> filtrada = new ArrayList<Conta>();
        for(Conta c : contas) {
            if(c.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH) &&
                    c.getDataAbertura().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)) {
                filtrada.add(c);
            }
        }

        filtrada.addAll(proximo(contas));
        return filtrada;
    }
}
