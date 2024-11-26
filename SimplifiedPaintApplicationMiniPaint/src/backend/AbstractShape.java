/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Zaki
 */
public abstract class AbstractShape implements Shape {
    private Point position;
    private Map <String, Double> properties;
    private Color color;
    private Color fillColor;
    private String name;

    public AbstractShape() {
        this.position = new Point(0, 0);
        this.properties = new HashMap<>();
        this.color = Color.BLACK;
        this.fillColor = Color.BLACK;
    }
    
    @Override
    public void setPosition (Point position) {
        this.position = position;
    }
    
    public void setPosition (double x, double y) {
        setPosition(new Point (x, y));
    }
    
    @Override
    public Point getPosition () {
        return this.position;
    }
    
    @Override
    public void setProperties (Map <String, Double> properties) {
        this.properties = properties;
    }
    @Override
    public Map <String, Double> getProperties () {
        return this.properties;
    }
    
    @Override
    public void setColor (Color color) {
        this.color = color;
    }
    @Override
    public Color getColor () {
        return this.color;
    }
    @Override
    public void setFillColor (Color fillColor) {
        this.fillColor = fillColor;
    }
    @Override
    public Color getFillColor () {
        return this.fillColor;
    }
    
    @Override
    public void setName (String name) {
        this.name = name;
    }
    @Override
    public String getName () {
        return this.name;
    }
    
    @Override
    public String toString () {
        StringBuilder s = new StringBuilder();
        s.append (this.getName());                  // 0
        s.append (",");
        s.append (this.getColor().getRGB());        // 1
        s.append (",");
        s.append (this.getFillColor().getRGB());    // 2
        s.append (",");
        s.append (this.getPosition().getX());       // 3
        s.append (",");
        s.append (this.getPosition().getY());       // 4
        s.append (",");
        this.getProperties().forEach((key, value) -> {
            s.append (key);
            s.append (":");
            s.append (value);
            s.append (",");
        });
        s.append("\n");
        return s.toString();
    }
    
    @Override
    public void setShape (String s) {
        String [] shapeDetails = s.split(",", 0);
        this.setName(shapeDetails[0]);
        this.setColor(new Color(Integer.parseInt(shapeDetails[1])));
        this.setFillColor(new Color(Integer.parseInt(shapeDetails[2])));
        this.setPosition(Double.parseDouble(shapeDetails[3]), Double.parseDouble(shapeDetails[4]));
        for (int i = 5; i < shapeDetails.length; i ++) {
            String [] property = shapeDetails[i].split(":", 0);
            this.getProperties().put(property [0], Double.parseDouble(property [1]));
        }
    }
}
