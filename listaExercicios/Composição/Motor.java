class Motor {
    public int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public void ligar() {
        System.out.println("Motor ligado!");
    }

    public void desligar() {
        System.out.println("Motor desligado!");
    }
}

class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void acelerar() {
        System.out.printf("O %s está acelerando com %d cavalos de potência.%n", modelo, motor.potencia);
    }

    public static void main(String[] args) {
        Motor motor16v = new Motor(160);
        Carro meuCarro = new Carro("Gol", motor16v);

        meuCarro.motor.ligar();
        meuCarro.acelerar();
        meuCarro.motor.desligar();
    }
}