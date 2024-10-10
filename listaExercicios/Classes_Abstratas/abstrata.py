from abc import ABC, abstractmethod

class Funcionario(ABC):
    def __init__(self, nome, cpf):
        self.nome = nome
        self.cpf = cpf

    @abstractmethod
    def calcular_salario(self):
        pass

class FuncionarioHorista(Funcionario):
    def __init__(self, nome, cpf, valor_hora, horas_trabalhadas):
        super().__init__(nome, cpf)
        self.valor_hora = valor_hora
        self.horas_trabalhadas = horas_trabalhadas

    def calcular_salario(self):
        return self.valor_hora * self.horas_trabalhadas

class FuncionarioAssalariado(Funcionario):
    def __init__(self, nome, cpf, salario_mensal):
        super().__init__(nome, cpf)
        self.salario_mensal = salario_mensal

    def calcular_salario(self):
        return self.salario_mensal

funcionario_horista = FuncionarioHorista("João", "12345678901", 20, 160)
funcionario_assalariado = FuncionarioAssalariado("Maria", "98765432109", 5000)

print(funcionario_horista.calcular_salario())  
print(funcionario_assalariado.calcular_salario())  