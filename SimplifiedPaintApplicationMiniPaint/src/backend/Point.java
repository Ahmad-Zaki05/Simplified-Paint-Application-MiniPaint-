/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Zaki
 */
public class Point {
    private double x;
    private double y;

    public Point () {
        this.x = 0;
        this.y = 0;
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void setPoint (double x, double y) { 
        this.setX (x);
        this.setY (y);
    }
    
    public void setX (double x) {
        this.x = x;
    }
    
    public void setY (double y) {
        this.y = y;
    }
    
    public double getX () {
        return this.x;
    }
    
    public double getY () {
        return this.y;
    }
}
