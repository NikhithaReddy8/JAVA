import java.awt.*;
import javax.swing.*;

public class ComponentsExample {

public static void main(String[] args) {
 JFrame frame = new JFrame();
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(new Dimension(300, 100));
 frame.setTitle("A frame");

 JButton button1 = new JButton();
 button1.setText("Click here.");
 button1.setBackground(Color.YELLOW);
 button1.setPreferredSize(new Dimension(150, 14));
 frame.add(button1);

 JButton button2 = new JButton();
 button2.setText("Click me!");
 button2.setBackground(Color.RED);
 button2.setPreferredSize(new Dimension(100, 45));
 frame.add(button2);
 frame.setLayout(new FlowLayout()); 
 frame.pack();
 frame.setVisible(true);
}
}
