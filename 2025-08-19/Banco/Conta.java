package Banco;

import Banco.Exception.NotEnoughBalanceException;
import Banco.Exception.WithDrawLimitException;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private double limiteSaque;

    public Conta(int numero, String titular, double saldo, double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) {
       if (valor > limiteSaque) {
           throw new WithDrawLimitException("Withdraw error: The amount exceeds withdraw limit");
       } else if (valor > saldo) {
           throw new NotEnoughBalanceException("Withdraw error: Not enough balance");
       }
        this.saldo -= valor;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
