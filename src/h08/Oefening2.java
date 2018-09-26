package h08;
import java.awt.*;
import java.applet.*;

public class Oefening2 extends Applet {
    TextField tekstvak;
    Label label;

    public void init(){
        tekstvak = new TextField("Touch this shit",20);
        label = new Label("Type something in here");
        add(label);
        add(tekstvak);
    }
    public void paint(Graphics G){}

}
