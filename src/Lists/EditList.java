/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import static Lists.patient.listofPat;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class EditList extends JFrame {

    JLabel Enter = new JLabel("Enter id of patient : ");
    JLabel j;
    JTextField Editing = new JTextField(10);
    JButton Edit = new JButton("Edit");
    String data []
         = {"name","username","age","password","height","weight","gender","phone"} ;
    JTextField datau = new JTextField(10);
    JComboBox choose = new JComboBox(data);

    public EditList() {
        getContentPane().setBackground(new Color(254, 190, 204));

        add(Enter);
        Enter.setBounds(320, 100, 120, 50);
        add(Editing);
        Editing.setBounds(300, 140, 150, 30);
        setSize(800, 600);
        Edit.setBounds(319, 210, 100, 30);
        setLayout(null);
        Edit.addActionListener(new ButtonWatcher());
        add(Edit);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public class ButtonWatcher implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Object buttonPressed = e.getSource();
            if (buttonPressed.equals(Edit)) {
                if(choose.getSelectedIndex()==0)
                {
                    try {
                        int y = Integer.parseInt(Editing.getText());
                        listofPat=patient.ReadingFile();
                        patient pNew = new patient();
                        pNew.setUsername(datau.getText());
                        listofPat.set(y, pNew);
                    } catch (IOException ex) {
                        Logger.getLogger(EditList.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(EditList.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 
//                int y = Integer.parseInt(Edit.getText());
//                listofPat.remove(y);
//                if (!listofPat.contains(y)) {
//                    JOptionPane.showMessageDialog(null, "deleted successfully", "list ", JOptionPane.WARNING_MESSAGE);
//                }

                //listofPat.get(gettext)
//                SearchedList s = new SearchedList(y);
//                s.setVisible(true);
//SearchedList(y);
            }
        }
    }
}
