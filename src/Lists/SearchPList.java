/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

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
public class SearchPList extends JFrame {

    JLabel Enter = new JLabel("Enter id of patient : ");
JLabel j ;
    JTextField searching = new JTextField(10);
    JButton search = new JButton("search");

    public SearchPList() {
        getContentPane().setBackground(new Color(254, 190, 204));

        add(Enter);
        Enter.setBounds(320, 100, 120, 50);
        add(searching);
        searching.setBounds(300, 140, 150, 30);
        setSize(800, 600);
        search.setBounds(319, 210, 100, 30);
        setLayout(null);
        search.addActionListener(new ButtonWatcher());
        add(search);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

  

    public class ButtonWatcher implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Object buttonPressed = e.getSource();
            if (buttonPressed.equals(search)) {

                int y = Integer.parseInt(searching.getText());
                JOptionPane.showMessageDialog(null, listofPat.get(y), "list ", JOptionPane.WARNING_MESSAGE);
                JFrame jf = new JFrame();
                setLayout(null);
                j=new JLabel(listofPat.get(y).getGender());
                j.setBounds(319, 210, 100, 30);
                jf.getContentPane().setBackground(new Color(254, 190, 204));
                jf.add(j);
                jf.setVisible(true);
                //listofPat.get(gettext)
//                SearchedList s = new SearchedList(y);
//                s.setVisible(true);
//SearchedList(y);
            }
        }
    }
}
