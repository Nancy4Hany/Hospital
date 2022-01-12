/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rooms;

import javax.swing.JComboBox;
import javax.swing.JFrame;


public class single extends JFrame 
{
   public  single()
    {
  //JFrame f = new JFrame("single rooms ") ; 
  String Singel []
         = {"A1","A2","A3","A4","A5","A6","A7","A8","A9","A10"} ;
  
  JComboBox s  = new JComboBox (Singel) ; 
   s.setBounds(50,50,90,20) ; 
   add(s); 
setLayout(null);
setSize(400, 500);
//setVisible(true);
  
           }
 
  
    
}
 