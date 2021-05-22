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
import java.util.List;
import static javax.swing.JOptionPane.showMessageDialog;



public class GeneralFunctions {
    
    public static String WORKINGDIR = System.getProperty("user.dir") + File.separator + "data";
    public static String CENTRIVACCINALIDIR = WORKINGDIR + File.separator + "centri_vaccinali";
    public static String CITTADINIDIR = WORKINGDIR + File.separator + "cittadini";
    
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
            if(!f.exists()){
                f.mkdirs();
                check = false;
            }
            
        }
        else{
            f.mkdirs();
            checkDirHierarchy();
        }
        return check;
    }
    
    public static List[] getCentriVaccinaliList(){
        List[] retList = null;
        
        return retList;
    }
 
    //Controlli per campi di inserimento
    public static boolean checkProvincia(String p){
        //controllare se sono solamente caratteri
        return p.length() == 2;
    }
    
    public static boolean checkCAP(String p){
        
        if(p.length()!=5){
            return false;
        }
        else{
            try{
                int parse = Integer.parseInt(p);
                return true;
            }
            catch(NumberFormatException e){
                return false;
            }
        }
    }
    
    public static boolean checkCompiled(String p){
        return !(p.length()<4 || p.contains("-"));
    }
    
    public static boolean checkCivico(String p){
        return p.length()>0;
    }
    
    
    
}

