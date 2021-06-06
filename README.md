# CovidFree - Laboratorio Interdisciplinare A
Il progetto è stato svolto come esame presso l'università degli studi dell'Insubria ed è volto al tracciamento
degli eventi avversi post vaccini Covid-19.
<br><br>

![Logo](https://github.com/m00tt/CovidFree/blob/main/MD%20Images/logo.png)


# Versioning
Data rilascio | Versione | Descrizione 
------------  | ------------- | ------------------ 
11/06/2021    | <a href="https://github.com/m00tt/CovidFree/tree/main/CovidFree%20versioning">v1.1</a> | Prima release


# Autori
Nome | Ruolo
------------ | -------------
Andrea Mottini | Project Manager - GUI/UE Designer - Developer
Riccardo Bianchi | GUI/UE Designer - Developer

# CovidFree - Manuale Utente
## 1. Installazione
### 1.1. Requisiti di Sistema
Applicazione multipiattaforma sviluppata in linguaggio Java (Java 8) <br>

Windows 10 / macOS (Lion o superiore)
* Java (versione 8 e successive)

<br>
Per eseguire l’applicazione è necessario installare Java JDK 12 o superiore (Download)<br>
Premere su “JDK Download” e selezionare la versione adatta al proprio sistema operativo.
<br><br>

NOTA: 
L’applicazione è stata sviluppata e testata in ambiente Windows 10 e in ambiente macOS BigSur (11.3.1).
Non si garantisce il corretto funzionamento dell’applicazione sugli altri sistemi operativi.

### 1.2. Installazione Programma
Il programma non necessita di particolari attività di installazione.
La procedura di avviamento di CovidFree è la stessa per tutti i sistemi operativi compatibili e verrà descritta nel paragrafo successivo.

## 2. Esecuzione ed Uso
## 2.1. Setup e Lancio del programma
Per avviare l’applicazione è sufficiente fare doppio clic su “CovidFree.jar”, o in alternativa, dopo essersi spostati nella cartella corretta, tramite prompt dei comandi (CMD – Windows / Terminale macOS) digitare il seguente comando:

![Avvio](https://github.com/m00tt/CovidFree/blob/main/MD%20Images/avvio.png)

## 2.2. TroubleShooting
In caso di malfunzionamenti dell’applicativo è necessario:
* Assicurarsi di aver installato correttamente Java
* Assicurarsi di avere una versione di Sistema Operativo compatibile
* Provare ad avviare l’applicativo da Linea di comando

Nel caso ci fossero malfunzionamenti o Bug non risolvibili è possibile segnalare la problematica al gruppo di sviluppo attraverso la piattaforma GitHub.


## 2.3.	Uso delle Funzionalità
### CovidFree – Main Menù
All’avvio l’applicazione CovidFree si presenterà con la seguente schermata

![Home](https://github.com/m00tt/CovidFree/blob/main/MD%20Images/home.png)


A seguito della selezione da parte dell’utente potranno essere avviate due applicazioni distinte:
* Centri Vaccinali (target utilizzo: Operatore Sanitario)
  * Possibilità di Registrare un nuovo Centro Vaccinale.
  * Possibilità di Registrare un nuovo Vaccinato.
* Cittadini (target utilizzo: Utente privato)
  * Possibilità di visualizzare le informazioni dei vari centri vaccinali (filtrandoli per: Nome, Comune e Tipologia).
  * Possibilità di effettuare un Login (Accesso) e segnalare Eventi Avversi riscontrati a seguito del vaccino.

### Centri Vaccinali
La schermata presenterà due scelte:
1. Registra Centro Vaccinale
2. Registra Vaccinato

![Centri Vaccinali](https://github.com/m00tt/CovidFree/blob/main/MD%20Images/home_centrivaccinali.png)

Premere sui relativi pulsanti per accedere alla schermata inerente alla funzione richiesta


#### Registra Centro Vaccinale
La funzione Registra Centro Vaccinale permette, agli utenti di competenza, di poter registrare un nuovo Centro Vaccinale ed aggiungerlo alla lista di quelli già presenti, rendendolo accessibile dall’applicazione Cittadini.

![Registra Centro Vaccinale](https://github.com/m00tt/CovidFree/blob/main/MD%20Images/registra_centrovaccinale.png)


Come registrare un nuovo Centro vaccinale? <br>
Per registrare e salvare un nuovo centro vaccinale procedere come segue:
1. Compilare TUTTI i campi richiesti nella schermata
   * Nome Centro Vaccinale (da 3 a 40 caratteri)
   * Tipologia (Ospedaliero/Aziendale/Hub)
   * Indirizzo (da 3 a 40 caratteri)
     1. Qualificatore (Via/Viale/Piazza)
     2. Indirizzo (da 3 a 40 caratteri)
     3. Civico (compreso tra 1 e 5 cifre)
   * Provincia (sigla della provincia – massimo 2 caratteri)
   * Comune (da 3 a 40 caratteri)
   * CAP (lunghezza statica 5 cifre) <br>
   NB: L’applicazione segnalerà eventuali errori di compilazioni indicandone il motivo

2. Premere infine su "Aggiungi"

#### Registra Vaccinato
La funzione Registra Vaccinato permette di poter registrare un nuovo cittadino vaccinato presso il centro vaccinale di competenza.

![Registra Vaccinato](https://github.com/m00tt/CovidFree/blob/main/MD%20Images/registra_vaccinato.png)


Come registrare un nuovo Vaccinato?<br>
Per registrare un nuovo vaccinato procedere come segue:
1.	Utilizzando il menu a tendina Nome Centro Vaccinale selezionare il centro vaccinale desiderato <br>
    NB: Verranno visualizzati solamente i centri registrati in precedenza
2.	Compilare i dati anagrafici e le informazioni richieste dalla schermata
    * Nome (da 3 a 40 caratteri)
    * Cognome (da 3 a 40 caratteri)
    * Codice Fiscale 
    * Selezionare il vaccino effettuato
    * Inserire la data di vaccinazione (Formato gg/mm/aaaa)
    * Inserire ID Vaccino (codice univoco di 16 cifre) <br><br>

NB: L’applicazione segnalerà eventuali errori di compilazioni indicandone il motivo

3.	Premere infine su “Aggiungi”

### Cittadini

La Home Cittadini permette agli utenti di eseguire le funzioni di:
* Registrazione all’applicazione
* Visualizzazione informazioni Centro Vaccinale
* Ricerca Centro Vaccinale (per Nome o Comune/Tipologia)
* Registrazione Evento Avverso (a seguito di Login)

La schermata si presenta come segue:

![Home Cittadini](https://github.com/m00tt/CovidFree/blob/main/MD%20Images/home_cittadini.png)


#### Ricerca Centro Vaccinale
Sfruttando i filtri di ricerca sarà possibile effettuare la ricerca di un Centro Vaccinale per: 
* Nome (figura A)
* Comune e Tipologia (figura B)

![Ricerca](https://github.com/m00tt/CovidFree/blob/main/MD%20Images/ricerca.png)


In base alle informazioni inserite nei filtri la Lista dei centri verrà aggiornata automaticamente.

#### Visualizzazione Centro Vaccinale

Effettuando un doppio click su un qualsiasi centro vaccinale, presente nella lista, potremo visualizzare, in una nuova finestra, tutte le informazioni relative ad esso.

![Lista](https://github.com/m00tt/CovidFree/blob/main/MD%20Images/lista.png)

Verranno dunque visualizzate le Generalità del centro selezionato ed il Prospetto contenente il numero di segnalazioni e la severità media degli eventi avversi registrati dai cittadini vaccinati. 

![Dettaglio](https://github.com/m00tt/CovidFree/blob/main/MD%20Images/dettaglio.png)

#### Iscrizione

Per effettuare l’iscrizione al sistema sarà necessario premere sul pulsante “Iscriviti”.
Verrà successivamente visualizzato il seguente Form di registrazione

![Iscrizione](https://github.com/m00tt/CovidFree/blob/main/MD%20Images/registra_nuovocittadino.png)

Come Registrarsi? <br>
1. Selezionare il centro vaccinale desiderato utilizzando il menu a tendina
2. Compilare tutti i campi richiesti dalla schermata
   * Nome (da 3 a 40 caratteri)
   * Cognome (da 3 a 40 caratteri)
   * Indirizzo E-Mail (da 3 a 40 caratteri)
   * Codice Fiscale 
   * User ID (da 3 a 8 caratteri)
   * Password <br>
     NB: La password, per essere valida dovrà rispettare i seguenti criteri <br>
     1. Lunghezza minima di 8 caratteri
     2. Almeno una lettera maiuscola
     3. Almeno un numero ed un carattere speciale

   * Inserire l’ID Vaccino fornito durante la vaccinazione (ID univoco di 16 cifre) <br>
   NB: L’applicazione segnalerà eventuali errori di compilazioni indicandone il motivo

3. Premere infine sul pulsante "Aggiungi"

#### Registra Evento
La funzionalità Registra Evento permette di inserire e registrare un qualsiasi evento avverso contratto a seguito del vaccino.
Per poter registrare un evento è necessario essere Iscritti all’applicazione.



Come registrare un Evento Avverso?
1. Identificarsi all'interno dell'applicazione <br>

   ![Login](https://github.com/m00tt/CovidFree/blob/main/MD%20Images/login.png)<br>
   ATTENZIONE: utilizzare User ID e password forniti durante la fase di registrazione.<br> 
   Il campo User ID NON è Case Sensitive, è dunque possibile inserire il nome utente senza rispettare caratteri maiuscoli o minuscoli.
   
2. Compilare le informazioni richieste come segue:
   * Evento Riscontrato – Inserire il nome dell’evento (es. Mal di testa, Stanchezza, Labirintite, ...)
   * Severità – In base al grado di severità selezionare un valore
   * Descrizione – Descrizione dettagliata evento riscontrato (da 8 ad un massimo di 256 caratteri) <br>
   NB: La schermata di registrazione evento, grazie alla funzionalità di Login, mostrerà automaticamente User ID e Centro Vaccinale dell’utente che ha effettuato l’accesso.
   
   
   ![Registra Evento](https://github.com/m00tt/CovidFree/blob/main/MD%20Images/registra_evento.png)
   
3. Premere infine su “Registra” per confermare la registrazione dell’evento

# 3.	Limiti della soluzione sviluppata

I due limiti principali della soluzione sviluppata sono:

1. Assenza di un Database <br>
L’applicazione CovidFree non dispone di un Database centralizzato per la condivisione dei dati.

Le informazioni vengono memorizzate tramite l’utilizzo di file locali creando quindi un’inconsistenza dati tra le applicazioni eseguite su diversi dispositivi.

Ciò comporta un maggiore rischio riguardo la persistenza dei dati, in quanto gli utenti, avendo pieno accesso alla cartella in cui vengono scritte le informazioni, hanno potenzialmente la possibilità di eliminare accidentalmente i file su cui lavora CovidFree. 
Non si dispone, inoltre, della possibilità di effettuare Backup/Restore dei dati.

A seguito di queste limitazioni è stata implementata la funzionalità di ricostruzione automatica della gerarchia di cartelle e file nel caso in cui queste venissero eliminate in modo da non provocare errori durante l’utilizzo dell’applicazione. 

ATTENZIONE: questa funzionalità NON comporta il ripristino dei dati eliminati, ma solamente la creazione delle cartelle e dei file necessari al corretto funzionamento dell’applicazione.


2. Problemi di sicurezza <br>

Utilizzando file locali per la memorizzazione gli utenti hanno pieno accesso alle informazioni registrate su di essi.

Tali informazioni, ad eccezione della password utente (criptata in SHA-256), possono essere visualizzate in chiaro all’interno del file .dati generato per la gestione degli utenti iscritti all’app.








# 4.	Sitografia/Bibliografia

Per lo sviluppo dell’applicazione sono stati consultati i seguenti siti:
* Stack Overflow - https://stackoverflow.com
* Oracle Documentation - https://docs.oracle.com/javase/7/docs/api/




