public class Calculadora {
    public int somar(int... numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultadoDoisNumeros = calculadora.somar(3, 5);
        System.out.println(resultadoDoisNumeros);

        int resultadoTresNumeros = calculadora.somar(2, 4, 6);
        System.out.println(resultadoTresNumeros);

        int[] numeros = {1, 2, 3, 4, 5};
        int resultadoLista = calculadora.somar(numeros);
        System.out.println(resultadoLista);
    }
}