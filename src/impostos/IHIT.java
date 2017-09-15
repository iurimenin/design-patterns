package impostos;

import dao.Item;
import dao.Orcamento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class IHIT extends TemplateDeImpostoCondicional {

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.13 + 100;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * (0.01 * orcamento.getItens().size());
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        List<String> noOrcamento = new ArrayList<>();

        for(Item item : orcamento.getItens()) {
            if(noOrcamento.contains(item.getNome())) return true;
            else noOrcamento.add(item.getNome());
        }

        return false;
    }
}