package entities;

public class Produto {
    
    public String nome;
    public double preco;
    public int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // sobrecarga - novo construtor com quantidade iniciando com 0
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }


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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
