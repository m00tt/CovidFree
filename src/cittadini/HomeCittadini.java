/**
 * 
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */

package cittadini;

import centrivaccinali.CentriVaccinali;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import static utils.GeneralFunctions.LOGODIR;
import static javax.swing.JOptionPane.showMessageDialog;
import static utils.GeneralFunctions.CENTRIVACCINALIDIR;
import static utils.GeneralFunctions.DATASEPARATOR;
import static utils.GeneralFunctions.checkDirHierarchy;
import static utils.GeneralFunctions.getCentriVaccinaliList;


public class HomeCittadini extends javax.swing.JFrame {

    /**
     *
     */
    public HomeCittadini() {
        initComponents();
        fillCentriVaccinali(getCentriVaccinaliList());
        this.setLocationRelativeTo(null);
        checkTargetSearch();
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
        pnlSearchComune_HomeCittadino = new javax.swing.JPanel();
        search_HomeCittadini = new javax.swing.JTextField();
        cmbSearchType_HomeCittadino = new javax.swing.JComboBox<>();
        lblSearch_HomeCittadino = new javax.swing.JLabel();
        lblSearchType_HomeCittadino = new javax.swing.JLabel();
        targetSearch_HomeCittadini = new javax.swing.JComboBox<>();
        scrollPnlInfo_HomeCittadini = new javax.swing.JScrollPane();
        infocentriList_HomeCittadini = new javax.swing.JList<>();
        back_HomeCittadini = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CovidFree - Home Cittadini");
        setIconImage(new ImageIcon(LOGODIR).getImage());
        setName("frame_HomeCittadini"); // NOI18N
        setResizable(false);

        Panel_HomeCittadini.setBackground(new java.awt.Color(255, 255, 255));

        title_HomeCittadini.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        title_HomeCittadini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new_vaccinato.png"))); // NOI18N
        title_HomeCittadini.setText("Home Cittadini");

        loginBtn_HomeCittadini.setText("Registra Evento");
        loginBtn_HomeCittadini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn_HomeCittadiniActionPerformed(evt);
            }
        });

        registerBtn_HomeCittadini.setText("Iscriviti");
        registerBtn_HomeCittadini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtn_HomeCittadiniActionPerformed(evt);
            }
        });

        pnl_HomeCittadini.setBackground(new java.awt.Color(255, 255, 255));
        pnl_HomeCittadini.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Centri Vaccinali", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        centriVaccinaliPnl_HomeCittadini.setBackground(new java.awt.Color(255, 255, 255));
        centriVaccinaliPnl_HomeCittadini.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ricerca Centro Vaccinale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        pnlSearchComune_HomeCittadino.setBackground(new java.awt.Color(255, 255, 255));
        pnlSearchComune_HomeCittadino.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ricerca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        search_HomeCittadini.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        search_HomeCittadini.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        search_HomeCittadini.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_HomeCittadiniKeyPressed(evt);
            }
        });

        cmbSearchType_HomeCittadino.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        cmbSearchType_HomeCittadino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Qualsiasi", "Ospedaliero", "Aziendale", "Hub" }));
        cmbSearchType_HomeCittadino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSearchType_HomeCittadinoItemStateChanged(evt);
            }
        });

        lblSearch_HomeCittadino.setBackground(new java.awt.Color(255, 255, 255));
        lblSearch_HomeCittadino.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSearch_HomeCittadino.setText("Nome Centro Vaccinale");

        lblSearchType_HomeCittadino.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSearchType_HomeCittadino.setText("Tipologia");

        javax.swing.GroupLayout pnlSearchComune_HomeCittadinoLayout = new javax.swing.GroupLayout(pnlSearchComune_HomeCittadino);
        pnlSearchComune_HomeCittadino.setLayout(pnlSearchComune_HomeCittadinoLayout);
        pnlSearchComune_HomeCittadinoLayout.setHorizontalGroup(
            pnlSearchComune_HomeCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchComune_HomeCittadinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchComune_HomeCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbSearchType_HomeCittadino, 0, 209, Short.MAX_VALUE)
                    .addComponent(search_HomeCittadini)
                    .addGroup(pnlSearchComune_HomeCittadinoLayout.createSequentialGroup()
                        .addGroup(pnlSearchComune_HomeCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSearch_HomeCittadino)
                            .addComponent(lblSearchType_HomeCittadino))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlSearchComune_HomeCittadinoLayout.setVerticalGroup(
            pnlSearchComune_HomeCittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchComune_HomeCittadinoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblSearch_HomeCittadino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSearchType_HomeCittadino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbSearchType_HomeCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        targetSearch_HomeCittadini.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ricerca per nome", "Ricerca per comune e tipo" }));
        targetSearch_HomeCittadini.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                targetSearch_HomeCittadiniItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout centriVaccinaliPnl_HomeCittadiniLayout = new javax.swing.GroupLayout(centriVaccinaliPnl_HomeCittadini);
        centriVaccinaliPnl_HomeCittadini.setLayout(centriVaccinaliPnl_HomeCittadiniLayout);
        centriVaccinaliPnl_HomeCittadiniLayout.setHorizontalGroup(
            centriVaccinaliPnl_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centriVaccinaliPnl_HomeCittadiniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centriVaccinaliPnl_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSearchComune_HomeCittadino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(targetSearch_HomeCittadini, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        centriVaccinaliPnl_HomeCittadiniLayout.setVerticalGroup(
            centriVaccinaliPnl_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centriVaccinaliPnl_HomeCittadiniLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(targetSearch_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlSearchComune_HomeCittadino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addComponent(scrollPnlInfo_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(centriVaccinaliPnl_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_HomeCittadiniLayout.setVerticalGroup(
            pnl_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_HomeCittadiniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(centriVaccinaliPnl_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPnlInfo_HomeCittadini))
                .addContainerGap())
        );

        back_HomeCittadini.setBackground(new java.awt.Color(255, 255, 255));
        back_HomeCittadini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        back_HomeCittadini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_HomeCittadiniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_HomeCittadiniLayout = new javax.swing.GroupLayout(Panel_HomeCittadini);
        Panel_HomeCittadini.setLayout(Panel_HomeCittadiniLayout);
        Panel_HomeCittadiniLayout.setHorizontalGroup(
            Panel_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_HomeCittadiniLayout.createSequentialGroup()
                .addGroup(Panel_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_HomeCittadiniLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnl_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(Panel_HomeCittadiniLayout.createSequentialGroup()
                        .addComponent(back_HomeCittadini)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(title_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registerBtn_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginBtn_HomeCittadini))
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        Panel_HomeCittadiniLayout.setVerticalGroup(
            Panel_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_HomeCittadiniLayout.createSequentialGroup()
                .addGroup(Panel_HomeCittadiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(back_HomeCittadini)
                    .addGroup(Panel_HomeCittadiniLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(title_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_HomeCittadiniLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(loginBtn_HomeCittadini, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registerBtn_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20)
                .addComponent(pnl_HomeCittadini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void infocentriList_HomeCittadiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infocentriList_HomeCittadiniMouseClicked
        JList list = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            String s = (String) list.getSelectedValue();
            VisualizzaCentriVaccinali visualizzacentro = new VisualizzaCentriVaccinali(s);
            visualizzacentro.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_infocentriList_HomeCittadiniMouseClicked

    private void cmbSearchType_HomeCittadinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSearchType_HomeCittadinoItemStateChanged
        cercaCentroVaccinale();
    }//GEN-LAST:event_cmbSearchType_HomeCittadinoItemStateChanged

    private void search_HomeCittadiniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_HomeCittadiniKeyPressed
        cercaCentroVaccinale();
    }//GEN-LAST:event_search_HomeCittadiniKeyPressed

    private void targetSearch_HomeCittadiniItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_targetSearch_HomeCittadiniItemStateChanged
        checkTargetSearch();
    }//GEN-LAST:event_targetSearch_HomeCittadiniItemStateChanged

    private void loginBtn_HomeCittadiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtn_HomeCittadiniActionPerformed
        LoginCittadino login = new LoginCittadino();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginBtn_HomeCittadiniActionPerformed

    private void registerBtn_HomeCittadiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtn_HomeCittadiniActionPerformed
        RegistraCittadini reg = new RegistraCittadini();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registerBtn_HomeCittadiniActionPerformed

    private void back_HomeCittadiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_HomeCittadiniActionPerformed
        CentriVaccinali centrivaccinali = new CentriVaccinali();
        centrivaccinali.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back_HomeCittadiniActionPerformed

    /**
     *
     */
    public void cercaCentroVaccinale()
    {
      String thisLine;
      String search = search_HomeCittadini.getText();
      String type = cmbSearchType_HomeCittadino.getSelectedItem().toString();
      //boolean check = false;
      List <String> list = new ArrayList();
      if(!checkDirHierarchy()){
            showMessageDialog(null, "I database risultano corrotti.\nI dati sono stati ripristinati.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("icon.png"));
        }
        try {
                BufferedReader br = new BufferedReader(new FileReader(CENTRIVACCINALIDIR + File.separator + "CentriVaccinali.dati"));
                while ((thisLine = br.readLine()) != null) {
                    String[] tmp = thisLine.split(DATASEPARATOR);
                    if(targetSearch_HomeCittadini.getSelectedIndex() == 0){
                        if(tmp[0].toLowerCase().contains(search.toLowerCase()) && search.length()>0){
                            list.add(tmp[0]);
                        }
                        
                    }
                    else{
                        if(tmp[6].toLowerCase().contains(search.toLowerCase())){
                            if(type.equals("Qualsiasi")){
                                list.add(tmp[0]);
                            }
                            else if(type.equals(tmp[1])){
                                list.add(tmp[0]);
                            }
                        }
                    }                 
                 
                }
                if(targetSearch_HomeCittadini.getSelectedIndex() == 0){
                    if (search.equals("")){
                        fillCentriVaccinali(getCentriVaccinaliList());
                    }else{
                        fillCentriVaccinali(list);
                    }
                }else{
                    if (search.equals("") && type.equalsIgnoreCase("Qualsiasi")){
                        fillCentriVaccinali(getCentriVaccinaliList());
                    }else{
                        fillCentriVaccinali(list);
                    }
                }
  
                
            } catch(IOException e) {
                showMessageDialog(null, "Errore di lettura del database, riprova.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("icon.png"));
            }  
    }
    
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
    private void fillCentriVaccinali(List<String> centriVaccinali){
        
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < centriVaccinali.size(); i++)
        {
            listModel.addElement(centriVaccinali.get(i));
        }
        infocentriList_HomeCittadini.setModel(listModel);
        
    }
    
    private void checkTargetSearch(){
        if(targetSearch_HomeCittadini.getSelectedIndex() == 0){
            lblSearch_HomeCittadino.setText("Nome Centro Vaccinale");
            lblSearchType_HomeCittadino.setVisible(false);
            cmbSearchType_HomeCittadino.setVisible(false);
        }else{
            lblSearch_HomeCittadino.setText("Comune");
            lblSearchType_HomeCittadino.setVisible(true);
            cmbSearchType_HomeCittadino.setVisible(true);         
        }
        search_HomeCittadini.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_HomeCittadini;
    private javax.swing.JButton back_HomeCittadini;
    private javax.swing.JPanel centriVaccinaliPnl_HomeCittadini;
    private javax.swing.JComboBox<String> cmbSearchType_HomeCittadino;
    private javax.swing.JList<String> infocentriList_HomeCittadini;
    private javax.swing.JLabel lblSearchType_HomeCittadino;
    private javax.swing.JLabel lblSearch_HomeCittadino;
    private javax.swing.JButton loginBtn_HomeCittadini;
    private javax.swing.JPanel pnlSearchComune_HomeCittadino;
    private javax.swing.JPanel pnl_HomeCittadini;
    private javax.swing.JButton registerBtn_HomeCittadini;
    private javax.swing.JScrollPane scrollPnlInfo_HomeCittadini;
    private javax.swing.JTextField search_HomeCittadini;
    private javax.swing.JComboBox<String> targetSearch_HomeCittadini;
    private javax.swing.JLabel title_HomeCittadini;
    // End of variables declaration//GEN-END:variables
}
