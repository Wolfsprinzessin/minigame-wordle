import java.util.Scanner;


public class Wordle {
    public static void main(String[] args) {

        String [] words = {"loewe", "tiger", "blume", "wiese", "fluss"};
        String word = words[(int)(Math.random()*words.length)];

        Scanner input = new Scanner(System.in);
        int versuche = 6;
        System.out.println("Du hast " + versuche + " Versuche übrig");

        String guess = "";
        while (guess != word && versuche > 0) {
            guess = input.nextLine();

            // Fehlermeldung, wenn das Wort zu kurz ist
            if (guess.length()!=5) {
                System.out.println("Das Wort muss 5 Buchstaben haben");
                continue;
            }



            for (int i = 0; i < word.length(); i++) {

                boolean didBreak = false;

                for(int j = 0; j < word.length(); j++) {
                    if (guess.charAt(i) == word.charAt(i)){
                        System.out.println("Y");
                        didBreak = true;
                        break;
                    } 
                    if (guess.charAt(i) == word.charAt(j)) {
                        System.out.println("C");
                        didBreak = true;
                        break;
                    }
                }
                if (!didBreak) {
                    System.out.println("X");
                }


            }

        }
        
    }

}