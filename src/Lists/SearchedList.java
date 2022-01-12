/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import static Lists.patient.listofPat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hani
 */
public class SearchedList extends JFrame {
    public SearchedList(int x){
    DefaultTableModel model = new DefaultTableModel();      
     patient p = new patient();
   
// model.addColumn("");
//for(patient s :listofPat)
//{
//    model.addColumn("");
//}
//  
for(int j = 0 ; j<listofPat.size();j++)
{

     model.addRow(new Object[]{"Patient no. "+listofPat.indexOf(x),null});  
     model.addRow(new Object[]{"name",listofPat.get(x).getName()});
     //listofPat.get(x)
     model.addRow(new Object[]{"age",listofPat.get(x).getAge()});
     model.addRow(new Object[]{"gender",listofPat.get(x).getGender()});
    

//JOptionPane.showMessageDialog(null, p.listofPat.get(x), "list ", JOptionPane.WARNING_MESSAGE);
break; 
}
JTable table = new JTable(model);
setSize(800,600);
add(new JScrollPane(table));
}
}

