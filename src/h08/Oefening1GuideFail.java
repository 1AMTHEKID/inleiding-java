package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Oefening1GuideFail extends Applet {
    Button knop;
    String schermtekst;

    public void init(){
       schermtekst = "Ugh, raak me niet aan.";
        knop = new Button("PORQUE ME TOCAS?!?");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
    }

    public void paint(Graphics g){
        g.drawString("Ugh, raak me niet aan.",50,60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ){
            schermtekst = "Puto, deverdad porque me tocas.";
            repaint();
        }
    }
}
