package h07;
import java.awt.*;
import java.applet.*;

public class Oefening1 extends Applet{

    public void init(){
        this.setSize(400,300);
    }

    public void paint(Graphics g){
        g.drawString("Ghello my friend!",50,60);
    }
}
