class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;


    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void exibirDetalhes() {
        System.out.println("\nMarca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano);
    }

    public void acelerar(int incremento) {
        velocidade += incremento;
        System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
    }

     public void frear(int decremento) {
        velocidade -= decremento;
        if (velocidade < 0) {
            velocidade = 0; // Não permite velocidade negativa
        }
        System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
    }
    
     public void exibirVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
    
    public static void main(String[] args) {
        Carro carro1 = new Carro("Chevrolet", "Onix", 2022);
        Carro carro2 = new Carro("Nissan", "Kicks", 2021);
        Carro carro3 = new Carro("Hyundai", "HB20", 2023);

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
        carro3.exibirDetalhes();
        carro1.acelerar(50);
        carro1.frear(20);
        carro1.exibirVelocidade();
    }
}
