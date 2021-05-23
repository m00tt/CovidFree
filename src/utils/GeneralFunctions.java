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
import java.nio.file.Files;
import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;



public class GeneralFunctions {
    
    public static String WORKINGDIR = System.getProperty("user.dir") + File.separator + "data";
    public static String CENTRIVACCINALIDIR = WORKINGDIR + File.separator + "centri_vaccinali";
    public static String CITTADINIDIR = WORKINGDIR + File.separator + "cittadini";
    
    static Pattern onlyCodiceFiscale = Pattern.compile("^[a-zA-Z]{6}[0-9]{2}[abcdehlmprstABCDEHLMPRST]{1}[0-9]{2}([a-zA-Z]{1}[0-9]{3})[a-zA-Z]{1}$");
    static Pattern onlyLettersPattern = Pattern.compile("[^a-zA-Zàèòìù'\\s]");
    static Pattern onlyNumbersPattern = Pattern.compile("[^0-9]");
    static Pattern onlyDataPattern = Pattern.compile("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$");
    static Pattern onlyPasswordPattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$!£&=?_%]).{8,20})");
    
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
    
    public static List<String> getUniqueList(){
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
                        retList.add(tmp[1]);
                        retList.add(tmp[2]);
                    }       
                } catch(IOException e) {
                    showMessageDialog(null, "Errore di lettura del database, riprova.");
                }
            }
        }
        
        if(new File(CITTADINIDIR + File.separator +"Cittadini_Registrati.dati").exists()){
            
                try {
                    String thisLine;
                    BufferedReader br = new BufferedReader(new FileReader(CITTADINIDIR + File.separator +"Cittadini_Registrati.dati"));
                    while ((thisLine = br.readLine()) != null) {
                        String[] tmp = thisLine.split("-");
                        retList.add(tmp[1]);
                        retList.add(tmp[2]);
                    }       
                } catch(IOException e) {
                    showMessageDialog(null, "Errore di lettura del database, riprova.");
                }
        }
        
        return retList;
    }
    
    //Controlli per campi di inserimento
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
    
    public static boolean checkIdVaccino(String p){
        Matcher matcher = onlyNumbersPattern.matcher(p);
        return !matcher.find() && p.length() == 16;
    }
    
    public static boolean checkCodiceFiscale(String p){
        Matcher matcher = onlyCodiceFiscale.matcher(p);
        return matcher.find();
    }
 
    public static boolean checkProvincia(String p){
        Matcher matcher = onlyLettersPattern.matcher(p);
        return p.trim().length() == 2 && !matcher.find();
    }
    
    public static boolean checkCAP(String p){
        Matcher matcher = onlyNumbersPattern.matcher(p);
        return p.trim().length() == 5 && !matcher.find();
    }
    
    public static boolean checkCompiled(String p){
        Matcher matcher = onlyLettersPattern.matcher(p);
        return p.trim().length()>3 && !matcher.find() && p.trim().length() < 41;
    }
    
    public static boolean checkCivico(String p){
        return p.trim().length()>0;
    }
    
    
    
}


