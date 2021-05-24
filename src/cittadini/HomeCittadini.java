/**
 * 
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */

package cittadini;

import centrivaccinali.CentriVaccinali;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DefaultListModel;

import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListModel;
import static utils.GeneralFunctions.getCentriVaccinaliList;


public class HomeCittadini extends javax.swing.JFrame {

    public HomeCittadini() {
        initComponents();
        fillCentriVaccinali();
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
        pnl_HomeCittadini = new javax.swing.JPanel();
        centriVaccinaliPnl_HomeCittadini = new javax.swing.JPanel();
        pnlSearchName_HomeCittadini = new javax.swing.JPanel();
        searchName_HomeCittadini = new javax.swing.JTextField();
        lblSearchName_HomeCittadini = new javax.swing.JLabel();
        pnlSearchComune_HomeCittadino = new javax.swing.JPanel();
        searchComune_HomeCittadini = new javax.swing.JTextField();
        cmbSearchType_HomeCittadino = new javax.swing.JComboBox<>();
        lblSearchComune_HomeCittadino = new javax.swing.JLabel();
        lblSearchType_HomeCittadino = new javax.swing.JLabel();
        scrollPnlInfo_HomeCittadini = new javax.swing.JScrollPane();
        infocentriList_HomeCittadini = new javax.swing.JList<>();
        back_HomeCittadini = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Cittadini");
        setIconImage(new ImageIcon("icon.png").getImage());
        setName("frame_HomeCittadini"); // NOI18N

        Panel_HomeCittadini.setBackground(new java.awt.Color(255, 255, 255));

        title_HomeCittadini.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        title_HomeCittadini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new_vaccinato.png"))); // NOI18N
        title_HomeCittadini.setText("Home Cittadini");

        loginBtn_HomeCittadini.setText("Accedi");
        loginBtn_HomeCittadini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtn_HomeCittadiniMouseClicked(evt);
            }
        });

        registerBtn_HomeCittadini.setText("Registrati");
        registerBtn_HomeCittadini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerBtn_HomeCittadiniMouseClicked(evt);
            }
        });

        pnl_HomeCittadini.setBackground(new java.awt.Color(255, 255, 255));
        pnl_HomeCittadini.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Centri Vaccinali", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        centriVaccinaliPnl_HomeCittadini.setBackground(new java.awt.Color(255, 255, 255));
        centriVaccinaliPnl_HomeCittadini.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ricerca Centro Vaccinale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        pnlSearchName_HomeCittadini.setBackground(new java.awt.Color(255, 255, 255));
        pnlSearchName_HomeCittadini.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ricerca per nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        lblSearchName_HomeCittadini.setBackground(new java.awt.Color(255, 255, 255));
        lblSearchName_HomeCittadini.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSearchName_HomeCittadini.setText("Nome Centro");

        javax.swing.GroupLayout pnlSearchName_HomeCittadiniLayout = new javax.swing.GroupLayout(pnlSearchName_HomeCittadini);
        pnlSearchName_HomeCittadini.setLayout(pnlSearchName_HomeCittadiniLayout);
        pnlSearchName_HomeCittadiniLayout.setHorizontalGroup(
            pnlSearchName_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchName_HomeCittadiniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchName_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchName_HomeCittadini)
                    .addGroup(pnlSearchName_HomeCittadiniLayout.createSequentialGroup()
                        .addComponent(lblSearchName_HomeCittadini)
                        .addGap(0, 133, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlSearchName_HomeCittadiniLayout.setVerticalGroup(
            pnlSearchName_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchName_HomeCittadiniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSearchName_HomeCittadini)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchName_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSearchComune_HomeCittadino.setBackground(new java.awt.Color(255, 255, 255));
        pnlSearchComune_HomeCittadino.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ricerca Comune e Tipologia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        searchComune_HomeCittadini.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        cmbSearchType_HomeCittadino.setBackground(new java.awt.Color(255, 255, 255));
        cmbSearchType_HomeCittadino.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        cmbSearchType_HomeCittadino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ospedaliero", "Aziendale", "Hub" }));

        lblSearchComune_HomeCittadino.setBackground(new java.awt.Color(255, 255, 255));
        lblSearchComune_HomeCittadino.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSearchComune_HomeCittadino.setText("Comune");

        lblSearchType_HomeCittadino.setText("Tipologia");

        javax.swing.GroupLayout pnlSearchComune_HomeCittadinoLayout = new javax.swing.GroupLayout(pnlSearchComune_HomeCittadino);
        pnlSearchComune_HomeCittadino.setLayout(pnlSearchComune_HomeCittadinoLayout);
        pnlSearchComune_HomeCittadinoLayout.setHorizontalGroup(
            pnlSearchComune_HomeCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchComune_HomeCittadinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchComune_HomeCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchComune_HomeCittadini)
                    .addGroup(pnlSearchComune_HomeCittadinoLayout.createSequentialGroup()
                        .addGroup(pnlSearchComune_HomeCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSearchComune_HomeCittadino)
                            .addComponent(lblSearchType_HomeCittadino))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbSearchType_HomeCittadino, 0, 209, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlSearchComune_HomeCittadinoLayout.setVerticalGroup(
            pnlSearchComune_HomeCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchComune_HomeCittadinoLayout.createSequentialGroup()
                .addComponent(lblSearchComune_HomeCittadino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchComune_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSearchType_HomeCittadino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbSearchType_HomeCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout centriVaccinaliPnl_HomeCittadiniLayout = new javax.swing.GroupLayout(centriVaccinaliPnl_HomeCittadini);
        centriVaccinaliPnl_HomeCittadini.setLayout(centriVaccinaliPnl_HomeCittadiniLayout);
        centriVaccinaliPnl_HomeCittadiniLayout.setHorizontalGroup(
            centriVaccinaliPnl_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centriVaccinaliPnl_HomeCittadiniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centriVaccinaliPnl_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSearchComune_HomeCittadino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSearchName_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        centriVaccinaliPnl_HomeCittadiniLayout.setVerticalGroup(
            centriVaccinaliPnl_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centriVaccinaliPnl_HomeCittadiniLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlSearchName_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlSearchComune_HomeCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        infocentriList_HomeCittadini.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        infocentriList_HomeCittadini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infocentriList_HomeCittadiniMouseClicked(evt);
            }
        });
        scrollPnlInfo_HomeCittadini.setViewportView(infocentriList_HomeCittadini);

        javax.swing.GroupLayout pnl_HomeCittadiniLayout = new javax.swing.GroupLayout(pnl_HomeCittadini);
        pnl_HomeCittadini.setLayout(pnl_HomeCittadiniLayout);
        pnl_HomeCittadiniLayout.setHorizontalGroup(
            pnl_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_HomeCittadiniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPnlInfo_HomeCittadini)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(centriVaccinaliPnl_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_HomeCittadiniLayout.setVerticalGroup(
            pnl_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_HomeCittadiniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(centriVaccinaliPnl_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPnlInfo_HomeCittadini))
                .addContainerGap())
        );

        back_HomeCittadini.setBackground(new java.awt.Color(255, 255, 255));
        back_HomeCittadini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        back_HomeCittadini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_HomeCittadiniMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_HomeCittadiniLayout = new javax.swing.GroupLayout(Panel_HomeCittadini);
        Panel_HomeCittadini.setLayout(Panel_HomeCittadiniLayout);
        Panel_HomeCittadiniLayout.setHorizontalGroup(
            Panel_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_HomeCittadiniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Panel_HomeCittadiniLayout.createSequentialGroup()
                        .addComponent(title_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registerBtn_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginBtn_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Panel_HomeCittadiniLayout.createSequentialGroup()
                .addComponent(back_HomeCittadini)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Panel_HomeCittadiniLayout.setVerticalGroup(
            Panel_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_HomeCittadiniLayout.createSequentialGroup()
                .addComponent(back_HomeCittadini)
                .addGap(0, 0, 0)
                .addGroup(Panel_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_HomeCittadiniLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(loginBtn_HomeCittadini)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerBtn_HomeCittadini))
                    .addComponent(title_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
       LoginCittadino login = new LoginCittadino();
       login.setVisible(true);
       this.setVisible(false);
        
    }//GEN-LAST:event_loginBtn_HomeCittadiniMouseClicked

    private void back_HomeCittadiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_HomeCittadiniMouseClicked
        CentriVaccinali centrivaccinali = new CentriVaccinali();
        centrivaccinali.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back_HomeCittadiniMouseClicked

    private void registerBtn_HomeCittadiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtn_HomeCittadiniMouseClicked
        RegistraCittadini reg = new RegistraCittadini();
        reg.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_registerBtn_HomeCittadiniMouseClicked

    private void infocentriList_HomeCittadiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infocentriList_HomeCittadiniMouseClicked
        JList list = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            VisualizzaCentriVaccinali visualizzacentro = new VisualizzaCentriVaccinali();
            visualizzacentro.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_infocentriList_HomeCittadiniMouseClicked

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
    
    
    
    //Recupera la lista di centri vaccinali registrati
    private void fillCentriVaccinali(){
        List<String> centriVaccinali = getCentriVaccinaliList();
        //infocentriList_HomeCittadini.setModel(((ListModel) centriVaccinali));
        
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < centriVaccinali.size(); i++)
        {
            listModel.addElement(centriVaccinali.get(i));
        }
        infocentriList_HomeCittadini.setModel(listModel);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_HomeCittadini;
    private javax.swing.JButton back_HomeCittadini;
    private javax.swing.JPanel centriVaccinaliPnl_HomeCittadini;
    private javax.swing.JComboBox<String> cmbSearchType_HomeCittadino;
    private javax.swing.JList<String> infocentriList_HomeCittadini;
    private javax.swing.JLabel lblSearchComune_HomeCittadino;
    private javax.swing.JLabel lblSearchName_HomeCittadini;
    private javax.swing.JLabel lblSearchType_HomeCittadino;
    private javax.swing.JButton loginBtn_HomeCittadini;
    private javax.swing.JPanel pnlSearchComune_HomeCittadino;
    private javax.swing.JPanel pnlSearchName_HomeCittadini;
    private javax.swing.JPanel pnl_HomeCittadini;
    private javax.swing.JButton registerBtn_HomeCittadini;
    private javax.swing.JScrollPane scrollPnlInfo_HomeCittadini;
    private javax.swing.JTextField searchComune_HomeCittadini;
    private javax.swing.JTextField searchName_HomeCittadini;
    private javax.swing.JLabel title_HomeCittadini;
    // End of variables declaration//GEN-END:variables
}
