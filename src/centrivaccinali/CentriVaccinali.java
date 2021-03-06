/**
 * 
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */
package centrivaccinali;

import cittadini.HomeCittadini;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static utils.GeneralFunctions.LOGODIR;
import static utils.GeneralFunctions.checkDirHierarchy;


    /**
     * La classe <b>CentriVaccinali</b> è utilizzata al fine di fornire una GUI tramite la quale gli utenti possano scegliere di eseguire le operazioni di loro interesse.
     *
     * @author Andrea Mottini 742605 VA
     * @author Riccardo Bianchi 736701 VA
     * 
     */
public final class CentriVaccinali extends javax.swing.JFrame {

    /**
     * Costruttore della classe <b>CentriVaccinali</b><br>
     * Viene utilizzata per inizializzare i componenti grafici della classe, richiama le funzioni per la gestione di data e ora     
     * ed imposta la visualizzazione della finestra al centro della pagina.
     */
    public CentriVaccinali() {
        initComponents();
        date();
        time();
        this.setLocationRelativeTo(null);
        //Panel_covidfree.requestFocusInWindow();
        JFrame j = new JFrame();
        j.setIconImage(new ImageIcon(LOGODIR).getImage());
         
    }
    

    /**
     * Il metodo <b>date</b> viene utilizzato per recuperare la data in base alla location ITALY e formatta il testo con il formato "gg/MM/aaaa".<br>
     * Successivamente aggiorna la textbox per renderla visibile all'utente.
     */
    public void date (){
        String txtDate = new SimpleDateFormat ("dd/MM/yyyy",Locale.ITALY).format(new Date());
        date.setText("Data:  " +txtDate);
    }

    /**
     * Il metodo <b>time</b> crea un nuovo Timer che permette all'utente la visualizzazione dell'ora in formato "HH:mm:ss".
     */
    public void time() {
        new Timer (0, new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");
                String texte_date = sdf.format (new Date());
                hours.setText("Ora:  " +texte_date);
            }
        }).start();
    }



    /**
     * Il metodo <b>initComponents</b> viene utilizzato per creare tutti gli oggetti grafici all'interno del JFrame della classe CentriVaccinali.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_covidfree = new javax.swing.JPanel();
        appTitle_covidfree = new javax.swing.JLabel();
        cittadiniPnl_covidfree = new javax.swing.JPanel();
        cittadiniBtn_covidfree = new javax.swing.JButton();
        centrovacciniPnl_covidfree = new javax.swing.JPanel();
        centrovacciniBtn_covidfree = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        hours = new javax.swing.JLabel();
        updatesBtn = new javax.swing.JButton();
        bugBtn = new javax.swing.JButton();
        userManualBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CovidFree");
        setIconImage(new ImageIcon(LOGODIR).getImage());
        setName("frame_CentriVaccinali"); // NOI18N
        setResizable(false);

        Panel_covidfree.setBackground(new java.awt.Color(255, 255, 255));

        appTitle_covidfree.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        appTitle_covidfree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/app-logo.png"))); // NOI18N
        appTitle_covidfree.setText("CovidFree");
        appTitle_covidfree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appTitle_covidfreeMouseClicked(evt);
            }
        });

        cittadiniPnl_covidfree.setBackground(new java.awt.Color(255, 255, 255));
        cittadiniPnl_covidfree.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Cittadini ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        cittadiniBtn_covidfree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cittadini-logo.png"))); // NOI18N
        cittadiniBtn_covidfree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cittadiniBtn_covidfreeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cittadiniPnl_covidfreeLayout = new javax.swing.GroupLayout(cittadiniPnl_covidfree);
        cittadiniPnl_covidfree.setLayout(cittadiniPnl_covidfreeLayout);
        cittadiniPnl_covidfreeLayout.setHorizontalGroup(
            cittadiniPnl_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cittadiniPnl_covidfreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cittadiniBtn_covidfree, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        cittadiniPnl_covidfreeLayout.setVerticalGroup(
            cittadiniPnl_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cittadiniPnl_covidfreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cittadiniBtn_covidfree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        centrovacciniPnl_covidfree.setBackground(new java.awt.Color(255, 255, 255));
        centrovacciniPnl_covidfree.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Centri Vaccinali ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        centrovacciniBtn_covidfree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centrivaccinali-logo.png"))); // NOI18N
        centrovacciniBtn_covidfree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centrovacciniBtn_covidfreeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout centrovacciniPnl_covidfreeLayout = new javax.swing.GroupLayout(centrovacciniPnl_covidfree);
        centrovacciniPnl_covidfree.setLayout(centrovacciniPnl_covidfreeLayout);
        centrovacciniPnl_covidfreeLayout.setHorizontalGroup(
            centrovacciniPnl_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centrovacciniPnl_covidfreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(centrovacciniBtn_covidfree, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        centrovacciniPnl_covidfreeLayout.setVerticalGroup(
            centrovacciniPnl_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centrovacciniPnl_covidfreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(centrovacciniBtn_covidfree, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );

        date.setText("Data:");

        hours.setText("Ora:");

        updatesBtn.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        updatesBtn.setText("Controlla aggiornamenti");
        updatesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatesBtnActionPerformed(evt);
            }
        });

        bugBtn.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        bugBtn.setText("Segnala un bug");
        bugBtn.setToolTipText("");
        bugBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bugBtnActionPerformed(evt);
            }
        });

        userManualBtn.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        userManualBtn.setText("Manuale utente");
        userManualBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userManualBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_covidfreeLayout = new javax.swing.GroupLayout(Panel_covidfree);
        Panel_covidfree.setLayout(Panel_covidfreeLayout);
        Panel_covidfreeLayout.setHorizontalGroup(
            Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_covidfreeLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel_covidfreeLayout.createSequentialGroup()
                        .addComponent(appTitle_covidfree)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hours)
                            .addComponent(date)))
                    .addGroup(Panel_covidfreeLayout.createSequentialGroup()
                        .addGroup(Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel_covidfreeLayout.createSequentialGroup()
                                .addComponent(centrovacciniPnl_covidfree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cittadiniPnl_covidfree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_covidfreeLayout.createSequentialGroup()
                                .addComponent(updatesBtn)
                                .addGap(18, 18, 18)
                                .addComponent(bugBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(userManualBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        Panel_covidfreeLayout.setVerticalGroup(
            Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_covidfreeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_covidfreeLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hours))
                    .addComponent(appTitle_covidfree, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cittadiniPnl_covidfree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(centrovacciniPnl_covidfree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bugBtn)
                    .addComponent(userManualBtn)
                    .addComponent(updatesBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_covidfree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_covidfree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Richiama il costruttore della classe <b>HomeCentriVaccinali</b> <br>
     * Posiziona finestra al centro dello schermo
     * @param evt - Evento
     * @see centrivaccinali.HomeCentriVaccinali#HomeCentriVaccinali()
     */
    private void centrovacciniBtn_covidfreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centrovacciniBtn_covidfreeActionPerformed
        HomeCentriVaccinali homeCentriVaccinali = new HomeCentriVaccinali();
        homeCentriVaccinali.setVisible(true);
        homeCentriVaccinali.setLocationRelativeTo(null);
        this.setVisible(Boolean.FALSE);
    }//GEN-LAST:event_centrovacciniBtn_covidfreeActionPerformed

     /**
     * Richiama il costruttore della classe <b>HomeCittadini</b> <br>
     * Posiziona finestra al centro dello schermo
     * @param evt - Evento 
     * @see cittadini.HomeCittadini#HomeCittadini() 
     */
    private void cittadiniBtn_covidfreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cittadiniBtn_covidfreeActionPerformed
        HomeCittadini homeCittadini = new HomeCittadini();
        homeCittadini.setVisible(true);
        homeCittadini.setLocationRelativeTo(null);
        this.setVisible(Boolean.FALSE);
    }//GEN-LAST:event_cittadiniBtn_covidfreeActionPerformed

    /**
     * Mostra autori progetto all'interno di una message box
     * @param evt - Evento 
     */
    private void appTitle_covidfreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTitle_covidfreeMouseClicked
        showMessageDialog(null, "Autori\n- Andrea Mottini\n- Riccardo Bianchi\n\n<html><b>Versione</b></html>\n<html><b>1.1</b></html\n\n", "CovidFree - Uninsubria", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
    }//GEN-LAST:event_appTitle_covidfreeMouseClicked

    /**
     * Apre collegamento a Repository GitHub per verificare aggiornamenti applicazione
     * @param evt - Evento
     */
    private void updatesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatesBtnActionPerformed
        try {
            URI uri = new URI("https://github.com/m00tt/CovidFree#versioning");
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(CentriVaccinali.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updatesBtnActionPerformed

    /**
     * Apre collegamento a repository GitHub per segnalare issue/bug applicativi
     * @param evt - Evento
     */
    private void bugBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bugBtnActionPerformed
        try {
            URI uri = new URI("https://github.com/m00tt/CovidFree/issues");
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(CentriVaccinali.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
                // TODO add your handling code here:
    }//GEN-LAST:event_bugBtnActionPerformed

    /**
     * Apre collegamento a repository GitHub per visualizzare Manuale Utente
     * @param evt - Evento
     */
    private void userManualBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userManualBtnActionPerformed
        try {
            URI uri = new URI("https://github.com/m00tt/CovidFree/blob/main/README.md#covidfree---manuale-utente");
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(CentriVaccinali.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_userManualBtnActionPerformed

    /**
     * Il metodo <b>main</b> viene richiamato al fine di richiamare il costruttore della classe CentriVaccinali al fine di rendere visibile la classe.<br>Viene utilizzato anche per effettuare un controllo della gerarchia delle cartelle necessarie al corretto funzionamento dell'applicazione.<br>Tale funzione, in caso di mancanze di file o directory, ricreerà correttamente la gerarchia:
     * @see utils.GeneralFunctions#checkDirHierarchy
     * @param args argomenti iniettabili da linea di comando
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CentriVaccinali().setVisible(true);
            }
        });
        
        
        if(!checkDirHierarchy()){
            showMessageDialog(null, "Database non trovati.\nI dati sono stati re-inizializzati.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_covidfree;
    private javax.swing.JLabel appTitle_covidfree;
    private javax.swing.JButton bugBtn;
    private javax.swing.JButton centrovacciniBtn_covidfree;
    private javax.swing.JPanel centrovacciniPnl_covidfree;
    private javax.swing.JButton cittadiniBtn_covidfree;
    private javax.swing.JPanel cittadiniPnl_covidfree;
    private javax.swing.JLabel date;
    private javax.swing.JLabel hours;
    private javax.swing.JButton updatesBtn;
    private javax.swing.JButton userManualBtn;
    // End of variables declaration//GEN-END:variables
}
