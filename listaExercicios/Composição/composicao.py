class Motor:
    def __init__(self, potencia):
        self.potencia = potencia

    def ligar(self):
        print("Motor ligado!")

    def desligar(self):
        print("Motor desligado!")

class Carro:
    def __init__(self, modelo, motor):
        self.modelo = modelo
        self.motor = motor

    def acelerar(self):
        print(f"O {self.modelo} está acelerando com {self.motor.potencia} cavalos de potência.")


motor_16v = Motor(160)
meu_carro = Carro("Gol", motor_16v)

meu_carro.motor.ligar()
meu_carro.acelerar()
meu_carro.motor.desligar()