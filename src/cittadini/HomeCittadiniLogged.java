/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cittadini;

/**
 *
 * @author riccardo
 */
public class HomeCittadiniLogged extends javax.swing.JFrame {

    /**
     * Creates new form HomeCittadiniLogged
     */
    public HomeCittadiniLogged() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHomeLogged_Cittadini = new javax.swing.JPanel();
        pnl_HomeCittadiniLogged = new javax.swing.JPanel();
        centriVaccinaliPnl_HomeCittadiniLogged = new javax.swing.JPanel();
        pnlSearchName_HomeCittadiniLogged = new javax.swing.JPanel();
        searchName_HomeCittadiniLogged = new javax.swing.JTextField();
        lblSearchName_HomeCittadiniLogged = new javax.swing.JLabel();
        pnlSearchComune_HomeCittadinoLogged = new javax.swing.JPanel();
        searchComune_HomeCittadiniLogged = new javax.swing.JTextField();
        cmbSearchType_HomeCittadiniLogged = new javax.swing.JComboBox<>();
        lblSearchComune_HomeCittadiniLogged = new javax.swing.JLabel();
        lblSearchType_HomeCittadiniLogged = new javax.swing.JLabel();
        scrollPnlInfo_HomeCittadiniLogged = new javax.swing.JScrollPane();
        infocentriList_HomeCittadini = new javax.swing.JList<>();
        pnlWelcome_HomeCittadiniLogged = new javax.swing.JPanel();
        btnEvents_HomeCittadiniLogged = new javax.swing.JButton();
        btnLogout_HomeCittadiniLogged = new javax.swing.JButton();
        lblWelcome_HomeCittadino = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlHomeLogged_Cittadini.setBackground(new java.awt.Color(255, 255, 255));

        pnl_HomeCittadiniLogged.setBackground(new java.awt.Color(255, 255, 255));
        pnl_HomeCittadiniLogged.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Centri Vaccinali", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        centriVaccinaliPnl_HomeCittadiniLogged.setBackground(new java.awt.Color(255, 255, 255));
        centriVaccinaliPnl_HomeCittadiniLogged.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ricerca Centro Vaccinale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        pnlSearchName_HomeCittadiniLogged.setBackground(new java.awt.Color(255, 255, 255));
        pnlSearchName_HomeCittadiniLogged.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ricerca per nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        lblSearchName_HomeCittadiniLogged.setBackground(new java.awt.Color(255, 255, 255));
        lblSearchName_HomeCittadiniLogged.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSearchName_HomeCittadiniLogged.setText("Nome Centro");

        javax.swing.GroupLayout pnlSearchName_HomeCittadiniLoggedLayout = new javax.swing.GroupLayout(pnlSearchName_HomeCittadiniLogged);
        pnlSearchName_HomeCittadiniLogged.setLayout(pnlSearchName_HomeCittadiniLoggedLayout);
        pnlSearchName_HomeCittadiniLoggedLayout.setHorizontalGroup(
            pnlSearchName_HomeCittadiniLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchName_HomeCittadiniLoggedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchName_HomeCittadiniLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchName_HomeCittadiniLogged)
                    .addGroup(pnlSearchName_HomeCittadiniLoggedLayout.createSequentialGroup()
                        .addComponent(lblSearchName_HomeCittadiniLogged)
                        .addGap(0, 133, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlSearchName_HomeCittadiniLoggedLayout.setVerticalGroup(
            pnlSearchName_HomeCittadiniLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchName_HomeCittadiniLoggedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSearchName_HomeCittadiniLogged)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchName_HomeCittadiniLogged, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSearchComune_HomeCittadinoLogged.setBackground(new java.awt.Color(255, 255, 255));
        pnlSearchComune_HomeCittadinoLogged.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ricerca Comune e Tipologia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        searchComune_HomeCittadiniLogged.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        cmbSearchType_HomeCittadiniLogged.setBackground(new java.awt.Color(255, 255, 255));
        cmbSearchType_HomeCittadiniLogged.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        cmbSearchType_HomeCittadiniLogged.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ospedaliero", "Aziendale", "Hub" }));

        lblSearchComune_HomeCittadiniLogged.setBackground(new java.awt.Color(255, 255, 255));
        lblSearchComune_HomeCittadiniLogged.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSearchComune_HomeCittadiniLogged.setText("Comune");

        lblSearchType_HomeCittadiniLogged.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSearchType_HomeCittadiniLogged.setText("Tipologia");

        javax.swing.GroupLayout pnlSearchComune_HomeCittadinoLoggedLayout = new javax.swing.GroupLayout(pnlSearchComune_HomeCittadinoLogged);
        pnlSearchComune_HomeCittadinoLogged.setLayout(pnlSearchComune_HomeCittadinoLoggedLayout);
        pnlSearchComune_HomeCittadinoLoggedLayout.setHorizontalGroup(
            pnlSearchComune_HomeCittadinoLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchComune_HomeCittadinoLoggedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchComune_HomeCittadinoLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchComune_HomeCittadiniLogged)
                    .addComponent(cmbSearchType_HomeCittadiniLogged, 0, 209, Short.MAX_VALUE)
                    .addGroup(pnlSearchComune_HomeCittadinoLoggedLayout.createSequentialGroup()
                        .addGroup(pnlSearchComune_HomeCittadinoLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSearchComune_HomeCittadiniLogged)
                            .addComponent(lblSearchType_HomeCittadiniLogged))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlSearchComune_HomeCittadinoLoggedLayout.setVerticalGroup(
            pnlSearchComune_HomeCittadinoLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchComune_HomeCittadinoLoggedLayout.createSequentialGroup()
                .addComponent(lblSearchComune_HomeCittadiniLogged, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchComune_HomeCittadiniLogged, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSearchType_HomeCittadiniLogged)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbSearchType_HomeCittadiniLogged, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout centriVaccinaliPnl_HomeCittadiniLoggedLayout = new javax.swing.GroupLayout(centriVaccinaliPnl_HomeCittadiniLogged);
        centriVaccinaliPnl_HomeCittadiniLogged.setLayout(centriVaccinaliPnl_HomeCittadiniLoggedLayout);
        centriVaccinaliPnl_HomeCittadiniLoggedLayout.setHorizontalGroup(
            centriVaccinaliPnl_HomeCittadiniLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centriVaccinaliPnl_HomeCittadiniLoggedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centriVaccinaliPnl_HomeCittadiniLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSearchName_HomeCittadiniLogged, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSearchComune_HomeCittadinoLogged, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        centriVaccinaliPnl_HomeCittadiniLoggedLayout.setVerticalGroup(
            centriVaccinaliPnl_HomeCittadiniLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centriVaccinaliPnl_HomeCittadiniLoggedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSearchName_HomeCittadiniLogged, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSearchComune_HomeCittadinoLogged, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        infocentriList_HomeCittadini.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        infocentriList_HomeCittadini.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPnlInfo_HomeCittadiniLogged.setViewportView(infocentriList_HomeCittadini);

        javax.swing.GroupLayout pnl_HomeCittadiniLoggedLayout = new javax.swing.GroupLayout(pnl_HomeCittadiniLogged);
        pnl_HomeCittadiniLogged.setLayout(pnl_HomeCittadiniLoggedLayout);
        pnl_HomeCittadiniLoggedLayout.setHorizontalGroup(
            pnl_HomeCittadiniLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_HomeCittadiniLoggedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPnlInfo_HomeCittadiniLogged)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(centriVaccinaliPnl_HomeCittadiniLogged, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_HomeCittadiniLoggedLayout.setVerticalGroup(
            pnl_HomeCittadiniLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_HomeCittadiniLoggedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_HomeCittadiniLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(centriVaccinaliPnl_HomeCittadiniLogged, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPnlInfo_HomeCittadiniLogged))
                .addContainerGap())
        );

        pnlWelcome_HomeCittadiniLogged.setBackground(new java.awt.Color(255, 255, 255));

        btnEvents_HomeCittadiniLogged.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEvents_HomeCittadiniLogged.setText("Registra Eventi Avversi");
        btnEvents_HomeCittadiniLogged.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEvents_HomeCittadiniLoggedMouseClicked(evt);
            }
        });

        btnLogout_HomeCittadiniLogged.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLogout_HomeCittadiniLogged.setText("Logout");

        lblWelcome_HomeCittadino.setBackground(new java.awt.Color(255, 255, 255));
        lblWelcome_HomeCittadino.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblWelcome_HomeCittadino.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWelcome_HomeCittadino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new_vaccinato.png"))); // NOI18N

        javax.swing.GroupLayout pnlWelcome_HomeCittadiniLoggedLayout = new javax.swing.GroupLayout(pnlWelcome_HomeCittadiniLogged);
        pnlWelcome_HomeCittadiniLogged.setLayout(pnlWelcome_HomeCittadiniLoggedLayout);
        pnlWelcome_HomeCittadiniLoggedLayout.setHorizontalGroup(
            pnlWelcome_HomeCittadiniLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcome_HomeCittadiniLoggedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome_HomeCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlWelcome_HomeCittadiniLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWelcome_HomeCittadiniLoggedLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnEvents_HomeCittadiniLogged))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWelcome_HomeCittadiniLoggedLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogout_HomeCittadiniLogged)))
                .addContainerGap())
        );
        pnlWelcome_HomeCittadiniLoggedLayout.setVerticalGroup(
            pnlWelcome_HomeCittadiniLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcome_HomeCittadiniLoggedLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlWelcome_HomeCittadiniLoggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWelcome_HomeCittadiniLoggedLayout.createSequentialGroup()
                        .addComponent(btnEvents_HomeCittadiniLogged)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogout_HomeCittadiniLogged)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblWelcome_HomeCittadino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlHomeLogged_CittadiniLayout = new javax.swing.GroupLayout(pnlHomeLogged_Cittadini);
        pnlHomeLogged_Cittadini.setLayout(pnlHomeLogged_CittadiniLayout);
        pnlHomeLogged_CittadiniLayout.setHorizontalGroup(
            pnlHomeLogged_CittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLogged_CittadiniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHomeLogged_CittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_HomeCittadiniLogged, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlWelcome_HomeCittadiniLogged, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlHomeLogged_CittadiniLayout.setVerticalGroup(
            pnlHomeLogged_CittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLogged_CittadiniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlWelcome_HomeCittadiniLogged, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(pnl_HomeCittadiniLogged, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlHomeLogged_Cittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlHomeLogged_Cittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEvents_HomeCittadiniLoggedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEvents_HomeCittadiniLoggedMouseClicked
        RegistraEventiAvversi regEvento = new RegistraEventiAvversi();
        regEvento.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEvents_HomeCittadiniLoggedMouseClicked

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
            java.util.logging.Logger.getLogger(HomeCittadiniLogged.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeCittadiniLogged.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeCittadiniLogged.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeCittadiniLogged.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeCittadiniLogged().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEvents_HomeCittadiniLogged;
    private javax.swing.JButton btnLogout_HomeCittadiniLogged;
    private javax.swing.JPanel centriVaccinaliPnl_HomeCittadiniLogged;
    private javax.swing.JComboBox<String> cmbSearchType_HomeCittadiniLogged;
    private javax.swing.JList<String> infocentriList_HomeCittadini;
    private javax.swing.JLabel lblSearchComune_HomeCittadiniLogged;
    private javax.swing.JLabel lblSearchName_HomeCittadiniLogged;
    private javax.swing.JLabel lblSearchType_HomeCittadiniLogged;
    private javax.swing.JLabel lblWelcome_HomeCittadino;
    private javax.swing.JPanel pnlHomeLogged_Cittadini;
    private javax.swing.JPanel pnlSearchComune_HomeCittadinoLogged;
    private javax.swing.JPanel pnlSearchName_HomeCittadiniLogged;
    private javax.swing.JPanel pnlWelcome_HomeCittadiniLogged;
    private javax.swing.JPanel pnl_HomeCittadiniLogged;
    private javax.swing.JScrollPane scrollPnlInfo_HomeCittadiniLogged;
    private javax.swing.JTextField searchComune_HomeCittadiniLogged;
    private javax.swing.JTextField searchName_HomeCittadiniLogged;
    // End of variables declaration//GEN-END:variables
}
