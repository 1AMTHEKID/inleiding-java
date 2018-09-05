package h04;
import java.awt.*;
import java.applet.*;

public class Opdracht6WIP extends Applet{
    public void init(){setBackground(Color.blue);}

    public void paint(Graphics g){
    // Stoplicht V
    g.setColor(Color.black);
    g.drawRect(60,40,124,360);
    g.fillRect(60,40,124,360);
    g.setColor(Color.black);
    g.drawRect(110,280,25,320);
    g.fillRect(110,280,25,320);
    //Stoplicht lichten V
    g.setColor(Color.green);
    g.drawArc(75,50,95,95,360,360);
    g.fillArc(75,50,95,95,360,360);
    g.setColor(Color.yellow);
    g.drawArc(75,150,95,95,360,360);
    g.fillArc(75,150,95,95,360,360);
    g.setColor(Color.red);
    g.drawArc(75,250,95,95,360,360);
    g.fillArc(75,250,95,95,360,360);
    }
}
