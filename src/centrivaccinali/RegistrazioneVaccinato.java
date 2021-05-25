/**
 * 
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */

package centrivaccinali;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.List;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;
import static utils.GeneralFunctions.CENTRIVACCINALIDIR;
import static utils.GeneralFunctions.checkCodiceFiscale;
import static utils.GeneralFunctions.checkCompiled;
import static utils.GeneralFunctions.checkData;
import static utils.GeneralFunctions.checkDirHierarchy;
import static utils.GeneralFunctions.checkIdVaccino;
import static utils.GeneralFunctions.getCentriVaccinaliList;
import static utils.GeneralFunctions.getUniqueList;

public class RegistrazioneVaccinato extends javax.swing.JFrame {

    
    public RegistrazioneVaccinato() {
        initComponents();
        //Aggiunge i centri vaccinali registrati alla combobox
        fillCentriVaccinali();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_RegistrazioneVaccinato = new javax.swing.JPanel();
        titleLbl_RegistrazioneVaccinato = new javax.swing.JLabel();
        datiPnl_RegistrazioneVaccinato = new javax.swing.JPanel();
        cognome_RegistrazioneVaccinato = new javax.swing.JTextField();
        codiceFiscale_RegistrazioneVaccinato = new javax.swing.JTextField();
        centroVaccinaleLbl_RegistrazioneVaccinato = new javax.swing.JLabel();
        nomeLbl_RegistrazioneVaccinato = new javax.swing.JLabel();
        cognomeLbl_RegistrazioneVaccinato = new javax.swing.JLabel();
        codiceFiscaleLbl_RegistrazioneVaccinato = new javax.swing.JLabel();
        centroVaccinale_RegistrazioneVaccinato = new javax.swing.JComboBox<>();
        nome_RegistrazioneVaccinato = new javax.swing.JTextField();
        vaccino_RegistrazioneVaccinato = new javax.swing.JComboBox<>();
        dataVaccino_RegistrazioneVaccinato = new javax.swing.JFormattedTextField();
        idVaccino_RegistrazioneVaccinato = new javax.swing.JTextField();
        vaccinoLbl_RegistrazioneVaccinato = new javax.swing.JLabel();
        dataVaccinoLbl_RegistrazioneVaccinato = new javax.swing.JLabel();
        idVaccinoLbl_RegistrazioneVaccinato = new javax.swing.JLabel();
        add_RegistrazioneVaccinato = new javax.swing.JButton();
        ann_RegistrazioneVaccinato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrazione Vaccinato");
        setIconImage(new ImageIcon("icon.png").getImage());
        setName("frame_RegistrazioneVaccinato"); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);

        Panel_RegistrazioneVaccinato.setBackground(new java.awt.Color(255, 255, 255));

        titleLbl_RegistrazioneVaccinato.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titleLbl_RegistrazioneVaccinato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl_RegistrazioneVaccinato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new_vaccinato.png"))); // NOI18N
        titleLbl_RegistrazioneVaccinato.setText("Registra Nuovo Vaccinato");

        datiPnl_RegistrazioneVaccinato.setBackground(new java.awt.Color(255, 255, 255));
        datiPnl_RegistrazioneVaccinato.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Inserisci i dati ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        datiPnl_RegistrazioneVaccinato.setToolTipText("");

        cognome_RegistrazioneVaccinato.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        cognome_RegistrazioneVaccinato.setText("Da 3 a 40 caratteri...");
        cognome_RegistrazioneVaccinato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cognome_RegistrazioneVaccinatoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cognome_RegistrazioneVaccinatoFocusLost(evt);
            }
        });

        codiceFiscale_RegistrazioneVaccinato.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        codiceFiscale_RegistrazioneVaccinato.setPreferredSize(new java.awt.Dimension(32, 30));

        centroVaccinaleLbl_RegistrazioneVaccinato.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        centroVaccinaleLbl_RegistrazioneVaccinato.setText("Nome Centro Vaccinale");

        nomeLbl_RegistrazioneVaccinato.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        nomeLbl_RegistrazioneVaccinato.setText("Nome");

        cognomeLbl_RegistrazioneVaccinato.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        cognomeLbl_RegistrazioneVaccinato.setText("Cognome");

        codiceFiscaleLbl_RegistrazioneVaccinato.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        codiceFiscaleLbl_RegistrazioneVaccinato.setText("Codice fiscale");

        centroVaccinale_RegistrazioneVaccinato.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N

        nome_RegistrazioneVaccinato.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        nome_RegistrazioneVaccinato.setText("Da 3 a 40 caratteri...");
        nome_RegistrazioneVaccinato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nome_RegistrazioneVaccinatoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nome_RegistrazioneVaccinatoFocusLost(evt);
            }
        });

        vaccino_RegistrazioneVaccinato.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        vaccino_RegistrazioneVaccinato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pfizer", "AstraZeneca", "Moderna", "J&J" }));
        vaccino_RegistrazioneVaccinato.setPreferredSize(new java.awt.Dimension(82, 30));

        dataVaccino_RegistrazioneVaccinato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        dataVaccino_RegistrazioneVaccinato.setText("gg/mm/aaaa");
        dataVaccino_RegistrazioneVaccinato.setToolTipText("");
        dataVaccino_RegistrazioneVaccinato.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        dataVaccino_RegistrazioneVaccinato.setPreferredSize(new java.awt.Dimension(82, 30));

        idVaccino_RegistrazioneVaccinato.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        idVaccino_RegistrazioneVaccinato.setText("16 cifre");
        idVaccino_RegistrazioneVaccinato.setToolTipText("");
        idVaccino_RegistrazioneVaccinato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idVaccino_RegistrazioneVaccinatoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idVaccino_RegistrazioneVaccinatoFocusLost(evt);
            }
        });

        vaccinoLbl_RegistrazioneVaccinato.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        vaccinoLbl_RegistrazioneVaccinato.setText("Vaccino");

        dataVaccinoLbl_RegistrazioneVaccinato.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        dataVaccinoLbl_RegistrazioneVaccinato.setText("Data vaccino");

        idVaccinoLbl_RegistrazioneVaccinato.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        idVaccinoLbl_RegistrazioneVaccinato.setText("ID vaccino");
        idVaccinoLbl_RegistrazioneVaccinato.setToolTipText("");

        javax.swing.GroupLayout datiPnl_RegistrazioneVaccinatoLayout = new javax.swing.GroupLayout(datiPnl_RegistrazioneVaccinato);
        datiPnl_RegistrazioneVaccinato.setLayout(datiPnl_RegistrazioneVaccinatoLayout);
        datiPnl_RegistrazioneVaccinatoLayout.setHorizontalGroup(
            datiPnl_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datiPnl_RegistrazioneVaccinatoLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(datiPnl_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codiceFiscaleLbl_RegistrazioneVaccinato)
                    .addComponent(nome_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codiceFiscale_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(datiPnl_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(centroVaccinale_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(datiPnl_RegistrazioneVaccinatoLayout.createSequentialGroup()
                            .addComponent(nomeLbl_RegistrazioneVaccinato)
                            .addGap(203, 203, 203)
                            .addGroup(datiPnl_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cognomeLbl_RegistrazioneVaccinato)
                                .addComponent(cognome_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(centroVaccinaleLbl_RegistrazioneVaccinato)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datiPnl_RegistrazioneVaccinatoLayout.createSequentialGroup()
                        .addGroup(datiPnl_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vaccino_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vaccinoLbl_RegistrazioneVaccinato))
                        .addGap(55, 55, 55)
                        .addGroup(datiPnl_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataVaccinoLbl_RegistrazioneVaccinato)
                            .addComponent(dataVaccino_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(datiPnl_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idVaccinoLbl_RegistrazioneVaccinato)
                            .addComponent(idVaccino_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        datiPnl_RegistrazioneVaccinatoLayout.setVerticalGroup(
            datiPnl_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datiPnl_RegistrazioneVaccinatoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(centroVaccinaleLbl_RegistrazioneVaccinato)
                .addGap(4, 4, 4)
                .addComponent(centroVaccinale_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datiPnl_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datiPnl_RegistrazioneVaccinatoLayout.createSequentialGroup()
                        .addGroup(datiPnl_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeLbl_RegistrazioneVaccinato)
                            .addComponent(cognomeLbl_RegistrazioneVaccinato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(cognome_RegistrazioneVaccinato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codiceFiscaleLbl_RegistrazioneVaccinato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codiceFiscale_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datiPnl_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataVaccinoLbl_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(datiPnl_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vaccinoLbl_RegistrazioneVaccinato)
                        .addComponent(idVaccinoLbl_RegistrazioneVaccinato)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datiPnl_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccino_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataVaccino_RegistrazioneVaccinato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idVaccino_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        codiceFiscaleLbl_RegistrazioneVaccinato.getAccessibleContext().setAccessibleName("");

        add_RegistrazioneVaccinato.setText("Aggiungi");
        add_RegistrazioneVaccinato.setMaximumSize(new java.awt.Dimension(83, 30));
        add_RegistrazioneVaccinato.setMinimumSize(new java.awt.Dimension(83, 30));
        add_RegistrazioneVaccinato.setPreferredSize(new java.awt.Dimension(83, 30));
        add_RegistrazioneVaccinato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_RegistrazioneVaccinatoActionPerformed(evt);
            }
        });

        ann_RegistrazioneVaccinato.setText("Annulla");
        ann_RegistrazioneVaccinato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ann_RegistrazioneVaccinatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_RegistrazioneVaccinatoLayout = new javax.swing.GroupLayout(Panel_RegistrazioneVaccinato);
        Panel_RegistrazioneVaccinato.setLayout(Panel_RegistrazioneVaccinatoLayout);
        Panel_RegistrazioneVaccinatoLayout.setHorizontalGroup(
            Panel_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RegistrazioneVaccinatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datiPnl_RegistrazioneVaccinato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLbl_RegistrazioneVaccinato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_RegistrazioneVaccinatoLayout.createSequentialGroup()
                        .addComponent(ann_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Panel_RegistrazioneVaccinatoLayout.setVerticalGroup(
            Panel_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RegistrazioneVaccinatoLayout.createSequentialGroup()
                .addComponent(titleLbl_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(datiPnl_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_RegistrazioneVaccinatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ann_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_RegistrazioneVaccinato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_RegistrazioneVaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ann_RegistrazioneVaccinatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ann_RegistrazioneVaccinatoActionPerformed
        //Annulla l'operazione e ritorna in home
        HomeCentriVaccinali homeCentriVaccinali = new HomeCentriVaccinali();
        homeCentriVaccinali.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ann_RegistrazioneVaccinatoActionPerformed

    private void add_RegistrazioneVaccinatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_RegistrazioneVaccinatoActionPerformed
        registraVaccinato();
    }//GEN-LAST:event_add_RegistrazioneVaccinatoActionPerformed

    private void nome_RegistrazioneVaccinatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome_RegistrazioneVaccinatoFocusGained
        //hint per l'inserimento corretto dei dati
        if(nome_RegistrazioneVaccinato.getText().equals("Da 3 a 40 caratteri...")){
            nome_RegistrazioneVaccinato.setText("");
        }
    }//GEN-LAST:event_nome_RegistrazioneVaccinatoFocusGained

    private void nome_RegistrazioneVaccinatoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome_RegistrazioneVaccinatoFocusLost
        //hint per l'inserimento corretto dei dati
        if(nome_RegistrazioneVaccinato.getText().equals("")){
            nome_RegistrazioneVaccinato.setText("Da 3 a 40 caratteri...");
        }
    }//GEN-LAST:event_nome_RegistrazioneVaccinatoFocusLost

    private void cognome_RegistrazioneVaccinatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cognome_RegistrazioneVaccinatoFocusGained
        //hint per l'inserimento corretto dei dati
        if(cognome_RegistrazioneVaccinato.getText().equals("Da 3 a 40 caratteri...")){
            cognome_RegistrazioneVaccinato.setText("");
        }
    }//GEN-LAST:event_cognome_RegistrazioneVaccinatoFocusGained

    private void cognome_RegistrazioneVaccinatoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cognome_RegistrazioneVaccinatoFocusLost
        //hint per l'inserimento corretto dei dati
        if(cognome_RegistrazioneVaccinato.getText().equals("")){
            cognome_RegistrazioneVaccinato.setText("Da 3 a 40 caratteri...");
        }
    }//GEN-LAST:event_cognome_RegistrazioneVaccinatoFocusLost

    private void idVaccino_RegistrazioneVaccinatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idVaccino_RegistrazioneVaccinatoFocusGained
        //hint per l'inserimento corretto dei dati
        if(idVaccino_RegistrazioneVaccinato.getText().equals("16 cifre")){
            idVaccino_RegistrazioneVaccinato.setText("");
        }
    }//GEN-LAST:event_idVaccino_RegistrazioneVaccinatoFocusGained

    private void idVaccino_RegistrazioneVaccinatoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idVaccino_RegistrazioneVaccinatoFocusLost
        //hint per l'inserimento corretto dei dati
        if(idVaccino_RegistrazioneVaccinato.getText().equals("")){
            idVaccino_RegistrazioneVaccinato.setText("16 cifre");
        }
    }//GEN-LAST:event_idVaccino_RegistrazioneVaccinatoFocusLost


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
            java.util.logging.Logger.getLogger(RegistrazioneVaccinato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrazioneVaccinato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrazioneVaccinato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrazioneVaccinato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrazioneVaccinato().setVisible(true);
            }
        });
    }
    
    //Registra un nuovo vaccinato
    private void registraVaccinato(){
        try {
            String nomeCentroVaccinale;
            if(centroVaccinale_RegistrazioneVaccinato.getSelectedItem() == null)
                nomeCentroVaccinale = "";
            else
                nomeCentroVaccinale = centroVaccinale_RegistrazioneVaccinato.getSelectedItem().toString();
            String nomeVaccinato = nome_RegistrazioneVaccinato.getText().strip();
            String cognomeVaccinato = cognome_RegistrazioneVaccinato.getText().strip();
            String codiceFiscaleVaccinato = codiceFiscale_RegistrazioneVaccinato.getText().strip();
            String nomeVaccino = vaccino_RegistrazioneVaccinato.getSelectedItem().toString();
            String dataVaccino = dataVaccino_RegistrazioneVaccinato.getText().strip();
            String idVaccino = idVaccino_RegistrazioneVaccinato.getText().strip();
            
            if(nomeCentroVaccinale != "" && checkCompiled(nomeVaccinato) && checkCompiled(cognomeVaccinato) && checkCodiceFiscale(codiceFiscaleVaccinato) && checkData(dataVaccino) && checkIdVaccino(idVaccino)){
                String insert = nomeCentroVaccinale + "-" + codiceFiscaleVaccinato + "-" + idVaccino + "-" + nomeVaccinato + "-" + cognomeVaccinato + "-" + nomeVaccino + "-" + dataVaccino;
                String path = CENTRIVACCINALIDIR + File.separator + "Vaccinati_"+nomeCentroVaccinale+".dati";
                if(!checkDirHierarchy()){
                    showMessageDialog(null, "I database risultano corrotti.\nI dati sono stati ripristinati.");
                }
                File f = new File(path);
                if(!f.exists()){
                    f.createNewFile();
                }
                try{
                    boolean ok = true;            
                    List<String> toCheckUnique = getUniqueList();
                    for (int i=0; i<toCheckUnique.size(); i++){
                        if(/*toCheckUnique.get(i).equalsIgnoreCase(codiceFiscaleVaccinato) || */toCheckUnique.get(i).equalsIgnoreCase(idVaccino)){
                            ok = false;
                            break;
                        }                        
                    }
                    
                    if(ok)
                    {
                        try (FileWriter fw2 = new FileWriter(path, true)) { 
                            fw2.append(insert+"\n");
                            showMessageDialog(null, "Vaccinato registrato con successo!");
                        }catch(HeadlessException | IOException e){
                            showMessageDialog(null, "Errore in fase di scrittura dei dati, riprova.");
                        }
                        
                        HomeCentriVaccinali homeCentriVaccinali = new HomeCentriVaccinali();
                        homeCentriVaccinali.setVisible(true);
                        this.setVisible(false);
                    }
                    else{
                        showMessageDialog(null, "Codice fiscale o ID Vaccino già presenti nel database.");
                    }
                    
                }catch(Exception e){
                    showMessageDialog(null, "Errore in fase di scrittura dei dati, riprova.");
                }
                
            }
            else{
                showMessageDialog(null, "I dati inseriti non sono corretti, prova a ricontrollare.");
            }
        } catch (ParseException ex) {
            showMessageDialog(null, "I dati inseriti non sono corretti, prova a ricontrollare.");
        } catch (IOException ex) {
            showMessageDialog(null, "Errore in fase di scrittura dei dati, riprova.");
        }
    }
    
    //Recupera la lista di centri vaccinali registrati
    private void fillCentriVaccinali(){
        List<String> centriVaccinali = getCentriVaccinaliList();
                
        for(int i=0; i<centriVaccinali.size(); i++){
            centroVaccinale_RegistrazioneVaccinato.addItem(centriVaccinali.get(i));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_RegistrazioneVaccinato;
    private javax.swing.JButton add_RegistrazioneVaccinato;
    private javax.swing.JButton ann_RegistrazioneVaccinato;
    private javax.swing.JLabel centroVaccinaleLbl_RegistrazioneVaccinato;
    private javax.swing.JComboBox<String> centroVaccinale_RegistrazioneVaccinato;
    private javax.swing.JLabel codiceFiscaleLbl_RegistrazioneVaccinato;
    private javax.swing.JTextField codiceFiscale_RegistrazioneVaccinato;
    private javax.swing.JLabel cognomeLbl_RegistrazioneVaccinato;
    private javax.swing.JTextField cognome_RegistrazioneVaccinato;
    private javax.swing.JLabel dataVaccinoLbl_RegistrazioneVaccinato;
    private javax.swing.JFormattedTextField dataVaccino_RegistrazioneVaccinato;
    private javax.swing.JPanel datiPnl_RegistrazioneVaccinato;
    private javax.swing.JLabel idVaccinoLbl_RegistrazioneVaccinato;
    private javax.swing.JTextField idVaccino_RegistrazioneVaccinato;
    private javax.swing.JLabel nomeLbl_RegistrazioneVaccinato;
    private javax.swing.JTextField nome_RegistrazioneVaccinato;
    private javax.swing.JLabel titleLbl_RegistrazioneVaccinato;
    private javax.swing.JLabel vaccinoLbl_RegistrazioneVaccinato;
    private javax.swing.JComboBox<String> vaccino_RegistrazioneVaccinato;
    // End of variables declaration//GEN-END:variables
}
