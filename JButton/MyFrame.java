package JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

      JButton button;

      MyFrame() {

            button = new JButton("click me");
            button.addActionListener(this);
            button.setFocusable(false);

            button.setBounds(230,230,100,40);
       
            JFrame frame = new JFrame();
      
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500,500);
            frame.setVisible(true);
            frame.setLayout(null);
      
            frame.add(button);
            

      }

      @Override
      public void actionPerformed(ActionEvent e) {
            if(e.getSource()==button) {

                  System.out.println("WOW YOU PRESSED IT");

            }
            
      }
}
