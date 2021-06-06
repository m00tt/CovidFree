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



public final class CentriVaccinali extends javax.swing.JFrame {

    /**
     * CentriVaccinali() class constructor
     */
    public CentriVaccinali() {
        initComponents();
        date();
        time();
        this.setLocationRelativeTo(null);
        JFrame j = new JFrame();
        j.setIconImage(new ImageIcon(LOGODIR).getImage());
         
    }
    
    //ShowDate

    /**
     * This method is used to retrieve current date and display it with "dd/MM/yyyy" format.
     */
    public void date (){
        String txtDate = new SimpleDateFormat ("dd/MM/yyyy",Locale.ITALY).format(new Date());
        date.setText("Data:  " +txtDate);
    }
    //ShowTime

    /**
     * This method is used to retrieve current time and display it with "HH:mm:ss" format.
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
     * This method is called from within the constructor to initialize the form.
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Covid Free");
        setIconImage(new ImageIcon(LOGODIR).getImage());
        setName("frame_CentriVaccinali"); // NOI18N
        setResizable(false);

        Panel_covidfree.setBackground(new java.awt.Color(255, 255, 255));

        appTitle_covidfree.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        appTitle_covidfree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/app-logo.png"))); // NOI18N
        appTitle_covidfree.setText("Covid Free");
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

        jButton1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton1.setText("Controlla aggiornamenti");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton2.setText("Segnala un bug");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                            .addComponent(jButton1)
                            .addComponent(centrovacciniPnl_covidfree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cittadiniPnl_covidfree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addContainerGap(64, Short.MAX_VALUE))
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
                    .addComponent(jButton1)
                    .addComponent(jButton2))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void centrovacciniBtn_covidfreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centrovacciniBtn_covidfreeActionPerformed
        HomeCentriVaccinali homeCentriVaccinali = new HomeCentriVaccinali();
        homeCentriVaccinali.setVisible(true);
        homeCentriVaccinali.setLocationRelativeTo(null);
        this.setVisible(Boolean.FALSE);
    }//GEN-LAST:event_centrovacciniBtn_covidfreeActionPerformed

    private void cittadiniBtn_covidfreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cittadiniBtn_covidfreeActionPerformed
        HomeCittadini homeCittadini = new HomeCittadini();
        homeCittadini.setVisible(true);
        homeCittadini.setLocationRelativeTo(null);
        this.setVisible(Boolean.FALSE);
    }//GEN-LAST:event_cittadiniBtn_covidfreeActionPerformed

    private void appTitle_covidfreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTitle_covidfreeMouseClicked
        showMessageDialog(null, "Autori\n- Andrea Mottini\n- Riccardo Bianchi\n\n<html><b>Versione</b></html>\n<html><b>1.1</b></html\n\n", "CovidFree - Uninsubria", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
    }//GEN-LAST:event_appTitle_covidfreeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        URI uri=null;
        try {
            uri = new URI("https://github.com/m00tt/CovidFree/blob/main/README.md");
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException ex) {
            Logger.getLogger(CentriVaccinali.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CentriVaccinali.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        URI uri=null;
        try {
            uri = new URI("https://github.com/m00tt/CovidFree/issues");
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException ex) {
            Logger.getLogger(CentriVaccinali.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CentriVaccinali.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * This Main method is used in order to launch the main graphic JavaForm of the application.
     * Is also used to initialize the current class and graphic elements.
     * @param args the command line arguments
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
    private javax.swing.JButton centrovacciniBtn_covidfree;
    private javax.swing.JPanel centrovacciniPnl_covidfree;
    private javax.swing.JButton cittadiniBtn_covidfree;
    private javax.swing.JPanel cittadiniPnl_covidfree;
    private javax.swing.JLabel date;
    private javax.swing.JLabel hours;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
