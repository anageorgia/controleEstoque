package entities;

public class Produto {
    
    public String nome;
    public double preco;
    public int quantidade;


    public double valorTotalEmEstoque(){
        return preco * quantidade;
    }

    public void adicionarProduto(int quantidade){
        // atributo da classe
        // this.quantidade = quantidade da minha classe
        // quantidade = quantidade recebida como parametro aqui

        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome
            + ", R$ "
            + String.format("%.2f", preco)
            + ", "
            + quantidade
            + " unidades, Total: R$ "
            + String.format("%.2f", valorTotalEmEstoque());
    }
}
