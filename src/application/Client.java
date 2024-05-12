package application;

public class Client {
	private int idC;
	private String nom;
	private String prenom;
	private int tel;
	private String adresse;
	public Client( String nom,String prenom, int tel, String adresse) {
		this.nom = nom;
		this.tel = tel;
		this.prenom=prenom;
		this.adresse = adresse;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getIdC() {
		return idC;
	}
	public void setIdC(int idC) {
		this.idC = idC;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Client [idC=" + idC + ", nom=" + nom + ", tel=" + tel + ", adresse=" + adresse + "]";
	}
	
	
}
