class Matematica:
    @staticmethod
    def fatorial(n):
        if n < 0:
            raise ValueError("Fatorial não é definido para números negativos.")
        if n == 0 or n == 1:
            return 1
        return n * Matematica.fatorial(n - 1)


print(Matematica.fatorial(5)) 
