package E2023;

public class Blog {
	private String titre;
	private Publiable[]LBillets;
	private int nbBillets;
	public Blog(String titre,int capacite, int nbBillets) {
		this.titre = titre;
		LBillets = new Publiable[capacite];
		this.nbBillets = nbBillets;
	}
	void post(Publiable billet) throws InvalidURLException{
		if(billet instanceof Video) {
			Video vid=(Video)billet;
			if(!vid.getUrl().startsWith("https")) {
				throw new InvalidURLException();
			}
		}if(nbBillets<LBillets.length) {
			LBillets[nbBillets]=billet;
		}else {
			System.out.println("tableau est plein");
		}
		
	}
	int getNombreBilletsTaggables() {
		int nb=0;
		 for(int i=0;i<nbBillets;i++) {
	            if(LBillets[i] instanceof BilletTaggable) {
	                nb++;
	            }
	        }
	        return nb;
		
	}
	Publiable[] RechercheBilletsTaggablesParAuteur(String auteur) {
		int nbb=0;
		for(int i =0;i<nbBillets;i++) {
		    if(LBillets[i] instanceof BilletTaggable && LBillets[i].getAuteur().equals(auteur)) {
		        nbb++;
		    }
		}
		Publiable[] TabAut= new Publiable[nbb];
		for(int j=0;j<nbBillets;j++) {
			if(LBillets[j] instanceof BilletTaggable && LBillets[j].getAuteur().equals(auteur)) {
		        TabAut[nbb++] = LBillets[j];
		    }
			
			
		}
		return TabAut;
		
		
	}
	Publiable getPlusRécentBillet() {
		Publiable premier =LBillets[0];
		for(int i=0;i<nbBillets;i++) {
			if(LBillets[i].getDatePublication().isAfter(premier.getDatePublication())) {
				premier=LBillets[i];
			}
			
		}
		return premier;
	}
	

}
