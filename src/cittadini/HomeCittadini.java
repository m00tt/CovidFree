/**
 * 
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */

package cittadini;


public class HomeCittadini extends javax.swing.JFrame {

    public HomeCittadini() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_HomeCittadini = new javax.swing.JPanel();
        title_HomeCittadini = new javax.swing.JLabel();
        loginBtn_HomeCittadini = new javax.swing.JButton();
        registerBtn_HomeCittadini = new javax.swing.JButton();
        centriVaccinaliPnl_HomeCittadini = new javax.swing.JPanel();
        searchName_HomeCittadini = new javax.swing.JTextField();
        searchComune_HomeCittadini = new javax.swing.JTextField();
        subtitle_HomeCittadini = new javax.swing.JLabel();
        scrollPnlInfo_HomeCittadini = new javax.swing.JScrollPane();
        infocentriList_HomeCittadini = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Cittadini");
        setIconImage(new ImageIcon("icon.png").getImage());
        setPreferredSize(new java.awt.Dimension(600, 450));

        Panel_HomeCittadini.setBackground(new java.awt.Color(255, 255, 255));

        title_HomeCittadini.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        title_HomeCittadini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cittadini-logo.png"))); // NOI18N
        title_HomeCittadini.setText("Home Cittadini");

        loginBtn_HomeCittadini.setText("Accedi");
        loginBtn_HomeCittadini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtn_HomeCittadiniMouseClicked(evt);
            }
        });
        loginBtn_HomeCittadini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn_HomeCittadiniActionPerformed(evt);
            }
        });

        registerBtn_HomeCittadini.setText("Registrati");

        centriVaccinaliPnl_HomeCittadini.setBackground(new java.awt.Color(255, 255, 255));
        centriVaccinaliPnl_HomeCittadini.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        searchName_HomeCittadini.setText("Inserisci Nome Centro");

        searchComune_HomeCittadini.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchComune_HomeCittadini.setText("Inserisci Comune");

        subtitle_HomeCittadini.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        subtitle_HomeCittadini.setText("Ricerca il tuo Centro Vaccini");

        javax.swing.GroupLayout centriVaccinaliPnl_HomeCittadiniLayout = new javax.swing.GroupLayout(centriVaccinaliPnl_HomeCittadini);
        centriVaccinaliPnl_HomeCittadini.setLayout(centriVaccinaliPnl_HomeCittadiniLayout);
        centriVaccinaliPnl_HomeCittadiniLayout.setHorizontalGroup(
            centriVaccinaliPnl_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centriVaccinaliPnl_HomeCittadiniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centriVaccinaliPnl_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(subtitle_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchName_HomeCittadini))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchComune_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        centriVaccinaliPnl_HomeCittadiniLayout.setVerticalGroup(
            centriVaccinaliPnl_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centriVaccinaliPnl_HomeCittadiniLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subtitle_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(centriVaccinaliPnl_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchName_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchComune_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        infocentriList_HomeCittadini.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        infocentriList_HomeCittadini.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPnlInfo_HomeCittadini.setViewportView(infocentriList_HomeCittadini);

        javax.swing.GroupLayout Panel_HomeCittadiniLayout = new javax.swing.GroupLayout(Panel_HomeCittadini);
        Panel_HomeCittadini.setLayout(Panel_HomeCittadiniLayout);
        Panel_HomeCittadiniLayout.setHorizontalGroup(
            Panel_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_HomeCittadiniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(centriVaccinaliPnl_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPnlInfo_HomeCittadini)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_HomeCittadiniLayout.createSequentialGroup()
                        .addComponent(title_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(Panel_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registerBtn_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginBtn_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        Panel_HomeCittadiniLayout.setVerticalGroup(
            Panel_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_HomeCittadiniLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(Panel_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_HomeCittadiniLayout.createSequentialGroup()
                        .addComponent(loginBtn_HomeCittadini)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerBtn_HomeCittadini))
                    .addComponent(title_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(centriVaccinaliPnl_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPnlInfo_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtn_HomeCittadiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtn_HomeCittadiniMouseClicked
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }//GEN-LAST:event_loginBtn_HomeCittadiniMouseClicked

    private void loginBtn_HomeCittadiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtn_HomeCittadiniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn_HomeCittadiniActionPerformed

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
            java.util.logging.Logger.getLogger(HomeCittadini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeCittadini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeCittadini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeCittadini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeCittadini().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_HomeCittadini;
    private javax.swing.JPanel centriVaccinaliPnl_HomeCittadini;
    private javax.swing.JList<String> infocentriList_HomeCittadini;
    private javax.swing.JButton loginBtn_HomeCittadini;
    private javax.swing.JButton registerBtn_HomeCittadini;
    private javax.swing.JScrollPane scrollPnlInfo_HomeCittadini;
    private javax.swing.JTextField searchComune_HomeCittadini;
    private javax.swing.JTextField searchName_HomeCittadini;
    private javax.swing.JLabel subtitle_HomeCittadini;
    private javax.swing.JLabel title_HomeCittadini;
    // End of variables declaration//GEN-END:variables
}
