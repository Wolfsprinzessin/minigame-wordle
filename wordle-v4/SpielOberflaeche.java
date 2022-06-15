import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpielOberflaeche extends JFrame implements ActionListener {

    static JPanel panel = new JPanel();
    static JFrame spiel = new JFrame();
    static JButton btnEnter = new JButton("Enter");
    static JButton btnNeu = new JButton("Neu");
    static JLabel title = new JLabel("Wordle: ");
    static JTextField eingabewort = new JTextField();
    static JLabel stats;
    static JLabel[] labels;

    //Konstruktor
    SpielOberflaeche() {

        //Spieloberfläche
        spiel.setSize(300, 350);
        spiel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        spiel.setTitle("Mini Wordle");
        spiel.setLocationRelativeTo(null);
        spiel.setVisible(true);
        spiel.add(panel);

        //Btn für Enter
        btnEnter.setBounds(100, 20, 80, 25);
        btnEnter.addActionListener(new MiniWordle());
        panel.add(btnEnter);

        //Btn für Neues Spiel
        btnNeu.setBounds(200, 20, 80, 25);
        btnNeu.addActionListener(new Spiel);
        panel.add(btnNeu);

        // Das Wort, das eingegeben wird
        eingabewort.addActionListener(new MiniWordle());
        eingabewort.setBounds(40, 80 + (0 * 25), 80, 25);
        panel.add(eingabewort);

        title.setBounds(10, 20, 80, 25);
        panel.add(title);
    
        panel.setLayout(null);
        labels = new JLabel[6];
        stats = new JLabel("Wort mit 5 Buchstaben eingeben:");
        stats.setBounds(10, 50, 250, 25);
        panel.add(stats);
    
        for (int i = 0; i < 6; i++) {
            labels[i] = new JLabel("<html><font size='5' color=blue> ----- </font> <font");
            labels[i].setBounds(44, 80 + (i * 25), 80, 25);
            panel.add(labels[i]);
        }
    }
    
}
