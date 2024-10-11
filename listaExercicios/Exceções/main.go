package main

import (
    "fmt"
)

type SaldoInsuficienteError struct {
    Message string
}

func (e *SaldoInsuficienteError) Error() string {
    return e.Message
}

type ContaBancaria struct {
    saldo float64
}

func NewContaBancaria(saldoInicial float64) *ContaBancaria {
    return &ContaBancaria{saldo: saldoInicial}
}

func (c *ContaBancaria) Saque(valor float64) error {
    if valor > c.saldo {
        return &SaldoInsuficienteError{Message: "Saldo insuficiente para realizar o saque."}
    }
    c.saldo -= valor
    return nil
}

func main() {
    conta := NewContaBancaria(100)
    err := conta.Saque(150)
    if err != nil {
        fmt.Println(err) 
    }
}
