package h04;
import java.awt.*;
import java.applet.*;

public class Show7 extends Applet{
    public void init(){setBackground(Color.white);}

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRect(30,10,1,300);
        g.setColor(Color.black);
        g.drawRect(30,310,300,1);
        g.setColor(Color.green);
        g.drawRect(35,190,60,119);
        g.fillRect(35,190,60,119);
        g.setColor(Color.yellow);
        g.drawRect(105,9,60,300);
        g.fillRect(105,9,60,300);
        g.setColor(Color.blue);
        g.drawRect(175,69,60,240);
        g.fillRect(175,69,60,240);



    }
}
