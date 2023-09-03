package Esercizi.Animal;

public class Lion extends Animal{
    public Lion(String animalName) {
        super(animalName);
    }
    @Override
    public void animalSound(){
        System.out.println(animalName + " Roars");
    }
}
