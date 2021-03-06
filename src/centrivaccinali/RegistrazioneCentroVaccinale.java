/**
 * 
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */

package centrivaccinali;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static utils.GeneralFunctions.CENTRIVACCINALIDIR;
import static utils.GeneralFunctions.DATASEPARATOR;
import static utils.GeneralFunctions.checkCAP;
import static utils.GeneralFunctions.checkCivico;
import static utils.GeneralFunctions.checkCompiled;
import static utils.GeneralFunctions.checkProvincia;
import static utils.GeneralFunctions.checkDirHierarchy;
import static utils.GeneralFunctions.LOGODIR;

/**
 *  La classe <b>RegistrazioneCentroVaccinale</b> è utilizzata al fine di fornire una GUI con la quale poter effettuare la registrazione a sistema di un nuovo Centro Vaccinale.
 *  @author Andrea Mottini 742605 VA
 *  @author Riccardo Bianchi 736701 VA
 */
public class RegistrazioneCentroVaccinale extends javax.swing.JFrame {

    /**
     * Costruttore della classe <b>RegistrazioneCentroVaccinale</b>
     * Tale costruttore permette di inizializzare i componenti grafici che compongono la classe e impostare la visulizzazione dell'applicazione al centro dello schermo.
     */
    public RegistrazioneCentroVaccinale() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    /**
     * La funzione <b>registraCentroVaccinale</b> è utilizzata al fine di recuperare i dati inseriti dall'utente e salvarli in un file esterno.<br>Viene effettuato un controllo che impedisce l'inserimento di centri vaccinali con lo stesso nominativo.<br>La classe usufruisce dei seguenti metodi importati per effettuare dei controlli sulla correttezza dei dati inseriti:
     * @see utils.GeneralFunctions#checkCompiled
     * @see utils.GeneralFunctions#checkCivico
     * @see utils.GeneralFunctions#checkProvincia
     * @see utils.GeneralFunctions#checkCAP
     * @see utils.GeneralFunctions#checkDirHierarchy
     */
    private void registraCentroVaccinale(){        
        String nomeCentroVaccinale = name_RegistrazioneCentroVaccinale.getText().strip();
        String tipologiaCentroVaccinale = tipologia_RegistrazioneCentroVaccinale.getSelectedItem().toString();
        String qualificatoreCentroVaccinale = qualificatore_RegistrazioneCentroVaccinale.getSelectedItem().toString();
        String indirizzoCentroVaccinale = via_RegistrazioneCentroVaccinale.getText().strip();
        String civicoCentroVaccinale = n_RegistrazioneCentroVaccinale.getText().strip();
        String provinciaCentroVaccinale = prov_RegistrazioneCentroVaccinale.getText().strip();
        String comuneCentroVaccinale = comune_RegistrazioneCentroVaccinale.getText().strip();
        String capCentroVaccinale= cap_RegistrazioneCentroVaccinale.getText().strip();
      
        
        if(checkCompiled(nomeCentroVaccinale) && checkCompiled(indirizzoCentroVaccinale) && checkCivico(civicoCentroVaccinale) && checkProvincia(provinciaCentroVaccinale) && checkCompiled(comuneCentroVaccinale) && checkCAP(capCentroVaccinale)){
            String insert = nomeCentroVaccinale + DATASEPARATOR + tipologiaCentroVaccinale + DATASEPARATOR + qualificatoreCentroVaccinale + DATASEPARATOR + indirizzoCentroVaccinale + DATASEPARATOR + civicoCentroVaccinale + DATASEPARATOR + provinciaCentroVaccinale + DATASEPARATOR + comuneCentroVaccinale + DATASEPARATOR + capCentroVaccinale;
            String path = CENTRIVACCINALIDIR + File.separator + "CentriVaccinali.dati";
            if(!checkDirHierarchy()){
                showMessageDialog(null, "I database risultano corrotti.\nI dati sono stati ripristinati.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
            }
            
            try{
                BufferedReader br = new BufferedReader(new FileReader(path));  
                String thisLine;
                boolean ok = true;
                while ((thisLine = br.readLine()) != null) {
                    String[] spThisLine = thisLine.split(DATASEPARATOR);
                    String toTest = spThisLine[0].toLowerCase();
                    String lcNomeCentro = nomeCentroVaccinale.toLowerCase();
                    if(toTest.equals(lcNomeCentro)){
                        ok = false;
                    }
                }
                
                if(ok)
                {
                    try (FileWriter fw2 = new FileWriter(path, true)) {
                        fw2.append(insert+"\n");
                        showMessageDialog(null, "Centro vaccinale aggiunto con successo!", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
                    }catch(HeadlessException | IOException e){
                        showMessageDialog(null, "Errore in fase di scrittura dei dati, riprova.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
                    }

                    HomeCentriVaccinali homeCentriVaccinali = new HomeCentriVaccinali();
                    homeCentriVaccinali.setVisible(true);
                    this.setVisible(false); 
                }
                else{
                    showMessageDialog(null, "Il centro vaccinale con nome "+nomeCentroVaccinale+" è già registrato nel database.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
                }
                
            }catch(Exception e){
                showMessageDialog(null, "Errore in fase di scrittura dei dati, riprova.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
            }
                     
        }
    }
    

    /**
     * Il metodo <b>initComponents</b> è utilizzato per istanziare tutti gli oggetti grafici all'interno del JFrame.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_RegistrazioneCentroVaccinale = new javax.swing.JPanel();
        title_RegistrazioneCentroVaccinale = new javax.swing.JLabel();
        datiPnl_RegistrazioneCentroVaccinale = new javax.swing.JPanel();
        name_RegistrazioneCentroVaccinale = new javax.swing.JTextField();
        qualificatore_RegistrazioneCentroVaccinale = new javax.swing.JComboBox<>();
        via_RegistrazioneCentroVaccinale = new javax.swing.JTextField();
        n_RegistrazioneCentroVaccinale = new javax.swing.JTextField();
        tipologia_RegistrazioneCentroVaccinale = new javax.swing.JComboBox<>();
        comune_RegistrazioneCentroVaccinale = new javax.swing.JTextField();
        prov_RegistrazioneCentroVaccinale = new javax.swing.JTextField();
        cap_RegistrazioneCentroVaccinale = new javax.swing.JTextField();
        centroVaccinaleLbl_RegistrazioneCentroVaccinale = new javax.swing.JLabel();
        tipologiaLbl_RegistrazioneCentroVaccinale = new javax.swing.JLabel();
        qualificLbl_RegistrazioneCentroVaccinale = new javax.swing.JLabel();
        indirizzoLbl_RegistrazioneCentroVaccinale = new javax.swing.JLabel();
        civicoLbl_RegistrazioneCentroVaccinale = new javax.swing.JLabel();
        comuneLbl_RegistrazioneCentroVaccinale = new javax.swing.JLabel();
        provLbl_RegistrazioneCentroVaccinale = new javax.swing.JLabel();
        capLbl_RegistrazioneCentroVaccinale = new javax.swing.JLabel();
        ann_RegistrazioneCentroVaccinale = new javax.swing.JButton();
        add_RegistrazioneCentroVaccinale = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registra Centro Vaccinale");
        setIconImage(new ImageIcon(LOGODIR).getImage());
        setName("frame_RegistrazioneCentroVaccinale"); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);

        Panel_RegistrazioneCentroVaccinale.setBackground(new java.awt.Color(255, 255, 255));

        title_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        title_RegistrazioneCentroVaccinale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_RegistrazioneCentroVaccinale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centrivaccinali-logo.png"))); // NOI18N
        title_RegistrazioneCentroVaccinale.setText("Registra Centro Vaccinale");

        datiPnl_RegistrazioneCentroVaccinale.setBackground(new java.awt.Color(255, 255, 255));
        datiPnl_RegistrazioneCentroVaccinale.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Inserisci i dati ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        datiPnl_RegistrazioneCentroVaccinale.setToolTipText("");

        name_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        name_RegistrazioneCentroVaccinale.setText("Da 3 a 40 caratteri...");
        name_RegistrazioneCentroVaccinale.setToolTipText("");
        name_RegistrazioneCentroVaccinale.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        name_RegistrazioneCentroVaccinale.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                name_RegistrazioneCentroVaccinaleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                name_RegistrazioneCentroVaccinaleFocusLost(evt);
            }
        });

        qualificatore_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        qualificatore_RegistrazioneCentroVaccinale.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Via", "Viale", "Piazza" }));

        via_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        via_RegistrazioneCentroVaccinale.setText("Da 3 a 40 caratteri...");
        via_RegistrazioneCentroVaccinale.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        via_RegistrazioneCentroVaccinale.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                via_RegistrazioneCentroVaccinaleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                via_RegistrazioneCentroVaccinaleFocusLost(evt);
            }
        });

        n_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        n_RegistrazioneCentroVaccinale.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tipologia_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        tipologia_RegistrazioneCentroVaccinale.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ospedaliero", "Aziendale", "Hub" }));

        comune_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        comune_RegistrazioneCentroVaccinale.setText("Da 3 a 40 caratteri...");
        comune_RegistrazioneCentroVaccinale.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        comune_RegistrazioneCentroVaccinale.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comune_RegistrazioneCentroVaccinaleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                comune_RegistrazioneCentroVaccinaleFocusLost(evt);
            }
        });

        prov_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        prov_RegistrazioneCentroVaccinale.setText("Sigla");
        prov_RegistrazioneCentroVaccinale.setToolTipText("");
        prov_RegistrazioneCentroVaccinale.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        prov_RegistrazioneCentroVaccinale.setPreferredSize(new java.awt.Dimension(32, 30));
        prov_RegistrazioneCentroVaccinale.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                prov_RegistrazioneCentroVaccinaleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                prov_RegistrazioneCentroVaccinaleFocusLost(evt);
            }
        });

        cap_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        cap_RegistrazioneCentroVaccinale.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        centroVaccinaleLbl_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        centroVaccinaleLbl_RegistrazioneCentroVaccinale.setText("Nome Centro Vaccinale");

        tipologiaLbl_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        tipologiaLbl_RegistrazioneCentroVaccinale.setText("Tipologia");

        qualificLbl_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        qualificLbl_RegistrazioneCentroVaccinale.setText("Qualific.");

        indirizzoLbl_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        indirizzoLbl_RegistrazioneCentroVaccinale.setText("Indirizzo");

        civicoLbl_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        civicoLbl_RegistrazioneCentroVaccinale.setText("Civico");

        comuneLbl_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        comuneLbl_RegistrazioneCentroVaccinale.setText("Comune");

        provLbl_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        provLbl_RegistrazioneCentroVaccinale.setText("Prov.");

        capLbl_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        capLbl_RegistrazioneCentroVaccinale.setText("CAP");

        javax.swing.GroupLayout datiPnl_RegistrazioneCentroVaccinaleLayout = new javax.swing.GroupLayout(datiPnl_RegistrazioneCentroVaccinale);
        datiPnl_RegistrazioneCentroVaccinale.setLayout(datiPnl_RegistrazioneCentroVaccinaleLayout);
        datiPnl_RegistrazioneCentroVaccinaleLayout.setHorizontalGroup(
            datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createSequentialGroup()
                        .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createSequentialGroup()
                                .addComponent(centroVaccinaleLbl_RegistrazioneCentroVaccinale)
                                .addGap(260, 260, 260))
                            .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createSequentialGroup()
                                .addComponent(name_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipologiaLbl_RegistrazioneCentroVaccinale)
                            .addComponent(tipologia_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createSequentialGroup()
                        .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qualificatore_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prov_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(provLbl_RegistrazioneCentroVaccinale)
                            .addComponent(qualificLbl_RegistrazioneCentroVaccinale))
                        .addGap(46, 46, 46)
                        .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(indirizzoLbl_RegistrazioneCentroVaccinale)
                            .addComponent(via_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(comuneLbl_RegistrazioneCentroVaccinale))
                                .addComponent(comune_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cap_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(capLbl_RegistrazioneCentroVaccinale))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(civicoLbl_RegistrazioneCentroVaccinale)
                                .addComponent(n_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        datiPnl_RegistrazioneCentroVaccinaleLayout.setVerticalGroup(
            datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(centroVaccinaleLbl_RegistrazioneCentroVaccinale)
                    .addComponent(tipologiaLbl_RegistrazioneCentroVaccinale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipologia_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createSequentialGroup()
                        .addComponent(civicoLbl_RegistrazioneCentroVaccinale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(qualificatore_RegistrazioneCentroVaccinale)
                            .addComponent(n_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createSequentialGroup()
                        .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(indirizzoLbl_RegistrazioneCentroVaccinale)
                            .addComponent(qualificLbl_RegistrazioneCentroVaccinale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(via_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comuneLbl_RegistrazioneCentroVaccinale)
                    .addComponent(provLbl_RegistrazioneCentroVaccinale)
                    .addComponent(capLbl_RegistrazioneCentroVaccinale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datiPnl_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cap_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comune_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prov_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        ann_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        ann_RegistrazioneCentroVaccinale.setText("Annulla");
        ann_RegistrazioneCentroVaccinale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ann_RegistrazioneCentroVaccinaleActionPerformed(evt);
            }
        });

        add_RegistrazioneCentroVaccinale.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        add_RegistrazioneCentroVaccinale.setText("Aggiungi");
        add_RegistrazioneCentroVaccinale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_RegistrazioneCentroVaccinaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_RegistrazioneCentroVaccinaleLayout = new javax.swing.GroupLayout(Panel_RegistrazioneCentroVaccinale);
        Panel_RegistrazioneCentroVaccinale.setLayout(Panel_RegistrazioneCentroVaccinaleLayout);
        Panel_RegistrazioneCentroVaccinaleLayout.setHorizontalGroup(
            Panel_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RegistrazioneCentroVaccinaleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datiPnl_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Panel_RegistrazioneCentroVaccinaleLayout.createSequentialGroup()
                        .addComponent(ann_RegistrazioneCentroVaccinale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add_RegistrazioneCentroVaccinale)))
                .addContainerGap())
        );
        Panel_RegistrazioneCentroVaccinaleLayout.setVerticalGroup(
            Panel_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RegistrazioneCentroVaccinaleLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(title_RegistrazioneCentroVaccinale)
                .addGap(18, 18, 18)
                .addComponent(datiPnl_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel_RegistrazioneCentroVaccinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ann_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_RegistrazioneCentroVaccinale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Richiama metodo <b>registraCentroVaccinale</b><br>
     * @see #registraCentroVaccinale
     * @param evt - Evento
     */
    private void add_RegistrazioneCentroVaccinaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_RegistrazioneCentroVaccinaleActionPerformed
        registraCentroVaccinale();
    }//GEN-LAST:event_add_RegistrazioneCentroVaccinaleActionPerformed

    /**
     * Annulla l'operazione e ritorna alla home<br>
     * Richiama il costruttore della classe <b>HomeCentriVaccinali</b>
     * @see centrivaccinali.HomeCentriVaccinali#HomeCentriVaccinali
     * @param evt - Evento
     */
    private void ann_RegistrazioneCentroVaccinaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ann_RegistrazioneCentroVaccinaleActionPerformed
        //Annulla l'operazione e ritorna alla home
        HomeCentriVaccinali homeCentriVaccinali = new HomeCentriVaccinali();
        homeCentriVaccinali.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ann_RegistrazioneCentroVaccinaleActionPerformed

    /**
     * Modifica contenuto nella textbox Nome quando selezionata
     * @param evt - Evento
     */
    private void name_RegistrazioneCentroVaccinaleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_RegistrazioneCentroVaccinaleFocusGained
        //hint per l'inserimento corretto dei dati
        if(name_RegistrazioneCentroVaccinale.getText().equals("Da 3 a 40 caratteri...")){
            name_RegistrazioneCentroVaccinale.setText("");
        }
    }//GEN-LAST:event_name_RegistrazioneCentroVaccinaleFocusGained

    /**
     * Modifica contenuto nella textbox Nome quando non selezionata
     * @param evt - Evento
     */
    private void name_RegistrazioneCentroVaccinaleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_RegistrazioneCentroVaccinaleFocusLost
        //hint per l'inserimento corretto dei dati
        if(name_RegistrazioneCentroVaccinale.getText().equals("")){
            name_RegistrazioneCentroVaccinale.setText("Da 3 a 40 caratteri...");
        }
    }//GEN-LAST:event_name_RegistrazioneCentroVaccinaleFocusLost

    /**
     * Modifica contenuto nella textbox Via quando selezionata
     * @param evt - Evento
     */
    private void via_RegistrazioneCentroVaccinaleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_via_RegistrazioneCentroVaccinaleFocusGained
        //hint per l'inserimento corretto dei dati
        if(via_RegistrazioneCentroVaccinale.getText().equals("Da 3 a 40 caratteri...")){
            via_RegistrazioneCentroVaccinale.setText("");
        }
    }//GEN-LAST:event_via_RegistrazioneCentroVaccinaleFocusGained

    /**
     * Modifica contenuto nella textbox Via quando non selezionata
     * @param evt - Evento
     */
    private void via_RegistrazioneCentroVaccinaleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_via_RegistrazioneCentroVaccinaleFocusLost
        //hint per l'inserimento corretto dei dati
        if(via_RegistrazioneCentroVaccinale.getText().equals("")){
            via_RegistrazioneCentroVaccinale.setText("Da 3 a 40 caratteri...");
        }
    }//GEN-LAST:event_via_RegistrazioneCentroVaccinaleFocusLost

    /**
     * Modifica contenuto nella textbox Comune quando selezionata
     * @param evt - Evento
     */
    private void comune_RegistrazioneCentroVaccinaleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comune_RegistrazioneCentroVaccinaleFocusGained
        //hint per l'inserimento corretto dei dati
        if(comune_RegistrazioneCentroVaccinale.getText().equals("Da 3 a 40 caratteri...")){
            comune_RegistrazioneCentroVaccinale.setText("");
        }
    }//GEN-LAST:event_comune_RegistrazioneCentroVaccinaleFocusGained

    /**
     * Modifica contenuto nella textbox Comune quando non selezionata
     * @param evt - Evento
     */
    private void comune_RegistrazioneCentroVaccinaleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comune_RegistrazioneCentroVaccinaleFocusLost
        //hint per l'inserimento corretto dei dati
        if(comune_RegistrazioneCentroVaccinale.getText().equals("")){
            comune_RegistrazioneCentroVaccinale.setText("Da 3 a 40 caratteri...");
        }
    }//GEN-LAST:event_comune_RegistrazioneCentroVaccinaleFocusLost

    /**
     * Modifica contenuto nella textbox Provincia quando selezionata
     * @param evt - Evento
     */
    private void prov_RegistrazioneCentroVaccinaleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prov_RegistrazioneCentroVaccinaleFocusGained
        //hint per l'inserimento corretto dei dati
        if(prov_RegistrazioneCentroVaccinale.getText().equals("Sigla")){
            prov_RegistrazioneCentroVaccinale.setText("");
        }
    }//GEN-LAST:event_prov_RegistrazioneCentroVaccinaleFocusGained

    /**
     * Modifica contenuto nella textbox Provincia quando non selezionata
     * @param evt - Evento
     */
    private void prov_RegistrazioneCentroVaccinaleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prov_RegistrazioneCentroVaccinaleFocusLost
        //hint per l'inserimento corretto dei dati
        if(prov_RegistrazioneCentroVaccinale.getText().equals("")){
            prov_RegistrazioneCentroVaccinale.setText("Sigla");
        }
    }//GEN-LAST:event_prov_RegistrazioneCentroVaccinaleFocusLost

    /**
     * Il metodo <b>main</b> viene richiamato al fine di richiamare il costruttore della classe <b>RegistrazioneCentroVaccinale</b> al fine di rendere visibile la classe.
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
            java.util.logging.Logger.getLogger(RegistrazioneCentroVaccinale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrazioneCentroVaccinale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrazioneCentroVaccinale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrazioneCentroVaccinale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrazioneCentroVaccinale().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_RegistrazioneCentroVaccinale;
    private javax.swing.JButton add_RegistrazioneCentroVaccinale;
    private javax.swing.JButton ann_RegistrazioneCentroVaccinale;
    private javax.swing.JLabel capLbl_RegistrazioneCentroVaccinale;
    private javax.swing.JTextField cap_RegistrazioneCentroVaccinale;
    private javax.swing.JLabel centroVaccinaleLbl_RegistrazioneCentroVaccinale;
    private javax.swing.JLabel civicoLbl_RegistrazioneCentroVaccinale;
    private javax.swing.JLabel comuneLbl_RegistrazioneCentroVaccinale;
    private javax.swing.JTextField comune_RegistrazioneCentroVaccinale;
    private javax.swing.JPanel datiPnl_RegistrazioneCentroVaccinale;
    private javax.swing.JLabel indirizzoLbl_RegistrazioneCentroVaccinale;
    private javax.swing.JTextField n_RegistrazioneCentroVaccinale;
    private javax.swing.JTextField name_RegistrazioneCentroVaccinale;
    private javax.swing.JLabel provLbl_RegistrazioneCentroVaccinale;
    private javax.swing.JTextField prov_RegistrazioneCentroVaccinale;
    private javax.swing.JLabel qualificLbl_RegistrazioneCentroVaccinale;
    private javax.swing.JComboBox<String> qualificatore_RegistrazioneCentroVaccinale;
    private javax.swing.JLabel tipologiaLbl_RegistrazioneCentroVaccinale;
    private javax.swing.JComboBox<String> tipologia_RegistrazioneCentroVaccinale;
    private javax.swing.JLabel title_RegistrazioneCentroVaccinale;
    private javax.swing.JTextField via_RegistrazioneCentroVaccinale;
    // End of variables declaration//GEN-END:variables
}
