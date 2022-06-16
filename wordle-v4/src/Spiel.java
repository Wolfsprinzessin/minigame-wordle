package src;

import java.util.Scanner;

public class Spiel extends SpielOberflaeche {

    public static Scanner s = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";

    static int versuche;
    static char[] input;
    static long startTime;
    static char[] answer;
    static boolean done;
    static String loesungsWort;

    //Konstruktor
    Spiel() {

        startWordle();

    }
   

    public static void startWordle() {
        versuche = 0;
        System.out.println("Wordle: Bitte Wort mit 5 Buchstaben eingeben.");
        RandomWord loesungsWort = new RandomWord();
        System.out.println(loesungsWort);

        answer = new char[5];
        
        //for (int i = 0; i < 5; i++ ) answer[i] = loesungsWort.charAt(i);

        input = new char[5];
    }

    public static void EndWordle() {
        System.out.println("Wordle: Die Antwort war: " + new String(loesungsWort));
        System.out.println("Wordle: Gelöst in " + ((System.currentTimeMillis() - startTime) / 1000) + " Sekunden und " + versuche + " Versuchen.");

        eingabewort.setEnabled(false);
        eingabewort.setVisible(false);

        if (!done) stats.setText("<html><font size='1' color=red> " + "Die Antwort war: " + new String(loesungsWort));
        else  stats.setText("<html><font size='1' color=green> " + "Gelöst in \n " + ((System.currentTimeMillis() - startTime) / 1000) + " Sekunden und " + versuche + " Versuchen." + "</font> <font");

    }

    public static void buttonPressed(){
        eingabewort.setBounds(40, 80 + ((versuche + 1) * 25), 80, 25);

        String userInput = eingabewort.getText();
        int[] colorOfLetters = playWordle(userInput);

        done = true;
        for (int i : colorOfLetters) {
            if (i != 2) done = false;
        }
        if (done || versuche > 5) EndWordle();

        String[] numsToColors = new String[5];
        for (int i = 0; i < 5; i++) {
            if (colorOfLetters[i] == 0) numsToColors[i] = "black";
            else if (colorOfLetters[i] == 1) numsToColors[i] = "orange";
            else if (colorOfLetters[i] == 2) numsToColors[i] = "green";
        }

        //System.out.println("Set colors to " + numsToColors[0] + " " + numsToColors[1] + " " + numsToColors[2] + " " + numsToColors[3] + " " + numsToColors[4] + " User Input was" + userInput + " answer was " + answerChoosen + " work on word is " + new String(answer));
        String finalString = (
        "<html><font size='5' color=" + numsToColors[0] + "> " + userInput.charAt(0) + "</font> <font            " + 
        "<html><font size='5' color=" + numsToColors[1] + "> " + userInput.charAt(1) + "</font> <font            " + 
        "<html><font size='5' color=" + numsToColors[2] + "> " + userInput.charAt(2) + "</font> <font            " + 
        "<html><font size='5' color=" + numsToColors[3] + "> " + userInput.charAt(3) + "</font> <font            " + 
        "<html><font size='5' color=" + numsToColors[4] + "> " + userInput.charAt(4) + "</font> <font            ");
        setNextLabel(finalString);

        eingabewort.setText(""); //set the text box to "" after all the logic is done
    }

    public static int[] playWordle(String InputWordleWord) {
        done = false;
        versuche++;

        String R1 = InputWordleWord.toLowerCase();//String R1 = s.nextLine().toLowerCase();

        //check if it is 5 letters and is a possible word
        if (!IsAValidWord(R1, wortliste)) {
            System.out.println("Diese Eingabe steht nicht zur Auswahl");
        } else {
            for (int i = 0; i < 5; i++ ) { //puts the inputWord into a char[]
                input[i] = R1.charAt(i);
            }
        }
        
        //just reset answer every time
        for (int i = 0; i < 5; i++ ) answer[i] = loesungsWort.charAt(i);
        return ReturnColorOfLeters(input, answer);
    }

    public static void setNextLabel(String string){
        labels[versuche - 1].setText(string);
    }

    public static int[] ReturnColorOfLeters(char[] inputWord, char[] correctWord) {
        char[] answerTemp = correctWord;
        int[] colorForLetter = new int[5]; //0 is grey, yellow is 1, green is 2

        for (int i = 0; i < 5; i++) { //check for any correct position+letter (green)
            if (inputWord[i] == answerTemp[i]) {
                answerTemp[i] = '-';
                colorForLetter[i] = 2;
            }
        }

        for (int j = 0; j < 5; j++) { //check for any correct letter (yellow)
            for (int k = 0; k < 5; k++){
                if (inputWord[j] == answerTemp[k] && colorForLetter[j] != 2) {
                    //if that letter is not already green and matches some other letter
                    colorForLetter[j] = 1;
                    answerTemp[k] = '-';
                }
            }
        }

        for (int m = 0; m < 5; m++) {
            if (colorForLetter[m] == 0) System.out.print(inputWord[m]);
            if (colorForLetter[m] == 1) System.out.print(ANSI_YELLOW + inputWord[m] + ANSI_RESET);
            if (colorForLetter[m] == 2) System.out.print(ANSI_GREEN + inputWord[m] + ANSI_RESET);
        }

        System.out.println("");
        return colorForLetter;
    }

    public static boolean IsAValidWord(String input, String[] possibleWords) {
        if (input.length() < 5) {
            System.out.println("Wordle: Das eingegeben Wort war zu kurz");
            return false;
        }
        for (String string : possibleWords) {
            if (string.equals(input)) {
                return true;
            }
        }
        return false;
    }

    public static void enterWord(){ //if its good, submit the word for checking
        if ( IsAValidWord(eingabewort.getText(), wortliste) ) buttonPressed();
        else System.out.println("Wordle: Das Wort ist nicht in der Liste");
    }


}
