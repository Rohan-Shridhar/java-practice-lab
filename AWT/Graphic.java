import java.awt.*;
import java.awt.event.*;
public class Graphic extends Frame{
    Graphic(){
        setTitle("Shapes");
        setSize(300,1000);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){System.exit(0);}
        });
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawLine(50, 50, 200, 50);

        g.drawArc(50,150,150,50,0,180);
        g.fillArc(50,250,150,50,0,180);

        g.drawOval(50, 300, 100, 50);
        g.fillOval(50, 400, 100, 50);

        g.drawRect(50,500,100,60);
        g.fillRect(50,600,100,60);

        int[] x = {50,100,150};
        int[] y = {700,660,700};
        g.fillPolygon(x,y,3);
    }
    public static void main(String[] args) {
        new Graphic();
    }
}
