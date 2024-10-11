class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto somar(Produto outro) {
        return new Produto(this.nome + " + " + outro.nome, this.preco + outro.preco);
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: " + preco;
    }

  
    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto A", 10.0);
        Produto produto2 = new Produto("Produto B", 20.0);
        Produto produto3 = produto1.somar(produto2);
        System.out.println(produto3); 
    }
}
