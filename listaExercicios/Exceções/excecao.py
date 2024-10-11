class SaldoInsuficienteException(Exception):
    def __init__(self, message="Saldo insuficiente para realizar o saque."):
        self.message = message
        super().__init__(self.message)

class ContaBancaria:
    def __init__(self, saldo_inicial):
        self.saldo = saldo_inicial

    def saque(self, valor):
        if valor > self.saldo:
            raise SaldoInsuficienteException()
        self.saldo -= valor
        return self.saldo

try:
    conta = ContaBancaria(100)
    conta.saque(150)
except SaldoInsuficienteException as e:
    print(e) 
