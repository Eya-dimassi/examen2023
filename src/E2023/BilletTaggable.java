package E2023;

import java.time.LocalDate;
import java.util.Arrays;

public class BilletTaggable  extends Billet implements Taggable {
	private String [] LTags;
	private  int nbTags;
	public BilletTaggable(LocalDate date_pub, String auteur, int capacite) {
		super(date_pub, auteur);
		LTags =new String[capacite];
		this.nbTags = 0;
	}
	@Override
	public String toString() {
		return "BilletTaggable [LTags=" + Arrays.toString(LTags) + ", nbTags=" + nbTags + "]";
	}
	public void ajoutTag(String tag) {
		for(int i=0;i<nbTags;i++) {
			if(LTags[i].equals(tag)==false ) {
				LTags[nbTags++]=tag;
				
			}else {
				System.out.println("tag deja existe ");
			}
		}
		
	}
	public void supprimeTag(String tag) {
		int p=-1;
		for(int i=0;i<nbTags;i++) {
			if(LTags[i].equals(tag)) {
				p=i;
				
			}
		}
		if (p != -1) {
            for (int i = p; i < nbTags - 1; i++) {
                LTags[i] =LTags[i + 1];
            }
            LTags[nbTags - 1] = null; 
        } else {
            System.out.println("le tag n'est pas trouvé");
        }
		
	}
	@Override
	public int rechercheTag(String tag) {
		for(int i=0;i<nbTags;i++) {
			if(LTags[i].equals(tag)) {
				return i;
			}
		}
		return -1;
	}
	public int nombreTags() {
		return nbTags;
	}
	
	
	
	

}
