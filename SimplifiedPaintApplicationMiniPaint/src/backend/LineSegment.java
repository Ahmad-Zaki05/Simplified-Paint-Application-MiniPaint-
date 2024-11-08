/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Zaki
 */
public class LineSegment extends AbstractShape {
    public LineSegment () {
        super();
        this.getProperties().put ("Length", 0.0);
        this.getProperties().put ("Angle", 0.0);
    }
    
    @Override
    public void draw (java.awt.Graphics canvas) {
        int start_x = this.getPosition().getX();
        int start_y = this.getPosition().getY();
        
        int end_x = start_x + (int) (this.getProperties().get("Length") * Math.cos(Math.toRadians(this.getProperties().get("Angle"))));
        int end_y = start_y + (int) (this.getProperties().get("Length") * Math.sin(Math.toRadians(this.getProperties().get("Angle"))));
        
        canvas.setColor(this.getFillColor());
        canvas.drawLine(start_x, start_y, end_x, end_y);
    }
}
