package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextField;
import java.awt.Button;

public class Challenge1xd extends Applet {

    public TextField textValerie;
    public TextField textJeroen;
    public TextField textHans;

    Button showButton;

    int result1;
    int result2;
    int result3;

    Label ValerieLabel;
    Label JeroenLabel;
    Label HansLabel;

    public void init(){
        setSize(600, 800);

        ValerieLabel = new Label("Valerie ");
        textValerie = new TextField("",10);
        textValerie.addActionListener(new showButtonListener());

        JeroenLabel = new Label("Jeroen ");
        textJeroen = new TextField("",10);
        textJeroen.addActionListener(new showButtonListener());

        HansLabel = new Label("Hans");
        textHans = new TextField("",10);
        textHans.addActionListener(new showButtonListener());

        showButton = new Button("Show");
        showButton.addActionListener(new showButtonListener());

        add(ValerieLabel);
        add(textValerie);
        add(JeroenLabel);
        add(textJeroen);
        add(HansLabel);
        add(textHans);
        add(showButton);
    }

    public void paint(Graphics g){
        int ValerieWeight = result1;
        int JeroenWeight = result2;
        int HansWeight = result3;

        g.setColor(Color.black);
        g.drawLine( 40, 100, 40, 600);
        g.drawLine(40, 600, 400, 600);

        g.drawString("100", 10, 104);
        g.drawString("  80", 10, 204);
        g.drawString("  60", 10, 304);
        g.drawString("  40", 10, 404);
        g.drawString("  20", 10, 504);
        g.drawString("    0", 10, 604);

        g.drawString("Valerie", 95, 615);
        g.drawString("Jeroen", 207, 615);
        g.drawString("Hans", 310, 615);

        g.setColor(Color.red);
        g.fillRect(90, 600-(int)(100*ValerieWeight/20), 50, (int)(100*ValerieWeight/20));

        g.setColor(Color.red);
        g.fillRect(200, 600-(int)(100*JeroenWeight/20), 50, (int)(100*JeroenWeight/20));

        g.setColor(Color.red);
        g.fillRect(300, 600-(int)(100*HansWeight/20), 50, (int)(100*HansWeight/20));

        g.setColor(Color.decode("#BBBBBB"));
        for(int i = 0; i < 5; i++)
            g.drawLine(40, 100 + 100 * i, 400, 100 + 100 * i);
    }
    class showButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            int ValerieWeight = Integer.parseInt(textValerie.getText());
            result1 = ValerieWeight;
            int JeroenWeight = Integer.parseInt(textJeroen.getText());
            result2 = JeroenWeight;
            int HansWeight = Integer.parseInt(textHans.getText());
            result3 = HansWeight;
            repaint();
        }
    }
}