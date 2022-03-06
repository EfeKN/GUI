package JButton2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

      boolean hasStarted;

      JButton button1;
      JButton button2;
      JButton button3;
      JButton button4;

      MyFrame() {

            hasStarted = false;

            button1 = new JButton("click me");
            button1.addActionListener(this);
            button1.setFocusable(false);
            
            button2 = new JButton("no click me");
            button2.addActionListener(this);
            button2.setFocusable(false);

            button3 = new JButton("no click me");
            button3.addActionListener(this);
            button3.setFocusable(false);

            button4 = new JButton("no click me");
            button4.addActionListener(this);
            button4.setFocusable(false);

            button1.setBounds(0,0,250,250);
            button2.setBounds(0,250,250,250);
            button4.setBounds(250,0,250,250);
            button3.setBounds(250,250,250,250);

            JFrame frame = new JFrame();
      
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500,500);
            frame.setVisible(true);
            frame.setLayout(null);

            button2.setVisible(false);
            button3.setVisible(false);
            button4.setVisible(false);
      
            frame.add(button1);
            frame.add(button2);
            frame.add(button3);
            frame.add(button4);

      }

      @Override
      public void actionPerformed(ActionEvent e) {
            if(e.getSource()==button1) {
                  if(!hasStarted) 
                  {
                        hasStarted = true;
                        button1.setText("no click me");
                        button1.setVisible(false);
                        button2.setVisible(true);
                  }
                  else {
                        button1.setVisible(false);
                        button2.setVisible(true);
                  }
            }
            else if(e.getSource()==button2) 
            {
                  button2.setVisible(false);
                  button3.setVisible(true);
            }
            else if(e.getSource()==button3) 
            {
                  button3.setVisible(false);
                  button4.setVisible(true);
            }
            else if(e.getSource()==button4) 
            {
                  button4.setVisible(false);
                  button1.setVisible(true);
            }
            
      }
}
