import java.util.List;

interface Imprimivel {
    void imprimir();
}

class Relatorio implements Imprimivel {
    private String conteudo;

    public Relatorio(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println(conteudo);
    }
}

class Contrato implements Imprimivel {
    private List<String> partes;
    private List<String> clausulas;

    public Contrato(List<String> partes, List<String> clausulas) {
        this.partes = partes;
        this.clausulas = clausulas;
    }

    @Override
    public void imprimir() {
        System.out.println("Contrato entre: " + partes);
        System.out.println("Cláusulas: " + clausulas);
    }

public static void main(String[] args) {
    Relatorio relatorio = new Relatorio("Este é um relatório.");
    Contrato contrato = new Contrato(List.of("João", "Maria"), List.of("Cláusula 1", "Cláusula 2"));

    List<Imprimivel> documentos = List.of(relatorio, contrato);

    for (Imprimivel documento : documentos) {
        documento.imprimir();
    }
}
}