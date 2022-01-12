/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import Homes.HomeRec;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Hani
 */
public class PListOptionsGui extends JFrame {
    JButton add = new JButton();
    JButton view = new JButton();
    JButton remove = new JButton();
    JButton edit = new JButton();
    JButton search = new JButton();
    public PListOptionsGui()
    {
     setDefaultCloseOperation(EXIT_ON_CLOSE);
    getContentPane().setBackground(new Color(218, 244, 183));
    setSize(800,600);
    setLayout(null);
    setTitle("List Options");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon icona = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\add option.png");
        Image pic = icona.getImage();
        Image newpic = pic.getScaledInstance(95, 90, java.awt.Image.SCALE_SMOOTH);
        icona = new ImageIcon(newpic);
        add = new JButton(icona);
        add.setBounds(319, 220, 90, 81);
//        arrow.setOpaque(opa);
        add.setBackground(new Color(218, 244, 183));
        add.setForeground(Color.white);
        add.setBorderPainted(false);
      //  add.addActionListener(new HomeRec.run());
        add(add);
        //on mouse touch text of option 
      
     ImageIcon viewIcon = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\view.png");
        Image picviewIcon = viewIcon.getImage();
        Image newpic2 = picviewIcon.getScaledInstance(150, 130, java.awt.Image.SCALE_REPLICATE);
        viewIcon = new ImageIcon(newpic2);
        view = new JButton(viewIcon);
        view.setBounds(309, 20, 90, 100);
        view.setOpaque(true);
//        arrow.setOpaque(opa);
        view.setBackground(new Color(218, 244, 183));
        view.setForeground(Color.white);
        view.setBorderPainted(false);
        add(view);
        
          ImageIcon searchIcon = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\search.png");
        Image picsearch = searchIcon.getImage();
        Image newsearch = picsearch.getScaledInstance(100, 90, java.awt.Image.SCALE_REPLICATE);
        searchIcon = new ImageIcon(newsearch);
        search = new JButton(searchIcon);
        search.setBounds(297, 100, 130, 120);
        search.setOpaque(true);
//        arrow.setOpaque(opa);
        search.setBackground(new Color(218, 244, 183));
        search.setForeground(Color.white);
        search.setBorderPainted(false);
        add(search);
        
        
        
        
     
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon AddDoc = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\delete option.png");
        Image picDoc = AddDoc.getImage();
        Image newpic3 = picDoc.getScaledInstance(100, 97, java.awt.Image.SCALE_REPLICATE);
        AddDoc = new ImageIcon(newpic3);
        remove = new JButton(AddDoc);
        remove.setBounds(319, 320,  90, 90);
//        bAddDoc.setOpaque(true);
//        arrow.setOpaque(opa);
        remove.setBackground(new Color(218, 244, 183));
        remove.setForeground(Color.white);
        remove.setBorderPainted(false);
        add(remove);
   
        
         
        ImageIcon editicon = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\edit option.png");
        Image picedit  = editicon.getImage();
        Image newedit  = picedit .getScaledInstance(86, 72, java.awt.Image.SCALE_REPLICATE);
        editicon = new ImageIcon(newedit );
        edit  = new JButton(editicon);
        edit .setBounds(320, 430,  90, 90);
//        bAddDoc.setOpaque(true);
//        arrow.setOpaque(opa);
       edit.setBackground(new Color(218, 244, 183));
        edit.setForeground(Color.white);
        edit.setBorderPainted(false);
        add(edit);
        
       
        
        
    }
    
}
