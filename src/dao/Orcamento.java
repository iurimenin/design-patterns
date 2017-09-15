package dao;

import dao.estadoOrcamento.EmAprovacao;
import dao.estadoOrcamento.EstadoDeUmOrcamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private double valor;
    private final List<Item> itens;
    private EstadoDeUmOrcamento estadoAtual;

    public Orcamento(double valor) {
       this.valor = valor;
       this.itens = new ArrayList<>();
       this.estadoAtual = new EmAprovacao();
    }

    public void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova() {
        estadoAtual.aprova(this);
    }

    public void reprova() {
        estadoAtual.reprova(this);
    }

    public void finaliza() {
        estadoAtual.finaliza(this);
    }

    public double getValor() {
        return valor;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public EstadoDeUmOrcamento getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(EstadoDeUmOrcamento estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
}
