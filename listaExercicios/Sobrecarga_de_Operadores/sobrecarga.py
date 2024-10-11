class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def __add__(self, other):
        if isinstance(other, Produto):
            return Produto(f'{self.nome} + {other.nome}', self.preco + other.preco)
        return NotImplemented

    def __str__(self):
        return f'Produto: {self.nome}, Preço: {self.preco}'

produto1 = Produto('Produto A', 10.0)
produto2 = Produto('Produto B', 20.0)
produto3 = produto1 + produto2
print(produto3) 
