import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Wordle extends JFrame implements ActionListener {

    private static JLabel stats; //Informationstext
    private static JTextField inputField;
    private static JLabel[] labels;

    static int tries; //Anzahl der Versuche
    static char[] input; //Eingabewort -> als Buchstabenarray
    static char[] answer; //zufälliges Wort -> als Buchstabenarray
    static boolean done;
    static String answerWord; //Lösungswort
    static String userInputLower;
    static int[] colorOfLetters;


    private static String[] possibleWords = {"abart","abbau","abend","abgas","abhol","abhör","abort","abruf","absud","abtei","abweg","abzug","achse","acker","acryl","adams","adler","äcker","ägide","ähren","ämter","äpfel","ärger","ärmel","ärzte","äther","ätzen","affen","after","agave","agent","ahnen","ahorn","akten","aktie","aktor","alarm","alben","album","alias","alibi","allee","alpen","alpha","altar","alten","alter","altöl","ammen","ampel","amsel","anbau","angel","angst","anker","anmut","anruf","anzug","apfel","april","arche","areal","arena","arier","armee","armen","armut","aroma","arsen","arten","asche","asien","asket","aspik","assel","aster","astro","atlas","atoll","audio","augen","autor","axiom","bahre","bambi","bande","banjo","barde","baron","basar","basis","batik","bauch","bauer","bäche","böcke","böden","bäder","beben","beere","belag","beleg","büßer","berge","beruf","besen","beton","beuge","beule","beute","bezug","bügel","bögen","bühne","bibel","biber","biene","biest","binde","binse","birke","birne","bitte","biwak","blase","blatt","blöße","blech","blick","blink","blitz","block","blüte","bluff","blume","bluse","bände","bänke","boden","bogen","bohle","bohne","bombe","bongo","bonus","bonze","boots","borke","borte","boten","bowle","boxer","brand","braue","braut","börde","brech","bären","brett","brühe","brief","brise","brite","börse","bärte","bruch","brumm","brust","büste","buben","bulle","busch","busen","butan","butze","celli","cello","chaos","chaot","chlor","chöre","chrom","civil","clown","cobra","codex","comic","couch","coupe","creme","curry","dachs","damen","dampf","datei","daten","dativ","datum","dauer","daune","dübel","debüt","degen","deich","dekan","dekor","delle","delta","demut","depot","devon","düfte","diele","dinar","diode","dirne","diwan","dämme","dämon","döner","dünge","dünkt","docht","dogge","dogma","dohle","dolch","donau","dosen","dosis","draht","drall","drama","drang","dreck","drift","drink","därme","droge","dürre","drüse","druck","duell","duett","dunst","durst","dusch","ebene","edukt","eiche","eifer","eimer","eisen","eiter","eklat","ekzem","elend","elfen","elite","ellen","engel","enkel","enten","enzym","erben","erbin","erbse","erdöl","erker","erlös","ernst","ernte","esche","essen","esser","essig","etage","etüde","ethik","ethos","eulen","euter","fabel","faden","fahne","fahrt","falke","falle","falte","fango","farbe","fasan","faser","fatum","fauna","faust","faxen","fazit","fecht","feder","feger","fehde","feier","feile","feind","felge","ferse","feuer","fähre","fibel","fiber","figur","filet","finne","finte","firma","first","fisch","fjord","flair","flaum","fleck","fleiß","flöhe","fließ","flirt","fülle","flora","flöte","fluch","fluid","fluor","fluss","fokus","folge","folie","foren","forst","forum","foyer","frack","frage","freak","freud","frist","front","frost","fürst","frust","föten","fötus","fuchs","fuder","fugen","fuhre","fäule","furie","fusel","futur","gabel","galle","garbe","garde","gasöl","gasse","gassi","gatte","geber","gebet","gebot","gebär","gefäß","gehör","geier","geige","geist","gelee","gemüt","genie","genom","genre","gerät","gerte","geäst","geste","getto","getue","gicht","gilde","ginko","glanz","glück","gleis","glied","glimm","gämse","gnade","gänse","gänze","gosse","gouda","gramm","graph","größe","greif","greis","grenz","grieß","griff","grill","grips","groll","gräte","grube","gruft","grund","gäste","güter","götze","gäule","gummi","gunst","gurke","gusto","hades","hafen","hafer","hagel","haken","halde","hallo","halte","handy","hanse","harfe","hasel","hasen","haube","hauch","hauer","haupt","hebel","heber","hecht","heide","henne","hexen","hexer","häfen","hüfte","hügel","höhen","höher","höhle","hähne","hilfe","hindu","hirse","hirte","hitze","hölle","hälse","hände","hänge","hobby","hobel","honig","horde","horst","hosen","hotel","hürde","hörer","härte","hüter","humor","humus","hunde","hunne","husar","häute","hydra","hymne","hyäne","ideal","ideen","idiot","idyll","ikone","iltis","image","imker","index","indio","indiz","innen","insel","ionen","islam","jacht","jacke","japan","jüdin","jäger","joker","joule","jubel","juden","jumbo","junge","juras","juror","juwel","kabel","kader","kakao","kalif","kamel","kamin","kampf","kanal","kanne","kanon","kante","kappe","karat","karre","karte","kasko","kasse","kasus","kater","kübel","köche","köder","kegel","kehle","kelch","kelle","kerze","kette","keule","käfer","käfig","kähne","kiepe","kiosk","kippe","kirch","kiste","küken","klage","klang","klapp","klebe","kleid","kleie","klick","klima","klops","klotz","kälte","kluft","knabe","knack","knall","knast","knauf","knick","kniff","könig","knopf","kobra","kodex","kohle","kokon","kolik","komet","komik","komma","konto","kopie","koran","korso","kosak","köpfe","krach","kraft","krake","kranz","kraut","körbe","krebs","kreis","krepp","kreuz","krähe","krieg","krimi","krise","kräne","krone","kropf","kröte","krume","küste","köter","kuben","kubus","kugel","kuhle","kunde","kunst","kupee","kupon","kuppe","kurie","kurve","labor","lache","lachs","laden","lader","lagen","lager","lakai","laken","lampe","lande","lanze","larve","laser","lasso","latex","latte","laube","lauch","lauer","laune","lücke","läden","leben","leber","leder","lehne","lehre","leier","leine","lende","lepra","lesbe","lesen","leser","leute","löhne","liane","licht","liebe","liege","ligen","likör","lilie","limes","limit","linde","linie","linse","lippe","liter","länge","lobby","logik","logis","lokal","lotos","lotse","lotto","lösch","lüste","luchs","luder","lunge","lunte","läuse","luxus","löwen","lymph","lyrik","macho","macht","macke","mafia","magen","magie","magma","major","makel","makro","maler","malus","malve","manie","manko","mappe","marge","markt","maske","masse","mauer","möbel","mücke","mädel","media","meile","meise","menge","mensa","messe","meter","meute","mühle","mähne","möhre","miene","miete","mieze","mikro","milan","milbe","milch","miliz","mimik","minen","mitte","mixer","mönch","münze","modul","modus","mogul","mokka","monat","moped","moral","morse","motel","motiv","motor","motte","motto","möpse","müsli","mütze","muffe","mulde","multi","mumie","murks","mäuse","musik","mutti","myrre","nabel","nacht","nadel","nagel","nager","namen","narbe","natur","nebel","neffe","neger","nelke","netto","nägel","näher","niere","niete","nomen","nonne","notar","noten","notiz","novum","nässe","nudel","nugat","nylon","obhut","odium","ölung","oheim","ohren","oktan","oktav","olive","olymp","onkel","opern","opfer","opium","optik","orbit","orden","order","organ","orgel","orkan","osten","otter","ozean","pacht","paket","palme","panik","panne","pappe","papst","pasta","paste","pater","pauke","pause","pöbel","pedal","pegel","perle","pfahl","pfand","pfarr","pfeil","pferd","pfiff","pflug","pfote","pfuhl","pfund","phase","photo","piano","piezo","pille","pilot","pinie","pinne","pirat","piste","pixel","pizza","platz","pläne","pluto","pokal","poker","polen","polis","polit","polle","polyp","poren","porto","posse","püree","preis","press","prime","prinz","probe","profi","prosa","prunk","psalm","pudel","puder","pulle","pulli","pumpe","punkt","puppe","puter","pylon","qualm","quant","quark","quart","quarz","quell","quere","quirl","quote","rache","radar","radau","radio","radon","rampe","rappe","rasen","rasse","ratte","rauch","raudi","raupe","röcke","räder","realo","recht","regal","regel","regen","regie","reich","reihe","reise","rente","revue","rügen","röhre","ricke","riege","riese","rille","rinde","rinne","rippe","riten","römer","robbe","rohöl","rolle","rolli","roman","rondo","rosen","rotor","route","räson","rubel","rubin","ruder","rufer","rugby","rumpf","runde","rupie","sache","sahne","saite","salat","salbe","saldo","salon","salto","salut","salve","samba","samen","satan","satin","satyr","sauce","sauna","säbel","schaf","schal","scham","schar","schau","schoß","schub","schuh","schur","säcke","süden","seele","segel","segen","seher","seide","seife","seite","senat","seren","serie","serum","sesam","sexte","säfte","sühne","sicht","silbe","sinus","sippe","sirup","sitte","skala","skalp","skier","slawe","sülze","sünde","socke","soßen","sohle","solei","sonde","sonne","sorge","sorte","spalt","spann","spant","spatz","späße","speck","speer","sperr","spezi","spieß","spiel","spike","spind","spion","späne","spore","sporn","sport","spott","spreu","sprüh","sprit","spule","spurt","särge","staat","stabs","stadt","stahl","stall","stamm","stand","start","staub","stück","steak","steiß","steig","stein","stern","stich","stiel","stier","stift","stirn","stock","stoff","stola","stolz","stopp","straf","streu","stroh","strom","stütz","stube","stuck","stufe","stuhl","stunk","sturm","sturz","stuss","stute","sätze","suche","sucht","suite","säule","summe","sumpf","suppe","säure","sushi","szene","tabak","tadel","tafel","tages","taiga","taler","talon","tango","tanne","tante","tapet","tarif","tasse","taste","tatze","taube","tauch","tücke","teeei","teich","teile","teint","tempo","tenne","tenor","theke","thema","these","thron","tiger","tilde","tinte","tisch","titan","titel","täler","tänze","toast","tonne","topas","torso","torte","toten","töpfe","trafo","trage","trakt","trank","traum","treff","trend","treue","trick","trieb","trink","tritt","türme","troll","tropf","tross","trost","trott","trotz","truhe","trunk","trupp","täter","tulpe","tumor","turbo","tusch","tutor","typen","ultra","umbau","umweg","umzug","unfug","union","unmut","unrat","unruh","urahn","vater","venen","venus","vögel","vögte","video","vikar","villa","viper","viren","virus","visum","vlies","vogel","vokal","votum","väter","waage","wache","wachs","wacht","waden","waffe","wagen","wagon","waise","walöl","walze","wange","wanne","wanst","wanze","warte","warze","wasch","watte","weber","wedel","weide","weihe","weite","welle","welpe","wende","werbe","werft","werks","werte","wesen","wespe","weste","wette","wägen","wicke","wiese","wille","wisch","witwe","wölfe","wände","woche","wodka","wolfs","wolke","wolle","wonne","wotan","wrack","würde","würfe","würge","wärme","wuchs","wucht","wulst","wunde","wurst","yacht","zange","zebra","zeche","zehnt","zeile","zelle","zügel","zügig","zähne","zicke","ziege","zille","zitat","zivil","zölle","zobel","zöpfe","zäsur","zuber","zucht","zäune","zunft","zunge","zuruf","zutat","zutun","zuzug","zwang","zweck","zweig","zwerg","zwirn","zwist","zyste",
    "tokyo","texas","hanoi"};

	public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MINI WORDLE");
        frame.setLocationRelativeTo(null);
        frame.add(panel);

        panel.setLayout(null);

        stats = new JLabel("<html><font size='5'> Wort mit 5 Buchstaben eingeben und Enter drücken (auch ä, ö, ü, ß möglich):</font> <font");
        stats.setBounds(25, 20, 500, 50);
        panel.add(stats);

        inputField = new JTextField();
        inputField.addActionListener(new Wordle());
        inputField.setBounds(80, 100, 100, 30);
        panel.add(inputField);

        labels = new JLabel[6]; //Zeilen für Versuche
        for (int i = 0; i < 6; i++) {
            labels[i] = new JLabel("<html><font size='7' color=blue> ----- </font> <font"); //ausstehende Versuche
            labels[i].setBounds(250, 90+(i*30), 100, 30);
            panel.add(labels[i]);
        }

        frame.setVisible(true);
        startWordle();
    }

    public static void startWordle() {
        tries = 0;
        done = false;
        answerWord = ReturnRandomWord();
        answer = new char[5];
        for (int i = 0; i < 5; i++ ) answer[i] = answerWord.charAt(i);
        input = new char[5];
    }

    public static String ReturnRandomWord(){ //wählt zufälliges Wort aus der Liste
        return possibleWords[(int)(Math.random() * (possibleWords.length - 1))]; 
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        // wenn Enter gedrückt wird
        enterPressed();
    }


    public static void enterPressed(){
        //Eingabe erstmal klein schreiben
        String userInput = inputField.getText();
        userInputLower = userInput.toLowerCase();
        //prüfen, ob das eingegeben Wort in der Liste vorkommt und 5 Buchstaben hat
        if (IsAValidWord(userInputLower, possibleWords)) {
            playGame();
        }
        //Antwort zurücksetzen für neue Eingabe
        for (int i = 0; i < 5; i++ ) answer[i] = answerWord.charAt(i);
    }


    public static boolean IsAValidWord(String input, String[] possibleWords) {
        if (input.length() < 5) {
            System.out.println("zu kurz");
            stats.setText("<html><font size='5'>Das Wort ist zu kurz.</font><font");
            return false;
        }
        for (String string : possibleWords) {
            if (string.equals(input)) {
                return true;
            } else {
                System.out.println("nicht dabei");
                stats.setText("<html><font size='5'" + "Das Wort ist nicht in der Liste." + "</font> <font");
            }
        }
        return false;
    }


    public static void playGame(){
        tries++; //Versuche um 1 erhöhen

        //das eingegeben Wort wird zum char[]-Array
        for (int i = 0; i < 5; i++ ) {input[i] = userInputLower.charAt(i);}
        colorOfLetters = ReturnColorOfLetters(input,answer);//den Buchstaben werden Farben zugeordnet
        System.out.println("Alle Buchstaben geprüft und gefärbt");
        
        for (int i : colorOfLetters) { 
            if (i != 2) {
                done = false; //wenn ein Buchstabe nicht grün ist, dann noch nicht fertig
            } else {
                done = true; //wenn alle Buchstaben grün sind, dann fertig
            }
        }

        String[] numsToColors = new String[5];
        for (int i = 0; i < 5; i++) {
            if (colorOfLetters[i] == 0) numsToColors[i] = "black";
            else if (colorOfLetters[i] == 1) numsToColors[i] = "orange";
            else if (colorOfLetters[i] == 2) numsToColors[i] = "green";
        }

        //die Buchstaben in den richtigen Farben wiedergeben
        String finalString = (
            "<html><font size='5' color=" + numsToColors[0] + "> " + userInputLower.charAt(0) + "</font> <font            " + 
            "<html><font size='5' color=" + numsToColors[1] + "> " + userInputLower.charAt(1) + "</font> <font            " + 
            "<html><font size='5' color=" + numsToColors[2] + "> " + userInputLower.charAt(2) + "</font> <font            " + 
            "<html><font size='5' color=" + numsToColors[3] + "> " + userInputLower.charAt(3) + "</font> <font            " + 
            "<html><font size='5' color=" + numsToColors[4] + "> " + userInputLower.charAt(4) + "</font> <font            ");
            
        labels[tries - 1].setText(finalString.toUpperCase());


        if (done || tries > 5) { //beenden oder weiterspielen
            EndWordle();
        } else {
            stats.setText("<html><font size='5'> " + "Nächstes Wort eingeben:" + "</font> <font");
            inputField.setText(""); //setzt den Text auf nichts wenn alles fertig ist
        }
    }


    public static int[] ReturnColorOfLetters(char[] inputWord, char[] correctWord) {
        char[] answerTemp = correctWord;
        int[] colorForLetter = new int[5]; //0 ist grau, gelb ist 1, grün ist 2
        for (int zGreen = 0; zGreen < 5; zGreen++) { //auf korrekte Buchstaben prüfen (grün)
            if (inputWord[zGreen] == answerTemp[zGreen]) {
                answerTemp[zGreen] = '-';
                colorForLetter[zGreen] = 2;
            }
        }
        for (int zYellow = 0; zYellow < 5; zYellow++) { //auf vorhandene Buchstaben prüfen (gelb)
            for (int k = 0; k < 5; k++){
                if (inputWord[zYellow] == answerTemp[k] && colorForLetter[zYellow] != 2) {
                    //wenn der Buchstaben weder gelb noch grün ist oder schon vorkommt
                    colorForLetter[zYellow] = 1;
                    answerTemp[k] = '-';
                }
            }
        }
        return colorForLetter;
    }


    public static void EndWordle() {
        System.out.println("Start EndWordle");
        System.out.println(done);
        inputField.setEnabled(false);
        inputField.setVisible(false);

        if (!done) {
            System.out.println("if done = false");
            stats.setText("<html><font size='5' color=red> Verloren! Die Antwort war: " + answerWord.toUpperCase() + "</font> <font");
        }
        else  stats.setText("<html><font size='5' color=green> " + "Gelöst in " + tries + " Versuchen. Das Wort war " + answerWord.toUpperCase() + "</font> <font");
    }
}