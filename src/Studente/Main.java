package Studente;

import java.util.Scanner;

public class Main {
	// si richiama sia il registrostudenti la classe registro e lo scanner
	private static RegistroStudenti registro = new RegistroStudenti();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int scelta;// mi dichiaro una variabile scelta che andro a modificare ogni qualvolta che l
					// utente andra a modifciare un numero

		do { // mi creo il menu da far vedere all utente con le varie opzioni di scelta

			System.out.println("\nMenu:");
			System.out.println("1. Aggiungere uno studente");
			System.out.println("2. Visualizzare tutti gli studenti");
			System.out.println("3. Cercare uno studente per matricola");
			System.out.println("4. Uscire");
			System.out.print("Scegli un'opzione: ");
			scelta = scanner.nextInt(); //
			scanner.nextLine(); // va direttamente avanti

			//
			switch (scelta) { // inseriamo tutti i casi
			case 1:
				aggiungiStudente();
				break; // esce
			case 2:
				visualizzaStudenti();
				break;
			case 3:
				cercaStudente();
				break;
			case 4:
				System.out.println("Uscita dal programma...");
				break;
			default:
				System.out.println("Scelta non valida. Riprova.");
				break;
			}
		} while (scelta != 4); // diverso da 4 massimo 4
	}

	// Metodo per aggiungere uno studente
	private static void aggiungiStudente() {
		System.out.print("Inserisci il nome dello studente: ");
		String nome = scanner.nextLine();
		System.out.print("Inserisci il cognome dello studente: ");
		String cognome = scanner.nextLine();
		System.out.print("Inserisci la matricola dello studente: ");
		String matricola = scanner.nextLine();

		registro.aggiungiStudente(nome, cognome, matricola);
	}

	// Metodo per visualizzare tutti gli studenti
	private static void visualizzaStudenti() {
		registro.visualizzaStudenti();
	}

	// Metodo per cercare uno studente tramite matricola
	private static void cercaStudente() {
		System.out.print("Inserisci la matricola dello studente da cercare: ");
		String matricola = scanner.nextLine();

		registro.cercaStudente(matricola);
	}
}