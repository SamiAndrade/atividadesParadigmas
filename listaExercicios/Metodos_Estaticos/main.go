package main

import (
    "fmt"
)

type Matematica struct{}

func (Matematica) Fatorial(n int) int {
    if n < 0 {
        panic("Fatorial não é definido para números negativos.")
    }
    if n == 0 || n == 1 {
        return 1
    }
    return n * Matematica{}.Fatorial(n - 1)
}

func main() {
    mat := Matematica{}
    fmt.Println(mat.Fatorial(5))  // Saída: 120
}
