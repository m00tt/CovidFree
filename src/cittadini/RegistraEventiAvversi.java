/**
 * 
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */
package cittadini;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static utils.GeneralFunctions.LOGODIR;
import static javax.swing.JOptionPane.showMessageDialog;
import static utils.GeneralFunctions.CENTRIVACCINALIDIR;
import static utils.GeneralFunctions.DATASEPARATOR;
import static utils.GeneralFunctions.checkCompiled;
import static utils.GeneralFunctions.checkEvtDescription;

/**
 * La classe <b>RegistraEventiAvversi</b> viene utilizzata per la creazione e la memorizzazione di un nuovo evento avverso segnalato da un cittadino.
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 */
public class RegistraEventiAvversi extends javax.swing.JFrame {


    /**
     * Costruttore della classe <b>RegistraEventiAvversi</b><br>
     * Tale costruttore permette di inizializzare i componenti grafici che compongono la classe e impostare la visulizzazione dell'applicazione al centro dello schermo.
     */
    public RegistraEventiAvversi() {
        initComponents();
    }

    /**
     * Costruttore della classe <b>RegistraEventiAvversi</b><br>
     * Tale costruttore permette di inizializzare i componenti grafici che compongono la classe e impostare la visulizzazione dell'applicazione al centro dello schermo.
     * @param username Username dell'utente loggato
     * @param centroVaccinale Centro vaccinale in cui l'utente è registrato
     */
    public RegistraEventiAvversi(String username, String centroVaccinale){
        initComponents();
        lblWelcomeEventi_RegistraEventiAvversi.setText(username  + " - Registra Evento");
        nomeCentroLbl_RegistraEventiAvversi.setText(centroVaccinale);
        this.setLocationRelativeTo(null);
    }
    /**
     * Questo metodo viene chiamato dall'interno del costruttore per inizializzare il form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain_RegistraEventiAvversi = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnlEventi_RegistraEventiAvversi = new javax.swing.JPanel();
        centroVaccinaleLbl_RegistraEventiAvversi = new javax.swing.JLabel();
        btnConfirm_registraEventiAvversi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scrlPanel_RegistraEventiAversi = new javax.swing.JScrollPane();
        txtDesc_RegistraEventiAvversi = new javax.swing.JTextArea();
        txtName_RegistraEventoAversi = new javax.swing.JTextField();
        btnAnnulla_RegistraeventiAvversi = new javax.swing.JButton();
        severitySld_RegistraEventiAvversi = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        nomeCentroLbl_RegistraEventiAvversi = new javax.swing.JLabel();
        lblWelcomeEventi_RegistraEventiAvversi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registra Evento Avverso");
        setIconImage(new ImageIcon(LOGODIR).getImage());
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);

        pnlMain_RegistraEventiAvversi.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        pnlEventi_RegistraEventiAvversi.setBackground(new java.awt.Color(255, 255, 255));
        pnlEventi_RegistraEventiAvversi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registra Eventi Avversi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        centroVaccinaleLbl_RegistraEventiAvversi.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        centroVaccinaleLbl_RegistraEventiAvversi.setText("Centro Vaccinale registrato");

        btnConfirm_registraEventiAvversi.setText("Registra");
        btnConfirm_registraEventiAvversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm_registraEventiAvversiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("Evento Riscontrato");

        scrlPanel_RegistraEventiAversi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrizione", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        txtDesc_RegistraEventiAvversi.setColumns(20);
        txtDesc_RegistraEventiAvversi.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        txtDesc_RegistraEventiAvversi.setRows(5);
        txtDesc_RegistraEventiAvversi.setText("Inserisci una descizione per l'evento risontrontato (da 8 a 256 caratteri)...");
        txtDesc_RegistraEventiAvversi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDesc_RegistraEventiAvversiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDesc_RegistraEventiAvversiFocusLost(evt);
            }
        });
        scrlPanel_RegistraEventiAversi.setViewportView(txtDesc_RegistraEventiAvversi);

        txtName_RegistraEventoAversi.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        txtName_RegistraEventoAversi.setText("Inserisci Nome Evento (da 3 a 40 caratteri)...");
        txtName_RegistraEventoAversi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtName_RegistraEventoAversi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtName_RegistraEventoAversiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtName_RegistraEventoAversiFocusLost(evt);
            }
        });

        btnAnnulla_RegistraeventiAvversi.setText("Annulla");
        btnAnnulla_RegistraeventiAvversi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnnulla_RegistraeventiAvversiMouseClicked(evt);
            }
        });

        severitySld_RegistraEventiAvversi.setBackground(new java.awt.Color(255, 255, 255));
        severitySld_RegistraEventiAvversi.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        severitySld_RegistraEventiAvversi.setMajorTickSpacing(1);
        severitySld_RegistraEventiAvversi.setMaximum(5);
        severitySld_RegistraEventiAvversi.setMinimum(1);
        severitySld_RegistraEventiAvversi.setPaintLabels(true);
        severitySld_RegistraEventiAvversi.setPaintTicks(true);
        severitySld_RegistraEventiAvversi.setSnapToTicks(true);
        severitySld_RegistraEventiAvversi.setToolTipText("1\n2\n3\n4\n5");
        severitySld_RegistraEventiAvversi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Severità Evento");

        nomeCentroLbl_RegistraEventiAvversi.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N

        javax.swing.GroupLayout pnlEventi_RegistraEventiAvversiLayout = new javax.swing.GroupLayout(pnlEventi_RegistraEventiAvversi);
        pnlEventi_RegistraEventiAvversi.setLayout(pnlEventi_RegistraEventiAvversiLayout);
        pnlEventi_RegistraEventiAvversiLayout.setHorizontalGroup(
            pnlEventi_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEventi_RegistraEventiAvversiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEventi_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrlPanel_RegistraEventiAversi)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEventi_RegistraEventiAvversiLayout.createSequentialGroup()
                        .addGroup(pnlEventi_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtName_RegistraEventoAversi, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlEventi_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(severitySld_RegistraEventiAvversi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(pnlEventi_RegistraEventiAvversiLayout.createSequentialGroup()
                        .addComponent(btnAnnulla_RegistraeventiAvversi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirm_registraEventiAvversi))
                    .addGroup(pnlEventi_RegistraEventiAvversiLayout.createSequentialGroup()
                        .addGroup(pnlEventi_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(centroVaccinaleLbl_RegistraEventiAvversi)
                            .addComponent(nomeCentroLbl_RegistraEventiAvversi, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlEventi_RegistraEventiAvversiLayout.setVerticalGroup(
            pnlEventi_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEventi_RegistraEventiAvversiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(centroVaccinaleLbl_RegistraEventiAvversi)
                .addGap(4, 4, 4)
                .addGroup(pnlEventi_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEventi_RegistraEventiAvversiLayout.createSequentialGroup()
                        .addComponent(nomeCentroLbl_RegistraEventiAvversi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(txtName_RegistraEventoAversi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEventi_RegistraEventiAvversiLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(severitySld_RegistraEventiAvversi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(scrlPanel_RegistraEventiAversi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEventi_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm_registraEventiAvversi)
                    .addComponent(btnAnnulla_RegistraeventiAvversi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblWelcomeEventi_RegistraEventiAvversi.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblWelcomeEventi_RegistraEventiAvversi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/symptoms.png"))); // NOI18N

        javax.swing.GroupLayout pnlMain_RegistraEventiAvversiLayout = new javax.swing.GroupLayout(pnlMain_RegistraEventiAvversi);
        pnlMain_RegistraEventiAvversi.setLayout(pnlMain_RegistraEventiAvversiLayout);
        pnlMain_RegistraEventiAvversiLayout.setHorizontalGroup(
            pnlMain_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMain_RegistraEventiAvversiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcomeEventi_RegistraEventiAvversi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMain_RegistraEventiAvversiLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(pnlEventi_RegistraEventiAvversi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        pnlMain_RegistraEventiAvversiLayout.setVerticalGroup(
            pnlMain_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMain_RegistraEventiAvversiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMain_RegistraEventiAvversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWelcomeEventi_RegistraEventiAvversi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    /**
     * Modifica contenuto nella textbox txtDesc quando non selezionata
     * @param evt - Evento
     */
    private void txtDesc_RegistraEventiAvversiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDesc_RegistraEventiAvversiFocusLost
         if (txtDesc_RegistraEventiAvversi.getText().equals("")){
            txtDesc_RegistraEventiAvversi.setText("Inserisci una descizione per l'evento risontrontato (da 8 a 256 caratteri)...");
        }
    }//GEN-LAST:event_txtDesc_RegistraEventiAvversiFocusLost

    /**
     * Modifica contenuto nella textbox txtName quando selezionata
     * @param evt - Evento
     */
    private void txtName_RegistraEventoAversiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtName_RegistraEventoAversiFocusGained
        if (txtName_RegistraEventoAversi.getText().equals("Inserisci Nome Evento (da 3 a 40 caratteri)...")){
            txtName_RegistraEventoAversi.setText("");
        }
    }//GEN-LAST:event_txtName_RegistraEventoAversiFocusGained

    /**
     * Modifica contenuto nella textbox txtDesc quando selezionata
     * @param evt - Evento
     */
    private void txtDesc_RegistraEventiAvversiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDesc_RegistraEventiAvversiFocusGained
         if (txtDesc_RegistraEventiAvversi.getText().equals("Inserisci una descizione per l'evento risontrontato (da 8 a 256 caratteri)...")){
            txtDesc_RegistraEventiAvversi.setText("");
        }
    }//GEN-LAST:event_txtDesc_RegistraEventiAvversiFocusGained

    /**
     * Modifica contenuto nella textbox txtName quando non selezionata
     * @param evt - Evento
     */
    private void txtName_RegistraEventoAversiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtName_RegistraEventoAversiFocusLost
        if (txtName_RegistraEventoAversi.getText().equals("")){
            txtName_RegistraEventoAversi.setText("Inserisci Nome Evento (da 3 a 40 caratteri)...");
        }
    }//GEN-LAST:event_txtName_RegistraEventoAversiFocusLost

   /**
     * Richiama il costruttore della classe <b>HomeCittadini</b><br>
     * @see cittadini.HomeCittadini#HomeCittadini() 
     * @param evt - Evento
     */
    private void btnAnnulla_RegistraeventiAvversiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnnulla_RegistraeventiAvversiMouseClicked
        HomeCittadini hcl = new HomeCittadini();
        hcl.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnAnnulla_RegistraeventiAvversiMouseClicked

    /**
     * Richiama il metodo <b>inserisciEventiAvversi</b><br>
     * @see cittadini.RegistraEventiAvversi#inserisciEventiAvversi() 
     * @param evt - Evento
     */
    private void btnConfirm_registraEventiAvversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm_registraEventiAvversiActionPerformed
        try {
            inserisciEventiAvversi();
        } catch (IOException ex) {
             showMessageDialog(null, "Errore nella scrittura dei dati.\n\nDescrizione dettagliata: "+ex.toString(), "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
        }
    }//GEN-LAST:event_btnConfirm_registraEventiAvversiActionPerformed
  
    /**
     * Il metodo <b>main</b> viene richiamato al fine di richiamare il costruttore della classe HomeCentriVaccinali al fine di rendere visibile la classe.
     * @param args argomenti iniettabili da linea di comando
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
        java.awt.EventQueue.invokeLater(() -> {
            new RegistraEventiAvversi().setVisible(true);
        });
       
    }
     
    /**
     * Il metodo <b>inserisciEventiAvversi</b> utilizzato al fine di permettere la registrazione di un nuovo evento avverso segnalato da un cittadino.<br>
     * Viene verificato che ogni inserimento sia corretto da parte dei pattern:<br>
     * @see utils.GeneralFunctions#checkCompiled
     * @see utils.GeneralFunctions#checkEvtDescription
     * @throws IOException
     */
    private void inserisciEventiAvversi() throws IOException{
        String nomeCentroVaccinale = nomeCentroLbl_RegistraEventiAvversi.getText();
        String nomeEvento = txtName_RegistraEventoAversi.getText();
        int severitaEvento = severitySld_RegistraEventiAvversi.getValue();
        String descrizioneEvento = txtDesc_RegistraEventiAvversi.getText();
        
        if(checkCompiled(nomeEvento) && checkEvtDescription(descrizioneEvento)){
            String insert = nomeCentroVaccinale + DATASEPARATOR + nomeEvento + DATASEPARATOR + severitaEvento + DATASEPARATOR + descrizioneEvento;
            File pathFile = new File(CENTRIVACCINALIDIR + File.separator + "Vaccinati_"+nomeCentroVaccinale+".dati");
            if(pathFile.exists()){
                pathFile.createNewFile();
            }
            try (FileWriter fw2 = new FileWriter(pathFile, true)) { 
                fw2.append(insert+"\n");
                showMessageDialog(null, "Evento avverso registrato con successo!", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
            }catch(HeadlessException | IOException e){
                showMessageDialog(null, "Errore in fase di scrittura dei dati, riprova.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
            }

            HomeCittadini homeCittadini = new HomeCittadini();
            homeCittadini.setVisible(true);
            this.setVisible(false);
        }
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnulla_RegistraeventiAvversi;
    private javax.swing.JButton btnConfirm_registraEventiAvversi;
    private javax.swing.JLabel centroVaccinaleLbl_RegistraEventiAvversi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblWelcomeEventi_RegistraEventiAvversi;
    private javax.swing.JLabel nomeCentroLbl_RegistraEventiAvversi;
    private javax.swing.JPanel pnlEventi_RegistraEventiAvversi;
    private javax.swing.JPanel pnlMain_RegistraEventiAvversi;
    private javax.swing.JScrollPane scrlPanel_RegistraEventiAversi;
    private javax.swing.JSlider severitySld_RegistraEventiAvversi;
    private javax.swing.JTextArea txtDesc_RegistraEventiAvversi;
    private javax.swing.JTextField txtName_RegistraEventoAversi;
    // End of variables declaration//GEN-END:variables
}
