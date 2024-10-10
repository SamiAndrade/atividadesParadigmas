import java.util.ArrayList;
import java.util.List;

class Empregado {
    public String nome;
    public String cargo;
    public double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
}

class Empresa {
    public String nome;
    public List<Empregado> empregados = new ArrayList<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void listarEmpregados() {
        for (Empregado empregado : empregados) {
            System.out.printf("Nome: %s, Cargo: %s, Salário: %.2f%n",
                    empregado.nome, empregado.cargo, empregado.salario);
        }
    }

    public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa("Minha Empresa");

        Empregado empregado1 = new Empregado("João Silva", "Desenvolvedor", 5000);
        Empregado empregado2 = new Empregado("Maria Santos", "Designer", 4500);

        minhaEmpresa.adicionarEmpregado(empregado1);
        minhaEmpresa.adicionarEmpregado(empregado2);

        minhaEmpresa.listarEmpregados();
    }
}