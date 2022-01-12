/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rooms;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JFrame;


public class Triple  extends JFrame 
{
   public Triple  ()
    {
 //setTitle("Terrible rooms ") ; 
  String T []
         = {"T1","T2","T3","T4","T5","T6","T7","T8","T9","T10"} ;
  
  JComboBox t  = new JComboBox (T) ; 
   t.setBounds(50,50,90,20) ; 
   add(t); 
setLayout(null);
setSize(400, 500);
//setVisible(true);
  
           }
 
  
    
}