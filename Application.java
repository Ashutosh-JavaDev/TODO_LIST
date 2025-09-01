package TODO_LIST;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;

public class Application extends JFrame implements ActionListener {

  public Application() {
    setTitle("TODO_Application");
    JLabel title=new JLabel("Hey,Welcome to the TODO Application");
    title.setBounds(300, 20,300,20);
    add(title);
    // Fix Function
    setLocation(400, 200);
    setLayout(null);
    setSize(800, 800);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  @Override
  public void actionPerformed(ActionEvent ae) {

  }

  public static void main(String[] args) {
    new Application();
  }
}
