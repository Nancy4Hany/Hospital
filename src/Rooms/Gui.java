/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rooms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Gui extends JFrame {

    JRadioButton s = new JRadioButton();
    JButton b = new JButton("submit");
    JRadioButton D = new JRadioButton();
    JRadioButton t = new JRadioButton();
    ButtonGroup b1 = new ButtonGroup();
    JLabel single = new JLabel("Single");
    JLabel Double = new JLabel("Double");
    JLabel triple = new JLabel("Triple");
    Container cp = getContentPane();

    public Gui() {

        b1.add(s);
        b1.add(D);
        b1.add(t);
        b1.add(b);
        setSize(800, 600);
        b.setBounds(260, 320, 150, 40);
        b.setBackground(new Color(250, 193, 60));
        b.setForeground(Color.white);
        single.setBounds(310, 90, 500, 60);
        Double.setBounds(310, 156, 500, 60);
        triple.setBounds(310, 220, 500, 60);
        single.setFont(new Font("Serif", Font.BOLD, 20));
        Double.setFont(new Font("Serif", Font.BOLD, 20));
        triple.setFont(new Font("Serif", Font.BOLD, 20));
        s.setBounds(410, 90, 20, 60);
        D.setBounds(410, 156, 20, 60);
        t.setBounds(410, 220, 20, 60);
        setLayout(null);
        getContentPane().setBackground(Color.lightGray);
        s.setOpaque(false);
        D.setOpaque(false);
        t.setOpaque(false);
        cp.add(single);
        cp.add(Double);
        cp.add(triple);
        cp.add(s);
        cp.add(D);
        cp.add(t);
        cp.add(b);
        setLayout(null);
        setTitle("Welcome Page");
        setSize(new Dimension(800, 600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon icona = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\rooms.jpg");
        Image pic = icona.getImage();
        Image newpic = pic.getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH);
        icona = new ImageIcon(newpic);
        JLabel label2 = new JLabel("", icona, JLabel.CENTER);
        label2.setBounds(3, 2, 800, 600);
        add(label2);
        b.addActionListener(new run());
        single.setBackground(new Color(90, 101, 216));
        Double.setBackground(new Color(90, 101, 216));
        triple.setBackground(new Color(90, 101, 216));
        
    }

    void drawRectangles(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int x = 170;
        int y = 50;
        int width = 370;
        int height = 420;
        int arcWidth = 20;
        int arcHeight = 20;
        g.setColor(new Color(69,75,197,90));
        g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);

    }

//     public void painter(Graphics g)
//     {
//         super.paint(g);
//         g.setColor(Color.red);
//      //   g.setOval(ball_x,ball_y,ball_dim,ball_dim)
//     
//     }
// public void startMoving()
// {
//     move = new Thread(){
//         
// 
//             @Override
//             public void run() 
//             {
//                 while(true)
//                 {
//                     
//                     try {
//                         sleep(30);
//                     } catch (InterruptedException ex) {
//                         Logger.getLogger(Form_SignUp.class.getName()).log(Level.SEVERE, null, ex);
//                     }
//             
//                 
//                 ball_X = ball_X + (5*x_cof);
//                 ball_Y = ball_Y + (5*y_cof);
//                 repaint();
//                 }
//             }
//};
//     move.start();
// }
// public void keyTyped(KeyEvent e)
// {
// }
// 
// public void keyPressed(KeyEvent e)
// {
//     if(e.getKeyCode()==KeyEvent.VK_LEFT)
//     {
//         repaint();
//     }
    //}   
    public void paint(Graphics g) {
        super.paint(g);
        drawRectangles(g);

    }

    private class run implements ActionListener {

        boolean single1 = s.isSelected();
        boolean Double1 = D.isSelected();
        boolean Triple1 = t.isSelected();

        @Override
        public void actionPerformed(ActionEvent e) {

            if (s.isSelected()) {
                JOptionPane.showMessageDialog(null, "you have to pay 500 per day  ", "room ", JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                single s1 = new single();
                s1.setVisible(true);
            } else if (D.isSelected()) {
                JOptionPane.showMessageDialog(null, "you have to pay 1000 per day  ", "room ", JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                Double d1 = new Double();
                d1.setVisible(true);
            } else if (t.isSelected()) {
                JOptionPane.showMessageDialog(null, "you have to pay 1500 per day  ", "room ", JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                Triple t1 = new Triple();
                t1.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "you have to choose an option ", "Error ", JOptionPane.WARNING_MESSAGE);

            }
        }
    }

}
