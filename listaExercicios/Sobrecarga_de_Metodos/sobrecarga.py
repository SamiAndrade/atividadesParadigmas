class Calculadora:
    def somar(*args):
        resultado = 0
        for numero in args:
            resultado += numero
        return resultado

resultado_dois_numeros = Calculadora.somar(3, 5)
print(resultado_dois_numeros)  

resultado_tres_numeros = Calculadora.somar(2, 4, 6)
print(resultado_tres_numeros) 

numeros = [1, 2, 3, 4, 5]
resultado_lista = Calculadora.somar(*numeros)
print(resultado_lista)  