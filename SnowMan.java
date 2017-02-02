/*
 * Alik-Serguy Alphonsovich Rukubayihunga
 * CS151-Object-Oriented Design
 * MoWe 9:00-10:15 Fall 2014
 */

import java.awt.geom.Ellipse2D;

public class SnowMan extends CompositeShape {

  /**
   * Constructs a snow man shape.
   *
   * @param x     the left of the bounding circle
   * @param y     the top of the bounding circle
   * @param width the width of the bounding circle
   */
  public SnowMan(int x, int y, int width) {
    Ellipse2D.Double topBody
        = new Ellipse2D.Double(x, y, width, width);
    Ellipse2D.Double bottomBody
        = new Ellipse2D.Double(x, y + width, width, width);

    add(topBody);
    add(bottomBody);
  }
}
