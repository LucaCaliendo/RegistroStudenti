package Studente;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList;

public class RegistroStudenti {
    private ArrayList<Studente> studenti;//studente è l oggetto e 
    // Costruttore
    public RegistroStudenti() {
        studenti = new ArrayList<>(); //studenti il nome della lista
    }

    // Metodo  aggiungi  studente che passa tre paramentri
    public void aggiungiStudente(String nome, String cognome, String matricola) {
        
    	//con un ciclo for each serve a scorrere la lista dell'oggetto studente e fa un confronto della matricola
    	// dello studente è presente gia nel registro
        for (Studente s : studenti) {
            if (s.getMatricola().equals(matricola)) {
                System.out.println("Errore: la matricola è già associata a uno studente.");
                return; //esce perchè univoca la matricola
            }
        }
       //se la matricola non corrisponde ad nessun altro studente aggiunge lo studente
        // Aggiungi lo studente all'ArrayList
        studenti.add(new Studente(nome, cognome, matricola));
        System.out.println("Studente aggiunto con successo.");
    }

    // Metodo per visualizzare tutti gli studenti
    public void visualizzaStudenti() {
        if (studenti.isEmpty()) { 
        	//controlla se la lista studenti è vuota allora stampa un mexx che non ci sono studenti nel registro
            System.out.println("Non ci sono studenti nel registro.");
        } else {//altrimenti  si stampa prima elenco studenti
            System.out.println("\nElenco degli studenti:");
            for (Studente s : studenti) {
                System.out.println(s);
                //e poi si fa un for each per stampare tutto l elenco degli studenti presenti nel registro
            }
        }
    }

    // Metodo per cercare uno studente tramite matricola
    public void cercaStudente(String matricola) {
        boolean trovato = false; 
        //si fa un for each per controllare tutti gli studenti 
       
        for (Studente s : studenti) { 
        //	e poi controlla se la matricola inserita in ingresso corrisponde ad una inserita in ingresso
            if (s.getMatricola().equals(matricola)) {
            	//singolo studente.getmatricola (elemento univoco di ogni studenti).equals matricola
                //se la matricola corrisponde stampo lo studente e setto il boolean a true 
            	//ed esco dal for 
            	System.out.println("Studente trovato: " + s);
                trovato = true;
                break;
            }
        }

        if (!trovato) { //se trovato è falso //stampa  lo studente con matricola non trovato
            System.out.println("Studente con matricola " + matricola + " non trovato.");
        }
    }
}