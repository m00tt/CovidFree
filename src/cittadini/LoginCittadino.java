/**
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */

package cittadini;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static utils.GeneralFunctions.LOGODIR;
import static javax.swing.JOptionPane.showMessageDialog;
import static utils.GeneralFunctions.CITTADINIDIR;
import static utils.GeneralFunctions.DATASEPARATOR;
import static utils.GeneralFunctions.checkDirHierarchy;
import static utils.GeneralFunctions.getCentroVaccinalebyID;
import static utils.GeneralFunctions.getSHA;
import static utils.GeneralFunctions.toHexString;

/**
 *
 * La classe LoginCittadino viene utilizzata per la creazione della GUI che permette ai cittadini di svolgere funzioni di:
 * <br></br>
 * Autenticazione all'applicazione 
 * 
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */
public class LoginCittadino extends javax.swing.JFrame {

    /**
     * Costruttore della classe LoginCittadino()<br></br>
     * Viene utilizzata per inizializzare i componenti della classe
     */
    public LoginCittadino() {
        initComponents();
        this.setLocationRelativeTo(null);

    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Login = new javax.swing.JPanel();
        title_Login = new javax.swing.JLabel();
        datiPnl_AccessoCittadino = new javax.swing.JPanel();
        usrIDLabel_Login = new javax.swing.JLabel();
        passwordLabel_Login = new javax.swing.JLabel();
        usrIDField_Login = new javax.swing.JTextField();
        pwdField_Login = new javax.swing.JPasswordField();
        accediBtn_Login = new javax.swing.JButton();
        indietroBtn_Login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setIconImage(new ImageIcon(LOGODIR).getImage());
        setName("frame_Login"); // NOI18N
        setResizable(false);

        Panel_Login.setBackground(new java.awt.Color(255, 255, 255));

        title_Login.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        title_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new_vaccinato.png"))); // NOI18N
        title_Login.setText("Area Utente");
        title_Login.setPreferredSize(new java.awt.Dimension(300, 100));

        datiPnl_AccessoCittadino.setBackground(new java.awt.Color(255, 255, 255));
        datiPnl_AccessoCittadino.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Inserisci i dati ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        datiPnl_AccessoCittadino.setToolTipText("");

        usrIDLabel_Login.setText("User ID");

        passwordLabel_Login.setText("Password");

        usrIDField_Login.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        usrIDField_Login.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usrIDField_Login.setText("Inserisci il tuo User ID...");
        usrIDField_Login.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        usrIDField_Login.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        usrIDField_Login.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usrIDField_LoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usrIDField_LoginFocusLost(evt);
            }
        });

        pwdField_Login.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pwdField_Login.setCaretColor(new java.awt.Color(255, 255, 255));

        accediBtn_Login.setText("Accedi");
        accediBtn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accediBtn_LoginActionPerformed(evt);
            }
        });

        indietroBtn_Login.setText("Indietro");
        indietroBtn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroBtn_LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout datiPnl_AccessoCittadinoLayout = new javax.swing.GroupLayout(datiPnl_AccessoCittadino);
        datiPnl_AccessoCittadino.setLayout(datiPnl_AccessoCittadinoLayout);
        datiPnl_AccessoCittadinoLayout.setHorizontalGroup(
            datiPnl_AccessoCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datiPnl_AccessoCittadinoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(datiPnl_AccessoCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datiPnl_AccessoCittadinoLayout.createSequentialGroup()
                        .addComponent(indietroBtn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(accediBtn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datiPnl_AccessoCittadinoLayout.createSequentialGroup()
                        .addComponent(passwordLabel_Login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(pwdField_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datiPnl_AccessoCittadinoLayout.createSequentialGroup()
                        .addComponent(usrIDLabel_Login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usrIDField_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        datiPnl_AccessoCittadinoLayout.setVerticalGroup(
            datiPnl_AccessoCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datiPnl_AccessoCittadinoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(datiPnl_AccessoCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usrIDField_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usrIDLabel_Login))
                .addGap(27, 27, 27)
                .addGroup(datiPnl_AccessoCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel_Login)
                    .addComponent(pwdField_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(datiPnl_AccessoCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indietroBtn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accediBtn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout Panel_LoginLayout = new javax.swing.GroupLayout(Panel_Login);
        Panel_Login.setLayout(Panel_LoginLayout);
        Panel_LoginLayout.setHorizontalGroup(
            Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title_Login, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
            .addGroup(Panel_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datiPnl_AccessoCittadino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_LoginLayout.setVerticalGroup(
            Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_LoginLayout.createSequentialGroup()
                .addComponent(title_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(datiPnl_AccessoCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietroBtn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroBtn_LoginActionPerformed
        HomeCittadini hc= new HomeCittadini();
        hc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_indietroBtn_LoginActionPerformed

    private void usrIDField_LoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usrIDField_LoginFocusGained
        if (usrIDField_Login.getText().equals("Inserisci il tuo User ID...")){
            usrIDField_Login.setText("");
        }
    }//GEN-LAST:event_usrIDField_LoginFocusGained

    private void usrIDField_LoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usrIDField_LoginFocusLost
        if (usrIDField_Login.getText().equals("")){
            usrIDField_Login.setText("Inserisci il tuo User ID...");
        }
    }//GEN-LAST:event_usrIDField_LoginFocusLost

    private void accediBtn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accediBtn_LoginActionPerformed
        String username = usrIDField_Login.getText().strip();
        String tmppsw = new String(pwdField_Login.getPassword());
        String password="";
        try {
            password = toHexString(getSHA(tmppsw));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LoginCittadino.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        if(checkLogin(username, password))
        {
            RegistraEventiAvversi rea = new RegistraEventiAvversi(username, getCentroVaccinalebyID(username));
            rea.setVisible(true);
            this.setVisible(false);
            
        }
        else{
            showMessageDialog(null, "Login fallito.\nUsername o password errati.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
        }
    }//GEN-LAST:event_accediBtn_LoginActionPerformed

    /**
     * Il metodo main viene utilizzato per inizializzare un nuovo elemento della classe <b>LoginCittadino()</b>
     * Tramite la proprietà <i>setVisible(true)</i> il form viene mostrato a schermo
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
            java.util.logging.Logger.getLogger(LoginCittadino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginCittadino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginCittadino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginCittadino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginCittadino().setVisible(true);
        });
    }
    
    
    
     /**
     * Il metodo <b>checkLogin </b> viene utilizzato per verificare la veridicità delle informazioni inserite in input durante la fase di Login. <br></br>
     * Il metodo confronta username e password inserite dall'utente con quelle presenti nel file <i>"Cittadini_Registrati.dati"</i>
     *
     * @param x
     * @param psw
     * @return true/false a seconda dalla presenza o meno dell'utente
     */
    private static boolean checkLogin(String x,String psw){
       
        String thisLine;
        
        if(!checkDirHierarchy()){
            showMessageDialog(null, "I database risultano corrotti.\nI dati sono stati ripristinati.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
        }
        
        try {
            BufferedReader br = new BufferedReader (new FileReader(CITTADINIDIR + File.separator + "Cittadini_Registrati.dati"));
            while((thisLine = br.readLine()) != null) {
                String [] tmp = thisLine.split(DATASEPARATOR);
                if(tmp[6].equalsIgnoreCase(x) && tmp[7].equals(psw))
                {
                    return true;            
                }
            }
        }catch(IOException e) {
            showMessageDialog(null, "Errore di lettura del database, riprova.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
        }
        
        
        return false;
    }
    

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Login;
    private javax.swing.JButton accediBtn_Login;
    private javax.swing.JPanel datiPnl_AccessoCittadino;
    private javax.swing.JButton indietroBtn_Login;
    private javax.swing.JLabel passwordLabel_Login;
    private javax.swing.JPasswordField pwdField_Login;
    private javax.swing.JLabel title_Login;
    private javax.swing.JTextField usrIDField_Login;
    private javax.swing.JLabel usrIDLabel_Login;
    // End of variables declaration//GEN-END:variables
}
