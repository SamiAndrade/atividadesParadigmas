class ContaBancaria:
    def __init__(self, titular):
        self.titular = titular
        self.__saldo = 0  # Atributo saldo é privado

    def depositar(self, valor):
        if valor > 0:
            self.__saldo += valor
            print(f"Depositado: R$ {valor:.2f}. Saldo atual: R$ {self.__saldo:.2f}")
        else:
            print("O valor do depósito deve ser positivo.")

    def sacar(self, valor):
        if 0 < valor <= self.__saldo:
            self.__saldo -= valor
            print(f"Sacado: R$ {valor:.2f}. Saldo atual: R$ {self.__saldo:.2f}")
        else:
            print("Valor inválido para saque.")

    def exibir_saldo(self):
        print(f"Saldo atual: R$ {self.__saldo:.2f}")


if __name__ == "__main__":
    # Criando uma conta bancária
    conta = ContaBancaria("João Silva")

    # Depositando e sacando valores
    conta.depositar(1000)
    conta.sacar(300)
    conta.exibir_saldo()
    conta.sacar(800)  # Tentativa de saque inválido
