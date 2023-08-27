package Esercizi;

public class checkscore {
    public static void checkScore(double score) {
        if (score > 0 && score <= 50.0) {
            System.out.println("Average score");
        } else if (score > 50.0 && score <= 100.0) {
            System.out.println("Very good score");
        } else {
            throw new ArithmeticException("Score is out of scale!");
        }
    }
    public static void main(String[] args){
        try{
            checkScore(2.15);
            checkScore(50);
            checkScore(95.02);
            checkScore(100.01);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
