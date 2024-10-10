package main

import "fmt"

type Imprimivel interface {
        imprimir()
}

type Relatorio struct {
        conteudo string
}

func (r *Relatorio) imprimir() {
        fmt.Println(r.conteudo)
}

type Contrato struct {
        partes    []string
        clausulas []string
}

func (c *Contrato) imprimir() {
        fmt.Println("Contrato entre:", c.partes)
        fmt.Println("Cláusulas:", c.clausulas)
}

func main() {
        relatorio := Relatorio{"Este é um relatório."}
        contrato := Contrato{[]string{"João", "Maria"}, []string{"Cláusula 1", "Cláusula 2"}}

        documentos := []Imprimivel{&relatorio, &contrato}

        for _, documento := range documentos {
                documento.imprimir()
        }
}