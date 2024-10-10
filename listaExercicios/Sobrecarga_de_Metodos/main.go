package main

import "fmt"

func somar(numeros ...int) int {
        soma := 0
        for _, numero := range numeros {
                soma += numero
        }
        return soma
}

func main() {
        resultadoDoisNumeros := somar(3, 5)
        fmt.Println(resultadoDoisNumeros)

        resultadoTresNumeros := somar(2, 4, 6)
        fmt.Println(resultadoTresNumeros)

        numeros := []int{1, 2, 3, 4, 5}
        resultadoLista := somar(numeros...)
        fmt.Println(resultadoLista)
}