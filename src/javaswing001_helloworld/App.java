package javaswing001_helloworld;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App
{
  public static void main(String[] args)
  {
    SwingUtilities.invokeLater(new Runnable(){
      
      @Override
      public void run()
      {
            JFrame frame = new JFrame("Hello World");
            frame.setSize(600,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
      }
    });
    
    
  }
}