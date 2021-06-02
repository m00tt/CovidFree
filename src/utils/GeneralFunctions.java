/**
 * 
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;


public class GeneralFunctions {
    
    //Dichiarazione dei path utili

    /**
     *
     */
    public static String WORKINGDIR = System.getProperty("user.dir") + File.separator + "data"; //cartella data

    /**
     *
     */
    public static String CENTRIVACCINALIDIR = WORKINGDIR + File.separator + "centri_vaccinali"; //cartella centri_vaccinali

    /**
     *
     */
    public static String CITTADINIDIR = WORKINGDIR + File.separator + "cittadini";              //cartella cittadini
    
    //Dichiarazione pattern per i controlli di inserimento
    static Pattern onlyCodiceFiscale = Pattern.compile("^[a-zA-Z]{6}[0-9]{2}[abcdehlmprstABCDEHLMPRST]{1}[0-9]{2}([a-zA-Z]{1}[0-9]{3})[a-zA-Z]{1}$");
    static Pattern onlyLettersPattern = Pattern.compile("[^a-zA-Zàèòìù'\\s]"); //Verranno accettati solamente lettere maiuscole e minuscole + alcuni caratteri speciali
    static Pattern onlyCivicoPattern = Pattern.compile("[^a-zA-Z0-9/\\\\s]"); //Verranno accettati solamente valori numerici, lettere o slash
    static Pattern onlyNumbersPattern = Pattern.compile("[^0-9]"); //Verranno accettati solamente numeri
    static Pattern onlyDataPattern = Pattern.compile("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$");  //Formato data dd/mm/aaaa
    static Pattern onlyPasswordPattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$!£&=?_%]).{8,20})"); //password che deve contenere un numero, un carattere minuscolo, uno maiuscolo e un carattere speciale tra @#$!£&=?_% e deve avere lunghezza min 8 e max 20
    static Pattern onlyEmail = Pattern.compile("[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}"); //Pattern di Verifica indirizzo Email
    
    //Controlla che la gerarchia di file/cartelle per il salvataggio dei dati esista, se non esiste viene creata

    /**
     *
     * @return
     */
    public static boolean checkDirHierarchy(){
        boolean check = true;
        File f = new File(WORKINGDIR);      
        if(f.exists()){
            f = new File(CENTRIVACCINALIDIR);
            if(f.exists()){
                f = new File(CENTRIVACCINALIDIR + File.separator + "CentriVaccinali.dati");
                if(!f.exists()){
                    try{
                        f.createNewFile();
                        check = false;
                    }catch(IOException e){
                        showMessageDialog(null, "Impossibile creare il database, provare a riavviare il programma.");
                    }
                }
            }
            else{
                f.mkdirs();
                check = false;
                f = new File(CENTRIVACCINALIDIR + File.separator + "CentriVaccinali.dati");
                try{
                    f.createNewFile();
                    check = false;
                }catch(IOException e){
                    showMessageDialog(null, "Impossibile creare il database, provare a riavviare il programma.");
                }    
            }
            
            f = new File(CITTADINIDIR);
            if(f.exists()){
                f = new File(CITTADINIDIR + File.separator + "Cittadini_Registrati.dati");
                if(!f.exists()){
                    try{
                        f.createNewFile();
                        check = false;
                    }catch(IOException e){
                        showMessageDialog(null, "Impossibile creare il database, provare a riavviare il programma.");
                    }
                }
            }
            else{
                f.mkdirs();
                check = false;
                f = new File(CITTADINIDIR + File.separator + "Cittadini_Registrati.dati");
                try{
                    f.createNewFile();
                    check = false;
                }catch(IOException e){
                    showMessageDialog(null, "Impossibile creare il database, provare a riavviare il programma.");
                }    
            }
            
        }
        else{
            f.mkdirs();
            checkDirHierarchy();
        }
        return check;
    }
    
    //Recupera dal DB la lista dei centri vaccinali registrati

    /**
     *
     * @return
     */
    public static List<String> getCentriVaccinaliList(){
        List<String> retList = new ArrayList();
        String thisLine;
    
        if(!checkDirHierarchy()){
            showMessageDialog(null, "I database risultano corrotti.\nI dati sono stati ripristinati.");
        }
        try {
                BufferedReader br = new BufferedReader(new FileReader(CENTRIVACCINALIDIR + File.separator + "CentriVaccinali.dati"));
                while ((thisLine = br.readLine()) != null) {
                    String[] tmp = thisLine.split("-");
                    retList.add(tmp[0]);
                }       
            } catch(IOException e) {
                showMessageDialog(null, "Errore di lettura del database, riprova.");
            }
        
        return retList;
    }
       
    
    //Recupera tutti gli ID Vaccino registrati

    /**
     *
     * @return
     */
    public static List<String> getUniqueList(){
        List<String> retList = new ArrayList<>();
        if(new File(CITTADINIDIR + File.separator +"Cittadini_Registrati.dati").exists()){
            
                try {
                    String thisLine;
                    BufferedReader br = new BufferedReader(new FileReader(CITTADINIDIR + File.separator +"Cittadini_Registrati.dati"));
                    while ((thisLine = br.readLine()) != null) {
                        String[] tmp = thisLine.split("-");
                        retList.add(tmp[1]);
                        retList.add(tmp[2]);
                        retList.add(tmp[6]);
                    }       
                } catch(IOException e) {
                    showMessageDialog(null, "Errore di lettura del database, riprova.");
                }
        }
        
        return retList;
    }
    
    //Recupera le info di un singolo Centro Vaccinale

    /**
     *
     * @param nomeCentroVaccinale
     * @return
     */
    public static List<String> getCentroVaccinaleInfo(String nomeCentroVaccinale){
        List<String> retList = new ArrayList();
        String thisLine;
    
        if(!checkDirHierarchy()){
            showMessageDialog(null, "I database risultano corrotti.\nI dati sono stati ripristinati.");
        }
        try {
                BufferedReader br = new BufferedReader(new FileReader(CENTRIVACCINALIDIR + File.separator + "CentriVaccinali.dati"));
                while ((thisLine = br.readLine()) != null) {
                    String[] tmp = thisLine.split("-");
                    if(tmp[0].equalsIgnoreCase(nomeCentroVaccinale)){
                        for(int i = 0; i<tmp.length; i++){
                            retList.add(tmp[i]);
                        }
                        break;
                    }
                }       
            } catch(IOException e) {
                showMessageDialog(null, "Errore di lettura del database, riprova.");
            }
        
        return retList;
    }
    
    public static String getCentroVaccinalebyID(String id){
        
        if(new File(CITTADINIDIR + File.separator +"Cittadini_Registrati.dati").exists()){
            
                try {
                    String thisLine;
                    BufferedReader br = new BufferedReader(new FileReader(CITTADINIDIR + File.separator +"Cittadini_Registrati.dati"));
                    while ((thisLine = br.readLine()) != null) {
                        
                        String[] tmp = thisLine.split("-");
                        if(id.equalsIgnoreCase(tmp[6])){
                            return tmp[0];
                        }
                        
                        
                    }       
                } catch(IOException e) {
                    showMessageDialog(null, "Errore di lettura del database, riprova.");
                }
        }
        
        return null;
    }
    
    public static String newCittadinoAlreadyVaccinato(String codFisc){
        List<String> nomeCentriVaccinali = getCentriVaccinaliList();
        List<String> retList = new ArrayList<>();
        
        for(int i=0; i<nomeCentriVaccinali.size(); i++){
            String path = CENTRIVACCINALIDIR + File.separator + "Vaccinati_"+nomeCentriVaccinali.get(i)+".dati";
            if(new File(path).exists()){
                try {
                    String thisLine;
                    BufferedReader br = new BufferedReader(new FileReader(path));
                    while ((thisLine = br.readLine()) != null) {
                        String[] tmp = thisLine.split("-");
                        if(tmp.length == 7){
                            if(codFisc.equalsIgnoreCase(tmp[1])){
                                return nomeCentriVaccinali.get(i)+"-"+tmp[2];
                            }
                        }
                        
                    }       
                } catch(IOException e) {
                    showMessageDialog(null, "Errore di lettura del database, riprova.");
                }
            }
        }
        
        return null;
    }
    
    
    
    
    /*

        Controlli per campi di inserimento

    */
    
    //Verifica che la data inserita non sia futura

    /**
     *
     * @param p
     * @return
     * @throws ParseException
     */
    public static boolean checkData(String p) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        Date date = new Date();  
        String str1 = formatter.format(date);
        try{
            Date dateNow = formatter.parse(str1);
            Date insertDate = formatter.parse(p);
            return !insertDate.after(dateNow);
        }catch(ParseException e){
            return false;
        }
    }
    
    //Verifica che l'ID vaccino sia numerico e di lunghezza 16

    /**
     *
     * @param p
     * @return
     */
    public static boolean checkIdVaccino(String p){
        Matcher matcher = onlyNumbersPattern.matcher(p);
        return !matcher.find() && p.length() == 16;
    }
    
    //Verifica il formato del codice fiscale inserito

    /**
     *
     * @param p
     * @return
     */
    public static boolean checkCodiceFiscale(String p){
        Matcher matcher = onlyCodiceFiscale.matcher(p);
        return matcher.find();
    }
 
    //Verifica che la provincia sia composta solamente da 2 lettere

    /**
     *
     * @param p
     * @return
     */
    public static boolean checkProvincia(String p){
        Matcher matcher = onlyLettersPattern.matcher(p);
        return p.trim().length() == 2 && !matcher.find();
    }
    
    //Verifica che il CAP sia di 5 cifre

    /**
     *
     * @param p
     * @return
     */
    public static boolean checkCAP(String p){
        Matcher matcher = onlyNumbersPattern.matcher(p);
        return p.trim().length() == 5 && !matcher.find();
    }
    
    //Verifica che un dato sia compilato con lunghezza da 3 a 40 caratteri

    /**
     *
     * @param p
     * @return
     */
    public static boolean checkCompiled(String p){
        Matcher matcher = onlyLettersPattern.matcher(p);
        return p.trim().length()>3 && !matcher.find() && p.trim().length() < 41;
    }
    
    //Verifica che il civico sia compreso tra 1 e 5 caratteri

    /**
     *
     * @param p
     * @return
     */
    public static boolean checkEvtDescription(String p){
        Matcher matcher = onlyLettersPattern.matcher(p);
        return p.trim().length()>7 && !matcher.find() && p.trim().length() < 257;
    }
    
    /**
     *
     * @param p
     * @return
     */
    public static boolean checkCivico(String p){
        Matcher matcher = onlyCivicoPattern.matcher(p);
        return p.trim().length()>0 && p.trim().length()<6 && !matcher.find();
    }
    
    //Verifica Indirizzo Mail

    /**
     *
     * @param p
     * @return
     */
    public static boolean checkMail(String p){
        Matcher matcher = onlyEmail.matcher(p);
        return p.trim().length()>0 && matcher.find();
    }
    
    //Verifica il pattern della password

    /**
     *
     * @param p
     * @return
     */
    public static boolean checkPassword(String p){
        Matcher matcher = onlyPasswordPattern.matcher(p);
        return matcher.find();
    }
    
    /**
     *
     * @param input
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static byte[] getSHA(String input) throws NoSuchAlgorithmException
    { 
        MessageDigest md = MessageDigest.getInstance("SHA-256"); 
        return md.digest(input.getBytes(StandardCharsets.UTF_8)); 
    }
    
    /**
     *
     * @param hash
     * @return
     */
    public static String toHexString(byte[] hash)
    {
        BigInteger number = new BigInteger(1, hash); 
  
        StringBuilder hexString = new StringBuilder(number.toString(16)); 

        while (hexString.length() < 32) 
        { 
            hexString.insert(0, '0'); 
        } 
  
        return hexString.toString(); 
    }
    
}


