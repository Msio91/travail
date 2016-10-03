
public class Capitale {
	//55
	//6655
	//77
	//88
	//Attributs privés
	private String nom;
	private int nbHabitants;
	private int superficie;
	
	//Constructeur
	public Capitale(){
		
	}
	
	public Capitale(String unNom){
		this.nom = unNom;
	}
	
	public Capitale(String unNom, int unNbHabitants){
		this.nom = unNom;
		this.nbHabitants = unNbHabitants;
	}
	
	public Capitale(String unNom, int unNbHabitants, int uneSuperficie){
		this.nom = unNom;
		this.nbHabitants = unNbHabitants;
		this.superficie = uneSuperficie;
	}
	
	//Accesseurs
	public String getUnNom(){
		return this.nom;
	}
	
	public void setUnNom(String unNom){
		this.nom = unNom;
	}
	
	public int getUnNbHabitants(){
		return this.nbHabitants;
	}
	
	public void setUnNbHabiatants(int unNbHabitants){
		this.nbHabitants = unNbHabitants;
	}
	
	public int getUneSuperficie(){
		return this.superficie;
	}
	
	public void setUneSuperficie(int uneSuperficie){
		this.superficie = uneSuperficie;
	}
	
	//Methodes toString()
	public String toString(){
		String chaine = "";
		chaine += "\nLe nom de la capitale est : " + this.nom + "\nNombre d'habitants : " + this.nbHabitants + "\nSuperficie : " + this.superficie;
		return chaine;
	}
	
}
