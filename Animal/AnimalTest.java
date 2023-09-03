package Esercizi.Animal;

public class AnimalTest {
    public static void main(String[] args){
        Animal generalAnimal = new Animal("genericAnimal");
        Lion lion = new Lion("Leon");
        Cow cow = new Cow("Muu Muu");

        generalAnimal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}
