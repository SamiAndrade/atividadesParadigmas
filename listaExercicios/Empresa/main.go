package main

import "fmt"

type Empregado struct {
    nome    string
    cargo   string
    salario float64
}

type Empresa struct {
    nome       string
    empregados []*Empregado
}

func (e *Empresa) adicionarEmpregado(empregado *Empregado) {
    e.empregados = append(e.empregados, empregado)
}

func (e *Empresa) listarEmpregados() {
    for _, empregado := range e.empregados {
        fmt.Printf("Nome: %s, Cargo: %s, Salário: %.2f\n",
            empregado.nome, empregado.cargo, empregado.salario)
    }
}

func main() {
    minhaEmpresa := Empresa{nome: "Minha Empresa"}

    empregado1 := Empregado{"João Silva", "Desenvolvedor", 5000}
    empregado2 := Empregado{"Maria Santos", "Designer", 4500}

    minhaEmpresa.adicionarEmpregado(&empregado1)
    minhaEmpresa.adicionarEmpregado(&empregado2)

    minhaEmpresa.listarEmpregados()
}