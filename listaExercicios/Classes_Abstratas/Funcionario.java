public abstract class Funcionario {
    protected String nome;
    protected String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double calcularSalario();
}

class FuncionarioHorista extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioHorista(String nome, String cpf, double valorHora, int horasTrabalhadas) {
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}

class FuncionarioAssalariado extends Funcionario {
    private double salarioMensal;

    public FuncionarioAssalariado(String nome, String cpf, double salarioMensal) {
        super(nome, cpf);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }

    public static void main(String[] args) {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("João", "12345678901", 20, 160);
        FuncionarioAssalariado funcionarioAssalariado = new FuncionarioAssalariado("Maria", "98765432109", 5000);

        System.out.println(funcionarioHorista.calcularSalario());
        System.out.println(funcionarioAssalariado.calcularSalario());
    }
}
