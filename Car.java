/*
 * Alik-Serguy Alphonsovich Rukubayihunga
 * CS151-Object-Oriented Design
 * MoWe 9:00-10:15 Fall 2014
 */

import java.awt.geom.*;

/**
   A car shape.
*/
public class Car extends CompositeShape
{
   /**
      Constructs a car shape.
      @param x the left of the bounding rectangle
      @param y the top of the bounding rectangle
      @param width the width of the bounding rectangle
   */
   public Car(int x, int y, int width)
   {
      Rectangle2D.Double body
         = new Rectangle2D.Double(x, y + width / 6,
            width - 1, width / 6);
      Ellipse2D.Double frontTire
         = new Ellipse2D.Double(x + width / 6, y + width / 3,
            width / 6, width / 6);
      Ellipse2D.Double rearTire
         = new Ellipse2D.Double(x + width * 2 / 3,
            y + width / 3,
            width / 6, width / 6);

      // the bottom of the front windshield
      Point2D.Double r1
         = new Point2D.Double(x + width / 6, y + width / 6);
      // the front of the roof
      Point2D.Double r2
         = new Point2D.Double(x + width / 3, y);
      // the rear of the roof
      Point2D.Double r3
         = new Point2D.Double(x + width * 2 / 3, y);
      // the bottom of the rear windshield
      Point2D.Double r4
         = new Point2D.Double(x + width * 5 / 6, y + width / 6);
      Line2D.Double frontWindshield
         = new Line2D.Double(r1, r2);
      Line2D.Double roofTop
         = new Line2D.Double(r2, r3);
      Line2D.Double rearWindshield
         = new Line2D.Double(r3, r4);

      add(body);
      add(frontTire);
      add(rearTire);
      add(frontWindshield);
      add(roofTop);
      add(rearWindshield);
   }
}