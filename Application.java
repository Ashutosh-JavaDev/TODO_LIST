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
