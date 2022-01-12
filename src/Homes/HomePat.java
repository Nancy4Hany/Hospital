/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homes;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Hani
 */
public class HomePat extends JFrame {
    JButton bFeedback;

    public HomePat() {
        getContentPane().setBackground(new Color(77, 150, 209));
        setLayout(null);
        setTitle("Welcome Page");
        setSize(new Dimension(800, 600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon icona = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\2arrows.png");
        Image pic = icona.getImage();
        Image newpic = pic.getScaledInstance(400, 245, java.awt.Image.SCALE_REPLICATE);
        icona = new ImageIcon(newpic);
        JButton arrow = new JButton(icona);
        arrow.setBounds(5, 30, 80, 100);
//        arrow.setOpaque(opa);
        arrow.setBackground(new Color(77, 150, 209));
        arrow.setForeground(Color.white);
        arrow.setBorderPainted(false);
        add(arrow);

     

  getContentPane().setBackground(new Color(77, 150, 209));
        setLayout(null);
        setTitle("Welcome Page");
        setSize(new Dimension(800, 600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon chat= new ImageIcon("E:\\Astars\\high GPA\\Year 2\\Chats.png");
        Image picchat = chat.getImage();
        Image newpic4 = picchat.getScaledInstance(750, 600, java.awt.Image.SCALE_REPLICATE);
        chat = new ImageIcon(newpic4);
        JButton bchat = new JButton(chat);
        bchat.setBounds(270, 30, 50, 130);
//        bAddDoc.setOpaque(true);
//        arrow.setOpaque(opa);
      bchat.setBackground(new Color(77, 150, 209));
        bchat.setForeground(Color.white);
        bchat.setBorderPainted(false);
        add(bchat);       
        
        
        
          getContentPane().setBackground(new Color(77, 150, 209));
        setLayout(null);
        setTitle("Welcome Page");
        setSize(new Dimension(800, 600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon notifications= new ImageIcon("E:\\Astars\\high GPA\\Year 2\\notification.png");
        Image picnotifications = notifications.getImage();
        Image newpic5 = picnotifications.getScaledInstance(170, 170, java.awt.Image.SCALE_SMOOTH);
        notifications = new ImageIcon(newpic5);
        JButton bnotifications = new JButton(notifications);
        bnotifications.setBounds(305, -2, 130, 130);
//        bAddDoc.setOpaque(true);
//        arrow.setOpaque(opa);
     bnotifications.setBackground(new Color(77, 150, 209));
        bnotifications.setForeground(Color.white);
        bnotifications.setBorderPainted(false);
        add(bnotifications);       
        
           
          getContentPane().setBackground(new Color(77, 150, 209));
        setLayout(null);
        setTitle("Welcome Page");
        setSize(new Dimension(800, 600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon ReachUs= new ImageIcon("E:\\Astars\\high GPA\\Year 2\\reach us.png");
        Image pReachUs = ReachUs.getImage();
        Image newpic6 = pReachUs.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
        ReachUs = new ImageIcon(newpic6);
        JButton bReachUs = new JButton(ReachUs);
        bReachUs.setBounds(408,13, 87, 80);
//        bAddDoc.setOpaque(true);
//        arrow.setOpaque(opa);
     bReachUs.setBackground(new Color(77, 150, 209));
        bReachUs.setForeground(Color.white);
        bReachUs.setBorderPainted(false);
        add(bReachUs);  
        
        
           ImageIcon Feedback = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\feedback.png");
        Image pFeedback = Feedback.getImage();
        Image newpic8 = pFeedback.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
        Feedback = new ImageIcon(newpic8);
        bFeedback = new JButton(Feedback);
        bFeedback.setBounds(595, 13, 87, 80);

//        bAddDoc.setOpaque(true);
//        arrow.setOpaque(opa);
        bFeedback.setBackground(new Color(218, 244, 183));
        bFeedback.setForeground(Color.white);
        bFeedback.setBorderPainted(false);
        add(bFeedback);

        
                getContentPane().setBackground(new Color(77, 150, 209));
        setLayout(null);
        setTitle("Welcome Page");
        setSize(new Dimension(800, 600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon logout= new ImageIcon("E:\\Astars\\high GPA\\Year 2\\logout.png");
        Image plogout = logout.getImage();
        Image newpic7 = plogout.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        logout = new ImageIcon(newpic7);
        JButton blogout = new JButton(logout);
        blogout.setBounds(478,10, 130, 100);
//        bAddDoc.setOpaque(true);
//        arrow.setOpaque(opa);
     blogout.setBackground(new Color(77, 150, 209));
        blogout.setForeground(Color.white);
        blogout.setBorderPainted(false);
        add(blogout);  
        
        
        
//           setLayout(null);
//        setTitle("Welcome Page");
//        setSize(new Dimension(800,600));
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//           ImageIcon icon = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\rec gradient.jpg");
//       Image picture=icon.getImage();
//        Image newp=picture.getScaledInstance(5800, 5500, java.awt.Image.SCALE_SMOOTH);
//        icona=new ImageIcon(newp);
//       JLabel label = new JLabel("", icon, JLabel.CENTER);
//        label.setBounds(3,2,800,600);
//        add(label);
    }

}
