/**
 * 
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */
package utils;

import java.io.File;
import java.nio.file.Files;
import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
import java.util.List;
import static javax.swing.JOptionPane.showMessageDialog;



public class GeneralFunctions {
    
    static String workingDir = System.getProperty("user.dir");
    
    public static void checkInitDir(){
        File f = new File(workingDir + File.separator + "data");
        
        if(!f.exists()){
            if(initializeDirectory()){
                showMessageDialog(null, "La cartella contenente i dati è stata spostata o eliminata.\n I file sono stati re-inizializzati.");
            }
            else{
                showMessageDialog(null, "La cartella contenente i dati è stata spostata o eliminata.\n A causa di un errore non è stato possibile ripristinare i dati.\nRiavviare il programma.");
            }
        }
    }
    
    private static boolean initializeDirectory(){
         File f1 = new File(workingDir + File.separator + "data" + File.separator + "centri_vaccinali");
         File f2 = new File(workingDir + File.separator + "data" + File.separator + "cittadini");
         File f3 = new File(workingDir + File.separator + "data" + File.separator + "list");
         
         boolean rf2 = f2.mkdirs();
         boolean rf1 = true;
         boolean rf3 = true;
         
         if(f1.mkdirs()){
             File f11 = new File(workingDir + File.separator + "data" + File.separator + "centri_vaccinali" + File.separator + "CentriVaccinali.dati");
             try{
                boolean rf11 = f11.createNewFile();
             }
             catch(Exception e){
                 showMessageDialog(null, e.toString());
                 rf1 = false;
             }   
         } else{rf1 = false;}

         if(f3.mkdirs()){
             File f13 = new File(workingDir + File.separator + "data" + File.separator + "list" + File.separator + "CentriVaccinali_list.txt");
             try{
                boolean rf13 = f13.createNewFile();
             }
             catch(Exception e){
                 showMessageDialog(null, e.toString());
                 rf3 = false;
             }   
         } else{rf3 = false;}
         
                  
         if(rf1 && rf2 && rf3){
             return true;
         }
         return false;

    }
    
    //Controlli per campi di inserimento
    public static boolean checkProvincia(String p){
        if(p.length()!=2){
            return false;
        }
        return true;
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
            catch(Exception e){
                return false;
            }
        }
    }
    
    public static boolean checkCompiled(String p){
        if(p.length()<4){
            return false;
        }
        return true;
    }
    
    public static boolean checkCivico(String p){
        if(p.length()>0){
            return true;
        }
        return false;
    }
    
    
    
}


