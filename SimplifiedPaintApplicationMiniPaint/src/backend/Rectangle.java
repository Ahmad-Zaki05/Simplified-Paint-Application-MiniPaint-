/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Zaki
 */
public class Rectangle extends AbstractShape {
    
    public Rectangle () {
        super();
        this.getProperties().put("Length", 0.0);
        this.getProperties().put("Width", 0.0);
    }
    
    @Override
    public void draw (java.awt.Graphics canvas) {
        canvas.setColor(this.getFillColor());
        canvas.fillRect(this.getPosition().getX(), this.getPosition().getY(), this.getProperties().get("Length").intValue(), this.getProperties().get("Width").intValue());
        canvas.setColor(this.getColor());
        canvas.drawRect(this.getPosition().getX(), this.getPosition().getY(), this.getProperties().get("Length").intValue(), this.getProperties().get("Width").intValue());
    }
}
