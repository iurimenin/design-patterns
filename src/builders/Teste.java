package builders;

import java.util.Calendar;

/**
 * Created by Iuri Menin on 18/09/17.
 */
public class Teste {

    public static void main(String[] args) {

        NotaFiscalBuilder builder = new NotaFiscalBuilder()
                .paraEmpresa("Pão de batata")
                .comCnpj("12.345.678/0001-02")
                .com(new ItemDaNotaBuilder().comNome("Item 1").comValor(200.0).constroi())
                .com(new ItemDaNotaBuilder().comNome("Item 2").comValor(300.0).constroi())
                .com(new ItemDaNotaBuilder().comNome("Item 3").comValor(400.0).constroi())
                .comObservacoes("OBS");

        NotaFiscal nf = builder.constroi();

        System.out.println(nf.getValorBruto());
    }
}
