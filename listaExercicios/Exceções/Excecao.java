class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void saque(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}


public class Excecao {
    public static void main(String[] args) {
        try {
            ContaBancaria conta = new ContaBancaria(100);
            conta.saque(150);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage()); 
        }
    }
}

