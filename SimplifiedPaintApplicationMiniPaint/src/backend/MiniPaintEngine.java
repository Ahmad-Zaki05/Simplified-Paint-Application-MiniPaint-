/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;

/**
 *
 * @author Zaki
 */
public class MiniPaintEngine implements DrawingEngine {
    
    private final ArrayList <Shape> shapes;
    
    public MiniPaintEngine () {
        this.shapes = new ArrayList<>();
    }
    
    @Override
    public void addShape (Shape shape) {
        this.shapes.add(shape);
    }
    
    @Override
    public void removeShape (Shape shape) {
        this.shapes.remove(shape);
    }
    
    @Override
    public Shape[] getShapes () {
        Shape [] allShapes = new Shape [this.shapes.size()];
        return this.shapes.toArray(allShapes);
    }
    
    @Override
    public void refresh (java.awt.Graphics canvas) {
        for (Shape shape : shapes) {
            shape.draw(canvas);
        }
    }
}
