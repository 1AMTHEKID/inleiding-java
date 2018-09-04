import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init(){
    }

    public void paint (Graphics g) {
        setBackground(Color.white);
        g. setColor(Color.BLACK);
        g. drawRect(20,20,200,200);
        g. fillRect(20,20,200,200);
    }
}
