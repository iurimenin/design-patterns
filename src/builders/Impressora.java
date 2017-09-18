package builders;

/**
 * Created by Iuri Menin on 18/09/17.
 */
public class Impressora implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("imprimi");
    }
}
