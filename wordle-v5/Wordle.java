import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.util.Scanner;

//simon feb 25 - march 25 - April 17-20 2022

public class Wordle extends JFrame implements ActionListener {

    private static JLabel stats;
    private static JTextField userText1;
    private static JLabel[] labels;

    public static Scanner s = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";

    static int tries;
    static char[] input;
    static long startTime;
    static char[] answer;
    static boolean done;
    static String answerChoosen;

    public static String[] possibleWords = {"abart","abbau","abend","abgas","abhol","abhör","abort","abruf","absud","abtei","abweg","abzug","achse","acker","acryl","adams","adler","äcker","ägide","ähren","ämter","äpfel","ärger","ärmel","ärzte","äther","ätzen","affen","after","agave","agent","ahnen","ahorn","akten","aktie","aktor","alarm","alben","album","alias","alibi","allee","alpen","alpha","altar","alten","alter","altöl","ammen","ampel","amsel","anbau","angel","angst","anker","anmut","anruf","anzug","apfel","april","arche","areal","arena","arier","armee","armen","armut","aroma","arsen","arten","asche","asien","asket","aspik","assel","aster","astro","atlas","atoll","audio","augen","autor","axiom","bahre","bambi","bande","banjo","barde","baron","basar","basis","batik","bauch","bauer","bäche","böcke","böden","bäder","beben","beere","belag","beleg","büßer","berge","beruf","besen","beton","beuge","beule","beute","bezug","bügel","bögen","bühne","bibel","biber","biene","biest","binde","binse","birke","birne","bitte","biwak","blase","blatt","blöße","blech","blick","blink","blitz","block","blüte","bluff","blume","bluse","bände","bänke","boden","bogen","bohle","bohne","bombe","bongo","bonus","bonze","boots","borke","borte","boten","bowle","boxer","brand","braue","braut","börde","brech","bären","brett","brühe","brief","brise","brite","börse","bärte","bruch","brumm","brust","büste","buben","bulle","busch","busen","butan","butze","celli","cello","chaos","chaot","chlor","chöre","chrom","civil","clown","cobra","codex","comic","couch","coupe","creme","curry","dachs","damen","dampf","datei","daten","dativ","datum","dauer","daune","dübel","debüt","degen","deich","dekan","dekor","delle","delta","demut","depot","devon","düfte","diele","dinar","diode","dirne","diwan","dämme","dämon","döner","dünge","dünkt","docht","dogge","dogma","dohle","dolch","donau","dosen","dosis","draht","drall","drama","drang","dreck","drift","drink","därme","droge","dürre","drüse","druck","duell","duett","dunst","durst","dusch","ebene","edukt","eiche","eifer","eimer","eisen","eiter","eklat","ekzem","elend","elfen","elite","ellen","engel","enkel","enten","enzym","erben","erbin","erbse","erdöl","erker","erlös","ernst","ernte","esche","essen","esser","essig","etage","etüde","ethik","ethos","eulen","euter","fabel","faden","fahne","fahrt","falke","falle","falte","fango","farbe","fasan","faser","fatum","fauna","faust","faxen","fazit","fecht","feder","feger","fehde","feier","feile","feind","felge","ferse","feuer","fähre","fibel","fiber","figur","filet","finne","finte","firma","first","fisch","fjord","flair","flaum","fleck","fleiß","flöhe","fließ","flirt","fülle","flora","flöte","fluch","fluid","fluor","fluss","fokus","folge","folie","foren","forst","forum","foyer","frack","frage","freak","freud","frist","front","frost","fürst","frust","föten","fötus","fuchs","fuder","fugen","fuhre","fäule","furie","fusel","futur","gabel","galle","garbe","garde","gasöl","gasse","gassi","gatte","geber","gebet","gebot","gebär","gefäß","gehör","geier","geige","geist","gelee","gemüt","genie","genom","genre","gerät","gerte","geäst","geste","getto","getue","gicht","gilde","ginko","glanz","glück","gleis","glied","glimm","gämse","gnade","gänse","gänze","gosse","gouda","gramm","graph","größe","greif","greis","grenz","grieß","griff","grill","grips","groll","gräte","grube","gruft","grund","gäste","güter","götze","gäule","gummi","gunst","gurke","gusto","hades","hafen","hafer","hagel","haken","halde","hallo","halte","handy","hanse","harfe","hasel","hasen","haube","hauch","hauer","haupt","hebel","heber","hecht","heide","henne","hexen","hexer","häfen","hüfte","hügel","höhen","höher","höhle","hähne","hilfe","hindu","hirse","hirte","hitze","hölle","hälse","hände","hänge","hobby","hobel","honig","horde","horst","hosen","hotel","hürde","hörer","härte","hüter","humor","humus","hunde","hunne","husar","häute","hydra","hymne","hyäne","ideal","ideen","idiot","idyll","ikone","iltis","image","imker","index","indio","indiz","innen","insel","ionen","islam","jacht","jacke","japan","jüdin","jäger","joker","joule","jubel","juden","jumbo","junge","juras","juror","juwel","kabel","kader","kakao","kalif","kamel","kamin","kampf","kanal","kanne","kanon","kante","kappe","karat","karre","karte","kasko","kasse","kasus","kater","kübel","köche","köder","kegel","kehle","kelch","kelle","kerze","kette","keule","käfer","käfig","kähne","kiepe","kiosk","kippe","kirch","kiste","küken","klage","klang","klapp","klebe","kleid","kleie","klick","klima","klops","klotz","kälte","kluft","knabe","knack","knall","knast","knauf","knick","kniff","könig","knopf","kobra","kodex","kohle","kokon","kolik","komet","komik","komma","konto","kopie","koran","korso","kosak","köpfe","krach","kraft","krake","kranz","kraut","körbe","krebs","kreis","krepp","kreuz","krähe","krieg","krimi","krise","kräne","krone","kropf","kröte","krume","küste","köter","kuben","kubus","kugel","kuhle","kunde","kunst","kupee","kupon","kuppe","kurie","kurve","labor","lache","lachs","laden","lader","lagen","lager","lakai","laken","lampe","lande","lanze","larve","laser","lasso","latex","latte","laube","lauch","lauer","laune","lücke","läden","leben","leber","leder","lehne","lehre","leier","leine","lende","lepra","lesbe","lesen","leser","leute","löhne","liane","licht","liebe","liege","ligen","likör","lilie","limes","limit","linde","linie","linse","lippe","liter","länge","lobby","logik","logis","lokal","lotos","lotse","lotto","lösch","lüste","luchs","luder","lunge","lunte","läuse","luxus","löwen","lymph","lyrik","macho","macht","macke","mafia","magen","magie","magma","major","makel","makro","maler","malus","malve","manie","manko","mappe","marge","markt","maske","masse","mauer","möbel","mücke","mädel","media","meile","meise","menge","mensa","messe","meter","meute","mühle","mähne","möhre","miene","miete","mieze","mikro","milan","milbe","milch","miliz","mimik","minen","mitte","mixer","mönch","münze","modul","modus","mogul","mokka","monat","moped","moral","morse","motel","motiv","motor","motte","motto","möpse","müsli","mütze","muffe","mulde","multi","mumie","murks","mäuse","musik","mutti","myrre","nabel","nacht","nadel","nagel","nager","namen","narbe","natur","nebel","neffe","neger","nelke","netto","nägel","näher","niere","niete","nomen","nonne","notar","noten","notiz","novum","nässe","nudel","nugat","nylon","obhut","odium","ölung","oheim","ohren","oktan","oktav","olive","olymp","onkel","opern","opfer","opium","optik","orbit","orden","order","organ","orgel","orkan","osten","otter","ozean","pacht","paket","palme","panik","panne","pappe","papst","pasta","paste","pater","pauke","pause","pöbel","pedal","pegel","perle","pfahl","pfand","pfarr","pfeil","pferd","pfiff","pflug","pfote","pfuhl","pfund","phase","photo","piano","piezo","pille","pilot","pinie","pinne","pirat","piste","pixel","pizza","platz","pläne","pluto","pokal","poker","polen","polis","polit","polle","polyp","poren","porto","posse","püree","preis","press","prime","prinz","probe","profi","prosa","prunk","psalm","pudel","puder","pulle","pulli","pumpe","punkt","puppe","puter","pylon","qualm","quant","quark","quart","quarz","quell","quere","quirl","quote","rache","radar","radau","radio","radon","rampe","rappe","rasen","rasse","ratte","rauch","raudi","raupe","röcke","räder","realo","recht","regal","regel","regen","regie","reich","reihe","reise","rente","revue","rügen","röhre","ricke","riege","riese","rille","rinde","rinne","rippe","riten","römer","robbe","rohöl","rolle","rolli","roman","rondo","rosen","rotor","route","räson","rubel","rubin","ruder","rufer","rugby","rumpf","runde","rupie","sache","sahne","saite","salat","salbe","saldo","salon","salto","salut","salve","samba","samen","satan","satin","satyr","sauce","sauna","säbel","schaf","schal","scham","schar","schau","schoß","schub","schuh","schur","säcke","süden","seele","segel","segen","seher","seide","seife","seite","senat","seren","serie","serum","sesam","sexte","säfte","sühne","sicht","silbe","sinus","sippe","sirup","sitte","skala","skalp","skier","slawe","sülze","sünde","socke","soßen","sohle","solei","sonde","sonne","sorge","sorte","spalt","spann","spant","spatz","späße","speck","speer","sperr","spezi","spieß","spiel","spike","spind","spion","späne","spore","sporn","sport","spott","spreu","sprüh","sprit","spule","spurt","särge","staat","stabs","stadt","stahl","stall","stamm","stand","start","staub","stäbe","stück","steak","steiß","steig","stein","stern","stich","stiel","stier","stift","stirn","stock","stoff","stola","stolz","stopp","straf","streu","stroh","strom","stütz","stube","stuck","stufe","stuhl","stunk","sturm","sturz","stuss","stute","sätze","suche","sucht","suite","säule","summe","sumpf","suppe","säure","sushi","szene","tabak","tadel","tafel","tages","taiga","taler","talon","tango","tanne","tante","tapet","tarif","tasse","taste","tatze","taube","tauch","tücke","teeei","teich","teile","teint","tempo","tenne","tenor","theke","thema","these","thron","tiger","tilde","tinte","tisch","titan","titel","täler","tänze","toast","tonne","topas","torso","torte","toten","töpfe","trafo","trage","trakt","trank","traum","treff","trend","treue","trick","trieb","trink","tritt","türme","troll","tropf","tross","trost","trott","trotz","truhe","trunk","trupp","täter","tulpe","tumor","turbo","tusch","tutor","typen","ultra","umbau","umweg","umzug","unfug","union","unmut","unrat","unruh","urahn","vater","venen","venus","vögel","vögte","video","vikar","villa","viper","viren","virus","visum","vlies","vogel","vokal","votum","väter","waage","wache","wachs","wacht","waden","waffe","wagen","wagon","waise","walöl","walze","wange","wanne","wanst","wanze","warte","warze","wasch","watte","weber","wedel","weide","weihe","weite","welle","welpe","wende","werbe","werft","werks","werte","wesen","wespe","weste","wette","wägen","wicke","wiese","wille","wisch","witwe","wölfe","wände","woche","wodka","wolfs","wolke","wolle","wonne","wotan","wrack","würde","würfe","würge","wärme","wuchs","wucht","wulst","wunde","wurst","yacht","zange","zebra","zeche","zehnt","zeile","zelle","zügel","zügig","zähne","zicke","ziege","zille","zirka","zitat","zitze","zivil","zölle","zobel","zonen","zöpfe","zäsur","zuber","zucht","zäune","zunft","zunge","zuruf","zutat","zutun","zuzug","zwang","zweck","zweig","zwerg","zwirn","zwist","zyste",
    "tokyo","texas","hanoi"};

	public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(300, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.setLocationRelativeTo(null);
        frame.add(panel);

        panel.setLayout(null);
        JLabel title = new JLabel("Wordle: ");
        title.setBounds(10, 20, 80, 25);
        panel.add(title);

        panel.setLayout(null);
        stats = new JLabel("Wort mit 5 Buchstaben eingeben:");
        stats.setBounds(10, 50, 250, 25);
        panel.add(stats);

        userText1 = new JTextField();
        userText1.addActionListener(new Wordle());
        userText1.setBounds(40, 80 + (0 * 25), 80, 25);
        panel.add(userText1);

        JButton button1 = new JButton("Enter");
        button1.setBounds(100, 20, 80, 25);
        button1.addActionListener(new Wordle());
        panel.add(button1);

        JButton button2 = new JButton("Neu");
        button2.setBounds(200, 20, 80, 25);
        button2.addActionListener(new Wordle());
        panel.add(button2);

        labels = new JLabel[6];
        for (int i = 0; i < 6; i++) {
            labels[i] = new JLabel("<html><font size='5' color=blue> ----- </font> <font");
            labels[i].setBounds(44, 80 + (i * 25), 80, 25);
            panel.add(labels[i]);
        }

        frame.setVisible(true);

        startWordle(); //gets the answer word, and does some other thing like starting the timer
    }

    public static void startWordle() {
        //makes an array of the possible words
    
        startTime = System.currentTimeMillis();
        tries = 0;
        System.out.println("Wordle: Bitte Wort mit 5 Buchstaben eingeben.");
        answerChoosen = ReturnRandomWord();
        answer = new char[5];
        for (int i = 0; i < 5; i++ ) answer[i] = answerChoosen.charAt(i);

        input = new char[5];
    }
    
    public static void EndWordle() {
        System.out.println("Wordle: Die Antwort war: " + new String(answerChoosen));
        System.out.println("Wordle: Gelöst in " + tries + " Versuchen.");

        userText1.setEnabled(false);
        userText1.setVisible(false);

        if (!done) stats.setText("<html><font size='1' color=red> " + "The Answer Was: " + new String(answerChoosen) + ".</font> <font");
        else  stats.setText("<html><font size='1' color=green> " + "Gelöst in " + tries + " Versuchen." + "</font> <font");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // if the button is pressed
        enterWord();
    }

    public static void enterWord(){ //if its good, actually submit the word for checking
        if ( IsAValidWord(userText1.getText(), possibleWords) ) buttonPressed();
        else System.out.println("Wordle: Das Wort ist nicht in der Liste");
    }

    public static void buttonPressed(){
        userText1.setBounds(40, 80 + ((tries + 1) * 25), 80, 25);

        String userInput = userText1.getText();
        int[] colorOfLetters = playWordle(userInput);

        done = true;
        for (int i : colorOfLetters) {
            if (i != 2) done = false;
        }
        if (done || tries > 5) EndWordle();

        String[] numsToColors = new String[5];
        for (int i = 0; i < 5; i++) {
            if (colorOfLetters[i] == 0) numsToColors[i] = "black";
            else if (colorOfLetters[i] == 1) numsToColors[i] = "orange";
            else if (colorOfLetters[i] == 2) numsToColors[i] = "green";
        }

        //die Buchstaben in den richtigen Farben wiedergeben
        String finalString = (
        "<html><font size='5' color=" + numsToColors[0] + "> " + userInput.charAt(0) + "</font> <font            " + 
        "<html><font size='5' color=" + numsToColors[1] + "> " + userInput.charAt(1) + "</font> <font            " + 
        "<html><font size='5' color=" + numsToColors[2] + "> " + userInput.charAt(2) + "</font> <font            " + 
        "<html><font size='5' color=" + numsToColors[3] + "> " + userInput.charAt(3) + "</font> <font            " + 
        "<html><font size='5' color=" + numsToColors[4] + "> " + userInput.charAt(4) + "</font> <font            ");
        setNextLabel(finalString);

        userText1.setText(""); //setzt den Text auf "" wenn alles fertig ist
    }

    public static int[] playWordle(String InputWordleWord) {
        done = false;
        tries++;

        String R1 = InputWordleWord.toLowerCase();

        //prüfen ob es ein mögliches Wort ist und 5 Buchstaben hat
        if (!IsAValidWord(R1, possibleWords)) {
            System.out.println("Diese Eingabe steht nicht zur Auswahl.");
        } else {
            for (int i = 0; i < 5; i++ ) { //das eingegeben Wort wird zum char[]-Array
                input[i] = R1.charAt(i);
            }
        }

        //Antwort zurücksetzen
        for (int i = 0; i < 5; i++ ) answer[i] = answerChoosen.charAt(i);
        return ReturnColorOfLeters(input, answer);
    }

    public static void setNextLabel(String string){
        labels[tries - 1].setText(string);
    }

    public static int[] ReturnColorOfLeters(char[] inputWord, char[] correctWord) {
        char[] answerTemp = correctWord;
        int[] colorForLetter = new int[5]; //0 ist grau, gelb is 1, grün is 2

        for (int i = 0; i < 5; i++) { //auf korrekte Buchstaben prüfen (grün)
            if (inputWord[i] == answerTemp[i]) {
                answerTemp[i] = '-';
                colorForLetter[i] = 2;
            }
        }

        for (int j = 0; j < 5; j++) { //auf vorhandene Buchstaben prüfen (gelb)
            for (int k = 0; k < 5; k++){
                if (inputWord[j] == answerTemp[k] && colorForLetter[j] != 2) {
                    //wenn der Buchstaben weder gelb noch grün ist oder schon vorkommt
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
            System.out.println("Wordle: Das eingegeben Wort war zu kurz.");
            return false;
        }
        for (String string : possibleWords) {
            if (string.equals(input)) {
                return true;
            }
        }
        return false;
    }

    public static String ReturnRandomWord(){

        return possibleWords[(int)(Math.random() * (possibleWords.length - 1))]; //wählt zufälliges Wort aus der Liste
    }
}