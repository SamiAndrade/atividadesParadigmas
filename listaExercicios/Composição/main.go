package main

import "fmt"

type Motor struct {
    potencia int
}

func (m *Motor) ligar() {
    fmt.Println("Motor ligado!")
}

func (m *Motor) desligar() {
    fmt.Println("Motor desligado!")
}

type Carro struct {
    modelo string
    motor  *Motor
}

func (c *Carro) acelerar() {
    fmt.Printf("O %s está acelerando com %d cavalos de potência.\n", c.modelo, c.motor.potencia)
}

func main() {
    motor16v := Motor{potencia: 160}
    meuCarro := Carro{modelo: "Gol", motor: &motor16v}

    meuCarro.motor.ligar()
    meuCarro.acelerar()
    meuCarro.motor.desligar()
}