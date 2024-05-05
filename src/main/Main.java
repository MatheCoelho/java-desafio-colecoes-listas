package main;

import br.com.alura.cursos.objetcs.CreditCard;
import br.com.alura.cursos.objetcs.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("%n%nBem vindo ao supermercado JonesJones!%n" +
                "Aqui so aceitamos cartao de credito, passe seu produto!%n%n" +
                "***********************************************************%n%n");

        CreditCard cartao = new CreditCard(1000);
        List<Product> carrinhoCompras = new ArrayList<>();

        while(true){
            System.out.print("Digite o nome do produto (ou sair para encerrar): ");
            String produtoNome = sc.nextLine();

            if (produtoNome.equalsIgnoreCase("sair")){
                System.out.println();
                break;
            }

            System.out.printf("%nDigite o valor do produto: ");
            double produtoValor = sc.nextDouble();
            sc.nextLine();

            try {
                cartao.compraCredito(produtoValor);
                Product produto = new Product(produtoNome, produtoValor);
                carrinhoCompras.add(produto);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                System.out.println();
                break;
            }
        }

        carrinhoCompras.sort(Comparator.comparing(Product :: getValor));

        System.out.printf("%nProdutos comprados: %n%n");
        for(Product produto : carrinhoCompras){
            System.out.println(produto);
        }

        sc.close();
    }
}