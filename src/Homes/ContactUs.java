/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Hani
 */
public class ContactUs extends JFrame  {
    private JLabel Contact = new JLabel("Contact us: ");
    public ContactUs()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(218, 244, 183));
        setLayout(null);
        setTitle("contact us");
        setSize(new Dimension(800, 700));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Contact.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
        Contact.setBounds(40,80,240,80);
        add(Contact);
    }
    
}
