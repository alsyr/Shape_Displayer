/*
 * Alik-Serguy Alphonsovich Rukubayihunga
 * CS151-Object-Oriented Design
 * MoWe 9:00-10:15 Fall 2014
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A class for the main frame for a shape editor.
 */
public class ShapeFrame extends JFrame {

  /**
   * Construct the main frame for a scene editor.
   */
  public ShapeFrame() {
    setTitle("Shape Displayer");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    final ShapeComponent scene = new ShapeComponent();

    JButton snowManButton = new JButton();
    snowManButton.setIcon(new ShapeIcon(new SnowMan(0, 0, 15), 30, 30));
    snowManButton.addActionListener(new
                                        ActionListener() {
                                          public void actionPerformed(ActionEvent event) {
                                            scene.setType('s');
                                          }
                                        });

    JButton carButton = new JButton();
    carButton.setIcon(new ShapeIcon(new Car(0, 0, 30), 30, 30));
    carButton.addActionListener(new
                                    ActionListener() {
                                      public void actionPerformed(ActionEvent event) {
                                        scene.setType('c');
                                      }
                                    });

    JButton smilleyButton = new JButton();
    smilleyButton.setIcon(new ShapeIcon(new Face(0, 0, 30), 30, 30));
    smilleyButton.addActionListener(new
                                        ActionListener() {
                                          public void actionPerformed(ActionEvent event) {
                                            scene.setType('f');
                                          }
                                        });

    JPanel buttons = new JPanel();

    buttons.add(snowManButton);
    buttons.add(carButton);
    buttons.add(smilleyButton);

    add(buttons, BorderLayout.NORTH);
    add(scene, BorderLayout.CENTER);

    setSize(300, 400);
  }
}


