package BorderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainExtended {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(1,1)); //Numbers create gap between panels
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.MAGENTA);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.BLUE);
        panel5.setBackground(Color.GREEN);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        //------------------ sub panels --------------------------

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.BLACK);
        panel7.setBackground(Color.CYAN);
        panel8.setBackground(Color.ORANGE);
        panel9.setBackground(Color.GRAY);
        panel10.setBackground(Color.PINK);

        panel3.setLayout(new BorderLayout());

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        panel3.add(panel6, BorderLayout.CENTER);
        panel3.add(panel7, BorderLayout.SOUTH);
        panel3.add(panel8, BorderLayout.NORTH);
        panel3.add(panel9, BorderLayout.EAST);
        panel3.add(panel10, BorderLayout.WEST);

        //------------------ sub panels --------------------------

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.CENTER);
        frame.add(panel4, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.WEST);

    }
    
}
