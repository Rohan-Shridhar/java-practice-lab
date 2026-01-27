import java.awt.*;
import java.awt.event.*;
public class AWTFrame {
    public static void main(String[] args) {
        Frame f = new Frame("My First AWT Window");
        f.setSize(500, 500);
        f.setLayout(null);
        f.setBackground(Color.YELLOW);

        MenuBar mb = new MenuBar();
        f.setMenuBar(mb);
        Menu file = new Menu("File");
        mb.add(file);
        MenuItem newfile = new MenuItem("New File");
        file.add(newfile);
        MenuItem openfile = new MenuItem("Open File");
        file.add(openfile);
        MenuItem savefile = new MenuItem("Save File");
        file.add(savefile);
        Menu edit = new Menu("Edit");
        mb.add(edit);
        MenuItem copy = new MenuItem("Copy");
        edit.add(copy);
        MenuItem paste = new MenuItem("Paste");
        edit.add(paste);
        

        Panel p = new Panel();
        p.setLayout(null);
        p.setBounds(50, 50, 480, 480);

        Button b = new Button("Click Me");
        b.setBounds(50, 50, 100, 30);
        p.add(b);

        Label l = new Label();
        l.setAlignment(Label.CENTER);
        l.setText("Hello World");
        l.setBounds(50, 70, 100, 30);
        p.add(l);

        TextField t = new TextField();
        t.setText("Name");
        t.setBounds(50, 90, 100, 30);
        t.setColumns(20);
        p.add(t);

        TextArea ta = new TextArea(5, 20);
        ta.getText();        // read text
        ta.setText("Hi");    // set text
        ta.setEditable(true); // make read-only
        ta.append("More");   // add text at end
        ta.setBounds(50, 130, 200, 100);
        p.add(ta);

        CheckboxGroup cg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male", cg, true);
        Checkbox c2 = new Checkbox("Female", cg, false);
        c1.setBounds(50, 240, 100, 30);
        c2.setBounds(150, 240, 100, 30);
        p.add(c1);
        p.add(c2);

        Choice c = new Choice();
        c.add("Java");
        c.add("Python");
        c.add("C++");
        c.setBounds(50, 280, 100, 30);
        p.add(c);

        List lst = new List(4);   // shows 4 items at a time
        lst.add("Red");
        lst.add("Green");
        lst.add("Blue");
        lst.add("Yellow");
        lst.setBounds(50, 320, 100, 80);
        p.add(lst);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.add(p);
        f.setVisible(true);
    }
}
