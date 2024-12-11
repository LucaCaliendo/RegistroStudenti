package Studente;
import java.util.ArrayList;
import java.util.Scanner;
public class Studente {
	private String nome;
	private String cognome;
	private String matricola;
	//costruttorer 
	public Studente(String nome,String cognome,String matricola) {
		this.nome=nome;
		this.cognome=cognome;
		this.matricola=matricola;
	}
	//metodi get e set
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		
		this.nome=nome;
	}
     public String getCognome() {
    	 return cognome;
     }
     public void setCognome(String cognome) {
    	 this.cognome=cognome;
     }
     public String getMatricola() {
    	 return matricola;
     
     }
     public void setMatricola(String matricola) {
    	 this.matricola=matricola;
     }
     @Override //per sovrascrivere i metodi
     public String toString() {
    	 return "matricola"+matricola+"nome"+nome+"cognome"+cognome;
     }
}
