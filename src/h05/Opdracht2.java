package h05;
import java.awt.*;
import java.applet.Applet;

public class Opdracht2 extends Applet {

    Color yellow;
    Color black;
    Color green;
    Color blue;
    int YAsHeight;
    int XAsLength;
    int yValerie;
    int hValerie;
    int yJeroen;
    int hJeroen;
    int yHans;
    int hHans;

    public void init() {
        yellow = Color.yellow;
        black = Color.black;
        green = Color.green;
        blue = Color.blue;
        YAsHeight = 300;
        XAsLength = 205;
        hValerie = 30;
        yValerie = YAsHeight - hValerie + 9;
        hJeroen = 200;
        yJeroen = YAsHeight - hJeroen + 9;
        hHans = 120;
        yHans = YAsHeight - hHans + 9;
    }


    public void paint(Graphics g) {
        // Zonder details V
        g.setColor(black);
        g.drawRect(80, 10, 1, YAsHeight);
        // Y-as ^
        g.setColor(black);
        g.drawRect(80, 310, XAsLength, 1);
        // X-as ^
        g.setColor(green);
        g.drawRect(85, yValerie, 60, hValerie);
        g.fillRect(85, yValerie, 60, hValerie);
        g.setColor(yellow);
        g.drawRect(155, yJeroen, 60, hJeroen);
        g.fillRect(155, yJeroen, 60, hJeroen);
        g.setColor(blue);
        g.drawRect(225, yHans, 60, hHans);
        g.fillRect(225, yHans, 60, hHans);
        // Met details V
        g.setColor(black);
        g.drawString("100KG", 10, 19);
        g.setColor(black);
        g.drawString("80KG", 10, 79);
        g.setColor(black);
        g.drawString("60KG", 10, 139);
        g.setColor(black);
        g.drawString("40KG", 10, 199);
        g.setColor(black);
        g.drawString("20KG", 10, 259);
        g.setColor(black);
        g.drawString("0KG", 10, 319);
        // Namen van personen V
        g.setColor(black);
        g.drawString("Valerie", 95, 330);
        g.setColor(black);
        g.drawString("Jeroen", 165, 330);
        g.setColor(black);
        g.drawString("Hans", 239, 330);
        // Finish, ugh.
    }
}