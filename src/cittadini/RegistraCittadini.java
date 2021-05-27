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
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import static utils.GeneralFunctions.CITTADINIDIR;

import static utils.GeneralFunctions.checkCompiled;
import static utils.GeneralFunctions.checkDirHierarchy;
import static utils.GeneralFunctions.checkIdVaccino;
import static utils.GeneralFunctions.checkMail;
import static utils.GeneralFunctions.checkPassword;
import static utils.GeneralFunctions.getSHA;
import static utils.GeneralFunctions.getCentriVaccinaliList;
import static utils.GeneralFunctions.getUniqueList;
import static utils.GeneralFunctions.toHexString;


/**
 *
 * 
 */
public class RegistraCittadini extends javax.swing.JFrame {
    

    public RegistraCittadini() {
        initComponents();
        fillCentriVaccinali();
    }
    
    HomeCittadini homeCittadini = new HomeCittadini();
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_RegistrazioneCittadino = new javax.swing.JPanel();
        titleLbl_RegistrazioneCittadino = new javax.swing.JLabel();
        datiPnl_RegistrazioneCittadino = new javax.swing.JPanel();
        cognome_RegistrazioneCittadino = new javax.swing.JTextField();
        codiceFiscale_RegistrazioneCittadino = new javax.swing.JTextField();
        nomeLbl_RegistrazioneCittadino = new javax.swing.JLabel();
        cognomeLbl_RegistrazioneCittadino = new javax.swing.JLabel();
        codiceFiscaleLbl_RegistrazioneCittadino = new javax.swing.JLabel();
        nome_RegistrazioneCittadino = new javax.swing.JTextField();
        idVaccino_RegistrazioneCittadino = new javax.swing.JTextField();
        usrnameLbl_RegistrazioneCittadino = new javax.swing.JLabel();
        pwdLbl_RegistrazioneCittadino = new javax.swing.JLabel();
        idCittadinoLbl_RegistrazioneCittadino = new javax.swing.JLabel();
        pwdUsr_RegistrazioneCittadino = new javax.swing.JPasswordField();
        userId_RegistrazioneCittadino = new javax.swing.JTextField();
        email_RegistrazioneCittadino = new javax.swing.JTextField();
        emailLbl_RegistrazioneCittadino = new javax.swing.JLabel();
        centroVaccinaleLbl_RegistrazioneCittadino = new javax.swing.JLabel();
        centroVaccinale_RegistrazioneCittadino = new javax.swing.JComboBox<>();
        add_RegistrazioneCittadino = new javax.swing.JButton();
        ann_RegistrazioneCittadino = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_RegistrazioneCittadino.setBackground(new java.awt.Color(255, 255, 255));

        titleLbl_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titleLbl_RegistrazioneCittadino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl_RegistrazioneCittadino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new_vaccinato.png"))); // NOI18N
        titleLbl_RegistrazioneCittadino.setText("Registra Nuovo Cittadino");

        datiPnl_RegistrazioneCittadino.setBackground(new java.awt.Color(255, 255, 255));
        datiPnl_RegistrazioneCittadino.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Inserisci i dati ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        datiPnl_RegistrazioneCittadino.setToolTipText("");

        cognome_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        cognome_RegistrazioneCittadino.setText("Da 3 a 40 caratteri...");
        cognome_RegistrazioneCittadino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cognome_RegistrazioneCittadinoFocusLost(evt);
            }
        });

        codiceFiscale_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        codiceFiscale_RegistrazioneCittadino.setPreferredSize(new java.awt.Dimension(32, 30));
        codiceFiscale_RegistrazioneCittadino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codiceFiscale_RegistrazioneCittadinoActionPerformed(evt);
            }
        });

        nomeLbl_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        nomeLbl_RegistrazioneCittadino.setText("Nome");

        cognomeLbl_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        cognomeLbl_RegistrazioneCittadino.setText("Cognome");

        codiceFiscaleLbl_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        codiceFiscaleLbl_RegistrazioneCittadino.setText("Codice fiscale");

        nome_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        nome_RegistrazioneCittadino.setText("Da 3 a 40 caratteri...");
        nome_RegistrazioneCittadino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nome_RegistrazioneCittadinoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nome_RegistrazioneCittadinoFocusLost(evt);
            }
        });

        idVaccino_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        idVaccino_RegistrazioneCittadino.setText("ID vaccino");

        usrnameLbl_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        usrnameLbl_RegistrazioneCittadino.setText("User ID");

        pwdLbl_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        pwdLbl_RegistrazioneCittadino.setText("Password");

        idCittadinoLbl_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        idCittadinoLbl_RegistrazioneCittadino.setText("ID vaccino");
        idCittadinoLbl_RegistrazioneCittadino.setToolTipText("");

        pwdUsr_RegistrazioneCittadino.setText("jPasswordField1");

        email_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        email_RegistrazioneCittadino.setText("Da 3 a 40 caratteri...");
        email_RegistrazioneCittadino.setPreferredSize(new java.awt.Dimension(32, 30));
        email_RegistrazioneCittadino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                email_RegistrazioneCittadinoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_RegistrazioneCittadinoFocusLost(evt);
            }
        });

        emailLbl_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        emailLbl_RegistrazioneCittadino.setText("Indirizzo E-Mail");

        centroVaccinaleLbl_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        centroVaccinaleLbl_RegistrazioneCittadino.setText("Nome Centro Vaccinale");

        centroVaccinale_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N

        javax.swing.GroupLayout datiPnl_RegistrazioneCittadinoLayout = new javax.swing.GroupLayout(datiPnl_RegistrazioneCittadino);
        datiPnl_RegistrazioneCittadino.setLayout(datiPnl_RegistrazioneCittadinoLayout);
        datiPnl_RegistrazioneCittadinoLayout.setHorizontalGroup(
            datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datiPnl_RegistrazioneCittadinoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLbl_RegistrazioneCittadino)
                    .addComponent(email_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(codiceFiscaleLbl_RegistrazioneCittadino)
                        .addComponent(nome_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(codiceFiscale_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(datiPnl_RegistrazioneCittadinoLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(nomeLbl_RegistrazioneCittadino)
                            .addGap(203, 203, 203)
                            .addGroup(datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cognomeLbl_RegistrazioneCittadino)
                                .addComponent(cognome_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datiPnl_RegistrazioneCittadinoLayout.createSequentialGroup()
                            .addGroup(datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(usrnameLbl_RegistrazioneCittadino)
                                .addComponent(userId_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addGroup(datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pwdLbl_RegistrazioneCittadino)
                                .addComponent(pwdUsr_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idCittadinoLbl_RegistrazioneCittadino)
                                .addComponent(idVaccino_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(datiPnl_RegistrazioneCittadinoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(centroVaccinale_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(centroVaccinaleLbl_RegistrazioneCittadino))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        datiPnl_RegistrazioneCittadinoLayout.setVerticalGroup(
            datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datiPnl_RegistrazioneCittadinoLayout.createSequentialGroup()
                .addComponent(centroVaccinaleLbl_RegistrazioneCittadino)
                .addGap(4, 4, 4)
                .addComponent(centroVaccinale_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datiPnl_RegistrazioneCittadinoLayout.createSequentialGroup()
                        .addGroup(datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeLbl_RegistrazioneCittadino)
                            .addComponent(cognomeLbl_RegistrazioneCittadino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(cognome_RegistrazioneCittadino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLbl_RegistrazioneCittadino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(codiceFiscaleLbl_RegistrazioneCittadino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codiceFiscale_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwdLbl_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usrnameLbl_RegistrazioneCittadino)
                        .addComponent(idCittadinoLbl_RegistrazioneCittadino)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwdUsr_RegistrazioneCittadino)
                    .addComponent(idVaccino_RegistrazioneCittadino)
                    .addComponent(userId_RegistrazioneCittadino))
                .addContainerGap())
        );

        add_RegistrazioneCittadino.setText("Aggiungi");
        add_RegistrazioneCittadino.setMaximumSize(new java.awt.Dimension(83, 30));
        add_RegistrazioneCittadino.setMinimumSize(new java.awt.Dimension(83, 30));
        add_RegistrazioneCittadino.setPreferredSize(new java.awt.Dimension(83, 30));
        add_RegistrazioneCittadino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_RegistrazioneCittadinoMouseClicked(evt);
            }
        });

        ann_RegistrazioneCittadino.setText("Annulla");
        ann_RegistrazioneCittadino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ann_RegistrazioneCittadinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_RegistrazioneCittadinoLayout = new javax.swing.GroupLayout(Panel_RegistrazioneCittadino);
        Panel_RegistrazioneCittadino.setLayout(Panel_RegistrazioneCittadinoLayout);
        Panel_RegistrazioneCittadinoLayout.setHorizontalGroup(
            Panel_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RegistrazioneCittadinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLbl_RegistrazioneCittadino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datiPnl_RegistrazioneCittadino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_RegistrazioneCittadinoLayout.createSequentialGroup()
                        .addComponent(ann_RegistrazioneCittadino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Panel_RegistrazioneCittadinoLayout.setVerticalGroup(
            Panel_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RegistrazioneCittadinoLayout.createSequentialGroup()
                .addComponent(titleLbl_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(datiPnl_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ann_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_RegistrazioneCittadino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codiceFiscale_RegistrazioneCittadinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codiceFiscale_RegistrazioneCittadinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codiceFiscale_RegistrazioneCittadinoActionPerformed

    private void ann_RegistrazioneCittadinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ann_RegistrazioneCittadinoActionPerformed
        homeCittadini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ann_RegistrazioneCittadinoActionPerformed

    private void add_RegistrazioneCittadinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_RegistrazioneCittadinoMouseClicked
        try {
            registraCittadino();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(RegistraCittadini.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_RegistrazioneCittadinoMouseClicked

    private void nome_RegistrazioneCittadinoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome_RegistrazioneCittadinoFocusGained
        if(nome_RegistrazioneCittadino.getText().equals("Da 3 a 40 caratteri...")){
            nome_RegistrazioneCittadino.setText("");
        }
    }//GEN-LAST:event_nome_RegistrazioneCittadinoFocusGained

    private void cognome_RegistrazioneCittadinoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cognome_RegistrazioneCittadinoFocusLost
       if(cognome_RegistrazioneCittadino.getText().equals("")){
            cognome_RegistrazioneCittadino.setText("Da 3 a 40 caratteri...");
        }
    }//GEN-LAST:event_cognome_RegistrazioneCittadinoFocusLost

    
    
    private void email_RegistrazioneCittadinoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_RegistrazioneCittadinoFocusGained
        if(email_RegistrazioneCittadino.getText().equals("Inserisci una mail valida...")){
            email_RegistrazioneCittadino.setText("");
        }
    }//GEN-LAST:event_email_RegistrazioneCittadinoFocusGained

    private void email_RegistrazioneCittadinoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_RegistrazioneCittadinoFocusLost
        if(email_RegistrazioneCittadino.getText().equals("")){
            email_RegistrazioneCittadino.setText("Inserisci una mail valida...");
        }
    }//GEN-LAST:event_email_RegistrazioneCittadinoFocusLost

    private void nome_RegistrazioneCittadinoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome_RegistrazioneCittadinoFocusLost
        if(nome_RegistrazioneCittadino.getText().equals("")){
            nome_RegistrazioneCittadino.setText("Da 3 a 40 caratteri...");
        }
    }//GEN-LAST:event_nome_RegistrazioneCittadinoFocusLost

    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(RegistraCittadini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistraCittadini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistraCittadini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistraCittadini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraCittadini().setVisible(true);
            }
        });
         
    }
    //Recupera la lista di centri vaccinali registrati
    private void fillCentriVaccinali(){
        List<String> centriVaccinali = getCentriVaccinaliList();
                
        for(int i=0; i<centriVaccinali.size(); i++){
            centroVaccinale_RegistrazioneCittadino.addItem(centriVaccinali.get(i));
        }
    }
    
    private void registraCittadino() throws NoSuchAlgorithmException{
    try{    
            String nomeCentroVaccinale;
                if(centroVaccinale_RegistrazioneCittadino.getSelectedItem() == null)
                    nomeCentroVaccinale = "";
                else
                    nomeCentroVaccinale = centroVaccinale_RegistrazioneCittadino.getSelectedItem().toString();
            String nomeCittadino = nome_RegistrazioneCittadino.getText().strip();
            String codiceFiscale = codiceFiscale_RegistrazioneCittadino.getText().strip();
            String cognomeCittadino= cognome_RegistrazioneCittadino.getText().strip();
            String emailCittadino= email_RegistrazioneCittadino.getText().strip();
            String userID= userId_RegistrazioneCittadino.getText().strip();
            String passwordCittadino = new String(pwdUsr_RegistrazioneCittadino.getPassword());
            String vaccineID = idVaccino_RegistrazioneCittadino.getText().strip();
            
            
            if (nomeCentroVaccinale != "" && checkCompiled(nomeCittadino)&& checkCompiled(userID) && checkCompiled(cognomeCittadino) && checkIdVaccino(vaccineID) && checkPassword(passwordCittadino) && checkMail(emailCittadino))
            {
                String insert = nomeCentroVaccinale + "-" + codiceFiscale + "-" + vaccineID + "-" + nomeCittadino + "-" + cognomeCittadino + "-" + emailCittadino + "-" + userID + "-" + toHexString(getSHA(passwordCittadino));
                String path = CITTADINIDIR + File.separator + "Cittadini_registrati.dati";
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
                        if(/*toCheckUnique.get(i).equalsIgnoreCase(codiceFiscaleVaccinato) || */toCheckUnique.get(i).equalsIgnoreCase(vaccineID)){
                            ok = false;
                            break;
                        }                        
                    }
                    
                    if(ok)
                    {
                        try (FileWriter fw2 = new FileWriter(path, true)) { 
                            fw2.append(insert+"\n");
                            showMessageDialog(null, "Registrazione Cittadino Avvenuta con successo con successo!");
                        }catch(HeadlessException | IOException e){
                            showMessageDialog(null, "Errore in fase di scrittura dei dati, riprova.");
                        }
                        
                        HomeCittadini homecittadini = new HomeCittadini();
                        homecittadini.setVisible(true);
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
        } catch (IOException ex) {
            showMessageDialog(null, "Errore in fase di scrittura dei dati, riprova.");
        }
    };
 
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_RegistrazioneCittadino;
    private javax.swing.JButton add_RegistrazioneCittadino;
    private javax.swing.JButton ann_RegistrazioneCittadino;
    private javax.swing.JLabel centroVaccinaleLbl_RegistrazioneCittadino;
    private javax.swing.JComboBox<String> centroVaccinale_RegistrazioneCittadino;
    private javax.swing.JLabel codiceFiscaleLbl_RegistrazioneCittadino;
    private javax.swing.JTextField codiceFiscale_RegistrazioneCittadino;
    private javax.swing.JLabel cognomeLbl_RegistrazioneCittadino;
    private javax.swing.JTextField cognome_RegistrazioneCittadino;
    private javax.swing.JPanel datiPnl_RegistrazioneCittadino;
    private javax.swing.JLabel emailLbl_RegistrazioneCittadino;
    private javax.swing.JTextField email_RegistrazioneCittadino;
    private javax.swing.JLabel idCittadinoLbl_RegistrazioneCittadino;
    private javax.swing.JTextField idVaccino_RegistrazioneCittadino;
    private javax.swing.JLabel nomeLbl_RegistrazioneCittadino;
    private javax.swing.JTextField nome_RegistrazioneCittadino;
    private javax.swing.JLabel pwdLbl_RegistrazioneCittadino;
    private javax.swing.JPasswordField pwdUsr_RegistrazioneCittadino;
    private javax.swing.JLabel titleLbl_RegistrazioneCittadino;
    private javax.swing.JTextField userId_RegistrazioneCittadino;
    private javax.swing.JLabel usrnameLbl_RegistrazioneCittadino;
    // End of variables declaration//GEN-END:variables
}
