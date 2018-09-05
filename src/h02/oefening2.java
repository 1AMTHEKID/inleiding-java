package h02;

import java.applet.Applet;
import java.awt.*;

public class oefening2 extends Applet {
    public void init () {
        setBackground(Color.magenta);
    }

    public void paint(Graphics g) {
        g. setColor(Color.pink);
        g.drawString("Ewaja wats deze :/", 50, 60);
    }
}