package main

import "fmt"

type Professor struct {
    nome     string
    escolas  []*Escola
}

func (p *Professor) adicionarEscola(escola *Escola) {
    p.escolas = append(p.escolas, escola)
}

type Escola struct {
    nome       string
    professores []*Professor
}

func (e *Escola) adicionarProfessor(professor *Professor) {
    e.professores = append(e.professores, professor)
    professor.adicionarEscola(e)
}

func main() {
    escola1 := Escola{nome: "Colégio Alfa"}
    escola2 := Escola{nome: "Colégio Beta"}

    professor1 := Professor{nome: "João da Silva"}
    professor2 := Professor{nome: "Maria Souza"}

    escola1.adicionarProfessor(&professor1)
    escola1.adicionarProfessor(&professor2)
    escola2.adicionarProfessor(&professor1)

    fmt.Printf("As escolas em que %s leciona são:\n", professor1.nome)
    for _, escola := range professor1.escolas {
        fmt.Println(escola.nome)
    }
}