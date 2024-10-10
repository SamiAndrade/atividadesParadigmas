class ContaBancaria {
    private String titular;
    private double saldo; // Atributo saldo é privado

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0; // Inicializa o saldo em 0
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depositado: R$ %.2f. Saldo atual: R$ %.2f%n", valor, saldo);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Sacado: R$ %.2f. Saldo atual: R$ %.2f%n", valor, saldo);
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public static void main(String[] args) {
        // Criando uma conta bancária
        ContaBancaria conta = new ContaBancaria("João Silva");

        // Depositando e sacando valores
        conta.depositar(1000);
        conta.sacar(300);
        conta.exibirSaldo();
        conta.sacar(800); // Tentativa de saque inválido
    }
}
