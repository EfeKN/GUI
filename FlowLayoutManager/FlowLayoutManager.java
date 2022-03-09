package FlowLayoutManager;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutManager {
      
      public static void main(String[] args) {
            
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500,500);
            frame.setLayout(new FlowLayout(FlowLayout.LEADING)); 
            
            //LEADING = Right
            //CENTER = Obvious
            //TRAILING = Left
            
            frame.setVisible(true);

            frame.add(new JButton("1"));
            frame.add(new JButton("2"));
            frame.add(new JButton("3"));
            frame.add(new JButton("4"));
            frame.add(new JButton("5"));
            frame.add(new JButton("6"));
            frame.add(new JButton("7"));
            frame.add(new JButton("8"));
            frame.add(new JButton("9"));

      }

}
