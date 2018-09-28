package H8;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Challenge1A extends Applet {

    public TextField naaminvoer1;

    Button button1;
    Button button2;
    Button button3;

    float result1;
    float result2;
    float result3;

    public void init(){
        setSize(600, 800);

        naaminvoer1 = new TextField("",10);
        naaminvoer1.addActionListener(new button1Listener());
        add(naaminvoer1);

        button1 = new Button("Valerie");
        button1Listener B1 = new button1Listener();
        button1.addActionListener( B1 );
        add(button1);

        button2 = new Button("Jeroen");
        button2Listener B2 = new button2Listener();
        button2.addActionListener( B2 );
        add(button2);

        button3 = new Button("Hans");
        button3Listener B3 = new button3Listener();
        button3.addActionListener( B3 );
        add(button3);

        setBackground(Color.decode("#FFFFFF"));
    }
    public void paint(Graphics g){

        float Weight1 = result1;
        float Weight2 = result2;
        float Weight3 = result3;


        g.setColor(Color.BLACK);
        g.drawLine( 40, 100, 40, 600);
        g.drawLine(40, 600, 400, 600);

        g.drawString("100", 10, 104);
        g.drawString("  80", 10, 204);
        g.drawString("  60", 10, 304);
        g.drawString("  40", 10, 404);
        g.drawString("  20", 10, 504);
        g.drawString("    0", 10, 604);

        g.drawString("Valerie", 95, 615);
        g.drawString("Jeroen", 207, 615);
        g.drawString("Hans", 310, 615);

        g.setColor(Color.RED);
        g.fillRect(90, 600-(int)(100*Weight1/20), 50, (int)(100*Weight1/20));

        g.setColor(Color.RED);
        g.fillRect(200, 600-(int)(100*Weight2/20), 50, (int)(100*Weight2/20));

        g.setColor(Color.RED);
        g.fillRect(300, 600-(int)(100*Weight3/20), 50, (int)(100*Weight3/20));

        g.setColor(Color.decode("#BBBBBB"));
        for(int i = 0; i < 5; i++)
            g.drawLine(40, 100 + 100 * i, 400, 100 + 100 * i);
    }
    class button1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            float Weight1 = Float.parseFloat(naaminvoer1.getText());
            result1 = Weight1;
            repaint();
        }
    }

    class button2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            float Weight2 = Float.parseFloat(naaminvoer1.getText());
            result2 = Weight2;
            repaint();
        }
    }

    class button3Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            float Weight3 = Float.parseFloat(naaminvoer1.getText());
            result3 = Weight3;
            repaint();
        }
    }



}