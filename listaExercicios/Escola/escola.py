class Professor:
    def __init__(self, nome):
        self.nome = nome
        self.escolas = []

    def adicionar_escola(self, escola):
        self.escolas.append(escola)

class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []

    def adicionar_professor(self, professor):
        self.professores.append(professor)
        professor.adicionar_escola(self)  

escola1 = Escola("Colégio Alfa")
escola2 = Escola("Colégio Beta")

professor1 = Professor("João da Silva")
professor2 = Professor("Maria Souza")


escola1.adicionar_professor(professor1)
escola1.adicionar_professor(professor2)
escola2.adicionar_professor(professor1)


print(f"As escolas em que {professor1.nome} leciona são:")
for escola in professor1.escolas:
    print(escola.nome)