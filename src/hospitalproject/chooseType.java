/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalproject;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import javax.swing.JOptionPane;

import java.io.IOException;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import signupAndLogin.Form_LogInDoctor;
import signupAndLogin.Form_LogInPatient;
import signupAndLogin.Form_LogInReceptionist;

/**
 *
 * @author ahmed
 */
public class chooseType extends JFrame
{
    private JRadioButton typeRec = new JRadioButton();
    private JLabel labelPerson = new JLabel("choose your category ") ;
    private JLabel Rec = new JLabel("Receptionist");
    private JLabel Pat = new JLabel("Patient");
    private JLabel Doc = new JLabel("Doctor");
    private JRadioButton typePat = new JRadioButton();
    private JRadioButton typeDoc = new JRadioButton();
    private ButtonGroup bg = new    ButtonGroup();
    
    private JButton b = new JButton("Login");
    public chooseType()
    {
        ImageIcon iconRec = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\rec icon.png");
        Image imageRec=iconRec.getImage();
        Image Recimage=imageRec.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
        iconRec=new ImageIcon(Recimage);
       JLabel labelRec = new JLabel("", iconRec, JLabel.CENTER);
        labelRec.setBounds(-130,-180,800,600);
        add(labelRec);
        
        ImageIcon iconPat = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\patient.png");
        Image imagePat=iconPat.getImage();
        Image Patimage=imagePat.getScaledInstance(105, 145, java.awt.Image.SCALE_SMOOTH);
        iconPat=new ImageIcon(Patimage);
       JLabel labelPat = new JLabel("", iconPat, JLabel.CENTER);
        labelPat.setBounds(-130,-100,800,600);
        add(labelPat);
        
        ImageIcon iconDoc = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\doctor.png");
        Image imageDoc=iconDoc.getImage();
        Image Docimage=imageDoc.getScaledInstance(85, 120, java.awt.Image.SCALE_SMOOTH);
        iconDoc=new ImageIcon(Docimage);
       JLabel labelDoc = new JLabel("", iconDoc, JLabel.CENTER);
        labelDoc.setBounds(-130,-35,800,600);
        add(labelDoc);
        
        getContentPane().setBackground( new Color(224,255, 255) );
        ImageIcon icon = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\base.png");
        Image image=icon.getImage();
        Image newimage=image.getScaledInstance(170, 170, java.awt.Image.SCALE_SMOOTH);
        icon=new ImageIcon(newimage);
       JLabel label = new JLabel("", icon, JLabel.CENTER);
        label.setBounds(-310,-200,800,600);
        add(label);
        
        
           ImageIcon iconHosp = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\hosp.png");
        Image imageHosp=iconHosp.getImage();
        Image Hospimage=imageHosp.getScaledInstance(600, 800, java.awt.Image.SCALE_SMOOTH);
        iconHosp=new ImageIcon(Hospimage);
       JLabel labelHosp = new JLabel("", iconHosp, JLabel.CENTER);
        labelHosp.setBounds(280,200,800,600);
        add(labelHosp);
        
        
        
             
        getContentPane().setBackground( new Color(224,255, 255) );
        setSize(800,600);
        setLayout(null);
        bg.add(typeRec);
        bg.add(typePat);
        bg.add(typeDoc);
       
        
        labelPerson.setBounds(280,30,500,60);
        labelPerson.setForeground(new Color(21,78,124));
                //(new Color(21,78,124));
        
        Rec.setBounds(310,90,500,60);
        Pat.setBounds(310,156,500,60);
        Doc.setBounds(310,220,500,60);
        typeRec.setBounds(410,90,20,60);
        typePat.setBounds(410,156,20,60);
        typeDoc.setBounds(410,220,20,60);
        typeRec.setOpaque(false);
        typeRec.setBackground(new Color(255, 0, 0, 20) );
        typeRec.setForeground(new Color (23,175,135));
        typePat.setOpaque(false);
        typePat.setBackground(new Color(255, 0, 0, 20) );
        typeDoc.setOpaque(false);
        typeDoc.setBackground(new Color(255, 0, 0, 20) );
        
        
      
        Container cp = getContentPane();
        cp.add(typeRec);
        cp.add(Rec);
        cp.add(typePat);
        cp.add(typeRec);
        cp.add(Pat);
        cp.add(typeDoc);
        cp.add(Doc);
        cp.add(labelPerson);
        
        b.setBounds(260,320,150,40);
        b.setBackground(new Color(250,193,60));
        b.setForeground(new Color(14,63,112));
        cp.add(b);
        
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
        
         
        
        
        
        b.addActionListener(new run());
    }
    
    
    class run implements ActionListener 
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            boolean Pat = typePat.isSelected();
            boolean Rec = typeRec.isSelected();
            boolean Doc = typeDoc.isSelected();
            if(Rec)
            {
                Form_LogInReceptionist obj = new Form_LogInReceptionist();
                obj.setVisible(true);
                dispose();
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            else if(Pat)
            {
               
                Form_LogInPatient obj2 = new Form_LogInPatient();
                obj2.setVisible(true);
                dispose();
                obj2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            }
            else if(Doc)
            {
               
                Form_LogInDoctor obj3 = new Form_LogInDoctor();
                obj3.setVisible(true);
                dispose();
                obj3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                        
            }
            if(Rec== false && Doc== false && Pat == false)
            {
                JOptionPane.showMessageDialog(null,"please choose one of the options", "please choose",JOptionPane.INFORMATION_MESSAGE);
            }

            }
    }
}
