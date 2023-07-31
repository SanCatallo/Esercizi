package JavaDoc;

/**
 * @author Samuele
 *
 * WordGames è la classe che ha i due metodi
 * addHelloWord e getFullName che restituiranno:
 * il primo Hello + una parola che si vuole
 * il secondo il proprio nome
 *
 */
public class WordGames {
    public String addHelloWord(String word){
        return "Hello" + " " + word;
    }
    public String getFullName(String name, String surname){
        return name + " " + surname;
    }
}
