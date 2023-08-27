package Esercizi;

public class Enumerations {
    public enum Month{
        January, February, March, April, May, June,
        July, August, September, October, November, December
    }
    public static void main(String[] args){
        for (Month month : Month.values()){
            String ending = month.name().endsWith("y") ? "ends with y" : "doesn't end with y";
            System.out.println(month.name() + ": " + ending);
        }
    }
}
