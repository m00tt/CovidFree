/**
 * 
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */

package centrivaccinali;
import javax.swing.ImageIcon;
import static utils.GeneralFunctions.LOGODIR;

/**
 * This class is used to open the multiple choice main menu of CentriVaccinali sub-application
 * Using this form user can choose to add a new vaccination centre or to add a new vaccined citizen
 * 
 */
public class HomeCentriVaccinali extends javax.swing.JFrame {

    /**
     * HomeCentriVaccinali() constructor
     */
    public HomeCentriVaccinali() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title_HomeCentriVaccinali = new javax.swing.JLabel();
        centroVaccinalePnl_HomeCentriVaccinali = new javax.swing.JPanel();
        registraCentroVaccinaleBtn_HomeCentriVaccinali = new javax.swing.JButton();
        vaccinatoPnl_HomeCentriVaccinali = new javax.swing.JPanel();
        registraVaccinatoBtn_HomeCentriVaccinali = new javax.swing.JButton();
        back_HomeCentriVaccinali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CovidFree - Home");
        setIconImage(new ImageIcon(LOGODIR).getImage());
        setName("frame_HomeCentriVaccinali"); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        title_HomeCentriVaccinali.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        title_HomeCentriVaccinali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centrivaccinali-logo.png"))); // NOI18N
        title_HomeCentriVaccinali.setText("Home Centri Vaccinali");

        centroVaccinalePnl_HomeCentriVaccinali.setBackground(new java.awt.Color(255, 255, 255));
        centroVaccinalePnl_HomeCentriVaccinali.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Registra Centro Vaccinale ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        registraCentroVaccinaleBtn_HomeCentriVaccinali.setBackground(new java.awt.Color(255, 255, 255));
        registraCentroVaccinaleBtn_HomeCentriVaccinali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new_centrovaccinale.png"))); // NOI18N
        registraCentroVaccinaleBtn_HomeCentriVaccinali.setBorderPainted(false);
        registraCentroVaccinaleBtn_HomeCentriVaccinali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraCentroVaccinaleBtn_HomeCentriVaccinaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout centroVaccinalePnl_HomeCentriVaccinaliLayout = new javax.swing.GroupLayout(centroVaccinalePnl_HomeCentriVaccinali);
        centroVaccinalePnl_HomeCentriVaccinali.setLayout(centroVaccinalePnl_HomeCentriVaccinaliLayout);
        centroVaccinalePnl_HomeCentriVaccinaliLayout.setHorizontalGroup(
            centroVaccinalePnl_HomeCentriVaccinaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centroVaccinalePnl_HomeCentriVaccinaliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registraCentroVaccinaleBtn_HomeCentriVaccinali, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        centroVaccinalePnl_HomeCentriVaccinaliLayout.setVerticalGroup(
            centroVaccinalePnl_HomeCentriVaccinaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centroVaccinalePnl_HomeCentriVaccinaliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registraCentroVaccinaleBtn_HomeCentriVaccinali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        vaccinatoPnl_HomeCentriVaccinali.setBackground(new java.awt.Color(255, 255, 255));
        vaccinatoPnl_HomeCentriVaccinali.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Registra Vaccinato ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        registraVaccinatoBtn_HomeCentriVaccinali.setBackground(new java.awt.Color(255, 255, 255));
        registraVaccinatoBtn_HomeCentriVaccinali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new_vaccinato.png"))); // NOI18N
        registraVaccinatoBtn_HomeCentriVaccinali.setBorderPainted(false);
        registraVaccinatoBtn_HomeCentriVaccinali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraVaccinatoBtn_HomeCentriVaccinaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vaccinatoPnl_HomeCentriVaccinaliLayout = new javax.swing.GroupLayout(vaccinatoPnl_HomeCentriVaccinali);
        vaccinatoPnl_HomeCentriVaccinali.setLayout(vaccinatoPnl_HomeCentriVaccinaliLayout);
        vaccinatoPnl_HomeCentriVaccinaliLayout.setHorizontalGroup(
            vaccinatoPnl_HomeCentriVaccinaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vaccinatoPnl_HomeCentriVaccinaliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registraVaccinatoBtn_HomeCentriVaccinali, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        vaccinatoPnl_HomeCentriVaccinaliLayout.setVerticalGroup(
            vaccinatoPnl_HomeCentriVaccinaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vaccinatoPnl_HomeCentriVaccinaliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registraVaccinatoBtn_HomeCentriVaccinali, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        back_HomeCentriVaccinali.setBackground(new java.awt.Color(255, 255, 255));
        back_HomeCentriVaccinali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        back_HomeCentriVaccinali.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back_HomeCentriVaccinali.setBorderPainted(false);
        back_HomeCentriVaccinali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_HomeCentriVaccinaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title_HomeCentriVaccinali)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(centroVaccinalePnl_HomeCentriVaccinali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vaccinatoPnl_HomeCentriVaccinali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_HomeCentriVaccinali, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_HomeCentriVaccinali, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(title_HomeCentriVaccinali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(centroVaccinalePnl_HomeCentriVaccinali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vaccinatoPnl_HomeCentriVaccinali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void back_HomeCentriVaccinaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_HomeCentriVaccinaliActionPerformed
        CentriVaccinali centriVaccinali = new CentriVaccinali();
        centriVaccinali.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back_HomeCentriVaccinaliActionPerformed

    private void registraCentroVaccinaleBtn_HomeCentriVaccinaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraCentroVaccinaleBtn_HomeCentriVaccinaliActionPerformed
        RegistrazioneCentroVaccinale registrazioneCentroVaccinale = new RegistrazioneCentroVaccinale();
        registrazioneCentroVaccinale.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registraCentroVaccinaleBtn_HomeCentriVaccinaliActionPerformed

    private void registraVaccinatoBtn_HomeCentriVaccinaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraVaccinatoBtn_HomeCentriVaccinaliActionPerformed
        RegistrazioneVaccinato registrazioneVaccinato = new RegistrazioneVaccinato();
        registrazioneVaccinato.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registraVaccinatoBtn_HomeCentriVaccinaliActionPerformed

    /**
     * This Main method is used in order to launch the current class JavaForm.
     * Is also used to initialize the current class and graphic elements.
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
            java.util.logging.Logger.getLogger(HomeCentriVaccinali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeCentriVaccinali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeCentriVaccinali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeCentriVaccinali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomeCentriVaccinali().setVisible(true);
        });

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_HomeCentriVaccinali;
    private javax.swing.JPanel centroVaccinalePnl_HomeCentriVaccinali;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registraCentroVaccinaleBtn_HomeCentriVaccinali;
    private javax.swing.JButton registraVaccinatoBtn_HomeCentriVaccinali;
    private javax.swing.JLabel title_HomeCentriVaccinali;
    private javax.swing.JPanel vaccinatoPnl_HomeCentriVaccinali;
    // End of variables declaration//GEN-END:variables
}
