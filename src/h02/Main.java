package h02;

import java.awt.*;
import java.applet.*;

public class Main extends Applet {
    public void init() {
        setBackground(new Color(255,248, 220));
    }
    public void paint (Graphics g) {
        g. setColor(new Color(128, 0,0));
        g .drawString("Voeg @passie.vrucht op SnapChat.", 50, 70);

    }
}