import java.util.ArrayList;
import java.util.List;

class Professor {
    public String nome;
    public List<Escola> escolas = new ArrayList<>();

    public Professor(String nome) {
        this.nome = nome;
    }

    public void adicionarEscola(Escola escola) {
        escolas.add(escola);
    }
}

class Escola {
    public String nome;
    public List<Professor> professores = new ArrayList<>();

    public Escola(String nome) {
        this.nome = nome;
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
        professor.adicionarEscola(this);
    }

    public static void main(String[] args) {
        Escola escola1 = new Escola("Colégio Alfa");
        Escola escola2 = new Escola("Colégio Beta");

        Professor professor1 = new Professor("João da Silva");
        Professor professor2 = new Professor("Maria Souza");

        escola1.adicionarProfessor(professor1);
        escola1.adicionarProfessor(professor2);
        escola2.adicionarProfessor(professor1);

        System.out.printf("As escolas em que %s leciona são:%n", professor1.nome);
        for (Escola escola : professor1.escolas) {
            System.out.println(escola.nome);
        }
    }
}