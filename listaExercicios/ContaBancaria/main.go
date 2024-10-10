package main

import (
	"fmt"
)

// Definindo a estrutura ContaBancaria
type ContaBancaria struct {
	titular   string
	 saldo     float64 // Atributo saldo é privado
}

// Método para criar uma nova conta bancária
func NovaContaBancaria(titular string) *ContaBancaria {
	return &ContaBancaria{titular: titular, saldo: 0}
}

// Método para depositar
func (c *ContaBancaria) Depositar(valor float64) {
	if valor > 0 {
		c.saldo += valor
		fmt.Printf("Depositado: R$ %.2f. Saldo atual: R$ %.2f\n", valor, c.saldo)
	} else {
		fmt.Println("O valor do depósito deve ser positivo.")
	}
}

// Método para sacar
func (c *ContaBancaria) Sacar(valor float64) {
	if valor > 0 && valor <= c.saldo {
		c.saldo -= valor
		fmt.Printf("Sacado: R$ %.2f. Saldo atual: R$ %.2f\n", valor, c.saldo)
	} else {
		fmt.Println("Valor inválido para saque.")
	}
}

// Método para exibir o saldo
func (c *ContaBancaria) ExibirSaldo() {
	fmt.Printf("Saldo atual: R$ %.2f\n", c.saldo)
}

func main() {
	// Criando uma conta bancária
	conta := NovaContaBancaria("João Silva")

	// Depositando e sacando valores
	conta.Depositar(1000)
	conta.Sacar(300)
	conta.ExibirSaldo()
	conta.Sacar(800) // Tentativa de saque inválido
}

