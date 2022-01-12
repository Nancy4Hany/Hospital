/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signupAndLogin;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Homes.HomePat;

/**
 *
 * @author Youssef
 */
public class Form_LogInPatient extends JFrame{
    public JButton Login;
    public JButton Back;
    public JLabel Username;
    public JLabel Password;
    public JTextField un;
    public JPasswordField pw;
    public JLabel Background = new JLabel();
    
    public Form_LogInPatient(){
        setSize(670, 600);
        setBounds(100,-5,463,620);
        getContentPane().setBackground(new Color(163,200,249));
        setLayout(null);
//        setBackground(Color.LIGHT_GRAY);
//        setVisible(false);
        
        Background.setIcon(new ImageIcon(new ImageIcon("E:\\Astars\\high GPA\\Year 2\\pat wallpaper.jpg").getImage().getScaledInstance(464, 746, Image.SCALE_DEFAULT)));
        Background.setBounds(100, -5, 800, 600);
        
        Login = new JButton("Login");
        Back = new JButton("Back");
        Username = new JLabel("Username");
        Username.setForeground(Color.darkGray);
        Password = new JLabel("Password");
        Password.setForeground(Color.darkGray);
        un = new JTextField("");
        pw = new JPasswordField("");
        
        Username.setBounds(190,300 , 100, 50);
        Password.setBounds(Username.getBounds().x,Username.getBounds().y + Username.getBounds().height + 10 , 100, 50);
        Username.setFont(new Font("Serif", Font.PLAIN, 20));
        Password.setFont(new Font("Serif", Font.PLAIN, 20));
        Username.setForeground(Color.black);
        Password.setForeground(Color.black);
      
        Login.setBounds(190,Username.getBounds().y + 130, 100, 30);
        Back.setBounds(Login.getBounds().x + Login.getBounds().width + 10, Login.getBounds().y, 100, 30);
        un.setBounds(Username.getBounds().x + Username.getBounds().width + 10, Username.getBounds().y + 10, 100, 25);
        pw.setBounds(Password.getBounds().x + Password.getBounds().width + 10, Password.getBounds().y + 10, 100, 25);
        
        add(Login);
        add(Back);
        add(Username);
        add(Password);
        add(un);
        add(pw);
        add(Background);
        
        Login.addActionListener(new ButtonWatcher());
        Back.addActionListener(new ButtonWatcher());
    }
    public class ButtonWatcher implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object buttonPressed = e.getSource();
            if(buttonPressed.equals(Login))
            {
                setVisible(false);
                HomePat homepat = new HomePat();
                homepat.setVisible(true);
//                MyFrame2.U = new strategygame.User();
                
//                if(users.get(un.getText()).equals(pw.getText()))
//                {
////                    try {
////                        MyFrame2.U = null;
////                        MyFrame2.U = new strategygame.User();
////                        MyFrame2.U.Username = un.getText();
////                        MyFrame2.U.setPassword(pw.getText());
////                        MyFrame2.U.login();
////                    } catch (IOException ex) {
////                        Logger.getLogger(Form_LogIn.class.getName()).log(Level.SEVERE, null, ex);
////                    } catch (ClassNotFoundException ex) {
////                        Logger.getLogger(Form_LogIn.class.getName()).log(Level.SEVERE, null, ex);
////                    }
////                    MyFrame2.form_LogIn.setVisible(false);
////                    MyFrame2.form_MainMenu.setVisible(true);
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(null, "Incorrect username or password, please try again");
//                    un.setText(null);
//                    pw.setText(null);
//                }
//            }
//            else if(buttonPressed.equals(Back))
//            {
//                MyFrame2.form_LogIn.setVisible(false);
//                MyFrame2.form_HomePage.setVisible(true);
//            }

        }
        
    }
}
}
