package application;

import java.util.Scanner;

import entities.Produto;


public class ProgramaEstoque {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite os dados do produto...");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();


        Produto produto = new Produto(nome, preco);

        System.out.println("Dados do produto: " + produto);
        // System.out.println(produto.nome + ", " + produto.preco + ", " + produto.quantidade);


        System.out.println();

        System.out.print("Digite o número de produtos que deseja adicionar ao estoque: ");
        int quantidade = sc.nextInt();

        produto.adicionarProduto(quantidade);

        System.out.println("Quantidade atualizada: " + produto);


        System.out.println();

        System.out.print("Digite o número de produtos que deseja remover ao estoque: ");
        quantidade = sc.nextInt();

        produto.removerProduto(quantidade);

        System.out.println("Quantidade atualizada: " + produto);


        sc.close();
    }
    
}
