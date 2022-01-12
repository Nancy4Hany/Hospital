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
public class AddMedicalCase extends JFrame {
    public AddMedicalCase()
    {
  //JFrame f = new JFrame("Double rooms ") ; 
  String cases[]
         = {"Derma","Dental","psychiatry","pediatrics","Neurological","Gynacological","Ear,Nose, Throat","Cardiological"};

  JComboBox d  = new JComboBox (cases) ; 
   d.setBounds(50,50,90,20) ; 
   add(d); 
setLayout(null);
setSize(400, 500);
//setVisible(true);
  
           }
    
}
