/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.DrawingEngine;
import backend.LineSegment;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;

/**
 *
 * @author Zaki
 */
public class LineSegmentConfig extends javax.swing.JFrame {

    /**
     * Creates new form LineSegmentConfig
     */
    
    DrawingEngine engine;
    java.awt.Graphics canvas;
    LineSegment lineSegment;
    JComboBox <String> comboBox;
    
    public LineSegmentConfig(DrawingEngine engine, java.awt.Graphics canvas, JComboBox <String> comboBox) {
        initComponents();
        
        this.engine = engine;
        this.canvas = canvas;
        this.lineSegment = new LineSegment();
        this.comboBox = comboBox;
        
        this.setVisible(true);
        this.setTitle("Line Segment Configuration");
        this.setLocationRelativeTo(null);
        
        this.xCoordinateField.setText("" + this.lineSegment.getPosition().getX());
        this.yCoordinateField.setText("" + this.lineSegment.getPosition().getX());
        this.lengthField.setText("" + this.lineSegment.getProperties().get("Length"));
        this.angleField.setText("" + this.lineSegment.getProperties().get("Angle"));
        this.fillColorPanel.setBackground(this.lineSegment.getFillColor());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lengthLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        lengthField = new javax.swing.JTextField();
        fillColorLabel = new javax.swing.JLabel();
        fillColorPanel = new javax.swing.JPanel();
        xCoordinateLabel = new javax.swing.JLabel();
        xCoordinateField = new javax.swing.JTextField();
        yCoordinateLabel = new javax.swing.JLabel();
        yCoordinateField = new javax.swing.JTextField();
        changeFillColorButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        angleLabel = new javax.swing.JLabel();
        angleField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lengthLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lengthLabel.setText("Length: ");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        fillColorLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fillColorLabel.setText("Fill Color:");

        fillColorPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout fillColorPanelLayout = new javax.swing.GroupLayout(fillColorPanel);
        fillColorPanel.setLayout(fillColorPanelLayout);
        fillColorPanelLayout.setHorizontalGroup(
            fillColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        fillColorPanelLayout.setVerticalGroup(
            fillColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        xCoordinateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        xCoordinateLabel.setText("x-coordinate: ");

        yCoordinateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yCoordinateLabel.setText("y-coordinate: ");

        changeFillColorButton.setText("Change");
        changeFillColorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFillColorButtonMouseClicked(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        angleLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        angleLabel.setText("Angle: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lengthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lengthField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(xCoordinateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fillColorLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(fillColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(changeFillColorButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(angleLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(angleField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(84, 84, 84)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(xCoordinateField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(yCoordinateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yCoordinateField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yCoordinateLabel)
                    .addComponent(yCoordinateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xCoordinateLabel)
                    .addComponent(xCoordinateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lengthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lengthLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fillColorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fillColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(changeFillColorButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void changeFillColorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeFillColorButtonMouseClicked
        Color color = JColorChooser.showDialog(this, "Choose Fill Color", this.lineSegment.getFillColor());
        this.fillColorPanel.setBackground(color);
    }//GEN-LAST:event_changeFillColorButtonMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        this.lineSegment.setFillColor(this.fillColorPanel.getBackground());
        this.lineSegment.setPosition(Double.parseDouble(this.xCoordinateField.getText()), Double.parseDouble(this.yCoordinateField.getText()));
        this.lineSegment.getProperties().put("Length", Double.parseDouble(this.lengthField.getText()));
        this.lineSegment.getProperties().put("Angle", Double.parseDouble(this.angleField.getText()));
        this.lineSegment.setName("Line " + (this.engine.getShapes().length + 1));
        this.comboBox.addItem(this.lineSegment.getName());
        this.engine.addShape(this.lineSegment);
        this.engine.refresh(this.canvas);
        this.dispose();
    }//GEN-LAST:event_saveButtonMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LineSegmentConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LineSegmentConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LineSegmentConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LineSegmentConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LineSegmentConfig().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angleField;
    private javax.swing.JLabel angleLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton changeFillColorButton;
    private javax.swing.JLabel fillColorLabel;
    private javax.swing.JPanel fillColorPanel;
    private javax.swing.JTextField lengthField;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField xCoordinateField;
    private javax.swing.JLabel xCoordinateLabel;
    private javax.swing.JTextField yCoordinateField;
    private javax.swing.JLabel yCoordinateLabel;
    // End of variables declaration//GEN-END:variables
}
