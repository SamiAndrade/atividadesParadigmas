class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0  # Inicializa a velocidade em 0

    def exibir_detalhes(self):
        print(f"\nMarca: {self.marca}\nModelo: {self.modelo}\nAno: {self.ano}")

    def acelerar(self, incremento):
        self.velocidade += incremento
        print(f"Acelerando... Velocidade atual: {self.velocidade} km/h")

    def frear(self, decremento):
        self.velocidade -= decremento
        if self.velocidade < 0:
            self.velocidade = 0  # Não permite velocidade negativa
        print(f"Freando... Velocidade atual: {self.velocidade} km/h")

    def exibir_velocidade(self):
        print(f"Velocidade atual: {self.velocidade} km/h")


if __name__ == "__main__":
    # Instanciando objetos da classe Carro
    carro1 = Carro("Chevrolet", "Onix", 2022)
    carro2 = Carro("Nissan", "Kicks", 2021)
    carro3 = Carro("Hyundai", "HB20", 2023)

    # Exibindo os detalhes de cada carro
    carro1.exibir_detalhes()
    carro2.exibir_detalhes()
    carro3.exibir_detalhes()

    # Testando os métodos de velocidade
    carro1.acelerar(50)  # Acelera 50 km/h
    carro1.frear(20)     # Freia 20 km/h
    carro1.exibir_velocidade()  # Exibe a velocidade atual
