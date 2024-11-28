/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.Circle;
import backend.CustomPanel;
import backend.DrawingEngine;
import backend.LineSegment;
import backend.MiniPaintEngine;
import backend.Rectangle;
import backend.Shape;
import backend.Square;
import java.awt.Dimension;

import javax.swing.JPanel;

/**
 *
 * @author Zaki
 */
public class AppFrontend extends javax.swing.JFrame {

    /**
     * Creates new form AppFrontend
     */
    
    private DrawingEngine engine;
    
    public AppFrontend() {
        initComponents();
        
        this.setVisible(true);
        this.setTitle("MiniPaint");
        this.setSize(new Dimension (1200, 700));
        this.setLocationRelativeTo(null);
        // this.engine = new MiniPaintEngine();
        
        this.selectShapeComboBox.removeAllItems();
        this.selectShapeComboBox.addItem("Choose the shape");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectShapeLabel = new javax.swing.JLabel();
        selectShapeComboBox = new javax.swing.JComboBox<>();
        colorizeButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        circleButton = new javax.swing.JButton();
        lineSegmentButton = new javax.swing.JButton();
        rectangleButton = new javax.swing.JButton();
        squareButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        this.engine = new MiniPaintEngine ();
        canvas = new CustomPanel(this.engine);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectShapeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectShapeLabel.setText("Select Shape:");

        selectShapeComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectShapeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectShapeComboBox.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        colorizeButton.setText("Edit");
        colorizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorizeButtonMouseClicked(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        circleButton.setText("Circle");
        circleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                circleButtonMouseClicked(evt);
            }
        });

        lineSegmentButton.setText("Line Segment");
        lineSegmentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lineSegmentButtonMouseClicked(evt);
            }
        });

        rectangleButton.setText("Rectangle");
        rectangleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rectangleButtonMouseClicked(evt);
            }
        });

        squareButton.setText("Square");
        squareButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                squareButtonMouseClicked(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        loadButton.setText("Load");
        loadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadButtonMouseClicked(evt);
            }
        });

        canvas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loadButton)
                            .addComponent(saveButton)))
                    .addComponent(selectShapeLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(selectShapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(colorizeButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deleteButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(circleButton)
                        .addGap(18, 18, 18)
                        .addComponent(lineSegmentButton)
                        .addGap(18, 18, 18)
                        .addComponent(rectangleButton)
                        .addGap(18, 18, 18)
                        .addComponent(squareButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lineSegmentButton)
                    .addComponent(rectangleButton)
                    .addComponent(squareButton)
                    .addComponent(circleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadButton)
                .addGap(18, 18, 18)
                .addComponent(selectShapeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorizeButton)
                    .addComponent(deleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectShapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colorizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorizeButtonMouseClicked
        String selectedShapeName = this.selectShapeComboBox.getItemAt(this.selectShapeComboBox.getSelectedIndex());
        if (!selectedShapeName.equals("Choose the shape")) {
            Shape [] shapes = this.engine.getShapes();
            Shape selectedShape = null;
            for (Shape shape : shapes) {
                if (selectedShapeName.equals(shape.getName())) {
                    selectedShape = shape;
                }
            }
            if (selectedShape instanceof Circle) {
                new CircleConfig(this.engine, this.canvas, this.selectShapeComboBox, (Circle) selectedShape);
            }
            else if (selectedShape instanceof Rectangle) {
                new RectangleConfig(this.engine, this.canvas, this.selectShapeComboBox, (Rectangle) selectedShape);
            }
            else if (selectedShape instanceof Square) {
                new SquareConfig(this.engine, this.canvas, this.selectShapeComboBox, (Square) selectedShape);
            }
            else {
                new LineSegmentConfig(this.engine, this.canvas, this.selectShapeComboBox, (LineSegment) selectedShape);
            }
        }
        this.canvas.repaint();
    }//GEN-LAST:event_colorizeButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        String selectedShapeName = this.selectShapeComboBox.getItemAt(this.selectShapeComboBox.getSelectedIndex());
        if (!selectedShapeName.equals("Choose the shape")) {
            Shape [] shapes = this.engine.getShapes();
            Shape selectedShape = null;
            for (Shape shape : shapes) {
                if (selectedShapeName.equals(shape.getName())) {
                    selectedShape = shape;
                }
            }
            this.engine.removeShape(selectedShape);
            this.selectShapeComboBox.removeItem(selectedShapeName);
//            canvas.getGraphics().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
//            this.engine.refresh(canvas.getGraphics());
            this.canvas.repaint();
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void circleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circleButtonMouseClicked
        new CircleConfig(this.engine, this.canvas, this.selectShapeComboBox);
//        System.out.println("in circle creation");
        this.canvas.repaint();
    }//GEN-LAST:event_circleButtonMouseClicked

    private void lineSegmentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineSegmentButtonMouseClicked
        new LineSegmentConfig(this.engine, this.canvas, this.selectShapeComboBox);
//        this.canvas.repaint();
    }//GEN-LAST:event_lineSegmentButtonMouseClicked

    private void rectangleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectangleButtonMouseClicked
        new RectangleConfig(this.engine, this.canvas, this.selectShapeComboBox);
//        this.canvas.repaint();
    }//GEN-LAST:event_rectangleButtonMouseClicked

    private void squareButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_squareButtonMouseClicked
        new SquareConfig(this.engine, this.canvas, this.selectShapeComboBox);
//        this.canvas.repaint();
    }//GEN-LAST:event_squareButtonMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        this.engine.saveToFile();
    }//GEN-LAST:event_saveButtonMouseClicked

    private void loadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadButtonMouseClicked
        this.engine.readFromFile();
//        this.engine.refresh(this.canvas.getGraphics());
        this.canvas.repaint();
        Shape [] shapes = this.engine.getShapes();
        this.selectShapeComboBox.removeAllItems();
        this.selectShapeComboBox.addItem("Choose the shape");
        for (Shape shape : shapes) {
            this.selectShapeComboBox.addItem(shape.getName());
        }
    }//GEN-LAST:event_loadButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppFrontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppFrontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppFrontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppFrontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppFrontend().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel canvas;
    private javax.swing.JButton circleButton;
    private javax.swing.JButton colorizeButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton lineSegmentButton;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton rectangleButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> selectShapeComboBox;
    private javax.swing.JLabel selectShapeLabel;
    private javax.swing.JButton squareButton;
    // End of variables declaration//GEN-END:variables
}
