/**
 * 
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */

package cittadini;

import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Login = new javax.swing.JPanel();
        title_Login = new javax.swing.JLabel();
        emailLabel_Login = new javax.swing.JLabel();
        passwordLabel_Login = new javax.swing.JLabel();
        emailField_Login = new javax.swing.JTextField();
        pwdField_Login = new javax.swing.JPasswordField();
        accediBtn_Login = new javax.swing.JButton();
        indietroBtn_Login = new javax.swing.JButton();
        logo_Login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Cittadini");
        setIconImage(new ImageIcon("icon.png").getImage());
        setName("frame_Login"); // NOI18N
        setResizable(false);

        Panel_Login.setBackground(new java.awt.Color(255, 255, 255));

        title_Login.setFont(new java.awt.Font("Teko SemiBold", 1, 36)); // NOI18N
        title_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cittadini-logo.png"))); // NOI18N
        title_Login.setText("Area Utente");
        title_Login.setPreferredSize(new java.awt.Dimension(300, 100));

        emailLabel_Login.setText("Email");

        passwordLabel_Login.setText("Password");

        emailField_Login.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailField_Login.setText("Inserisci indirizzo email");
        emailField_Login.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        emailField_Login.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailField_LoginFocusGained(evt);
            }
        });
        emailField_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailField_LoginActionPerformed(evt);
            }
        });

        pwdField_Login.setText("jPasswordField1");
        pwdField_Login.setCaretColor(new java.awt.Color(255, 255, 255));

        accediBtn_Login.setText("Accedi");

        indietroBtn_Login.setText("Indietro");
        indietroBtn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroBtn_LoginActionPerformed(evt);
            }
        });

        logo_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/app-logo.png"))); // NOI18N
        logo_Login.setToolTipText("");

        javax.swing.GroupLayout Panel_LoginLayout = new javax.swing.GroupLayout(Panel_Login);
        Panel_Login.setLayout(Panel_LoginLayout);
        Panel_LoginLayout.setHorizontalGroup(
            Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logo_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_LoginLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel_LoginLayout.createSequentialGroup()
                        .addComponent(indietroBtn_Login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(accediBtn_Login))
                    .addGroup(Panel_LoginLayout.createSequentialGroup()
                        .addComponent(emailLabel_Login)
                        .addGap(63, 63, 63)
                        .addComponent(emailField_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_LoginLayout.createSequentialGroup()
                        .addComponent(passwordLabel_Login)
                        .addGap(41, 41, 41)
                        .addComponent(pwdField_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        Panel_LoginLayout.setVerticalGroup(
            Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_LoginLayout.createSequentialGroup()
                .addComponent(title_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel_Login)
                    .addComponent(emailField_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdField_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel_Login))
                .addGap(53, 53, 53)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indietroBtn_Login)
                    .addComponent(accediBtn_Login))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logo_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(Panel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietroBtn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroBtn_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indietroBtn_LoginActionPerformed

    private void emailField_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailField_LoginActionPerformed
          
    }//GEN-LAST:event_emailField_LoginActionPerformed

    private void emailField_LoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailField_LoginFocusGained
        // TODO add your handling code here:
        emailField_Login.setText("");
    }//GEN-LAST:event_emailField_LoginFocusGained

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Login;
    private javax.swing.JButton accediBtn_Login;
    private javax.swing.JTextField emailField_Login;
    private javax.swing.JLabel emailLabel_Login;
    private javax.swing.JButton indietroBtn_Login;
    private javax.swing.JLabel logo_Login;
    private javax.swing.JLabel passwordLabel_Login;
    private javax.swing.JPasswordField pwdField_Login;
    private javax.swing.JLabel title_Login;
    // End of variables declaration//GEN-END:variables
}
