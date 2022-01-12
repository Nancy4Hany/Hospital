/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Hani
 */
public class ChatOptions extends JFrame {
    JButton chatbot = new JButton("ChatBot");
    //view list of pat 
    //view list of doctors 
    //add a new pat 
    //add a new dr 
    //edit pat 
    //edit dr 
    //delete pat 
    //delete dr 
    //search pat 
    //search dr 
    JButton talkToPat = new JButton("talk to patient");
    JButton talkToDoc = new JButton("talk to doctor");
    public ChatOptions()
    {
    
        getContentPane().setBackground(new Color(218, 244, 183));
        setLayout(null);
        setTitle("chat");
        setSize(new Dimension(800, 700));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        chatbot.setBounds(319, 140, 140, 40);
        chatbot.setBackground(new Color(255,171,24));
        chatbot.setForeground(Color.white);
        add(chatbot);
        talkToPat.setBounds(319, 210, 140, 40);
        talkToPat.setBackground(new Color(255,159,179));
        talkToPat.setForeground(Color.white);
        add(talkToPat);
        talkToDoc.setBounds(319, 280, 140, 40);
        talkToDoc.setBackground(new Color(13,136,191));
        talkToDoc.setForeground(Color.white);
        add(talkToDoc);
        
    }
    
    
}
