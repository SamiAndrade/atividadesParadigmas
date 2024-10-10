package main

import "fmt"

// Definindo a estrutura Carro
type Carro struct {
	marca     string
	modelo    string
	ano       int
	velocidade int // Inicializa a velocidade em 0
}

// Método para exibir detalhes do carro
func (c Carro) exibirDetalhes() {
	fmt.Printf("\nMarca: %s\nModelo: %s\nAno: %d\n", c.marca, c.modelo, c.ano)
}

// Método para acelerar
func (c *Carro) acelerar(incremento int) {
	c.velocidade += incremento
	fmt.Printf("Acelerando... Velocidade atual: %d km/h\n", c.velocidade)
}

// Método para frear
func (c *Carro) frear(decremento int) {
	c.velocidade -= decremento
	if c.velocidade < 0 {
		c.velocidade = 0 // Não permite velocidade negativa
	}
	fmt.Printf("Freando... Velocidade atual: %d km/h\n", c.velocidade)
}

// Método para exibir a velocidade atual
func (c Carro) exibirVelocidade() {
	fmt.Printf("Velocidade atual: %d km/h\n", c.velocidade)
}

func main() {
	// Instanciando objetos da estrutura Carro
	carro1 := Carro{"Chevrolet", "Onix", 2022, 0}
	carro2 := Carro{"Nissan", "Kicks", 2021, 0}
	carro3 := Carro{"Hyundai", "HB20", 2023, 0}

	// Exibindo os detalhes de cada carro
	carro1.exibirDetalhes()
	carro2.exibirDetalhes()
	carro3.exibirDetalhes()

	// Testando os métodos de velocidade
	carro1.acelerar(50)  // Acelera 50 km/h
	carro1.frear(20)     // Freia 20 km/h
	carro1.exibirVelocidade()  // Exibe a velocidade atual
}
