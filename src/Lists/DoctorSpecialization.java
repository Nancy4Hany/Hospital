/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Hani
 */
public class DoctorSpecialization extends JFrame {
    public DoctorSpecialization()
    {
  //JFrame f = new JFrame("Double rooms ") ; 
  String specializations[]
         = {"Dermatology","Dentistry","psychiatry","pediatrics","Neurology","Gynacology","Ear,Nose, Throat","Cardiology"};

  JComboBox d  = new JComboBox (specializations) ; 
   d.setBounds(50,50,90,20) ; 
   add(d); 
setLayout(null);
setSize(400, 500);
//setVisible(true);
  
           }
    
}
