/*
 * Alik-Serguy Alphonsovich Rukubayihunga
 * CS151-Object-Oriented Design
 * MoWe 9:00-10:15 Fall 2014
 */

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Face extends CompositeShape {

  /**
   * Constructs a smiley shape.
   *
   * @param x     the left of the bounding circle
   * @param y     the top of the bounding circle
   * @param width the width of the bounding circle
   */
  public Face(int x, int y, int width) {
    Ellipse2D.Double head
        = new Ellipse2D.Double(x, y, width, width);
    Ellipse2D.Double leftEye
        = new Ellipse2D.Double(x + width / 3, y + width / 3, width / 6, width / 6);
    Ellipse2D.Double rightEye
        = new Ellipse2D.Double(x + width - width / 3, y + width / 3, width / 6, width / 6);
    Rectangle2D.Double mouth
        = new Rectangle2D.Double(x + width / 3, y + width - width / 3, width / 3, width / 6);

    add(head);
    add(leftEye);
    add(rightEye);
    add(mouth);
  }
}
