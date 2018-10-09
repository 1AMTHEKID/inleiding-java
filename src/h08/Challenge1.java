package h08;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Challenge1 extends Applet{
    Color yellow;
    Color black;
    Color green;
    Color blue;
    Color red;

    String textV;
    String textJ;
    String textH;

    int tV;
    int tJ;
    int tH;
    int yValerie;
    int hValerie;
    int yJeroen;
    int hJeroen;
    int yHans;
    int hHans;
    //int som;


    int YAsHeight;
    int XAsLength;

    Button showButton;

    TextField textValerie;
    TextField textJeroen;
    TextField textHans;

    Label ValerieLabel;
    Label JeroenLabel;
    Label HansLabel;

    public void init(){
        setBackground(Color.white);

        yellow = Color.yellow;
        black = Color.black;
        green = Color.green;
        blue = Color.blue;
        red = Color.red;

        YAsHeight = 399;
        XAsLength = 310;

        hValerie = 120;
        yValerie = YAsHeight - hValerie;
        hJeroen = 0;
        yJeroen = YAsHeight - hJeroen;
        hHans = 0;
        yHans = YAsHeight - hHans;

        //som=(hHans+hJeroen+hValerie)/3+40;


        textValerie = new TextField("0",10);
        textValerie.addActionListener(new show1ButtonListener());
        ValerieLabel = new Label("Valerie ");

        textJeroen = new TextField("0",10);
        textJeroen.addActionListener(new show1ButtonListener());
        JeroenLabel = new Label("Jeroen ");

        textHans = new TextField("0",10);
        textHans.addActionListener(new show1ButtonListener());
        HansLabel = new Label("Hans ");

        showButton = new Button("Toon");
        showButton.addActionListener(new show1ButtonListener());

        add(ValerieLabel);
        add(textValerie);
        add(JeroenLabel);
        add(textJeroen);
        add(HansLabel);
        add(textHans);
        add(showButton);
    }
    public void paint(Graphics g){

        g.setColor(Color.black);
        g.drawLine(100,40,100,YAsHeight);
        // ^ Y-As
        g.setColor(Color.black);
        g.drawLine(100,YAsHeight,XAsLength,YAsHeight);
        // ^ X-As
        g.setColor(red);
        g.drawRect(105,yValerie,60,hValerie);
        g.fillRect(105,yValerie,60,hValerie);
        // 70p. ruimte elke keer.
        g.setColor(red);
        g.drawRect(175,yJeroen,60,hJeroen);
        g.fillRect(175,yJeroen,60,hJeroen);

        g.setColor(red);
        g.drawRect(245,yHans,60,hHans);
        g.fillRect(245,yHans,60,hHans);
        // V Shit strings
        g.setColor(black);
        g.drawString("0KG",49,399);
        g.drawString("20KG       ___",49,339);
        g.drawString("40KG       ___",49,279);
        g.drawString("60KG       ___",49,219);
        g.drawString("80KG       ___",49,159);
        g.drawString("100KG     ___",48,99);
        g.drawString("120KG     ___",48,39);



        // V Hier beneden classes toevoegen, eerst kijken ytf balken niet werken.

    }

    class show1ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            textV = textValerie.getText();
            tV = Integer.parseInt(textV);

            textJ = textValerie.getText();
            tJ = Integer.parseInt(textJ);

            textH = textValerie.getText();
            tH = Integer.parseInt(textH);

            yValerie = YAsHeight - hValerie;
            yJeroen = YAsHeight - hJeroen;
            yHans = YAsHeight - hHans;

            hValerie = tV;
            hJeroen = tJ;
            hHans = tH;

            repaint();
            // Nieuwe JavaKlasse aanmaken, van scratch +1


        }
    }
}
