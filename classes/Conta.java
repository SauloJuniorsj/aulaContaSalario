package com.github.dmmaycon.classes;

public class Conta {
    private String titular;
    private String numero; // tem que ser 5 digitos
    private Double saldo = 0d;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws Exception{
        if (numero.length() == 5) {
            this.numero = numero;
        } else {
            throw new Exception("Numero de conta invalido");
        }
    }

    public Double getSaldo() {
        return saldo;
    }

    private void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor) {
        setSaldo(valor + getSaldo());
    }
}
