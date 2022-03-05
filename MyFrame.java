import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    
    MyFrame() {
 
        this.setSize(600,600);
        this.setTitle("Funny Number");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLayout(null); //Border layout is done manually
        //this.setResizable(false);

        //Set logo for the GUI
        ImageIcon logo = new ImageIcon("hp.png");
        this.setIconImage(logo.getImage());

        //Create border
        Border border = BorderFactory.createLineBorder(Color.GREEN);

        //Initialize a label
        JLabel label = new JLabel("Naber müdür?");
        label.setIcon(logo);
        label.setHorizontalTextPosition(JLabel.CENTER); //Center, Right, Left, Bottom, Top
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.GREEN); //Changes font color
        label.setFont(new Font("MV Boli", Font.PLAIN,100)); //this will set font and size of text
        label.setIconTextGap(10); //Gap between image and text
        label.setBackground(Color.BLACK);
        label.setOpaque(true); //Otherwise transparent and background color wont show
        //Label takes as much space as possible
        label.setBorder(border); //sets border
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0,0,500,500); //sicne there are no border layout manager we have to set bounds manually
        this.add(label);

        //This part I do not understand
        this.getContentPane().setBackground(Color.WHITE);

        //Makes the this visible
        this.pack(); // dimensions of the frame will be adjusted to accomodate to components
        this.setVisible(true);

    }

}
