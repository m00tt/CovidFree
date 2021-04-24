/**
 * 
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */
package covidfree;

import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Locale;
import javax.swing.Timer;
import javax.swing.ImageIcon;

public class CovidFree extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public CovidFree() {
        initComponents();
        date();
        time();
    }
    
    //ShowDate
    public void date (){
        String txtDate = new SimpleDateFormat ("dd/MM/yyyy",Locale.ITALY).format(new Date());
        date.setText("Data:  " +txtDate);
    }
    //ShowTime
    public void time() {
        new Timer (0, new ActionListener() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Panel_covidfree.setBackground(new java.awt.Color(255, 255, 255));

        appTitle_covidfree.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        appTitle_covidfree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/app-logo.png"))); // NOI18N
        appTitle_covidfree.setText("Covid Free");

        cittadiniPnl_covidfree.setBackground(new java.awt.Color(255, 255, 255));
        cittadiniPnl_covidfree.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Cittadini ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        cittadiniBtn_covidfree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cittadini-logo.png"))); // NOI18N

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

        javax.swing.GroupLayout Panel_covidfreeLayout = new javax.swing.GroupLayout(Panel_covidfree);
        Panel_covidfree.setLayout(Panel_covidfreeLayout);
        Panel_covidfreeLayout.setHorizontalGroup(
            Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_covidfreeLayout.createSequentialGroup()
                .addGroup(Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(Panel_covidfreeLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(centrovacciniPnl_covidfree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cittadiniPnl_covidfree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_covidfreeLayout.createSequentialGroup()
                        .addComponent(appTitle_covidfree)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hours)
                            .addComponent(date))))
                .addGap(60, 60, 60))
        );
        Panel_covidfreeLayout.setVerticalGroup(
            Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_covidfreeLayout.createSequentialGroup()
                .addGroup(Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appTitle_covidfree, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_covidfreeLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hours)))
                .addGap(40, 40, 40)
                .addGroup(Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cittadiniPnl_covidfree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(centrovacciniPnl_covidfree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
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
            java.util.logging.Logger.getLogger(CovidFree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CovidFree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CovidFree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CovidFree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CovidFree().setVisible(true);
            }
        });
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
    // End of variables declaration//GEN-END:variables
}
