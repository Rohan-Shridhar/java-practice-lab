import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements MouseListener,MouseMotionListener {

    MyFrame() {
        addMouseListener(this);   // registering listener
        addMouseMotionListener(this);
        setSize(600, 600);
        setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse Dragged");
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse Moved");
    }
}
public class Test {
    public static void main(String[] args) {
        MyFrame m=new MyFrame();
        m.addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
