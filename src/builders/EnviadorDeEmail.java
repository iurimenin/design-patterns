package builders;

/**
 * Created by Iuri Menin on 18/09/17.
 */
public class EnviadorDeEmail implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("enviaEmail");
    }
}
