package TODO_LIST;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;

public class Application extends JFrame implements ActionListener {
  JLabel title;
    public void addFunction(){
      
    }
  public Application() {
    setTitle("TODO_Application");
    title=new JLabel("Hey,Welcome to the TODO Application");
    title.setBounds(250,20,400,25);
    Font titleFont=new Font("Arial",Font.BOLD,18);
    title.setFont(titleFont);
    title.setForeground(Color.RED);
    add(title);
    // Fix Function
    setLocation(400,100);
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
