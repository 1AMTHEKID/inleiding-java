package h04;
import java.awt.*;
import java.applet.*;

public class Opdracht6WIP extends Applet{
    public void init(){setBackground(Color.blue);}

    public void paint(Graphics g){
    g.setColor(Color.black);
    g.drawRect(60,40,125,180);
    g.fillRect(60,40,125,180);
    }
}
