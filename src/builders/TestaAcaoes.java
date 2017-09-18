package builders;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Iuri Menin on 18/09/17.
 */
public class TestaAcaoes {

    public static void main(String[] args) {

        List<AcaoAposGerarNota> acoes = Arrays.asList(new EnviadorDeEmail(), new NotaFiscaDao(),
                new EnviadorDeSms(), new Impressora(), new Multiplicador(2),
                new Multiplicador(3), new Multiplicador(5.5));

        NotaFiscalBuilder builder = new NotaFiscalBuilder(acoes);

        NotaFiscal nf = builder
                .paraEmpresa("Caelum")
                .comCnpj("123")
                .com(new ItemDaNota("Item 1", 200))
                .comObservacoes("OBS").constroi();

        System.out.println(nf.getValorBruto());
    }
}