package h02;

import java.awt.*;
import java.applet.*;

public class Show3 extends Applet{
    public void init () {setBackground (Color.white); }

    public void paint (Graphics g) {
        g. setColor(Color.blue);
        g.drawString("Pascual",75, 62);
        g. setColor(Color.blue);
        g.drawString("Frankel Gonzalez", 75, 75);
    }
}
