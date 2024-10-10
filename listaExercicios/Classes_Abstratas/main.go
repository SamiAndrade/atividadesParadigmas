package main

import "fmt"

type Funcionario interface {
        calcularSalario() float64
}

type FuncionarioHorista struct {
        nome          string
        cpf           string
        valorHora     float64
        horasTrabalhadas int
}

func (f *FuncionarioHorista) calcularSalario() float64 {
        return f.valorHora * float64(f.horasTrabalhadas)
}

type FuncionarioAssalariado struct {
        nome          string
        cpf           string
        salarioMensal float64
}

func (f *FuncionarioAssalariado) calcularSalario() float64 {
        return f.salarioMensal
}

func main() {
        funcionarioHorista := FuncionarioHorista{
                nome:          "João",
                cpf:           "12345678901",
                valorHora:     20,
                horasTrabalhadas: 160,
        }
        funcionarioAssalariado := FuncionarioAssalariado{
                nome:          "Maria",
                cpf:           "98765432109",
                salarioMensal: 5000,
        }

        fmt.Println(funcionarioHorista.calcularSalario())
        fmt.Println(funcionarioAssalariado.calcularSalario())
}