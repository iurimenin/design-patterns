package banco;

import dao.Conta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public abstract class Filtro {

    protected Filtro outroFiltro;

    public Filtro(Filtro outroFiltro) {
        this.outroFiltro = outroFiltro;
    }

    public Filtro() {}

    public abstract List<Conta> filtra(List<Conta> contas);

    protected List<Conta> proximo(List<Conta> contas) {
        if(outroFiltro != null) return outroFiltro.filtra(contas);
        else return new ArrayList<>();
    }
}