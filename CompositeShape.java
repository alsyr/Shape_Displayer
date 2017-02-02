/*
 * Alik-Serguy Alphonsovich Rukubayihunga
 * CS151-Object-Oriented Design
 * MoWe 9:00-10:15 Fall 2014
 */

import java.awt.*;
import java.awt.geom.*;

/**
 * A scene shape that is composed of multiple geometric shapes.
 */
public abstract class CompositeShape {
  private GeneralPath path;
  private int width;

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return width / 2;
  }

  public CompositeShape() {
    path = new GeneralPath();
  }

  protected void add(Shape s) {
    path.append(s, false);
  }

  public boolean contains(Point2D aPoint) {
    return path.contains(aPoint);
  }

  public void draw(Graphics2D g2) {
    g2.draw(path);
  }
}







