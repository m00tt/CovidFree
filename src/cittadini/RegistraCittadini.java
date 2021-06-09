/**
 * La classe RegistraCittadini viene utilizzata per la creazione e la memorizzazione di un nuovo cittadino sulla struttura dati dell'applicazione.
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
import javax.swing.ImageIcon;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static utils.GeneralFunctions.LOGODIR;
import static javax.swing.JOptionPane.showMessageDialog;
import static utils.GeneralFunctions.CITTADINIDIR;
import static utils.GeneralFunctions.DATASEPARATOR;
import static utils.GeneralFunctions.checkCodiceFiscale;
import static utils.GeneralFunctions.checkCompiled;
import static utils.GeneralFunctions.checkDirHierarchy;
import static utils.GeneralFunctions.checkIdVaccino;
import static utils.GeneralFunctions.checkMail;
import static utils.GeneralFunctions.checkPassword;
import static utils.GeneralFunctions.checkUserId;
import static utils.GeneralFunctions.getSHA;
import static utils.GeneralFunctions.getCentriVaccinaliList;
import static utils.GeneralFunctions.getUniqueList;
import static utils.GeneralFunctions.newCittadinoAlreadyVaccinato;
import static utils.GeneralFunctions.toHexString;



public class RegistraCittadini extends javax.swing.JFrame {
    
    /**
     * Costruttore della classe RegistraCittadini()
     * Viene utilizzata per inizializzare i componenti della classe
     * richiama inoltre il metodo <b>fillCentriVaccinali()</b> per consentire l'aggiunta dei centri vaccinali già registrati alla combo box presente nel form
     */
    public RegistraCittadini() {
        initComponents();
        fillCentriVaccinali();
        this.setLocationRelativeTo(null);
    }
    
    
    
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
        ann_RegistrazioneCittadino = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrati");
        setIconImage(new ImageIcon(LOGODIR).getImage());
        setResizable(false);

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
        cognome_RegistrazioneCittadino.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cognome_RegistrazioneCittadino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cognome_RegistrazioneCittadinoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cognome_RegistrazioneCittadinoFocusLost(evt);
            }
        });

        codiceFiscale_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        codiceFiscale_RegistrazioneCittadino.setText("Inserisci Codice Fiscale...");
        codiceFiscale_RegistrazioneCittadino.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        codiceFiscale_RegistrazioneCittadino.setPreferredSize(new java.awt.Dimension(32, 30));
        codiceFiscale_RegistrazioneCittadino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                codiceFiscale_RegistrazioneCittadinoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                codiceFiscale_RegistrazioneCittadinoFocusLost(evt);
            }
        });
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
        nome_RegistrazioneCittadino.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nome_RegistrazioneCittadino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nome_RegistrazioneCittadinoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nome_RegistrazioneCittadinoFocusLost(evt);
            }
        });

        idVaccino_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        idVaccino_RegistrazioneCittadino.setText("16 cifre...");
        idVaccino_RegistrazioneCittadino.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        idVaccino_RegistrazioneCittadino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idVaccino_RegistrazioneCittadinoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idVaccino_RegistrazioneCittadinoFocusLost(evt);
            }
        });

        usrnameLbl_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        usrnameLbl_RegistrazioneCittadino.setText("User ID");

        pwdLbl_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        pwdLbl_RegistrazioneCittadino.setText("Password");

        idCittadinoLbl_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        idCittadinoLbl_RegistrazioneCittadino.setText("ID vaccino");
        idCittadinoLbl_RegistrazioneCittadino.setToolTipText("");

        pwdUsr_RegistrazioneCittadino.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        userId_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        userId_RegistrazioneCittadino.setText("Da 3 a 8 caratteri...");
        userId_RegistrazioneCittadino.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        userId_RegistrazioneCittadino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userId_RegistrazioneCittadinoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userId_RegistrazioneCittadinoFocusLost(evt);
            }
        });

        email_RegistrazioneCittadino.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        email_RegistrazioneCittadino.setText("Inserisci una mail valida...");
        email_RegistrazioneCittadino.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
                                .addGroup(datiPnl_RegistrazioneCittadinoLayout.createSequentialGroup()
                                    .addComponent(usrnameLbl_RegistrazioneCittadino)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(userId_RegistrazioneCittadino))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pwdUsr_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pwdLbl_RegistrazioneCittadino))
                            .addGap(18, 18, 18)
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
                .addGap(14, 14, 14)
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
                .addGroup(datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usrnameLbl_RegistrazioneCittadino)
                    .addComponent(idCittadinoLbl_RegistrazioneCittadino)
                    .addComponent(pwdLbl_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datiPnl_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(userId_RegistrazioneCittadino)
                    .addComponent(pwdUsr_RegistrazioneCittadino, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(idVaccino_RegistrazioneCittadino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ann_RegistrazioneCittadino.setText("Annulla");
        ann_RegistrazioneCittadino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ann_RegistrazioneCittadinoActionPerformed(evt);
            }
        });

        jButton1.setText("Registrati");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(ann_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        Panel_RegistrazioneCittadinoLayout.setVerticalGroup(
            Panel_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RegistrazioneCittadinoLayout.createSequentialGroup()
                .addComponent(titleLbl_RegistrazioneCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(datiPnl_RegistrazioneCittadino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(Panel_RegistrazioneCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ann_RegistrazioneCittadino, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
        HomeCittadini homeCittadini = new HomeCittadini();
        homeCittadini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ann_RegistrazioneCittadinoActionPerformed

    
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

    private void codiceFiscale_RegistrazioneCittadinoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codiceFiscale_RegistrazioneCittadinoFocusGained
       if (codiceFiscale_RegistrazioneCittadino.getText().equals("Inserisci Codice Fiscale...")){
           codiceFiscale_RegistrazioneCittadino.setText("");
       }
    }//GEN-LAST:event_codiceFiscale_RegistrazioneCittadinoFocusGained

    private void codiceFiscale_RegistrazioneCittadinoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codiceFiscale_RegistrazioneCittadinoFocusLost
        if (codiceFiscale_RegistrazioneCittadino.getText().equals("")){
           codiceFiscale_RegistrazioneCittadino.setText("Inserisci Codice Fiscale...");
        }
    }//GEN-LAST:event_codiceFiscale_RegistrazioneCittadinoFocusLost

    private void userId_RegistrazioneCittadinoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userId_RegistrazioneCittadinoFocusGained
     if (userId_RegistrazioneCittadino.getText().equals("Da 3 a 8 caratteri...")){
         userId_RegistrazioneCittadino.setText("");
     }
    }//GEN-LAST:event_userId_RegistrazioneCittadinoFocusGained

    private void userId_RegistrazioneCittadinoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userId_RegistrazioneCittadinoFocusLost
        if (userId_RegistrazioneCittadino.getText().equals("")){
         userId_RegistrazioneCittadino.setText("Da 3 a 8 caratteri...");
     }
    }//GEN-LAST:event_userId_RegistrazioneCittadinoFocusLost

    private void idVaccino_RegistrazioneCittadinoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idVaccino_RegistrazioneCittadinoFocusGained
        if (idVaccino_RegistrazioneCittadino.getText().equals("16 cifre...")){
         idVaccino_RegistrazioneCittadino.setText("");
     }
    }//GEN-LAST:event_idVaccino_RegistrazioneCittadinoFocusGained

    private void idVaccino_RegistrazioneCittadinoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idVaccino_RegistrazioneCittadinoFocusLost
        if (idVaccino_RegistrazioneCittadino.getText().equals("")){
         idVaccino_RegistrazioneCittadino.setText("16 cifre...");
     }
    }//GEN-LAST:event_idVaccino_RegistrazioneCittadinoFocusLost

    private void cognome_RegistrazioneCittadinoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cognome_RegistrazioneCittadinoFocusGained
        if(cognome_RegistrazioneCittadino.getText().equals("Da 3 a 40 caratteri...")){
            cognome_RegistrazioneCittadino.setText("");
        }
    }//GEN-LAST:event_cognome_RegistrazioneCittadinoFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            registraCittadino();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(RegistraCittadini.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Il metodo main viene utilizzato per inizializzare un nuovo elemento della classe <b>RegistraCittadini()</b>
     * Tramite la proprietà <i>setVisible(true)</i> il form viene mostrato a schermo
     * @param args
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
        java.awt.EventQueue.invokeLater(() -> {
            new RegistraCittadini().setVisible(true);
        });
         
    }
    //Recupera la lista di centri vaccinali registrati
    /**
     * La funzione <b>fillCentriVaccinali</b> ha lo scopo di aggiungere alla Jlist presente nella GUI i centri vaccinali registrati e salvati sul file <i>"CentriVaccinali.dati"</i>
     * @param centriVaccinali
     */
    private void fillCentriVaccinali(){
        List<String> centriVaccinali = getCentriVaccinaliList();
                
        for(int i=0; i<centriVaccinali.size(); i++){
            centroVaccinale_RegistrazioneCittadino.addItem(centriVaccinali.get(i));
        }
    }
    
    /**
     * Il metodo <b>registraCittadino()</b> consente di registrare un nuovo cittadino e memorizzare le informazioni nell'apposita struttura dati.
     * Controlla che tutti i campi all'interno del form siano stati correttamente compilati .
     * Al suo interno richiama tutte le funzioni di verifica veridicità dei dati e, in caso di errori restituisce un messaggio che indica quale campo è sbagliato e come modificare l'input per validare la verifica.
     * Al termine dell'operazione di scrittura dati, se avvenuta con successo, riport automaticamente l'applicazione alla schermata precedente.
     * @throws NoSuchAlgorithmException 
     */
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
            
            
            if (!"".equals(nomeCentroVaccinale) && checkCompiled(nomeCittadino) && checkCompiled(cognomeCittadino) && checkMail(emailCittadino) && checkCodiceFiscale(codiceFiscale) && checkUserId(userID) && checkPassword(passwordCittadino) && checkIdVaccino(vaccineID))
            {
                String insert = nomeCentroVaccinale + DATASEPARATOR + codiceFiscale + DATASEPARATOR + vaccineID + DATASEPARATOR + nomeCittadino + DATASEPARATOR + cognomeCittadino + DATASEPARATOR + emailCittadino + DATASEPARATOR + userID + DATASEPARATOR + toHexString(getSHA(passwordCittadino));
                String path = CITTADINIDIR + File.separator + "Cittadini_registrati.dati";
                if(!checkDirHierarchy()){
                    showMessageDialog(null, "I database risultano corrotti.\nI dati sono stati ripristinati.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
                }
                File f = new File(path);
                if(!f.exists()){
                    f.createNewFile();
                }
                try{
                    boolean ok = true;            
                    List<String> toCheckUnique = getUniqueList();
                    for (int i=0; i<toCheckUnique.size(); i++){
                        if(toCheckUnique.get(i).equalsIgnoreCase(userID) || toCheckUnique.get(i).equalsIgnoreCase(vaccineID) || toCheckUnique.get(i).equalsIgnoreCase(codiceFiscale)){
                            ok = false;
                            break;
                        }                        
                    }
                    
                    if(ok)
                    {
                        String cmpCentroVaccinale = newCittadinoAlreadyVaccinato(codiceFiscale);
                        
                        if(cmpCentroVaccinale == null){
                            try (FileWriter fw2 = new FileWriter(path, true)) { 
                                fw2.append(insert+"\n");
                                showMessageDialog(null, "Registrazione Cittadino Avvenuta con successo!", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
                            }catch(HeadlessException | IOException e){
                                showMessageDialog(null, "Errore in fase di scrittura dei dati, riprova.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
                            }
                        
                            HomeCittadini homecittadini = new HomeCittadini();
                            homecittadini.setVisible(true);
                            this.setVisible(false);
                        }
                        else{
                            String[] cmpSplit = cmpCentroVaccinale.split(DATASEPARATOR);
                            if(cmpSplit[0].equalsIgnoreCase(nomeCentroVaccinale) && cmpSplit[1].equalsIgnoreCase(vaccineID)){
                                try (FileWriter fw2 = new FileWriter(path, true)) { 
                                    fw2.append(insert+"\n");
                                    showMessageDialog(null, "Registrazione Cittadino Avvenuta con successo!", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
                                }catch(HeadlessException | IOException e){
                                    showMessageDialog(null, "Errore in fase di scrittura dei dati, riprova.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
                                }

                                HomeCittadini homecittadini = new HomeCittadini();
                                homecittadini.setVisible(true);
                                this.setVisible(false);
                            }
                            else{
                                showMessageDialog(null, "Risulta già una vaccinazione avvenuta al centro vaccinale '"+cmpSplit[0]+"' con l'ID Vaccino: "+cmpSplit[1]+"\n\nRegistrati con gli stessi dati.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
                            }
                        
                        }
                    }
                    else{
                        showMessageDialog(null, "Codice Fiscale, UserID o ID Vaccino Vaccino già presenti nel database.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
                    }
                    
                }catch(Exception e){
                    showMessageDialog(null, "Errore in fase di scrittura dei dati, riprova.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
                }              
            }
            else{
                if("".equals(nomeCentroVaccinale))
                    showMessageDialog(null, "Nessun centro vaccinale disponibile.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
            }
        } catch (IOException ex) {
            showMessageDialog(null, "Errore in fase di scrittura dei dati, riprova.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
        }
    };
 
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_RegistrazioneCittadino;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel nomeLbl_RegistrazioneCittadino;
    private javax.swing.JTextField nome_RegistrazioneCittadino;
    private javax.swing.JLabel pwdLbl_RegistrazioneCittadino;
    private javax.swing.JPasswordField pwdUsr_RegistrazioneCittadino;
    private javax.swing.JLabel titleLbl_RegistrazioneCittadino;
    private javax.swing.JTextField userId_RegistrazioneCittadino;
    private javax.swing.JLabel usrnameLbl_RegistrazioneCittadino;
    // End of variables declaration//GEN-END:variables
}
