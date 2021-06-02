/**
 * 
 * @author Andrea Mottini 742605 VA
 * @author Riccardo Bianchi 736701 VA
 * 
 */

package cittadini;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author Riccardo
 */
public class Cittadini {
    private String userID;
    private String nome;
    private String cognome;
    private String email;
    private String cod_fiscale;
    Scanner scn = new Scanner (System.in);

    /**
     *
     */
    public Cittadini(){};
    
    /**
     *
     * @param uid
     * @param n
     * @param pwd
     * @param c
     * @param e
     * @param cf
     */
    public Cittadini(String uid,String n,String pwd,String c,String e,String cf){
        this.userID = uid;
        this.nome = n;
        this.cognome =c;
        this.email = e;
        this.cod_fiscale =cf;
    }
    
    //Set Campi Classe Cittadino

    /**
     *
     * @param userID
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @param cognome
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param cod_fiscale
     */
    public void setCod_fiscale(String cod_fiscale) {
        this.cod_fiscale = cod_fiscale;
    }
   
    
    //Get Campi Classe Cittadino

    /**
     *
     * @return
     */
    public String getUserID() {
        return userID;
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @return
     */
    public String getCognome() {
        return cognome;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return
     */
    public String getCod_fiscale() {
        return cod_fiscale;
    }

    //Metodi
    //Check Information
    private boolean checkNome (String nome) {
        String pattern = "^[A-Z][a-z]+";
        if(nome.matches(pattern))
            return false;
        else {
            if(nome.isEmpty()){
                System.out.println("Inserire il nome");
            }
            else{
                System.out.println("Errore! Il nome deve iniziare con una maiuscola e non può contenere numeri o caratteri speciali!");
            }
            return true;
        }
    }
    private boolean checkCognome (String cognome) {
        String pattern = "^[A-Z][a-z]+";
        if(cognome.matches(pattern))
            return false;
        else {
            if(cognome.isEmpty()){
                System.out.println("Inserire il cognome");
            }
            else{
                System.out.println("Errore! Il cognome deve iniziare con una maiuscola e non può contenere numeri o caratteri speciali!");
            }
            return true;
        }
    }
    private boolean checkEmail(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }
    
    
}
