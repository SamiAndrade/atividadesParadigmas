package main

import (
    "fmt"
)

type Produto struct {
    Nome  string
    Preco float64
}

func (p Produto) Somar(outro Produto) Produto {
    return Produto{
        Nome:  p.Nome + " + " + outro.Nome,
        Preco: p.Preco + outro.Preco,
    }
}

func main() {
    produto1 := Produto{"Produto A", 10.0}
    produto2 := Produto{"Produto B", 20.0}
    produto3 := produto1.Somar(produto2)
    fmt.Printf("Produto: %s, Preço: %.2f\n", produto3.Nome, produto3.Preco) 
}
