/*
 * Alik-Serguy Alphonsovich Rukubayihunga
 * CS151-Object-Oriented Design
 * MoWe 9:00-10:15 Fall 2014
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
   A panel that shows a scene composed of shapes.
*/
public class ShapeComponent extends JComponent
{
   private ArrayList<CompositeShape> shapes;
   private Point mousePoint;
   private char type;
   
   public ShapeComponent()
   {
      shapes = new ArrayList<CompositeShape>();

      addMouseListener(new
         MouseAdapter()
         {
            public void mousePressed(MouseEvent event)
            {
               mousePoint = event.getPoint();
               if(type == 's')
                    shapes.add(new SnowMan((int)mousePoint.getX(),(int)mousePoint.getY(),20));
               if(type == 'c')
                    shapes.add(new Car((int)mousePoint.getX(),(int)mousePoint.getY(),50));
               if(type == 'f')
                    shapes.add(new Face((int)mousePoint.getX(),(int)mousePoint.getY(),40));
               repaint();
            }
         });
   }

   /**
      Sets the type of shape to the scene.
      @param theType the code char of the type
   */
   public void setType(char theType)
   {
      type = theType;
   }


   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      for (CompositeShape s : shapes)
      {
         s.draw(g2);
      }
   }
}
