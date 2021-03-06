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
 * La classe <b>HomeCentriVaccinali</b> è utilizzata al fine di fornire una GUI tramite la quale gli utenti possano scegliere di eseguire le operazioni di loro interesse.
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 */
public class HomeCentriVaccinali extends javax.swing.JFrame {

    /**
     * Costruttore della classe <b>HomeCentriVaccinali</b><br>
     * Tale costruttore permette di inizializzare i componenti grafici che compongono la classe e impostare la visulizzazione dell'applicazione al centro dello schermo.
     */
    public HomeCentriVaccinali() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * Il metodo <b>initComponents</b> è utilizzato per istanziare tutti gli oggetti grafici all'interno del JFrame.
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

    /**
     * Permette tramite apposito pulsante di tornare alla schermata precedente.<br>
     * Richiama costruttore della classe <b>CentriVaccinali()</b>
     * @param evt - Evento
     * @see centrivaccinali.CentriVaccinali#CentriVaccinali() 
     */
    private void back_HomeCentriVaccinaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_HomeCentriVaccinaliActionPerformed
        CentriVaccinali centriVaccinali = new CentriVaccinali();
        centriVaccinali.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back_HomeCentriVaccinaliActionPerformed

    /**
     * Richiama il costruttore della classe <b>RegistrazioneCentroVaccinale</b><br>
     * Posiziona finestra al centro dello schermo
     * @param evt - Evento
     * @see centrivaccinali.RegistrazioneCentroVaccinale#RegistrazioneCentroVaccinale()
     */
    private void registraCentroVaccinaleBtn_HomeCentriVaccinaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraCentroVaccinaleBtn_HomeCentriVaccinaliActionPerformed
        RegistrazioneCentroVaccinale registrazioneCentroVaccinale = new RegistrazioneCentroVaccinale();
        registrazioneCentroVaccinale.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registraCentroVaccinaleBtn_HomeCentriVaccinaliActionPerformed

    /**
     * Richiama il costruttore della classe <b>RegistrazioneVaccinato</b><br>
     * Posiziona finestra al centro dello schermo
     * @param evt - Evento
     * @see centrivaccinali.RegistrazioneVaccinato#RegistrazioneVaccinato() 
     */
    private void registraVaccinatoBtn_HomeCentriVaccinaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraVaccinatoBtn_HomeCentriVaccinaliActionPerformed
        RegistrazioneVaccinato registrazioneVaccinato = new RegistrazioneVaccinato();
        registrazioneVaccinato.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registraVaccinatoBtn_HomeCentriVaccinaliActionPerformed

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
