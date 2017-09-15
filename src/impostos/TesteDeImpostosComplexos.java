package impostos;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class TesteDeImpostosComplexos {

    public static void main(String[] args) {

        Imposto iss = new ISS(new ICMS(new ICPP()));

        Orcamento orcamento = new Orcamento(500);

        double valor = iss.calcula(orcamento);

        System.out.println(valor);

    }
}
