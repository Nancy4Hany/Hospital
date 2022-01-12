/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import static Lists.Doctor.listofDoc;
import static Lists.patient.listofPat;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hani
 */
public class DeleteDList extends JFrame {

    JLabel Enter = new JLabel("Enter id of patient : ");
JLabel j ;
    JTextField Deleting = new JTextField(10);
    JButton Delete = new JButton("search");

    public DeleteDList() {
        getContentPane().setBackground(new Color(254, 190, 204));

        add(Enter);
        Enter.setBounds(320, 100, 120, 50);
        add(Deleting);
        Deleting.setBounds(300, 140, 150, 30);
        setSize(800, 600);
        Delete.setBounds(319, 210, 100, 30);
        setLayout(null);
        Delete.addActionListener(new ButtonWatcher());
        add(Delete);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

  

    public class ButtonWatcher implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Object buttonPressed = e.getSource();
            if (buttonPressed.equals(Delete)) {

                int y = Integer.parseInt(Deleting.getText());
                listofDoc.remove(y);
                if(!listofDoc.contains(y))
                {
                    JOptionPane.showMessageDialog(null, "deleted successfully", "list ", JOptionPane.WARNING_MESSAGE);
                }
             
                //listofPat.get(gettext)
//                SearchedList s = new SearchedList(y);
//                s.setVisible(true);
//SearchedList(y);
            }
        }
    }
}