/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package backend;

import java.awt.Color;
import java.util.Map;

/**
 *
 * @author Zaki
 */
public interface Shape {
    public void setPosition (Point position);
    public Point getPosition ();
    
    public void setProperties (Map <String, Double> properties);
    public Map <String, Double> getProperties ();
    
    public void setColor (Color color);
    public Color getColor ();
    public void setFillColor (Color color);
    public Color getFillColor ();
    
    public void draw (java.awt.Graphics canvas);
}
