/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.DrawingEngine;
import backend.Rectangle;
import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author Zaki
 */
public class RectangleConfig extends javax.swing.JFrame {

    /**
     * Creates new form RectangleConfig
     */
    
    DrawingEngine engine;
    java.awt.Graphics canvas;
    Rectangle rectangle;
    
    public RectangleConfig(DrawingEngine engine, java.awt.Graphics canvas) {
        initComponents();
        
        this.engine = engine;
        this.canvas = canvas;
        this.rectangle = new Rectangle();
        
        this.setVisible(true);
        this.setTitle("Rectangle Configuration");
        this.setLocationRelativeTo(null);
        
        this.xCoordinateField.setText("" + this.rectangle.getPosition().getX());
        this.yCoordinateField.setText("" + this.rectangle.getPosition().getX());
        this.lengthField.setText("" + this.rectangle.getProperties().get("Length"));
        this.widthField.setText("" + this.rectangle.getProperties().get("Width"));
        this.fillColorPanel.setBackground(this.rectangle.getFillColor());
        this.borderColorPanel.setBackground(this.rectangle.getColor());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xCoordinateField = new javax.swing.JTextField();
        yCoordinateLabel = new javax.swing.JLabel();
        lengthLabel = new javax.swing.JLabel();
        yCoordinateField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        changeFillColorButton = new javax.swing.JButton();
        lengthField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        widthLabel = new javax.swing.JLabel();
        widthField = new javax.swing.JTextField();
        fillColorLabel = new javax.swing.JLabel();
        fillColorPanel = new javax.swing.JPanel();
        xCoordinateLabel = new javax.swing.JLabel();
        borderColorLabel = new javax.swing.JLabel();
        borderColorPanel = new javax.swing.JPanel();
        changeBorderColorButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        yCoordinateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yCoordinateLabel.setText("y-coordinate: ");

        lengthLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lengthLabel.setText("Length: ");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

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

        widthLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        widthLabel.setText("Width: ");

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

        borderColorLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        borderColorLabel.setText("Border Color:");

        borderColorPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout borderColorPanelLayout = new javax.swing.GroupLayout(borderColorPanel);
        borderColorPanel.setLayout(borderColorPanelLayout);
        borderColorPanelLayout.setHorizontalGroup(
            borderColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        borderColorPanelLayout.setVerticalGroup(
            borderColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        changeBorderColorButton.setText("Change");
        changeBorderColorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeBorderColorButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(xCoordinateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xCoordinateField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yCoordinateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yCoordinateField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(widthLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(widthField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lengthLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lengthField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fillColorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fillColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(changeFillColorButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(borderColorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(borderColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(changeBorderColorButton)))
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(widthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(widthLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(borderColorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borderColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(changeBorderColorButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        Color color = JColorChooser.showDialog(this, "Choose Fill Color", this.rectangle.getFillColor());
        this.fillColorPanel.setBackground(color);
    }//GEN-LAST:event_changeFillColorButtonMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        this.rectangle.setFillColor(this.fillColorPanel.getBackground());
        this.rectangle.setColor(this.borderColorPanel.getBackground());
        this.rectangle.setPosition(Double.parseDouble(this.xCoordinateField.getText()), Double.parseDouble(this.yCoordinateField.getText()));
        this.rectangle.getProperties().put("Length", Double.parseDouble(this.lengthField.getText()));
        this.rectangle.getProperties().put("Width", Double.parseDouble(this.widthField.getText()));
        this.rectangle.setName("Rectangle" + (this.engine.getShapes().length + 1));
        this.engine.addShape(this.rectangle);
        this.engine.refresh(this.canvas);
        this.dispose();
    }//GEN-LAST:event_saveButtonMouseClicked

    private void changeBorderColorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeBorderColorButtonMouseClicked
        Color color = JColorChooser.showDialog(this, "Choose Border Color", this.rectangle.getColor());
        this.borderColorPanel.setBackground(color);
    }//GEN-LAST:event_changeBorderColorButtonMouseClicked

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
//            java.util.logging.Logger.getLogger(RectangleConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RectangleConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RectangleConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RectangleConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RectangleConfig().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel borderColorLabel;
    private javax.swing.JPanel borderColorPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton changeBorderColorButton;
    private javax.swing.JButton changeFillColorButton;
    private javax.swing.JLabel fillColorLabel;
    private javax.swing.JPanel fillColorPanel;
    private javax.swing.JTextField lengthField;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField widthField;
    private javax.swing.JLabel widthLabel;
    private javax.swing.JTextField xCoordinateField;
    private javax.swing.JLabel xCoordinateLabel;
    private javax.swing.JTextField yCoordinateField;
    private javax.swing.JLabel yCoordinateLabel;
    // End of variables declaration//GEN-END:variables
}