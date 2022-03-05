//import java.awt.Color;
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;

public class Main 
{
    public static void main(String[] args) 
    {
        //Some normal operations when creating a GUI
        /**
        JFrame frame = new JFrame(); 
        frame.setSize(420,420);
        frame.setTitle("Funny Number");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        //Set logo for the GUI
        ImageIcon logo = new ImageIcon("hp.png");
        frame.setIconImage(logo.getImage());

        //This part I do not understand
        frame.getContentPane().setBackground(new Color(10,250,100));

        //Makes the frame visible
        frame.setVisible(true);
        */
        //! Two different ways which you can create a frame
        /**
         * *The first way is the method given above
         * 
         * *You create an instance of JFrame and adjust its elements
         */
        //! The other way is to use JFrame as a parent class and construct a child class

        new MyFrame();
    }
}