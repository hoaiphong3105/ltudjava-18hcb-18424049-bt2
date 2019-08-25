/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18424049_bt2;

import pojo.NguoiDung;
import util.Helper;

/**
 *
 * @author hoaip
 */
public class frm_Main extends javax.swing.JDialog {

    /**
     * Creates new form frm_Main
     */
    public frm_Main(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        NguoiDung user = Helper.getCurrentUser();
        if(user.getRole() == 1)
        {
            jPanel2.setVisible(false);
        }
        else
        {
            jPanel1.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnQLSV = new javax.swing.JButton();
        btnQLD = new javax.swing.JButton();
        btnQLTKB = new javax.swing.JButton();
        btnQLPK = new javax.swing.JButton();
        btnQLKH = new javax.swing.JButton();
        btnPass = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnQLSV1 = new javax.swing.JButton();
        btnQLSV2 = new javax.swing.JButton();
        btnPass1 = new javax.swing.JButton();
        btnLogOut1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnQLSV.setText("Quản lý sinh viên");
        btnQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSVActionPerformed(evt);
            }
        });

        btnQLD.setText("Quản lý điểm");
        btnQLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDActionPerformed(evt);
            }
        });

        btnQLTKB.setText("Quản lý thời khóa biểu");
        btnQLTKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLTKBActionPerformed(evt);
            }
        });

        btnQLPK.setText("Quản lý phúc khảo");
        btnQLPK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLPKActionPerformed(evt);
            }
        });

        btnQLKH.setText("Quản lý lớp học");
        btnQLKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKHActionPerformed(evt);
            }
        });

        btnPass.setText("Đổi mật khẩu");
        btnPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassActionPerformed(evt);
            }
        });

        btnLogOut.setText("Đăng xuất");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnQLSV, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnQLD, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQLTKB, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQLPK, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPass, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnQLSV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQLD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQLTKB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQLPK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQLKH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnQLSV1.setText("Xem điểm");
        btnQLSV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSV1ActionPerformed(evt);
            }
        });

        btnQLSV2.setText("Phúc khảo");
        btnQLSV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSV2ActionPerformed(evt);
            }
        });

        btnPass1.setText("Đổi mật khẩu");
        btnPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPass1ActionPerformed(evt);
            }
        });

        btnLogOut1.setText("Đăng xuất");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQLSV1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLSV2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPass1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOut1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnQLSV1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQLSV2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPass1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut1)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSVActionPerformed
        // TODO add your handling code here:
        frm_QLSV frm = new frm_QLSV(null, true);
        frm.setTitle("Quản lý sinh viên");
        frm.setLocationRelativeTo(null); // to center the JFrame
        frm.setVisible(true);
    }//GEN-LAST:event_btnQLSVActionPerformed

    private void btnQLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDActionPerformed
        // TODO add your handling code here:
        frm_QLDiem frm = new frm_QLDiem(null, true);
        frm.setTitle("Quản lý điểm");
        frm.setLocationRelativeTo(null); // to center the JFrame
        frm.setVisible(true);
    }//GEN-LAST:event_btnQLDActionPerformed

    private void btnQLTKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTKBActionPerformed
        // TODO add your handling code here:
        frm_QLTKB frm = new frm_QLTKB(null, true);
        frm.setTitle("Quản lý thời khóa biểu");
        frm.setLocationRelativeTo(null); // to center the JFrame
        frm.setVisible(true);
    }//GEN-LAST:event_btnQLTKBActionPerformed

    private void btnQLPKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLPKActionPerformed
        // TODO add your handling code here:
        frm_QLPK frm = new frm_QLPK(null, true);
        frm.setTitle("Quản lý phúc khảo");
        frm.setLocationRelativeTo(null); // to center the JFrame
        frm.setVisible(true);
    }//GEN-LAST:event_btnQLPKActionPerformed

    private void btnQLKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKHActionPerformed
        // TODO add your handling code here:
        frm_QLSV_TKB frm = new frm_QLSV_TKB(null, true);
        frm.setTitle("Quản lý lớp học");
        frm.setLocationRelativeTo(null); // to center the JFrame
        frm.setVisible(true);
    }//GEN-LAST:event_btnQLKHActionPerformed

    private void btnPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassActionPerformed
        // TODO add your handling code here:
        frm_doi_mat_khau frm = new frm_doi_mat_khau(null, true);
        frm.setTitle("Đổi mật khẩu");
        frm.setLocationRelativeTo(null); // to center the JFrame
        frm.setVisible(true);
    }//GEN-LAST:event_btnPassActionPerformed

    private void btnQLSV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSV1ActionPerformed
        // TODO add your handling code here:
        frm_sv_xem_diem frm = new frm_sv_xem_diem(null, true);
        frm.setTitle("Sinh viên xem điểm");
        frm.setLocationRelativeTo(null); // to center the JFrame
        frm.setVisible(true);
    }//GEN-LAST:event_btnQLSV1ActionPerformed

    private void btnQLSV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSV2ActionPerformed
        // TODO add your handling code here:
        frm_sv_ycpk frm = new frm_sv_ycpk(null, true);
        frm.setTitle("Yêu cầu phúc khảo");
        frm.setLocationRelativeTo(null); // to center the JFrame
        frm.setVisible(true);
    }//GEN-LAST:event_btnQLSV2ActionPerformed

    private void btnPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPass1ActionPerformed
        // TODO add your handling code here:
        frm_doi_mat_khau frm = new frm_doi_mat_khau(null, true);
        frm.setTitle("Đổi mật khẩu");
        frm.setLocationRelativeTo(null); // to center the JFrame
        frm.setVisible(true);
    }//GEN-LAST:event_btnPass1ActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        Helper.setCurrentUser(null);
        System.exit(0);
    }//GEN-LAST:event_btnLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frm_Main dialog = new frm_Main(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnLogOut1;
    private javax.swing.JButton btnPass;
    private javax.swing.JButton btnPass1;
    private javax.swing.JButton btnQLD;
    private javax.swing.JButton btnQLKH;
    private javax.swing.JButton btnQLPK;
    private javax.swing.JButton btnQLSV;
    private javax.swing.JButton btnQLSV1;
    private javax.swing.JButton btnQLSV2;
    private javax.swing.JButton btnQLTKB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
