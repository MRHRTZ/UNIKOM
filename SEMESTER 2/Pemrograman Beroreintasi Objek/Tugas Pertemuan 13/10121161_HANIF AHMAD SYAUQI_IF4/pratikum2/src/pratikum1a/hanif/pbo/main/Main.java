/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum1a.hanif.pbo.main;

/**
 *
 * @author user
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        inputPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAlamat = new javax.swing.JTextArea();
        jBtnTampil = new javax.swing.JButton();
        outputPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(620, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Data"));
        inputPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("DOMISILI              :");
        inputPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jTextNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNamaActionPerformed(evt);
            }
        });
        inputPanel.add(jTextNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 340, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("NAMA LENGKAP  :");
        inputPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, -1));

        jTextAlamat.setColumns(20);
        jTextAlamat.setRows(5);
        jScrollPane2.setViewportView(jTextAlamat);

        inputPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 340, 120));

        jBtnTampil.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBtnTampil.setText("TAMPIL");
        jBtnTampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnTampilMouseClicked(evt);
            }
        });
        inputPanel.add(jBtnTampil, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 360, 70));

        mainPanel.add(inputPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 590, 380));

        outputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Output Data"));
        outputPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextOutput.setColumns(20);
        jTextOutput.setRows(5);
        jScrollPane1.setViewportView(jTextOutput);

        outputPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 570, 170));

        mainPanel.add(outputPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 590, 200));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 590, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNamaActionPerformed

    private void jBtnTampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnTampilMouseClicked
        // TODO add your handling code here:
        String nama, alamat;
        
        nama = jTextNama.getText();
        alamat = jTextAlamat.getText();
        
        jTextOutput.setText(nama + "\n" + alamat);
    }//GEN-LAST:event_jBtnTampilMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel inputPanel;
    private javax.swing.JButton jBtnTampil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAlamat;
    private javax.swing.JTextField jTextNama;
    private javax.swing.JTextArea jTextOutput;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel outputPanel;
    // End of variables declaration//GEN-END:variables
}
