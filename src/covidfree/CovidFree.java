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
        centrivaccinaliPnl_covidfree = new javax.swing.JPanel();
        centrivaccinaliBtn_covidfree = new javax.swing.JButton();
        cittadiniPnl_covidfree = new javax.swing.JPanel();
        cittadiniBtn_covidfree = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        hours = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Covid Free");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new ImageIcon("icon.png").getImage());
        setMinimumSize(new java.awt.Dimension(600, 450));
        setPreferredSize(new java.awt.Dimension(600, 450));

        Panel_covidfree.setBackground(new java.awt.Color(255, 255, 255));

        appTitle_covidfree.setFont(new java.awt.Font("Teko SemiBold", 1, 36)); // NOI18N
        appTitle_covidfree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/app-logo.png"))); // NOI18N
        appTitle_covidfree.setText("Covid Free");

        centrivaccinaliPnl_covidfree.setBackground(new java.awt.Color(255, 255, 255));
        centrivaccinaliPnl_covidfree.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Centri Vaccinali", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        centrivaccinaliPnl_covidfree.setPreferredSize(new java.awt.Dimension(210, 200));

        centrivaccinaliBtn_covidfree.setBackground(new java.awt.Color(255, 255, 255));
        centrivaccinaliBtn_covidfree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centrivaccinali-logo.png"))); // NOI18N
        centrivaccinaliBtn_covidfree.setBorderPainted(false);

        javax.swing.GroupLayout centrivaccinaliPnl_covidfreeLayout = new javax.swing.GroupLayout(centrivaccinaliPnl_covidfree);
        centrivaccinaliPnl_covidfree.setLayout(centrivaccinaliPnl_covidfreeLayout);
        centrivaccinaliPnl_covidfreeLayout.setHorizontalGroup(
            centrivaccinaliPnl_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(centrivaccinaliBtn_covidfree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        centrivaccinaliPnl_covidfreeLayout.setVerticalGroup(
            centrivaccinaliPnl_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(centrivaccinaliBtn_covidfree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cittadiniPnl_covidfree.setBackground(new java.awt.Color(255, 255, 255));
        cittadiniPnl_covidfree.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cittadini", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        cittadiniPnl_covidfree.setPreferredSize(new java.awt.Dimension(210, 200));
        cittadiniPnl_covidfree.setVerifyInputWhenFocusTarget(false);

        cittadiniBtn_covidfree.setBackground(new java.awt.Color(255, 255, 255));
        cittadiniBtn_covidfree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cittadini-logo.png"))); // NOI18N
        cittadiniBtn_covidfree.setBorderPainted(false);

        javax.swing.GroupLayout cittadiniPnl_covidfreeLayout = new javax.swing.GroupLayout(cittadiniPnl_covidfree);
        cittadiniPnl_covidfree.setLayout(cittadiniPnl_covidfreeLayout);
        cittadiniPnl_covidfreeLayout.setHorizontalGroup(
            cittadiniPnl_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cittadiniBtn_covidfree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cittadiniPnl_covidfreeLayout.setVerticalGroup(
            cittadiniPnl_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cittadiniBtn_covidfree, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        date.setText("DATA");

        hours.setBackground(new java.awt.Color(255, 255, 255));
        hours.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        hours.setText("ORA");

        javax.swing.GroupLayout Panel_covidfreeLayout = new javax.swing.GroupLayout(Panel_covidfree);
        Panel_covidfree.setLayout(Panel_covidfreeLayout);
        Panel_covidfreeLayout.setHorizontalGroup(
            Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_covidfreeLayout.createSequentialGroup()
                .addComponent(appTitle_covidfree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(166, 166, 166)
                .addGroup(Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_covidfreeLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(hours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(Panel_covidfreeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(centrivaccinaliPnl_covidfree, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cittadiniPnl_covidfree, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        Panel_covidfreeLayout.setVerticalGroup(
            Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_covidfreeLayout.createSequentialGroup()
                .addGroup(Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_covidfreeLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_covidfreeLayout.createSequentialGroup()
                                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_covidfreeLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(hours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(48, 48, 48))
                    .addGroup(Panel_covidfreeLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(appTitle_covidfree, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Panel_covidfreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(centrivaccinaliPnl_covidfree, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(cittadiniPnl_covidfree, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addGap(45, 45, 45))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
    private javax.swing.JButton centrivaccinaliBtn_covidfree;
    private javax.swing.JPanel centrivaccinaliPnl_covidfree;
    private javax.swing.JButton cittadiniBtn_covidfree;
    private javax.swing.JPanel cittadiniPnl_covidfree;
    private javax.swing.JLabel date;
    private javax.swing.JLabel hours;
    // End of variables declaration//GEN-END:variables
}
