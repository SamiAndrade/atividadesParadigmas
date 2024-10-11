class Configuracao {
    private static Configuracao instance;

    private Configuracao() {
        // Inicialização aqui, se necessário
    }

    public static Configuracao getInstance() {
        if (instance == null) {
            instance = new Configuracao();
        }
        return instance;
    }
}

// Exemplo de uso
public class Singleton {
    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstance();
        Configuracao config2 = Configuracao.getInstance();

        System.out.println(config1 == config2);  // Saída: true
    }
}
