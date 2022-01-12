/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homes;
import java.util.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.text.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
class AlarmLabel extends JLabel implements ActionListener
{
private static final long serialVersionUID = 1L;
String type;
SimpleDateFormat sdf;
public AlarmLabel(String type)
{
this.type = type;
setForeground(Color.green);
switch (type)
{
case "date" :
sdf = new SimpleDateFormat(" MMMM dd yyyy");
setFont(new Font("sans-serif", Font.PLAIN, 12));
setHorizontalAlignment(SwingConstants.LEFT);
break;
case "time" :
sdf = new SimpleDateFormat("hh:mm:ss a");
setFont(new Font("sans-serif", Font.PLAIN, 40));
setHorizontalAlignment(SwingConstants.CENTER);
break;
case "day" :
sdf = new SimpleDateFormat("EEEE ");
setFont(new Font("sans-serif", Font.PLAIN, 16));
setHorizontalAlignment(SwingConstants.RIGHT);
break;
default:
sdf = new SimpleDateFormat();
break;
}
Timer t = new Timer(1000, this);
t.start();
}
public void actionPerformed(ActionEvent ae)
{
Date d = new Date();
setText(sdf.format(d));
}
}