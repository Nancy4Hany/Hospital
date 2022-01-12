/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signupAndLogin;

/**
 *
 * @author Hani
 */
import Homes.HomeRec;
import Lists.PatientAERS;
import Lists.Receptionist;
import static Lists.Receptionist.listofRec;
import Lists.patient;
import static Lists.patient.listofPat;
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

/**
 *
 * @author Youssef
 */
public class Form_LogInReceptionist extends JFrame {

    public JButton Login;
    public JButton Back;
    public JLabel Username;
    public JLabel Password;
    public JTextField un;
    public JPasswordField pw;
    public JLabel Background = new JLabel();

    public Form_LogInReceptionist() {
        setSize(670, 600);
        setBounds(100, -5, 463, 620);
        getContentPane().setBackground(new Color(163, 200, 249));
        setLayout(null);
//        setBackground(Color.LIGHT_GRAY);
//        setVisible(false);

        Background.setIcon(new ImageIcon(new ImageIcon("E:\\Astars\\high GPA\\Year 2\\green rec.jpg").getImage().getScaledInstance(464, 746, Image.SCALE_DEFAULT)));
        Background.setBounds(100, -5, 800, 600);

        Login = new JButton("Login");
        Back = new JButton("Back");
        Username = new JLabel("Username");
        Username.setForeground(Color.darkGray);
        Password = new JLabel("Password");
        Password.setForeground(Color.darkGray);
        un = new JTextField("");
        pw = new JPasswordField("");

        Username.setBounds(190, 300, 100, 50);
        Password.setBounds(Username.getBounds().x, Username.getBounds().y + Username.getBounds().height + 10, 100, 50);
        Username.setFont(new Font("Serif", Font.PLAIN, 20));
        Password.setFont(new Font("Serif", Font.PLAIN, 20));
        Username.setForeground(Color.black);
        Password.setForeground(Color.black);

        Login.setBounds(190, Username.getBounds().y + 130, 100, 30);
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
//        Back.addActionListener(new ButtonWatcher());
    }

    public class ButtonWatcher implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object buttonPressed = e.getSource();
            if (buttonPressed.equals(Login)) {
                if (!"".equals(un.getText()) && !"".equals(pw.getText())) {
      
//                        if (listofRec.get(i).getUsername()==un.getText() && listofRec.get(i).getPassword()==pw.getText()) {
                          if(un.getText().equals("nancy")&& pw.getText().equals("nancy"))
                          {
                            setVisible(false);
                            HomeRec hr = new HomeRec();
                            hr.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Incorrect username or password,try again");
                            un.setText(null);
                            pw.setText(null);
                               }
                      
                   

                }
//                setVisible(false);
//                HomeRec homerec = new HomeRec();
//                homerec.setVisible(true);
//contains(un.getText())

            

        }
    }
}
    }
