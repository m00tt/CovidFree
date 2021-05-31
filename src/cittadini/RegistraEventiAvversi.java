/**
 * 
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */
package cittadini;


public class RegistraEventiAvversi extends javax.swing.JFrame {

    /**
     * Creates new form RegistraEventiAvversi
     */
    public RegistraEventiAvversi() {
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

        pnlMain_RegistraEventiAvversi = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnlEventi_RegistraEventiAvversi = new javax.swing.JPanel();
        centroVaccinale_RegistraEventiAvversi = new javax.swing.JComboBox<>();
        centroVaccinaleLbl_RegistraEventiAvversi = new javax.swing.JLabel();
        btnConfirm_registraEventiAvversi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scrlPanel_RegistraEventiAversi = new javax.swing.JScrollPane();
        txtDesc_RegistraEventiAvversi = new javax.swing.JTextArea();
        txtName_RegistraEventoAversi = new javax.swing.JTextField();
        btnAnnulla_RegistraeventiAvversi = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));

        pnlMain_RegistraEventiAvversi.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        pnlEventi_RegistraEventiAvversi.setBackground(new java.awt.Color(255, 255, 255));
        pnlEventi_RegistraEventiAvversi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registra Eventi Avversi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        centroVaccinale_RegistraEventiAvversi.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N

        centroVaccinaleLbl_RegistraEventiAvversi.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        centroVaccinaleLbl_RegistraEventiAvversi.setText("Nome Centro Vaccinale");

        btnConfirm_registraEventiAvversi.setText("Registra");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("Evento Riscontrato");

        scrlPanel_RegistraEventiAversi.setBackground(new java.awt.Color(255, 255, 255));
        scrlPanel_RegistraEventiAversi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrizione", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        txtDesc_RegistraEventiAvversi.setColumns(20);
        txtDesc_RegistraEventiAvversi.setRows(5);
        txtDesc_RegistraEventiAvversi.setText("Inserisci una descizione per l'evento risontrontato (max. 256 caratteri)");
        scrlPanel_RegistraEventiAversi.setViewportView(txtDesc_RegistraEventiAvversi);

        txtName_RegistraEventoAversi.setText("Inserisci Nome Evento");

        btnAnnulla_RegistraeventiAvversi.setText("Annulla");
        btnAnnulla_RegistraeventiAvversi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnnulla_RegistraeventiAvversiMouseClicked(evt);
            }
        });

        jSlider1.setBackground(new java.awt.Color(255, 255, 255));
        jSlider1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(5);
        jSlider1.setMinimum(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setToolTipText("1\n2\n3\n4\n5");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Severità Evento");

        javax.swing.GroupLayout pnlEventi_RegistraEventiAvversiLayout = new javax.swing.GroupLayout(pnlEventi_RegistraEventiAvversi);
        pnlEventi_RegistraEventiAvversi.setLayout(pnlEventi_RegistraEventiAvversiLayout);
        pnlEventi_RegistraEventiAvversiLayout.setHorizontalGroup(
            pnlEventi_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEventi_RegistraEventiAvversiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEventi_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEventi_RegistraEventiAvversiLayout.createSequentialGroup()
                        .addComponent(btnAnnulla_RegistraeventiAvversi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirm_registraEventiAvversi))
                    .addGroup(pnlEventi_RegistraEventiAvversiLayout.createSequentialGroup()
                        .addGroup(pnlEventi_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrlPanel_RegistraEventiAversi, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlEventi_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(centroVaccinale_RegistraEventiAvversi, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(centroVaccinaleLbl_RegistraEventiAvversi)
                                .addGroup(pnlEventi_RegistraEventiAvversiLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2)))
                            .addGroup(pnlEventi_RegistraEventiAvversiLayout.createSequentialGroup()
                                .addComponent(txtName_RegistraEventoAversi, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlEventi_RegistraEventiAvversiLayout.setVerticalGroup(
            pnlEventi_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEventi_RegistraEventiAvversiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(centroVaccinaleLbl_RegistraEventiAvversi)
                .addGap(4, 4, 4)
                .addComponent(centroVaccinale_RegistraEventiAvversi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(pnlEventi_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(pnlEventi_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName_RegistraEventoAversi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrlPanel_RegistraEventiAversi, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEventi_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm_registraEventiAvversi)
                    .addComponent(btnAnnulla_RegistraeventiAvversi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/symptoms.png"))); // NOI18N
        jLabel3.setText("Eventi Avversi");

        javax.swing.GroupLayout pnlMain_RegistraEventiAvversiLayout = new javax.swing.GroupLayout(pnlMain_RegistraEventiAvversi);
        pnlMain_RegistraEventiAvversi.setLayout(pnlMain_RegistraEventiAvversiLayout);
        pnlMain_RegistraEventiAvversiLayout.setHorizontalGroup(
            pnlMain_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMain_RegistraEventiAvversiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMain_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMain_RegistraEventiAvversiLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlEventi_RegistraEventiAvversi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlMain_RegistraEventiAvversiLayout.setVerticalGroup(
            pnlMain_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMain_RegistraEventiAvversiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMain_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEventi_RegistraEventiAvversi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMain_RegistraEventiAvversi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMain_RegistraEventiAvversi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnulla_RegistraeventiAvversiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnnulla_RegistraeventiAvversiMouseClicked
        HomeCittadiniLogged hcl = new HomeCittadiniLogged();
        hcl.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnAnnulla_RegistraeventiAvversiMouseClicked

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
            java.util.logging.Logger.getLogger(RegistraEventiAvversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistraEventiAvversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistraEventiAvversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistraEventiAvversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraEventiAvversi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnulla_RegistraeventiAvversi;
    private javax.swing.JButton btnConfirm_registraEventiAvversi;
    private javax.swing.JLabel centroVaccinaleLbl_RegistraEventiAvversi;
    private javax.swing.JComboBox<String> centroVaccinale_RegistraEventiAvversi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JPanel pnlEventi_RegistraEventiAvversi;
    private javax.swing.JPanel pnlMain_RegistraEventiAvversi;
    private javax.swing.JScrollPane scrlPanel_RegistraEventiAversi;
    private javax.swing.JTextArea txtDesc_RegistraEventiAvversi;
    private javax.swing.JTextField txtName_RegistraEventoAversi;
    // End of variables declaration//GEN-END:variables
}
