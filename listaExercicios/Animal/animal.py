class Animal:
    def som(self):
        pass 

class Cachorro(Animal):
    def som(self):
        print("Auau!")

class Gato(Animal):
    def som(self):
        print("Miau!")


def fazerSom(animais):
    for animal in animais:
        animal.som()


cachorro = Cachorro()
gato = Gato()

animais = [cachorro, gato]


fazerSom(animais)