/**
 * 
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */
package cittadini;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.JOptionPane.showMessageDialog;
import static utils.GeneralFunctions.CENTRIVACCINALIDIR;
import static utils.GeneralFunctions.checkDirHierarchy;


public class VisualizzaCentriVaccinali extends javax.swing.JFrame {


    public VisualizzaCentriVaccinali() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        centroVaccinaleLbl_VisualizzaCentriVaccinali = new javax.swing.JLabel();
        indirizzoLbl_VisualizzacentriVaccinali = new javax.swing.JLabel();
        comuneLbl_VisualizzaCentriVaccinali = new javax.swing.JLabel();
        provLbl_VisualizzaCentriVaccinali = new javax.swing.JLabel();
        capLbl_VisualizzaCentriVaccinali = new javax.swing.JLabel();
        tipologiaLbl_VisualizzaCentriVaccinali = new javax.swing.JLabel();
        namelbl_VisualizzaCentriVaccinali = new javax.swing.JLabel();
        tipelbl_VisualizzaCentriVaccinali = new javax.swing.JLabel();
        indlbl_VisualizzaCentriVaccinali = new javax.swing.JLabel();
        provlbl_VisualizzaCentriVaccinali = new javax.swing.JLabel();
        comlbl_VisualizzaCentriVaccinali = new javax.swing.JLabel();
        caplb_VisualizzaCentriVaccinali = new javax.swing.JLabel();
        btnIndietro_VisualizzaCentriVaccinali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informazioni Centro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        centroVaccinaleLbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        centroVaccinaleLbl_VisualizzaCentriVaccinali.setText("Nome Centro Vaccinale:");

        indirizzoLbl_VisualizzacentriVaccinali.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        indirizzoLbl_VisualizzacentriVaccinali.setText("Indirizzo:");

        comuneLbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        comuneLbl_VisualizzaCentriVaccinali.setText("Comune:");

        provLbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        provLbl_VisualizzaCentriVaccinali.setText("Prov:");

        capLbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        capLbl_VisualizzaCentriVaccinali.setText("CAP:");

        tipologiaLbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        tipologiaLbl_VisualizzaCentriVaccinali.setText("Tipologia");

        namelbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        namelbl_VisualizzaCentriVaccinali.setText("jLabel2");

        tipelbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        tipelbl_VisualizzaCentriVaccinali.setText("jLabel3");

        indlbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        indlbl_VisualizzaCentriVaccinali.setText("jLabel4");

        provlbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        provlbl_VisualizzaCentriVaccinali.setText("jLabel5");

        comlbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        comlbl_VisualizzaCentriVaccinali.setText("jLabel6");

        caplb_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        caplb_VisualizzaCentriVaccinali.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(indirizzoLbl_VisualizzacentriVaccinali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(indlbl_VisualizzaCentriVaccinali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(provLbl_VisualizzaCentriVaccinali)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(provlbl_VisualizzaCentriVaccinali)
                                .addGap(38, 38, 38)
                                .addComponent(comuneLbl_VisualizzaCentriVaccinali)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comlbl_VisualizzaCentriVaccinali))
                            .addComponent(centroVaccinaleLbl_VisualizzaCentriVaccinali)
                            .addComponent(namelbl_VisualizzaCentriVaccinali, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipelbl_VisualizzaCentriVaccinali)
                            .addComponent(tipologiaLbl_VisualizzaCentriVaccinali)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(capLbl_VisualizzaCentriVaccinali)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caplb_VisualizzaCentriVaccinali)))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(centroVaccinaleLbl_VisualizzaCentriVaccinali)
                    .addComponent(tipologiaLbl_VisualizzaCentriVaccinali))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelbl_VisualizzaCentriVaccinali, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipelbl_VisualizzaCentriVaccinali))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(indirizzoLbl_VisualizzacentriVaccinali)
                    .addComponent(indlbl_VisualizzaCentriVaccinali, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(provLbl_VisualizzaCentriVaccinali)
                        .addComponent(comuneLbl_VisualizzaCentriVaccinali)
                        .addComponent(capLbl_VisualizzaCentriVaccinali)
                        .addComponent(comlbl_VisualizzaCentriVaccinali)
                        .addComponent(caplb_VisualizzaCentriVaccinali))
                    .addComponent(provlbl_VisualizzaCentriVaccinali, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        btnIndietro_VisualizzaCentriVaccinali.setText("Indietro");
        btnIndietro_VisualizzaCentriVaccinali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIndietro_VisualizzaCentriVaccinaliMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new_centrovaccinale.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnIndietro_VisualizzaCentriVaccinali, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnIndietro_VisualizzaCentriVaccinali, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIndietro_VisualizzaCentriVaccinaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIndietro_VisualizzaCentriVaccinaliMouseClicked
        HomeCittadini hc = new HomeCittadini();
        hc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIndietro_VisualizzaCentriVaccinaliMouseClicked

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
            java.util.logging.Logger.getLogger(VisualizzaCentriVaccinali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizzaCentriVaccinali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizzaCentriVaccinali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizzaCentriVaccinali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizzaCentriVaccinali().setVisible(true);
            }
        });
    }
    
    
    //Retrieve e Display  Informazioni Centri Vaccinali
  
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIndietro_VisualizzaCentriVaccinali;
    private javax.swing.JLabel capLbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel caplb_VisualizzaCentriVaccinali;
    private javax.swing.JLabel centroVaccinaleLbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel comlbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel comuneLbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel indirizzoLbl_VisualizzacentriVaccinali;
    private javax.swing.JLabel indlbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel namelbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel provLbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel provlbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel tipelbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel tipologiaLbl_VisualizzaCentriVaccinali;
    // End of variables declaration//GEN-END:variables
}
