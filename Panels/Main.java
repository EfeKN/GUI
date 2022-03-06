package Panels;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
      
      public static void main(String[] args) {

            JPanel mainPanel = new JPanel();
            mainPanel.setBackground(Color.decode("#747474"));
            mainPanel.setBounds(0,0,250,250);
            mainPanel.setLayout(null);

            JPanel subPanel1 = new JPanel();
            JPanel subPanel2 = new JPanel();
            JPanel subPanel3 = new JPanel();
            JPanel subPanel4 = new JPanel();

            subPanel1.setBackground(Color.decode("#F34F1C"));
            subPanel2.setBackground(Color.decode("#7FBC00"));
            subPanel3.setBackground(Color.decode("#FFBA01"));
            subPanel4.setBackground(Color.decode("#01A6F0"));

            subPanel1.setBounds(2,2,122,122);
            subPanel2.setBounds(126,2,122,122);
            subPanel4.setBounds(2,126,122,122);
            subPanel3.setBounds(126,126,122,122);
            
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(264,287);
            frame.setVisible(true);
            frame.setLayout(null);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);

            mainPanel.add(subPanel1);
            mainPanel.add(subPanel2);
            mainPanel.add(subPanel3);
            mainPanel.add(subPanel4);

            frame.add(mainPanel);

      }

}
