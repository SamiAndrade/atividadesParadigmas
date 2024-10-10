class Animal {
    public void som() {
      
    }
}

class Cachorro extends Animal {
    @Override
    public void som() {
        System.out.println("Auau!");
    }
}

class Gato extends Animal {
    @Override
    public void som() {
        System.out.println("Miau!");
    }
}

public class Animais {
    public static void fazerSom(Animal[] animais) {
        for (Animal animal : animais) {
            animal.som();
        }
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        Animal[] animais = {cachorro, gato};

        fazerSom(animais);
    }
}