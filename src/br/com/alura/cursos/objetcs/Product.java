package br.com.alura.cursos.objetcs;

public class Product {
    private String nome;
    private double valor;

    public Product(String nome, double valor) {
        this.nome = primeiraLetraMaiscula(nome);
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = primeiraLetraMaiscula(nome);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.getNome() + ": R$ " + String.format("%.2f", getValor());
    }

    private String primeiraLetraMaiscula(String nome){
        if (nome == null || nome.isEmpty()){
            return nome;
        }
        return nome.substring(0,1).toUpperCase() + nome.substring(1);
    }
}
