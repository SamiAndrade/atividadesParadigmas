class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

class Empresa:
    def __init__(self, nome_empresa):
        self.nome = nome_empresa
        self.empregados = []

    def adicionar_empregado(self, empregado):
        self.empregados.append(empregado)

    def listar_empregados(self):
        for empregado in self.empregados:
            print(f"Nome: {empregado.nome}, Cargo: {empregado.cargo}, Salário: {empregado.salario}")

minha_empresa = Empresa("Minha Empresa")

empregado1 = Empregado("João Silva", "Desenvolvedor", 5000)
empregado2 = Empregado("Maria Santos", "Designer", 4500)

minha_empresa.adicionar_empregado(empregado1)
minha_empresa.adicionar_empregado(empregado2)

minha_empresa.listar_empregados()