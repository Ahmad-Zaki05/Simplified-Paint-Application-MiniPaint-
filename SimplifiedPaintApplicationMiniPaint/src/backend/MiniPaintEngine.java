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
    private static int numOfCircles = 0;
    private static int numOfRectangles = 0;
    private static int numOfSquares = 0;
    private static int numOfLineSegments = 0;
    
    public MiniPaintEngine () {
        this.shapes = new ArrayList<>();
    }
    
    @Override
    public void addShape (Shape shape) {
        if (shape instanceof Circle) {
            MiniPaintEngine.numOfCircles ++;
            shape.setName("Circle " + MiniPaintEngine.numOfCircles);
        }
        else if (shape instanceof Rectangle) {
            MiniPaintEngine.numOfRectangles ++;
            shape.setName("Rectangle " + MiniPaintEngine.numOfRectangles);
        }
        else if (shape instanceof Square) {
            MiniPaintEngine.numOfSquares ++;
            shape.setName("Square " + MiniPaintEngine.numOfSquares);
        }
        else {
            MiniPaintEngine.numOfLineSegments ++;
            shape.setName("Line " + MiniPaintEngine.numOfLineSegments);
        }
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
