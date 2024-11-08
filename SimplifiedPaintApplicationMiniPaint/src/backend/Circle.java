/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Zaki
 */
public class Circle extends AbstractShape{
    
    public Circle () {
        super();
        this.getProperties().put("Radius", 0.0);
    }

    @Override
    public void draw (java.awt.Graphics canvas) {
//        super.paintComponent (canvas);
        canvas.setColor(this.getFillColor());
        canvas.fillOval(this.getPosition().getX(), this.getPosition().getY(),  this.getProperties().get("Radius").intValue(), this.getProperties().get("Radius").intValue());
//        canvas.fillOval(getPosition().getX(), getPosition().getX(), getProperties().get("radius").intValue(), getProperties().get("radius").intValue());
        canvas.setColor(getColor());
        canvas.drawOval(this.getPosition().getX(), this.getPosition().getY(), this.getProperties().get("Radius").intValue(), this.getProperties().get("Radius").intValue());
//        canvas.drawOval(getPosition().getX(), getPosition().getX(), getProperties().get("radius").intValue(), getProperties().get("radius").intValue());
    }
    
    
    
    
    
}
