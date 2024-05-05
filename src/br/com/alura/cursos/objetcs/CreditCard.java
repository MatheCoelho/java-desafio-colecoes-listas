package br.com.alura.cursos.objetcs;

public class CreditCard {
    private double limite = 0.0;
    private double fatura = 0.0;

    public CreditCard(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getFatura() {
        return fatura;
    }

    public void compraCredito(double valor) {
        if (valor > this.getLimite()) {
            throw new IllegalArgumentException("Limite insuficiente!");
        }
        else {
            this.fatura += valor;
            this.limite -= valor;
        }
    }
}