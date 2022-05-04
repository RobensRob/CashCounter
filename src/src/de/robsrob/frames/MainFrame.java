package de.robsrob.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    public MainFrame(int euros, int cents) {
        this.setTitle("CashCounter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 900);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        this.setVisible(true);


        JLabel label = new JLabel();
        label.setText("Your Cash: " + euros + "," + cents + "€");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("CALIBRI",Font.PLAIN,30));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(1200 / 2 - 125, 800 / 2 - 125, 250, 250);

        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
