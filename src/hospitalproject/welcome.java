/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalproject;

/**
 *
 * @author Hani
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Paint;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import static java.awt.PageAttributes.MediaType.B;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class welcome extends JFrame
{
//    JButton b1=new JButton("Start");
//    JButton b1=new JButton("Start");
    
    int x=0,y=100;
    JProgressBar jb;    
    int i=0,num=0;
   
    public welcome() throws IOException
    {
         

         getContentPane().setBackground( new Color(224,255, 255) );
        ImageIcon icon = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\base.png");
        Image image=icon.getImage();
        Image newimage=image.getScaledInstance(455, 663, java.awt.Image.SCALE_SMOOTH);
        icon=new ImageIcon(newimage);
       JLabel label = new JLabel("", icon, JLabel.CENTER);
        label.setBounds(-15,110,800,600);
        add(label);
       jb=new JProgressBar(0,2000);    
        jb.setBounds(0,533,792,30);         
        jb.setValue(0);    
        jb.setStringPainted(true);    
        jb.setForeground(new Color(252,184,48));
        jb.setBackground(new Color(102,188,151));
        add(jb);    
        setSize(250,150);    
        setLayout(null);   
        
//        b1.setBounds(600,600,100,50);
//        add(b1);
//        b1.addActionListener(new OnClick());
      
        setLayout(null);
        setTitle("Welcome Page");
        setSize(new Dimension(800,600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
           ImageIcon icona = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\grad back.jpg");
       Image pic=icona.getImage();
        Image newpic=pic.getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH);
        icona=new ImageIcon(newpic);
       JLabel label2 = new JLabel("", icona, JLabel.CENTER);
        label2.setBounds(3,2,800,600);
        add(label2);
        
        
       // repaint();
        
    }
    
    
        @Override
        public void paint(Graphics g){
        
  
        super.paint(g);
        Graphics2D g2d=(Graphics2D) g;
        Font f=new Font("Areial",Font.BOLD+Font.ITALIC ,50 );
        g2d.setFont(f);
        g2d.setColor(new Color(15,53,99));
        g2d.drawString("Welcome to Our E-System",x,y);
        //setSize(1000,100);
        // Bravoooooooooo
        try{
        Thread.sleep(100);
        
        }catch(InterruptedException ex){
        }
        x+=10;
        if(x>this.getWidth()){
            x=0; 
        }
           repaint();
        }
           
public void iterate(){    
while(i<=2000){    
  jb.setValue(i);    
  i=i+20;    
  try{Thread.sleep(73);}catch(Exception e){}    
      if(i==2000)
            {
                setVisible(false);
                chooseType choose = new chooseType();
               choose.setVisible(true);
            }
}    
}



}