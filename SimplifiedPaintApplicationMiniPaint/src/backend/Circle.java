/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.*;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Zaki
 */
public class Circle implements Shape {
    private Point position;
    private double radius;
    private Map <String, Double> properties;
    private Color color;
    private Color fillColor;

    public Circle() {
        this.position = new Point();
        this.radius = 0;
        this.properties = new HashMap<>();
        this.color = Color.BLACK;
        this.fillColor = Color.WHITE;
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
    public void draw (java.awt.Graphics canvas) {
//        super.paintComponent (canvas);
        canvas.setColor(this.getFillColor());
        canvas.fillOval(this.getPosition().getX(), this.getPosition().getY(), (int)this.radius, (int)this.radius);
//        canvas.fillOval(getPosition().getX(), getPosition().getX(), getProperties().get("radius").intValue(), getProperties().get("radius").intValue());
        canvas.setColor(getColor());
        canvas.drawOval(this.getPosition().getX(), this.getPosition().getY(), (int)this.radius, (int)this.radius);
//        canvas.drawOval(getPosition().getX(), getPosition().getX(), getProperties().get("radius").intValue(), getProperties().get("radius").intValue());
    }
    
    
    
    
    
}
