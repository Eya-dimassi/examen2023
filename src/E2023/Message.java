package E2023;

import java.time.LocalDate;

public class Message extends Billet {
	private String contenu;

	public Message(LocalDate date_pub, String auteur, String contenu) {
		super(date_pub, auteur);
		this.contenu = contenu;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
	

}
