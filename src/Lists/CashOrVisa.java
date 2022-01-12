/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Hani
 */
public class CashOrVisa extends JFrame {
    JButton Visa = new JButton("Visa");
    JButton Cash = new JButton("Cash");
    CashOrVisa(){
    getContentPane().setBackground(new Color(254, 190, 204));
      setSize(new Dimension(800, 700));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Visa.setBounds(319, 140, 140, 40);
        Visa.setBackground(new Color(255,171,24));
        Visa.setForeground(Color.white);
        add(Visa);
        Cash.setBounds(319, 210, 140, 40);
        Cash.setBackground(new Color(255,159,179));
        Cash.setForeground(Color.white);
        add(Cash);
       
    }
    
}
