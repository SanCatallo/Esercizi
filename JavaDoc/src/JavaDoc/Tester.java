package JavaDoc;

/**
 *
 * @author Samuele
 *
 * Tester è usato per testare i metodi di WordGames
 *
 */
public class Tester {
    public static void main(String[] args){
        WordGames wordGames = new WordGames();

        String wordWithHello = wordGames.addHelloWord("Italia");
        System.out.println(wordWithHello);

        String fullName = wordGames.getFullName("Samuele", "Santia");
        System.out.println(fullName);
    }
}
