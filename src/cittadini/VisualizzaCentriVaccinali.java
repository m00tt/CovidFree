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
import javax.swing.ImageIcon;
import java.util.List;
import static javax.swing.JOptionPane.showMessageDialog;
import static utils.GeneralFunctions.CENTRIVACCINALIDIR;
import static utils.GeneralFunctions.getCentroVaccinaleInfo;


public class VisualizzaCentriVaccinali extends javax.swing.JFrame {

    /**
     *
     */
    public VisualizzaCentriVaccinali() {
        initComponents();
    }
    
    /**
     *
     * @param centroVaccinale
     */
    public VisualizzaCentriVaccinali(String centroVaccinale) {
        initComponents();
        visualizzaInfoCentroVaccinale(centroVaccinale);
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
        title_VisualizzaCentriVaccinali = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nEvents_VisualizzaCentriVaccinali = new javax.swing.JLabel();
        avgEvents_VisualizzaCentriVaccinali = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("icon.png").getImage());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informazioni Centro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        centroVaccinaleLbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        centroVaccinaleLbl_VisualizzaCentriVaccinali.setText("Nome Centro Vaccinale");

        indirizzoLbl_VisualizzacentriVaccinali.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        indirizzoLbl_VisualizzacentriVaccinali.setText("Indirizzo");

        comuneLbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        comuneLbl_VisualizzaCentriVaccinali.setText("Comune");

        provLbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        provLbl_VisualizzaCentriVaccinali.setText("Provincia");

        capLbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        capLbl_VisualizzaCentriVaccinali.setText("CAP");

        tipologiaLbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        tipologiaLbl_VisualizzaCentriVaccinali.setText("Tipologia");

        namelbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        namelbl_VisualizzaCentriVaccinali.setText("Centro vaccinale");

        tipelbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        tipelbl_VisualizzaCentriVaccinali.setText("Tipologia");

        indlbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        indlbl_VisualizzaCentriVaccinali.setText("Indirizzo");

        provlbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        provlbl_VisualizzaCentriVaccinali.setText("VA");

        comlbl_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        comlbl_VisualizzaCentriVaccinali.setText("Comune");

        caplb_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        caplb_VisualizzaCentriVaccinali.setText("21100");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(provLbl_VisualizzaCentriVaccinali)
                    .addComponent(centroVaccinaleLbl_VisualizzaCentriVaccinali)
                    .addComponent(namelbl_VisualizzaCentriVaccinali, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indirizzoLbl_VisualizzacentriVaccinali)
                    .addComponent(indlbl_VisualizzaCentriVaccinali, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provlbl_VisualizzaCentriVaccinali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caplb_VisualizzaCentriVaccinali)
                    .addComponent(comlbl_VisualizzaCentriVaccinali)
                    .addComponent(tipelbl_VisualizzaCentriVaccinali)
                    .addComponent(tipologiaLbl_VisualizzaCentriVaccinali)
                    .addComponent(capLbl_VisualizzaCentriVaccinali)
                    .addComponent(comuneLbl_VisualizzaCentriVaccinali))
                .addContainerGap(125, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indirizzoLbl_VisualizzacentriVaccinali)
                    .addComponent(comuneLbl_VisualizzaCentriVaccinali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indlbl_VisualizzaCentriVaccinali, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comlbl_VisualizzaCentriVaccinali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capLbl_VisualizzaCentriVaccinali)
                    .addComponent(provLbl_VisualizzaCentriVaccinali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caplb_VisualizzaCentriVaccinali)
                    .addComponent(provlbl_VisualizzaCentriVaccinali, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        btnIndietro_VisualizzaCentriVaccinali.setText("Indietro");
        btnIndietro_VisualizzaCentriVaccinali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIndietro_VisualizzaCentriVaccinaliMouseClicked(evt);
            }
        });

        title_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        title_VisualizzaCentriVaccinali.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_VisualizzaCentriVaccinali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new_centrovaccinale.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prospetto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Numero segnalazioni");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Severità media");

        nEvents_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        nEvents_VisualizzaCentriVaccinali.setText("0");

        avgEvents_VisualizzaCentriVaccinali.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        avgEvents_VisualizzaCentriVaccinali.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(nEvents_VisualizzaCentriVaccinali)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(avgEvents_VisualizzaCentriVaccinali)
                        .addGap(34, 34, 34)))
                .addGap(96, 96, 96))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nEvents_VisualizzaCentriVaccinali)
                    .addComponent(avgEvents_VisualizzaCentriVaccinali))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title_VisualizzaCentriVaccinali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnIndietro_VisualizzaCentriVaccinali, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_VisualizzaCentriVaccinali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnIndietro_VisualizzaCentriVaccinali)
                .addGap(13, 13, 13))
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
        hc.setLocationRelativeTo(null);
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
    
    
    
    
    private void getReportCentroVaccinale(String nomeCentroVaccinale){
        
        int avgEvents = 0;
        int countEvents = 0;
        
        String path = CENTRIVACCINALIDIR + File.separator + "Vaccinati_"+nomeCentroVaccinale+".dati";
        if(new File(path).exists()){
            try {
                String thisLine;
                BufferedReader br = new BufferedReader(new FileReader(path));
                while ((thisLine = br.readLine()) != null) {
                    String[] tmp = thisLine.split("-");
                    if(tmp.length == 4){
                        countEvents++;
                        avgEvents += Integer.parseInt(tmp[2]);
                    }

                }
                if(countEvents>0){
                    nEvents_VisualizzaCentriVaccinali.setText(""+countEvents);
                    avgEvents_VisualizzaCentriVaccinali.setText(""+(avgEvents/countEvents));
                }
            } catch(IOException e) {
                showMessageDialog(null, "Errore di lettura del database, riprova.");
            }
        }
        
        
    }
    
    
    private void visualizzaInfoCentroVaccinale(String centroVaccinale){
        List<String> infoCentro = getCentroVaccinaleInfo(centroVaccinale);
        namelbl_VisualizzaCentriVaccinali.setText(infoCentro.get(0));
        tipelbl_VisualizzaCentriVaccinali.setText(infoCentro.get(1));
        indlbl_VisualizzaCentriVaccinali.setText(infoCentro.get(2) + " " + infoCentro.get(3) + " " + infoCentro.get(4));
        provlbl_VisualizzaCentriVaccinali.setText(infoCentro.get(5));
        comlbl_VisualizzaCentriVaccinali.setText(infoCentro.get(6));
        caplb_VisualizzaCentriVaccinali.setText(infoCentro.get(7));
        title_VisualizzaCentriVaccinali.setText(infoCentro.get(0));
        
        getReportCentroVaccinale(infoCentro.get(0));
    }
  
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avgEvents_VisualizzaCentriVaccinali;
    private javax.swing.JButton btnIndietro_VisualizzaCentriVaccinali;
    private javax.swing.JLabel capLbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel caplb_VisualizzaCentriVaccinali;
    private javax.swing.JLabel centroVaccinaleLbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel comlbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel comuneLbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel indirizzoLbl_VisualizzacentriVaccinali;
    private javax.swing.JLabel indlbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nEvents_VisualizzaCentriVaccinali;
    private javax.swing.JLabel namelbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel provLbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel provlbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel tipelbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel tipologiaLbl_VisualizzaCentriVaccinali;
    private javax.swing.JLabel title_VisualizzaCentriVaccinali;
    // End of variables declaration//GEN-END:variables
}
