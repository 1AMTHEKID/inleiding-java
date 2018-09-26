package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {
    TextField textfield;
    Button button;
    Button buttonReset;

    public void init(){
        textfield = new TextField("",30);
        button = new Button("CHEEKI BREEKI");
        button.addActionListener(new ButtonListener());
        add(textfield);
        add(button);

        buttonReset = new Button ("Reset blyat");
        buttonReset.addActionListener(new ButtonListener2());
        add(buttonReset);
        // Variabele naam "2de textfield" overlayed andere textfield.
        // 2 objecten die elkaar "jammen".

    }
    public void paint(Graphics g){
        g.drawString("Insert your text here " +
                "in the text bar " +
                "and click on 'cheeki breeki'",40,70 );

    }
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            textfield.setText("blyat fuck you, " +
                    "hell that so ugly, who let your momma lose? Pizdec.");
//            repaint();
        }
    }
    class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            textfield.setText("");
            repaint();
        }
    }
}
