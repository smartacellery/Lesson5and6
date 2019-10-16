
package Lesson5;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;


public class FaceMaker extends javax.swing.JFrame {
    Face f;
    public FaceMaker() {
        initComponents();
        f=new Face (facePanel.getGraphics(),100,100);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        facePanel = new javax.swing.JPanel();
        btnset = new javax.swing.JButton();
        btnmove = new javax.swing.JButton();
        btnresize = new javax.swing.JButton();
        btncolor = new javax.swing.JButton();
        btnmood = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        facePanel.setBackground(new java.awt.Color(252, 252, 252));
        facePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout facePanelLayout = new javax.swing.GroupLayout(facePanel);
        facePanel.setLayout(facePanelLayout);
        facePanelLayout.setHorizontalGroup(
            facePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        facePanelLayout.setVerticalGroup(
            facePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        btnset.setBackground(new java.awt.Color(248, 248, 248));
        btnset.setText("Set Initial Face");
        btnset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsetActionPerformed(evt);
            }
        });

        btnmove.setText("Move Face");
        btnmove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoveActionPerformed(evt);
            }
        });

        btnresize.setText("Resize Face");
        btnresize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresizeActionPerformed(evt);
            }
        });

        btncolor.setText("Change Color");
        btncolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncolorActionPerformed(evt);
            }
        });

        btnmood.setText("Toggle Mood");
        btnmood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnmove, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnresize, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(btncolor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnmood, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(facePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmove)
                    .addComponent(btnresize)
                    .addComponent(btncolor)
                    .addComponent(btnmood))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(facePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnset, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnresizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresizeActionPerformed
        int newsize= Integer.parseInt(JOptionPane.showInputDialog(this,"Enter New Size "));
        f.erase();
        f.sizenew(newsize);
        f.draw();
    }//GEN-LAST:event_btnresizeActionPerformed
    
    private void btncolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncolorActionPerformed
        Color newc=JColorChooser.showDialog(this, "Pick new face color > ", Color.red);
        f.setcolorhead(newc);
        f.draw();
    }//GEN-LAST:event_btncolorActionPerformed

    private void btnsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsetActionPerformed
       btnmood.setEnabled(true);
       btncolor.setEnabled(true);
       btnmove.setEnabled(true);
       btnresize.setEnabled(true);
       f.erase();
       f= new Face(facePanel.getGraphics(),50,50);
       f.draw();
    }//GEN-LAST:event_btnsetActionPerformed

    private void btnmoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoveActionPerformed
        int newx = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter New X"));
        int newy= Integer.parseInt(JOptionPane.showInputDialog(this,"Enter New Y" ));
        f.erase();
        f.move(newx,newy);
        f.draw();
    }//GEN-LAST:event_btnmoveActionPerformed

    private void btnmoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoodActionPerformed
        f.toggleMood();
        f.erase();
        f.draw();// TODO add your handling code here:
    }//GEN-LAST:event_btnmoodActionPerformed

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
            java.util.logging.Logger.getLogger(FaceMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaceMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaceMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaceMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FaceMaker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncolor;
    private javax.swing.JButton btnmood;
    private javax.swing.JButton btnmove;
    private javax.swing.JButton btnresize;
    private javax.swing.JButton btnset;
    private javax.swing.JPanel facePanel;
    // End of variables declaration//GEN-END:variables
}
