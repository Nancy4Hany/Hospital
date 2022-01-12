/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rooms;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class Double extends JFrame 
{
   public Double ()
    {
  //JFrame f = new JFrame("Double rooms ") ; 
  String D []
         = {"B1","B2","B3","B4","B5","B6","B7","B8","B9","B10"} ;
  
  JComboBox d  = new JComboBox (D) ; 
   d.setBounds(50,50,90,20) ; 
   add(d); 
setLayout(null);
setSize(400, 500);
//setVisible(true);
  
           }
 
  
    
}