/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Calendar;

import javax.swing.JPanel;

public class CustomClock extends JPanel
{

	@Override
	protected void paintComponent(Graphics g) 
	{
		int width=200;
		int height=200;
		Graphics2D g2d=(Graphics2D)g;
		
		
		// Smooth rendering (anti-aliasing)
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//		g2d.setPaint(Color.white);
//		g2d.fillRect(200, 200, width, height);
		
		// Get the largest text
		//Rectangle rect = new Rectangle(0,0,200,200);
		int w = width;
		int h = width;
		if( h > height)
		{
			h = height;
			w = height;
		}
		Rectangle rect = new Rectangle((width-w)/2, (height-h)/2, w, h);		
		rect.grow(-4,-4); // Shrink in a little
		
		//Center point and radius
		int centerX=(int)rect.getCenterX();
		int centerY=(int)rect.getCenterY();
		int radius=(int)rect.width/2;
	
	
		////////////// Round frame of dial/////////////
		if(true)
		{			
			// Background Filled with White
//			g2d.setPaint(new Color(0xFFFFFF));
//			g2d.fillOval(rect.x, rect.y, rect.width, rect.height);
			
			// Frame
			g2d.setStroke(new BasicStroke(4));
			g2d.setPaint(Color.RED);
			g2d.drawOval(100, 100, rect.width, rect.height);
		}
		
		
		/////////////// Calibration/////////////////
		if(true)
		{
			g2d.setStroke(new BasicStroke(4));
			for(double angle=0;angle<360;angle+=30)
			{
				drawRadialLine(g2d, 190, 190, radius, angle);
			}
			//Calibration by truncating spokes
			radius-=5;
//			g2d.setPaint(Color.RED);
//			g2d.fillOval(100, 20, r*2, r*2);g2d.setPaint(Color.WHITE);
//			g2d.fillOval(centerX-radius, centerY-radius, radius*2, radius*2);
			//Draw a small dot in the center
			int r=4;
//			g2d.setPaint(Color.RED);
//			g2d.fillOval(100, 20, r*2, r*2);
		}
		
		//Radiation Gradual Filling
		if(true)	
		{
			Point2D center=new Point2D.Double(centerX,centerY);
			float[] dist= {0.0f,0.2f,1.0f};  //distance
			Color[] colors = { Color.RED, Color.WHITE, Color.BLUE };  //colour
			//Gradient gradient
			RadialGradientPaint paint=new RadialGradientPaint(center,radius,dist,colors);
			g2d.setPaint(paint);
			g2d.fillOval(105, 105, radius*2, radius*2);

		}
			
			////////////// Second hand, minute hand, hour hand///////////
			
			//Get the time-seconds value
			Calendar cal=Calendar.getInstance();
			int hour=cal.get(Calendar.HOUR);
			int minute=cal.get(Calendar.MINUTE);
			int second=cal.get(Calendar.SECOND);
			
			//Hour hand
			if(true)
			{
				double radius2=radius*0.5;
				g2d.setPaint(Color.ORANGE);
				g2d.setStroke(new BasicStroke(6));
				
				//Calculating angle
				double vv=hour+minute/60.0;
				drawRadialLine(g2d,190,190,radius2,vv/12.0*360-90);
			}
			
			// Minute hand
			if(true)
			{
				double radius2 = radius *0.7;
				g2d.setPaint(Color.GREEN);
				g2d.setStroke(new BasicStroke(3));
				
				double vv = minute + second/60.0; // Angle calculation is a little complicated.
				drawRadialLine(g2d, 190, 190, radius2, minute/60.0 * 360 - 90);
			}
			
			// Second hand
			if(true)
			{
				double radius2 = radius *0.9;
				g2d.setPaint(Color.RED);
				g2d.setStroke(new BasicStroke(1));			
				drawRadialLine(g2d, 190, 190, radius2, second/60.0 * 360 - 90 );
			}	
		
	}

	
	
	// Draw spoke lines, center X, center Y, radius, angle from the center of the circle
	private void drawRadialLine(Graphics2D g2d,
			double centerX, double centerY,
			double radius, double angle)
	{
		double radian=angle/180*Math.PI; //Angle to radian
		
		double x = centerX + radius * Math.cos( radian );
		double y = centerY + radius * Math.sin( radian );	
		
		Line2D line=new Line2D.Double(x, y, centerX, centerY);
		g2d.draw(line);
	}
        
	
}