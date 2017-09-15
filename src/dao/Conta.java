package dao;

import dao.estadoConta.EstadoDaConta;
import dao.estadoConta.Positivo;

import java.util.Calendar;

/**
 * Created by Iuri Menin on 14/09/17.
 */
public class Conta {

    private String titular;
    private String nome;
    private Integer numero;
    private Integer agencia;
    private double saldo;
    private Calendar dataAbertura;
    private EstadoDaConta estado;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        estado = new Positivo();
    }

    public void saca(double valor) {
        estado.saca(this, valor);
    }

    public void deposita(double valor) {
        estado.deposita(this, valor);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public EstadoDaConta getEstado() {
        return estado;
    }

    public void setEstado(EstadoDaConta estado) {
        this.estado = estado;
    }
}
