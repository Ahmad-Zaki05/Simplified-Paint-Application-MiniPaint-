/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Zaki
 */
public class CustomPanel extends JPanel {
    private DrawingEngine engine;

    public CustomPanel (DrawingEngine engine) {
        this.engine = engine;
    }
    
    @Override
    protected void paintComponent (Graphics canvas) {
        super.paint(canvas);
        engine.refresh(canvas);
    }
    
}
