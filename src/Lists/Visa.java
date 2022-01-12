/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Hani
 */
public class Visa extends JFrame{
    public JButton pay;
    public JButton Back;
    public JLabel cardNumL;
    public JLabel ammountL;
    public JTextField cardNumber;
    public JTextField ammount;
    
    public Visa(){
        setSize(670, 600);
        setBounds(100,-5,463,620);
        getContentPane().setBackground(new Color(163,200,249));
        setLayout(null);
//        setBackground(Color.LIGHT_GRAY);
//        setVisible(false);
        
        //Background.setIcon(new ImageIcon(new ImageIcon("E:\\Astars\\high GPA\\Year 2\\green rec.jpg").getImage().getScaledInstance(464, 746, Image.SCALE_DEFAULT)));
        //Background.setBounds(100, -5, 800, 600);
        
        pay = new JButton("pay");
        Back = new JButton("Back");
        cardNumL = new JLabel("card number: ");
        cardNumL.setForeground(Color.darkGray);
        ammountL= new JLabel("Password");
        ammountL.setForeground(Color.darkGray);
        cardNumber= new JTextField("");
        ammount = new JTextField("");
        
       cardNumL.setBounds(190,300 , 100, 50);
        ammountL.setBounds(cardNumL.getBounds().x,cardNumL.getBounds().y + cardNumL.getBounds().height + 10 , 100, 50);
        cardNumL.setFont(new Font("Serif", Font.PLAIN, 20));
        ammountL.setFont(new Font("Serif", Font.PLAIN, 20));
        cardNumL.setForeground(Color.black);
        ammountL.setForeground(Color.black);
      
        pay.setBounds(190,cardNumL.getBounds().y + 130, 100, 30);
        Back.setBounds(pay.getBounds().x + pay.getBounds().width + 10, pay.getBounds().y, 100, 30);
        cardNumber.setBounds(cardNumL.getBounds().x + cardNumL.getBounds().width + 10, cardNumL.getBounds().y + 10, 100, 25);
        ammount.setBounds(ammountL.getBounds().x + ammountL.getBounds().width + 10, ammountL.getBounds().y + 10, 100, 25);
        
        add(pay);
        add(Back);
        add(cardNumL);
        add(ammountL);
        add(cardNumber);
        add(ammount);
        
    }
}