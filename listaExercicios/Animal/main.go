package main

import "fmt"

// Interface Animal define o método Som
type Animal interface {
    Som()
}

// Estrutura Cachorro implementa a interface Animal
type Cachorro struct{}

func (c Cachorro) Som() {
    fmt.Println("Auau!")
}

// Estrutura Gato implementa a interface Animal
type Gato struct{}

func (g Gato) Som() {
    fmt.Println("Miau!")
}

func fazerSom(animais []Animal) {
    for _, animal := range animais {
        animal.Som()
    }
}

func main() {
    cachorro := Cachorro{}
    gato := Gato{}

    animais := []Animal{cachorro, gato}

    fazerSom(animais)
}