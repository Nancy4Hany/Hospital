/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import static Lists.Doctor.listofDoc;
import static Lists.patient.listofPat;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Paint;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import static java.awt.PageAttributes.MediaType.B;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

import static Lists.patient.listofPat;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JTable;

import javax.swing.JScrollPane;

public class ListDGui extends JFrame {

    public ListDGui() throws IOException, ClassNotFoundException {
        Doctor d = new Doctor();
        

DefaultTableModel model = new DefaultTableModel();      
 model.addColumn("");
for(Doctor s :listofDoc)
{
    model.addColumn("");
}
  
for(int j = 0 ; j<listofDoc.size();j++)
{

    for(Doctor o :listofDoc)
    {
     model.addRow(new Object[]{"Patient no. "+(int)listofDoc.indexOf(o),null});  
     model.addRow(new Object[]{"name",o.getName()});
     //listofPat.get(x)
     model.addRow(new Object[]{"age",o.getAge()});
     model.addRow(new Object[]{"gender",o.getGender()});
    }

break; 
}
JTable table = new JTable(model);
setSize(800,600);
add(new JScrollPane(table));
    }
     
        
    }

        
  
    
    

