package Prof;

public class Personne {
	String nom;
	String Prenom;
	
	public Personne(String nom, String Prenom) {
		this.nom = nom;
		this.Prenom = Prenom;
	}
	
	public Personne(String Prenom) {
		this.Prenom = nom;
		this.nom = "";
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String toString() {
		if(nom.length()== 0) {
			return this.Prenom;
		}
		return this.nom + "" + this.Prenom;
	}
	
}
