/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homes;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MyFrame extends JFrame
{
	CustomClock clock=new CustomClock();
	
	Timer timer;
        public int i = 0;
    JButton arrow;
    JButton bAddPat;
    JButton bAddDoc;
    JButton bchat;
    JButton bnotifications;
    JButton bReachUs;
    JButton bFacilities;
    JButton bFeedback;
    JButton blogout;
	
	public MyFrame()
	{
    

        getContentPane().setBackground(new Color(218, 244, 183));
        setLayout(null);
        setTitle("Welcome Page");
        setSize(new Dimension(800, 700));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon icona = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\2arrows.png");
        Image pic = icona.getImage();
        Image newpic = pic.getScaledInstance(400, 245, java.awt.Image.SCALE_REPLICATE);
        icona = new ImageIcon(newpic);
        arrow = new JButton(icona);
        arrow.setBounds(10, -25, 80, 112);
//        arrow.setOpaque(opa);
        arrow.setBackground(new Color(218, 244, 183));
        arrow.setForeground(Color.white);
        arrow.setBorderPainted(false);
        arrow.addActionListener(new MyFrame.run2());
        add(arrow);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon AddPat = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\add pat.png");
        Image picPat = AddPat.getImage();
        Image newpic2 = picPat.getScaledInstance(375, 100, java.awt.Image.SCALE_REPLICATE);
        AddPat = new ImageIcon(newpic2);
        bAddPat = new JButton(AddPat);
        bAddPat.setBounds(100, 9, 90, 100);
        bAddPat.setOpaque(true);
//        arrow.setOpaque(opa);
        bAddPat.setBackground(new Color(218, 244, 183));
        bAddPat.setForeground(Color.white);
        bAddPat.setBorderPainted(false);
//        JLabel LAddPat = new JLabel("add patient");
//        LAddPat.setBounds(100, -20, 300, 300);
//        LAddPat.setFont(new Font("Serif", Font.BOLD, 20));
//        LAddPat.setForeground(Color.black);
//        add(LAddPat);
        add(bAddPat);
////        

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon AddDoc = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\add doc.png");
        Image picDoc = AddDoc.getImage();
        Image newpic3 = picDoc.getScaledInstance(115, 95, java.awt.Image.SCALE_REPLICATE);
        AddDoc = new ImageIcon(newpic3);
        bAddDoc = new JButton(AddDoc);
        bAddDoc.setBounds(190, 10, 60, 90);
//        bAddDoc.setOpaque(true);
//        arrow.setOpaque(opa);
        bAddDoc.setBackground(new Color(218, 244, 183));
        bAddDoc.setForeground(Color.white);
        bAddDoc.setBorderPainted(false);
        add(bAddDoc);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon chat = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\Chats.png");
        Image picchat = chat.getImage();
        Image newpic4 = picchat.getScaledInstance(90, 80, java.awt.Image.SCALE_REPLICATE);
        chat = new ImageIcon(newpic4);
        bchat = new JButton(chat);
        bchat.setBounds(270, 5, 50, 90);
//        bAddDoc.setOpaque(true);
//        arrow.setOpaque(opa);
        bchat.setBackground(new Color(218, 244, 183));
        bchat.setForeground(Color.white);
        bchat.setBorderPainted(false);
        add(bchat);

        ImageIcon notifications = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\notification.png");
        Image picnotifications = notifications.getImage();
        Image newpic5 = picnotifications.getScaledInstance(90, 80, java.awt.Image.SCALE_SMOOTH);
        notifications = new ImageIcon(newpic5);
        bnotifications = new JButton(notifications);
        bnotifications.setBounds(338, 2, 70, 100);
//        bAddDoc.setOpaque(true);
//        arrow.setOpaque(opa);
        bnotifications.setBackground(new Color(218, 244, 183));
        bnotifications.setForeground(Color.white);
        bnotifications.setBorderPainted(false);
        add(bnotifications);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon ReachUs = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\reach us.png");
        Image pReachUs = ReachUs.getImage();
        Image newpic6 = pReachUs.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
        ReachUs = new ImageIcon(newpic6);
        bReachUs = new JButton(ReachUs);
        bReachUs.setBounds(408, 13, 87, 80);
//        bAddDoc.setOpaque(true);
//        arrow.setOpaque(opa);
        bReachUs.setBackground(new Color(218, 244, 183));
        bReachUs.setForeground(Color.white);
        bReachUs.setBorderPainted(false);
        add(bReachUs);

        ImageIcon Facilities = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\facilities.png");
        Image pFacilities = Facilities.getImage();
        Image newpic9 = pFacilities.getScaledInstance(75, 75, java.awt.Image.SCALE_SMOOTH);
        Facilities = new ImageIcon(newpic9);
        bFacilities = new JButton(Facilities);
        bFacilities.setBounds(488, 13, 87, 80);
//        bAddDoc.setOpaque(true);
//        arrow.setOpaque(opa);
        bFacilities.setBackground(new Color(218, 244, 183));
        bFacilities.setForeground(Color.white);
        bFacilities.setBorderPainted(false);
        add(bFacilities);

        ImageIcon Feedback = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\feedback.png");
        Image pFeedback = Feedback.getImage();
        Image newpic8 = pFeedback.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
        Feedback = new ImageIcon(newpic8);
        bFeedback = new JButton(Feedback);
        bFeedback.setBounds(595, 13, 87, 80);
//        bAddDoc.setOpaque(true);
//        arrow.setOpaque(opa);
        bFeedback.setBackground(new Color(218, 244, 183));
        bFeedback.setForeground(Color.white);
        bFeedback.setBorderPainted(false);
        add(bFeedback);

        ImageIcon logout = new ImageIcon("E:\\Astars\\high GPA\\Year 2\\logout.png");
        Image plogout = logout.getImage();
        Image newpic7 = plogout.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        logout = new ImageIcon(newpic7);
        blogout = new JButton(logout);
        blogout.setBounds(640, 10, 130, 100);
//        bAddDoc.setOpaque(true);
//        arrow.setOpaque(opa);
        blogout.setBackground(new Color(218, 244, 183));
        blogout.setForeground(Color.white);
        blogout.setBorderPainted(false);
        add(blogout);

		setLayout(new BorderLayout());	
		
		add(clock);
		
		// toolbar
		Box toolbar = Box.createHorizontalBox();
		JButton startButton = new JButton("start");
		JButton stopButton = new JButton("Stop it");
		toolbar.add(startButton);
		toolbar.add(Box.createHorizontalStrut(10));
		toolbar.add(stopButton);
                add(toolbar, BorderLayout.PAGE_START);
				
		startButton.addActionListener( (e)->{
		//		startClock();
			});
		stopButton.addActionListener( (e)->{
//				stopClock();
			});
	}
	
	private void startClock()
	{
		if(timer!=null) return;
		
		//Create a timer that executes every 1000 milliseconds
		//The first parameter is delay
		//The second parameter is ActionListener, which can be used with anonymous classes or Lamada expressions
//		timer=new Timer(1000,(e)-> {
//			clock.repaint(); // reset clock
//		});
		
		//Anonymous class
//		timer=new Timer(1000,new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				clock.repaint();
//			}
//			
//		});
//		timer.start();
//	}
//	
//	private void stopClock()
//	{
//		if(timer != null)
//		{
//			timer.stop();
//			timer = null;
//		}
	}
     private class run2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (i == 0) {
                bAddPat.setLocation(10, 94);
                bAddDoc.setLocation(22, 174);
                bchat.setLocation(20, 240);
                bnotifications.setLocation(8, 300);
                bReachUs.setLocation(4, 380);
                bFacilities.setLocation(3, 450);
                bFeedback.setLocation(19, 519);
                blogout.setLocation(-13, 584);
                i = 1;

            } else {
                bAddPat.setLocation(100, 9);
                bAddDoc.setLocation(190, 10);
                bchat.setLocation(270, 5);
                bnotifications.setLocation(338, 2);
                bReachUs.setLocation(408, 13);
                bFacilities.setLocation(488, 13);
                bFeedback.setLocation(595, 13);
                blogout.setLocation(640, 10);
                i = 0;
            }

        }
    }
      
}
