/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;
import static Lists.Doctor.listofDoc;
import hospitalproject.Test;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DoctorAERS extends JFrame implements MouseListener {

    JLabel NameL, usernameL, addressL, phoneNumberL, passwordL, ageL, genderL;

    JTextField NameT, usernameT, addressT, genderT, ageT, phoneNumberT;
    JPasswordField passwordT ;

    JButton addB, searchB, viewB, deleteB, editB, backupB;
    JPanel p1, p2, mainP;

    public DoctorAERS() throws ParseException {

        getContentPane().setBackground(new Color(254, 190, 204));
        p1 = new JPanel();
        p1.setBackground(new Color(254, 190, 204));
        p2 = new JPanel();
        p2.setBackground(new Color(254, 190, 204));
        NameL = new JLabel("Enter Name: ");

        usernameL = new JLabel("Enter username: ");

        addressL = new JLabel("Enter Address: ");

        phoneNumberL = new JLabel("Enter Phone Number: ");
        passwordL = new JLabel("Enter Password: ");
        ageL = new JLabel("Enter age");
        genderL = new JLabel("Enter gender: ");
        ageT = new JTextField(10);
        genderT = new JTextField(10);

        NameT = new JTextField(10);

//        NameT = new JTextField(10);
        usernameT = new JTextField(10);

        addressT = new JTextField(10);

        phoneNumberT = new JTextField(10);
        passwordT = new JPasswordField(10);
        addB = new JButton("Add");
        addB.addActionListener(new ButtonWatcher());
        searchB = new JButton("Search");
        searchB.addActionListener(new ButtonWatcher());
        viewB = new JButton("View");
        editB = new JButton("edit");
        editB.addActionListener(new ButtonWatcher());
        deleteB = new JButton("Delete");
        deleteB.addActionListener(new ButtonWatcher());
        
        mainP = new JPanel();
        p1.add(NameL);
        p1.add(NameT);
        p1.add(ageL);
        p1.add(ageT);
        p1.add(genderL);
        p1.add(genderT);
        p1.add(usernameL);
        p1.add(usernameT);
        p1.add(passwordL);
        p1.add(passwordT);
        p1.add(phoneNumberL);
        p1.add(phoneNumberT);

        p1.setLayout(new GridLayout(5, 2));

        p2.add(addB);

        p2.add(searchB);

        p2.add(viewB);

        p2.add(deleteB);
        p2.add(editB);


        mainP.add(p1);

        mainP.add(p2);
        mainP.setBackground(new Color(254, 190, 204));
        mainP.setLayout(new GridLayout(2, 1));

        add(mainP);

        setSize(800, 600);
        viewB.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == viewB) {
          

// Loops till end of the list
           
// Displays bill
//
//               JOptionPane.showMessageDialog(null, listofPat.get(x), "list ", JOptionPane.WARNING_MESSAGE);
                try {

                    getData();
                } catch (IOException ex) {
                    Logger.getLogger(PatientAERS.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PatientAERS.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        

    }

    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseExited(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getData() throws IOException, ClassNotFoundException {
        ListDGui g = new ListDGui();
        g.setVisible(true);
    }

    public class ButtonWatcher implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Object buttonPressed = e.getSource();
            if (buttonPressed.equals(addB)) {

                
            if (!"".equals(NameT.getText()) && !"".equals(ageT.getText()) && !"".equals(genderT.getText()) && !"".equals(usernameT.getText()) && !"".equals(passwordT.getText()) && !"".equals(phoneNumberT.getText())) {
                try {
                    listofDoc=Doctor.ReadingFile();
                } catch (IOException ex) {
                    Logger.getLogger(PatientAERS.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PatientAERS.class.getName()).log(Level.SEVERE, null, ex);
                }
                Doctor d = new Doctor();
                d.setUsername(usernameT.getText());
                d.setPhone(phoneNumberT.getText());
                d.setName(NameT.getText());
                d.setAge(ageT.getText());
                d.setGender(genderT.getText());
                d.setPassword(passwordT.getText());
                listofDoc.add(d);
                if (listofDoc.contains(d)) {
                    JOptionPane.showMessageDialog(null, "Successfully added");
                    try {
                        
                        patient.WritingFile();
                    } catch (IOException ex) {
                        Logger.getLogger(DoctorAERS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Please fill all the required fields...");
            }
            }
            else if(buttonPressed.equals(searchB))
            {
                SearchPList search = new SearchPList();
                search.setVisible(true);
                        
        }
            else if(buttonPressed.equals(deleteB))
            {
                DeletePList del = new DeletePList();
                del.setVisible(true);
                        
        }

    }
}
}
