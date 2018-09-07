package h05;
import java.awt.*;
import java.applet.Applet;

public class Opdracht2 extends Applet{

    Color yellow;
    Color black;
    Color green;
    Color blue;


    public void init(){
        yellow = Color.yellow;
        black = Color.black;
        green = Color.green;
        blue = Color.blue;

    }
}

    public void paint(Graphics g){
        // Zonder details V
        g.setColor(black);
        g.drawRect(80,10,1,300);
        g.setColor(black);
        g.drawRect(80,310,300,1);
        g.setColor(green);
        g.drawRect(85,190,60,119);
        g.fillRect(85,190,60,119);
        g.setColor(yellow);
        g.drawRect(155,9,60,300);
        g.fillRect(155,9,60,300);
        g.setColor(blue);
        g.drawRect(225,69,60,240);
        g.fillRect(225,69,60,240);
        // Met details V
        g.setColor(black);
        g.drawString("100KG",10,19);
        g.setColor(black);
        g.drawString("80KG",10,79);
        g.setColor(black);
        g.drawString("60KG",10,139);
        g.setColor(black);
        g.drawString("40KG",10,199);
        g.setColor(black);
        g.drawString("20KG",10,259);
        g.setColor(black);
        g.drawString("0KG",10,319);
        // Namen van personen V
        g.setColor(black);
        g.drawString("Valerie",95,330);
        g.setColor(black);
        g.drawString("Jeroen",165,330);
        g.setColor(black);
        g.drawString("Hans",239,330);
        // Finish, ugh.
    }