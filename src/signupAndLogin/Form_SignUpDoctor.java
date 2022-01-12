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
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.Formatter;
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
public class Form_SignUpDoctor extends JFrame{
     private static final int BOX_WIDTH = 640;
   private static final int BOX_HEIGHT = 480;
   // Ball's properties
   private float ballRadius = 200; // Ball's radius
   private float ballX = ballRadius + 50; // Ball's center (x, y)
   private float ballY = ballRadius + 20; 
   private float ballSpeedX = 3;   // Ball's speed for x and y
   private float ballSpeedY = 2;
   
    public JButton Bsignup = new JButton("SignUp");
    public JButton BsignUpback = new JButton("Back");
    public JTextField Tname= new JTextField();
    public JTextField Tusername= new JTextField();
    public JPasswordField Ppassword = new JPasswordField();
    public JPasswordField Prenter = new JPasswordField();
    public JLabel Lname = new JLabel("Name:");
    public JLabel Lusername = new JLabel("Username:");
    public JLabel Lpassword = new JLabel("Password:");
    public JLabel Lrepassword = new JLabel("Renter Password:");
    public JLabel Background = new JLabel();
//    addKeyListener(this);
    
    public Form_SignUpDoctor(){
        setSize(800 ,600);
//        startMoving();
        setLayout(null);
//        setBackground(Color.LIGHT_GRAY);
        setVisible(false);
        
        Background.setIcon(new ImageIcon(new ImageIcon("E:\\Astars\\high GPA\\Year 2\\a doc 2.jpg").getImage().getScaledInstance(790, 750, Image.SCALE_DEFAULT)));
       
        Background.setBounds(0, 0, 800, 600);
        
        Lname.setBounds(190, 120, 100, 25);
        Lusername.setBounds(Lname.getBounds().x, Lname.getBounds().y + 40, 100, 25);
        Lpassword.setBounds(Lusername.getBounds().x, Lusername.getBounds().y + 40, 100, 25);
        Lrepassword.setBounds(Lpassword.getBounds().x, Lpassword.getBounds().y + 40, 160, 25);
        JPanel j = new JPanel () ; 
//        Graphics g = null ;
//        g.setColor(Color.red);
//        g.drawRect(190, 120, 120, 250);
        Lname.setFont(new Font("Serif", Font.BOLD, 20));
        Lusername.setFont(new Font("Serif", Font.BOLD, 20));
        Lpassword.setFont(new Font("Serif", Font.BOLD, 20));
        Lrepassword.setFont(new Font("Serif", Font.BOLD, 20));
        Lname.setForeground(new Color(38,59,102,255));
        Lusername.setForeground(new Color(38,59,102,255));
        Lpassword.setForeground(new Color(38,59,102,255));
        Lrepassword.setForeground(new Color(38,59,102,255));
       
        
        
        Tname.setBounds(Lrepassword.getBounds().x + Lrepassword.getSize().width, Lname.getBounds().y, 150, 25);
        Tusername.setBounds(Lrepassword.getBounds().x + Lrepassword.getSize().width, Lusername.getBounds().y, 150, 25);
        Ppassword.setBounds(Lrepassword.getBounds().x + Lrepassword.getSize().width, Lpassword.getBounds().y, 150, 25);
        Prenter.setBounds(Lrepassword.getBounds().x + Lrepassword.getSize().width, Lrepassword.getBounds().y, 150, 25);
        
        add(Tname);
        add(Tusername);
        add(Ppassword);
        add(Prenter);
        add(Lname);
        add(Lusername);
        add(Lpassword);
        add(Lrepassword);
        Bsignup.setBounds(Lrepassword.getBounds().x + 35, Lrepassword.getBounds().y + 50, 80, 30);
        Bsignup.setBackground(new Color(39,61,98));
        Bsignup.setForeground(Color.white);
        BsignUpback.setBounds(Bsignup.getBounds().x + 150, Bsignup.getBounds().y, 80, 30);
        BsignUpback.setBackground(new Color(39,61,98));
        BsignUpback.setForeground(Color.white);
        add(Bsignup);
        add(BsignUpback);
        add(Background);
        
        Bsignup.addActionListener(new ButtonWatcher());
        BsignUpback.addActionListener(new ButtonWatcher());
    }
    public class ButtonWatcher implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object buttonPressed = e.getSource();
            if(buttonPressed.equals(Bsignup))
            {
                if(!"".equals(Tname.getText()) && !"".equals(Tusername.getText()) && !"".equals(Ppassword.getText()) && Ppassword.getText().equals(Prenter.getText()))
                {
//                    MyFrame2.U = new strategygame.User();
//                    MyFrame2.U.signUp();
//
//                    MyFrame2.form_SignUp.Tusername.setText(null);
//                    MyFrame2.form_SignUp.Tname.setText(null);
//                    MyFrame2.form_SignUp.Ppassword.setText(null);
//                    MyFrame2.form_SignUp.Prenter.setText(null);
//
//                    try {
//                        strategygame.User.SAVE();
//                    } catch (IOException ex) {
//                        Logger.getLogger(Form_SignUp.class.getName()).log(Level.SEVERE, null, ex);
//                    } catch (ClassNotFoundException ex) {
//                        Logger.getLogger(Form_SignUp.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                    
//                    MyFrame2.form_SignUp.setVisible(false);
//                    MyFrame2.form_HomePage.setVisible(false);
//                    MyFrame2.form_NewGame.setVisible(true);
                    JOptionPane.showMessageDialog(null, "ok great");
                        Ppassword.setText(null);
                        Prenter.setText(null);
                }
                else
                {
                    if(Ppassword.getText().equals(Prenter.getText()))
                    {
                        JOptionPane.showMessageDialog(null, "Please fill all the required fields...");
                        Ppassword.setText(null);
                        Prenter.setText(null);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "The 2 passwords doesnot match");
                        Ppassword.setText(null);
                        Prenter.setText(null);
                    }
                }
            }
//            else if(buttonPressed.equals(BsignUpback))
//            {
////                MyFrame2.form_SignUp.setVisible(false);
////                MyFrame2.form_HomePage.setVisible(true);
//            }
        }
        
    }
     void drawRectangles(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
       int x = 170;
     int y = 50;
    int width = 370;
    int height = 420;
    int arcWidth = 20;
    int arcHeight = 20;
 
// g2d.setPaint(new Color(39,61,98));
 g.setColor(new Color(250,193,60,87));
 g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
// g2d.setColor(new Color(39,61,98,90));
//g2d.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
        // code to draw rectangles goes here...
 
    }
  
//     public void painter(Graphics g)
//     {
//         super.paint(g);
//         g.setColor(Color.red);
//      //   g.setOval(ball_x,ball_y,ball_dim,ball_dim)
//     
//     }
// public void startMoving()
// {
//     move = new Thread(){
//         
// 
//             @Override
//             public void run() 
//             {
//                 while(true)
//                 {
//                     
//                     try {
//                         sleep(30);
//                     } catch (InterruptedException ex) {
//                         Logger.getLogger(Form_SignUp.class.getName()).log(Level.SEVERE, null, ex);
//                     }
//             
//                 
//                 ball_X = ball_X + (5*x_cof);
//                 ball_Y = ball_Y + (5*y_cof);
//                 repaint();
//                 }
//             }
//};
//     move.start();
// }
// public void keyTyped(KeyEvent e)
// {
// }
// 
// public void keyPressed(KeyEvent e)
// {
//     if(e.getKeyCode()==KeyEvent.VK_LEFT)
//     {
//         repaint();
//     }
 //}   
    public void paint(Graphics g) {
        super.paint(g);
        drawRectangles(g);
    }
     

}