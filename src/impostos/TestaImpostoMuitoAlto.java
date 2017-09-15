package impostos;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class TestaImpostoMuitoAlto {

    public static void main(String[] args) {
        Imposto impostos = new ImpostoMuitoAlto(new ICMS());

        Orcamento orcamento = new Orcamento(500.0);

        System.out.println(impostos.calcula(orcamento));
    }
}
