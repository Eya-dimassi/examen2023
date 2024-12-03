package E2023;
import java.time.LocalDate;
public class Billet implements Publiable  {
	private LocalDate date_pub;
	private String auteur;
	public Billet(LocalDate date_pub, String auteur) {
		this.date_pub = date_pub;
		this.auteur = auteur;
	}
	@Override
	public String toString() {
		return "Billet [date_pub=" + date_pub + ", auteur=" + auteur + "]";
	}
	@Override
	public LocalDate getDatePublication() {
		
		return null;
	}
	@Override
	public String getAuteur() {
		
		return null;
	}
	
	
	
	

}
