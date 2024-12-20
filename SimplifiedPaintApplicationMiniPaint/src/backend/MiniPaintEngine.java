/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;

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
//        if (shape.getName() == null) {
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
//        }
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
//        System.out.println("in refresh");
        for (Shape shape : shapes) {
            shape.draw(canvas);
        }
    }
    
    @Override
    public void readFromFile () {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(java.io.File file) {
                return file.isDirectory() || file.getName().toLowerCase().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                return "Text Files (*.txt)";
            }
        });
        int choice = fileChooser.showOpenDialog(null);
        
        if (choice == JFileChooser.APPROVE_OPTION) {
            try {
                String path = fileChooser.getSelectedFile().getAbsolutePath();
                File file = new File (path);
                Scanner sc = new Scanner(file);
                String line;
                this.shapes.clear();
                MiniPaintEngine.numOfCircles = 0;
                MiniPaintEngine.numOfLineSegments = 0;
                MiniPaintEngine.numOfRectangles = 0;
                MiniPaintEngine.numOfSquares = 0;
                while (sc.hasNextLine()) {
                    line = sc.nextLine();
                    Shape shape;
                    if (line.contains("Circle")) {
                        shape = new Circle();
                    }
                    else if (line.contains("Rectangle")) {
                        shape = new Rectangle();
                    }
                    else if (line.contains("Square")) {
                        shape = new Square();
                    }
                    else {
                        shape = new LineSegment();
                    }
                    shape.setShape(line);
                    this.addShape(shape);
                }
                sc.close();
            }
            catch (FileNotFoundException e) {

            }
        }
    }
    
    @Override
    public void saveToFile () {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(java.io.File file) {
                return file.isDirectory() || file.getName().toLowerCase().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                return "Text Files (*.txt)";
            }
        });
        int choice = fileChooser.showSaveDialog(null);
        
        if (choice == JFileChooser.APPROVE_OPTION) {
            try {
                String path = fileChooser.getSelectedFile().getAbsolutePath();
                if (!path.endsWith(".txt")) {
                    path += ".txt";
                }
                FileWriter fileWriter = new FileWriter (path);
                
                for (Shape shape : shapes) {
                    fileWriter.write(shape.toString());
                }
                fileWriter.close();
            }
            catch (IOException e) {

            }
        }
    }
}
