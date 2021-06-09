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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 * La classe GeneralFunction contiene tutte le funzioni utili e condivise con gli altri package
 * @author Andrea Mottini 742605 VA
 */
public class GeneralFunctions {
    
    /**
     * Costante utilizzata per standardizzare il carattere di separazione dei dati durante il salvataggio ed il recupero dei dati
     */
    public static final String DATASEPARATOR = "#";
    
    /**
     *  Path per il recupero dell'icona di CovidFree
     */
    public static final String LOGODIR = System.getProperty("user.dir") + File.separator + "src" + File.separator + "img" + File.separator + "app-logo.png";
    
    /**
     * Path per il recupero della cartella padre
     */
    public static final String WORKINGDIR = System.getProperty("user.dir") + File.separator + "data";

    /**
     * Path per il recupero della cartella centi_vaccinali
     */
    public static final String CENTRIVACCINALIDIR = WORKINGDIR + File.separator + "centri_vaccinali";

    /**
     * Path per il recupero della cartella cittadini
     */
    public static final String CITTADINIDIR = WORKINGDIR + File.separator + "cittadini";
    
    /**
     * Pattern utilizzato per il riconoscimento di codici fiscali corretti
     */
    private static final Pattern ONLY_CODICE_FISCALE = Pattern.compile("^[a-zA-Z]{6}[0-9]{2}[abcdehlmprstABCDEHLMPRST]{1}[0-9]{2}([a-zA-Z]{1}[0-9]{3})[a-zA-Z]{1}$");
    
    /**
     * Pattern utilizzato per il riconoscimento di caratteri non accettati all'interno di stringhe<br>
     * Il pattern accetta:<br>
     *  - Lettere maiuscole e minuscole<br>
     *  - I seguenti caratteri speciali àèòìù'
     */
    private static final Pattern ONLY_LETTERS_PATTERN = Pattern.compile("[^a-zA-Zàèòìù'\\s]");
    
    /**
     * Pattern utilizzato per il riconoscimento di caratteri non ammessi durante la compilazione della descrizione dell'evento avverso
     * Il pattern accetta:<br>
     *  - Numeri<br>
     *  - Lettere maiuscole e minuscole<br>
     *  - I seguenti caratteri speciali àèòìù'().,:;
     */    
    private static final Pattern ONLY_EVENT_DESCRIPTION = Pattern.compile("[^0-9a-zA-Zàèòìù'().,:;\\s]");

    /**
     * Pattern utilizzato per il riconoscimento di caratteri non ammessi durante la compilazione del numero civico<br>
     * Il pattern accetta:<br>
     *  - Numeri<br>
     *  - Lettere maiuscole e minuscole<br>
     *  - Il seguente carattere speciale /
     */   
    private static final Pattern ONLY_CIVICO_PATTERN = Pattern.compile("[^a-zA-Z0-9/\\\\s]");
    
    /**
     * Pattern utilizzato per accettare solamente numeri all'interno dei campi di compilazione
     */    
    private static final Pattern ONLY_NUMBERS_PATTERN = Pattern.compile("[^0-9]"); //Verranno accettati solamente numeri

    /**
     * Pattern utilizzato per il corretto inserimento della password.<br>
     * Il pattern accetta le stringhe che sono composte da:<br>
     *  - una lunghezza compresa tra 8 e 20 caratteri<br>
     *  - almeno un carattere maiuscolo<br>
     *  - almeno un carattere minuscolo<br>
     *  - almeno un numero<br>
     *  - almeno un carattere speciale tra i seguenti @#$!£&=?_%
     */    
    private static final Pattern ONLY_PASSWORD_PATTERN = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!£&=?_%]).{8,20})"); //password che deve contenere un numero, un carattere minuscolo, uno maiuscolo e un carattere speciale tra @#$!£&=?_% e deve avere lunghezza min 8 e max 20

    /**
     * Pattern per la verifica della bontà dell'indirizzo email inserito
     */    
    private static final Pattern ONLY_EMAIL_PATTERN = Pattern.compile("[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}"); //Pattern di Verifica indirizzo Email
    

    /**
     * Il metodo <b>checkDirHierarchy</b> è utilizzato per verificare la presenza di tutti i file e directory per permettere un corretto funzionamento all'applicazione.
     * Il metodo, inoltre, in caso trovasse mancanze, ricostruirà i file o directory mancanti al fine di non generare errori in esecuzione.
     * @return Viene ritornato un valore booleano in base all'esito del metodo. True: se non sono state trovate mancanze. False: se sono state necessarie ristrutturazioni.
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
                        showMessageDialog(null, "Impossibile creare il database, provare a riavviare il programma.\n\nDescrizione dettagliata: "+e.toString(), "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
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
                    showMessageDialog(null, "Impossibile creare il database, provare a riavviare il programma.\n\nDescrizione dettagliata: "+e.toString(), "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
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
                        showMessageDialog(null, "Impossibile creare il database, provare a riavviare il programma.\n\nDescrizione dettagliata: "+e.toString(), "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
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
                    showMessageDialog(null, "Impossibile creare il database, provare a riavviare il programma.\n\nDescrizione dettagliata: "+e.toString(), "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
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
     * Il metodo <b>getCentriVaccinaliList</b> è utilizzato per recuperare la lista di tutti i centri vaccinali registrati
     * @return Viene ritornata una lista di stringhe (List<String>) contenente i nomi dei centri vaccinali registrati
     */
    public static List<String> getCentriVaccinaliList(){
        List<String> retList = new ArrayList();
        String thisLine;
    
        if(!checkDirHierarchy()){
            showMessageDialog(null, "I database risultano corrotti.\nI dati sono stati ripristinati.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
        }
        try {
                BufferedReader br = new BufferedReader(new FileReader(CENTRIVACCINALIDIR + File.separator + "CentriVaccinali.dati"));
                while ((thisLine = br.readLine()) != null) {
                    String[] tmp = thisLine.split(DATASEPARATOR);
                    retList.add(tmp[0]);
                }       
            } catch(IOException e) {
                showMessageDialog(null, "Errore di lettura del database, riprova.\n\nDescrizione dettagliata: "+e.toString(), "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
            }
        
        return retList;
    }
       

    /**
     * Il metodo <b>getUniqueList</br> recupera una lista di ID Vaccini, Codici Fiscali e UserID che sono già stati registrati a sistema
     * @return Viene ritornata una lista di stringhe (List<String>) contenente gli ID Vaccini, Codici Fiscali e UserID che sono già stati registrati a sistema
     */
    public static List<String> getUniqueList(){
        List<String> retList = new ArrayList<>();
        if(new File(CITTADINIDIR + File.separator +"Cittadini_Registrati.dati").exists()){
            
                try {
                    String thisLine;
                    BufferedReader br = new BufferedReader(new FileReader(CITTADINIDIR + File.separator +"Cittadini_Registrati.dati"));
                    while ((thisLine = br.readLine()) != null) {
                        String[] tmp = thisLine.split(DATASEPARATOR);
                        retList.add(tmp[1]);
                        retList.add(tmp[2]);
                        retList.add(tmp[6]);
                    }       
                } catch(IOException e) {
                    showMessageDialog(null, "Errore di lettura del database, riprova.\n\nDescrizione dettagliata: "+e.toString(), "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
                }
        }
        
        return retList;
    }
    
    //Recupera le info di un singolo Centro Vaccinale

    /**
     * Il metodo <b>getCentroVaccinaleInfo</b> è utilizzato per recuperare tutte le informazioni relative ad uno specifico centro vaccinale registrato.
     * @param nomeCentroVaccinale Nome del centro vaccinale del quale si necessitano le informazioni
     * @return Viene ritornata una lista di stringhe (List<String>) che riporta le informazioni del centro vaccinale target
     */
    public static List<String> getCentroVaccinaleInfo(String nomeCentroVaccinale){
        List<String> retList = new ArrayList();
        String thisLine;
    
        if(!checkDirHierarchy()){
            showMessageDialog(null, "I database risultano corrotti.\nI dati sono stati ripristinati.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
        }
        try {
                BufferedReader br = new BufferedReader(new FileReader(CENTRIVACCINALIDIR + File.separator + "CentriVaccinali.dati"));
                while ((thisLine = br.readLine()) != null) {
                    String[] tmp = thisLine.split(DATASEPARATOR);
                    if(tmp[0].equalsIgnoreCase(nomeCentroVaccinale)){
                        for(int i = 0; i<tmp.length; i++){
                            retList.add(tmp[i]);
                        }
                        break;
                    }
                }       
            } catch(IOException e) {
                showMessageDialog(null, "Errore di lettura del database, riprova.\n\nDescrizione dettagliata: "+e.toString(), "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
            }
        
        return retList;
    }
    
    /**
     * Il metodo <b>getCentroVaccinalebyID</b> è utilizzato al fine di recuperare il centro vaccinale al quale un cittadino risulta registrato.
     * @param id UserID del cittadino
     * @return Viene ritornata una stringa contenente il nome del centro vaccinale
     */
    public static String getCentroVaccinalebyID(String id){
        
        if(new File(CITTADINIDIR + File.separator +"Cittadini_Registrati.dati").exists()){
            
                try {
                    String thisLine;
                    BufferedReader br = new BufferedReader(new FileReader(CITTADINIDIR + File.separator +"Cittadini_Registrati.dati"));
                    while ((thisLine = br.readLine()) != null) {
                        
                        String[] tmp = thisLine.split(DATASEPARATOR);
                        if(id.equalsIgnoreCase(tmp[6])){
                            return tmp[0];
                        }
                        
                        
                    }       
                } catch(IOException e) {
                    showMessageDialog(null, "Errore di lettura del database, riprova.\n\nDescrizione dettagliata: "+e.toString(), "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
                }
        }
        
        return null;
    }
    
    /**
     * Il metodo <b>newCittadinoAlreadyVaccinato</b> ritorna il centro vaccinale e l'ID Vaccino per il quale un cittadino risulta registrato
     * @param codFisc Codice Fiscale del cittadino
     * @return Viene ritornata una stringa che contiene "<NomeCentroVaccinale><DATASEPARATOR><IdVaccino>"
     * @see #DATASEPARATOR
     */
    public static String newCittadinoAlreadyVaccinato(String codFisc){
        List<String> nomeCentriVaccinali = getCentriVaccinaliList();
        
        for(int i=0; i<nomeCentriVaccinali.size(); i++){
            String path = CENTRIVACCINALIDIR + File.separator + "Vaccinati_"+nomeCentriVaccinali.get(i)+".dati";
            if(new File(path).exists()){
                try {
                    String thisLine;
                    BufferedReader br = new BufferedReader(new FileReader(path));
                    while ((thisLine = br.readLine()) != null) {
                        String[] tmp = thisLine.split(DATASEPARATOR);
                        if(tmp.length == 7){
                            if(codFisc.equalsIgnoreCase(tmp[1])){
                                return nomeCentriVaccinali.get(i)+DATASEPARATOR+tmp[2];
                            }
                        }
                        
                    }       
                } catch(IOException e) {
                    showMessageDialog(null, "Errore di lettura del database, riprova.\n\nDescrizione dettagliata: "+e.toString(), "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
                }
            }
        }
        
        return null;
    }
    
    

    /**
     * Il metodo <b>checkData</b> controlla che la data i passata come parametro non sia futura
     * @param p Stringa da verificare
     * @return Ritorna un valore booleano in base all'esito del controllo
     * @throws ParseException
     */
    public static boolean checkData(String p) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        Date date = new Date();  
        String str1 = formatter.format(date);
        try{
            Date dateNow = formatter.parse(str1);
            Date insertDate = formatter.parse(p);
            if((!insertDate.after(dateNow)) == false){
                showMessageDialog(null, "La data inserita non è corretta.\n\n- La data non può essere futura.\n- Rispettare il formato gg/mm/aaaa", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
            }
            return !insertDate.after(dateNow);
        }catch(ParseException e){
            showMessageDialog(null, "La data inserita non è corretta.\n\n- La data non può essere futura.\n- Rispettare il formato gg/mm/aaaa", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
            return false;
        }
    }
    
    /**
     * Il metodo <b>checkUserId</b> controlla che la stringa inserita rispetti il pattern ONLY_LETTERS_PATTERN. Inoltre, viene verificato che la lunghezza del parametro inserito sia compresa tra 3 e 8 caratteri, in caso contrario si visualizzerà un errore.
     * @param p Stringa da verificare
     * @return Ritorna un valore booleano in base all'esito del controllo
     * @see #ONLY_LETTERS_PATTERN
     */
    public static boolean checkUserId(String p){
        Matcher matcher = ONLY_LETTERS_PATTERN.matcher(p);
        if((p.trim().length()>2 && !matcher.find() && p.trim().length() <9) == false){
            if(p.equalsIgnoreCase("Da 3 a 8 caratteri...")){
                showMessageDialog(null, "Alcuni campi non sono stati compilati, prova a controllare.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR)); 
                return false;
            }else{
                showMessageDialog(null, "Lo UserID risulta errato.\n\nTale campo:\n- Deve avere lunghezza compresa tra 3 e 8 caratteri\n- Può contenere solamente lettere ed i seguenti caratteri speciali: àèòìù'", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
                return false;
            }
        }
        return true;
    }
    
    //Verifica che l'ID vaccino sia numerico e di lunghezza 16

    /**
     * Il metodo <b>checkIdVaccino</b> controlla che la il parametro rispetti il pattern ONLY_NUMBERS_PATTERN.<br>Inoltre, viene controllata che la lunghezza del parametro sia uguale a 16, in caso contrario si visualizzerà un errore.
     * @param p Stringa da verificare
     * @return Ritorna un valore booleano in base all'esito del controllo
     * @see #ONLY_NUMBERS_PATTERN
     */
    public static boolean checkIdVaccino(String p){
        Matcher matcher = ONLY_NUMBERS_PATTERN.matcher(p);
        if((!matcher.find() && p.length() == 16) == false){
            showMessageDialog(null, "L'ID Vaccino deve contenere esattamente 16 cifre.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
        }
        return !matcher.find() && p.length() == 16;
    }
   

    /**
     * Il metodo <b>checkCodiceFiscale</b> controlla che la il parametro rispetti il pattern ONLY_CODICE_FISCALE, in caso contrario si visualizzerà un errore.
     * @param p Stringa da verificare
     * @return Ritorna un valore booleano in base all'esito del controllo
     * @see #ONLY_CODICE_FISCALE
     */
    public static boolean checkCodiceFiscale(String p){
        Matcher matcher = ONLY_CODICE_FISCALE.matcher(p);
        if(matcher.find() == false){
            showMessageDialog(null, "Il codice fiscale inserito non è valido.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
            return false;
        }
        return true;
    }

    /**
     * Il metodo <b>checkProvincia</b> controlla che la il parametro rispetti il pattern ONLY_LETTERS_PATTERN.Inoltre, viene verificata che la lunghezza del parametro sia uguale a 2, in caso contrario si visualizzerà un errore.
     * @param p Stringa da verificare
     * @return Ritorna un valore booleano in base all'esito del controllo
     * @see #ONLY_LETTERS_PATTERN
     */
    public static boolean checkProvincia(String p){
        Matcher matcher = ONLY_LETTERS_PATTERN.matcher(p);
        if((p.trim().length() == 2 && !matcher.find()) == false){
            showMessageDialog(null, "La provincia inserita risulta errata\nInserire la sigla della provincia.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
        }
        return p.trim().length() == 2 && !matcher.find();
    }

    /**
     * Il metodo <b>checkProvincia</b> controlla che la il parametro rispetti il pattern ONLY_LETTERS_PATTERN.Inoltre, viene verificata che la lunghezza del parametro sia uguale a 2, in caso contrario si visualizzerà un errore.
     * @param p Stringa da verificare
     * @return Ritorna un valore booleano in base all'esito del controllo
     * @see #ONLY_LETTERS_PATTERN
     */
    public static boolean checkCAP(String p){
        Matcher matcher = ONLY_NUMBERS_PATTERN.matcher(p);
        if((p.trim().length() == 5 && !matcher.find()) == false){
            showMessageDialog(null, "Il CAP inserito risulta errato.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
        }
        return p.trim().length() == 5 && !matcher.find();
    }
   

    /**
     * Il metodo <b>checkCompiled</b> controlla che la il parametro rispetti il pattern ONLY_LETTERS_PATTERN. Inoltre, viene verificata che la lunghezza del parametro sia compresa tra 3 e 40 caratteri, in caso contrario si visualizzerà un errore.
     * @param p Stringa da verificare
     * @return Ritorna un valore booleano in base all'esito del controllo
     * @see #ONLY_LETTERS_PATTERN
     */
    public static boolean checkCompiled(String p){
        Matcher matcher = ONLY_LETTERS_PATTERN.matcher(p);
        if((p.trim().length()>2 && !matcher.find() && p.trim().length() < 41) == false){
            if(p.equalsIgnoreCase("Da 3 a 40 caratteri...")){
                showMessageDialog(null, "Alcuni campi non sono stati compilati, prova a controllare.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR)); 
                return false;
            }else{
                showMessageDialog(null, "Il campo compilato con '"+p+"' risulta errato.\n\nTale campo:\n- Deve avere lunghezza compresa tra 3 e 40 caratteri\n- Può contenere solamente i seguenti caratteri speciali: àèòìù'", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR)); 
                return false;
            }
        }
        return true;
    }

    /**
     * Il metodo <b>checkEvtDescription</b> controlla che la il parametro rispetti il pattern ONLY_EVENT_DESCRIPTION. Inoltre, viene verificata che la lunghezza del parametro sia compresa tra 8 e 256 caratteri, in caso contrario si visualizzerà un errore.
     * @param p Stringa da verificare
     * @return Ritorna un valore booleano in base all'esito del controllo
     * @see #ONLY_EVENT_DESCRIPTION
     */
    public static boolean checkEvtDescription(String p){
        Matcher matcher = ONLY_EVENT_DESCRIPTION.matcher(p);
        if((p.trim().length()>7 && !matcher.find() && p.trim().length() < 257) == false){
            showMessageDialog(null, "La descrizione dell'evento risulta errata.\nLa descrizione deve essere compresa tra 8 e 256 caratteri e può contenere\nsolamente i seguenti caratteri speciali èòìù'().,:;", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
            return false;
        }
        if(p.equalsIgnoreCase("Inserisci una descizione per l'evento risontrontato (da 8 a 256 caratteri)...")){
            showMessageDialog(null, "La descrizione non è stata compilata.\nLa descrizione deve essere compresa tra 8 e 256 caratteri e può contenere\nsolamente i seguenti caratteri speciali èòìù'().,:;", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
            return false;
        }
        return true;
    }
    
    /**
     * Il metodo <b>checkCivico</b> controlla che la il parametro rispetti il pattern ONLY_CIVICO_PATTERN. Inoltre, viene verificata che la lunghezza del parametro sia compresa tra 1 e 5 caratteri, in caso contrario si visualizzerà un errore.
     * @param p Stringa da verificare
     * @return Ritorna un valore booleano in base all'esito del controllo
     * @see #ONLY_CIVICO_PATTERN
     */
    public static boolean checkCivico(String p){
        Matcher matcher = ONLY_CIVICO_PATTERN.matcher(p);
        if(!(p.trim().length()>0 && p.trim().length()<6 && !matcher.find())){
            showMessageDialog(null, "Il civico inserito risulta errato.\nIl campo:\n- Può contenere da 1 a 6 caratteri\n- Può contenere lettere, numeri o il carattere '/'", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
        }
        return p.trim().length()>0 && p.trim().length()<6 && !matcher.find();
    }

    /**
     * Il metodo <b>checkMail</b> controlla che la il parametro rispetti il pattern ONLY_EMAIL_PATTERN, in caso contrario si visualizzerà un errore.
     * @param p Stringa da verificare
     * @return Ritorna un valore booleano in base all'esito del controllo
     * @see #ONLY_EMAIL_PATTERN
     */
    public static boolean checkMail(String p){
        Matcher matcher = ONLY_EMAIL_PATTERN.matcher(p);
        if((p.trim().length()>0 && matcher.find()) == false){
            showMessageDialog(null, "L'indirizzo e-mail inserito risulta errato.", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
            return false;
        }
        return true;
    }

    /**
     * Il metodo <b>checkPassword</b> controlla che la il parametro rispetti il pattern ONLY_PASSWORD_PATTERN, in caso contrario si visualizzerà un errore.
     * @param p Stringa da verificare
     * @return Ritorna un valore booleano in base all'esito del controllo
     * @see #ONLY_PASSWORD_PATTERN
     */
    public static boolean checkPassword(String p){
        Matcher matcher = ONLY_PASSWORD_PATTERN.matcher(p);
        if(matcher.find() == false){
             showMessageDialog(null, "La password inserita non è valida.\n\nLa password deve:\n- Avere lunghezza tra 8 e 20 caratteri\n- Avere almeno un numero\n- Avere almeno una lettera minuscola\n- Avere almeno una lettera maiuscola\n- Avere almeno un carattere speciale tra i seguenti:  @$!£&=?_%", "CovidFree", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(LOGODIR));
             return false;
        }
        return true;
    }
    
    /**
     * Il metodo <b>getSHA</b> cripta in SHA-256 il parametro passato
     * @param input Stringa da criptare
     * @return Ritorna un array di byte contentente il parametro criptato in SHA-256
     * @throws NoSuchAlgorithmException
     */
    public static byte[] getSHA(String input) throws NoSuchAlgorithmException
    { 
        MessageDigest md = MessageDigest.getInstance("SHA-256"); 
        return md.digest(input.getBytes(StandardCharsets.UTF_8)); 
    }
    
    /**
     * Il metodo <b>toHexString</b> converte un array di byte in una stringa
     * @param hash Stringa da convertire
     * @return Ritorna una stringa che rappresenta l'hash
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


