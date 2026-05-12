package donnees;

import java.util.ArrayList;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 * 
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 * 
 */
public class Magasin {

	/**
	 * la liste des CDs disponibles en magasin
	 */
	private ArrayList<CD> listeCds;

	/**
	 * construit un magasin par defaut qui ne contient pas de CD
	 */
	public Magasin() {
		listeCds = new ArrayList<CD>();
	}

	/**
	 * ajoute un cd au magasin
	 * 
	 * @param cdAAjouter
	 * le cd a ajouter
	 */
	public void ajouteCd(CD cdAAjouter) {
		listeCds.add(cdAAjouter);
	}

	@Override
	/**
	 * affiche le contenu du magasin
	 */
	public String toString() {
		String chaineResultat = "";
		//parcours des Cds
		for (int i = 0; i < listeCds.size(); i++) {
			chaineResultat += listeCds.get(i);
		}
		chaineResultat += "nb Cds: " + listeCds.size();
		return (chaineResultat);

	}

	/**
	 * @return le nombre de Cds du magasin
	 */
	public int getNombreCds() {
		return listeCds.size();
	}
	
	/**
	 * permet d'acceder � un CD
	 * 
	 * @return le cd a l'indice i ou null si indice est non valide
	 */
	public CD getCd(int i)
	{
		CD res=null;
		if ((i>=0)&&(i<this.listeCds.size()))
			res=this.listeCds.get(i);
		return(res);
	}

	public void trierAlbum() {
		for (int i = 0; i < listeCds.size() - 1; i++) {
			for (int j = i + 1; j < listeCds.size(); j++) {
				CD cd1 = listeCds.get(i);
				CD cd2 = listeCds.get(j);

				if (cd1.getNom().compareTo(cd2.getNom()) > 0) {
					listeCds.set(i, cd2);
					listeCds.set(j, cd1);
				}
			}
		}
	}


	public ArrayList<CD> trierParArtiste() {
		ArrayList<CD> listeTriee = new ArrayList<>();
		ArrayList<CD> copieListe = new ArrayList<>(this.listeCds);

		while (!copieListe.isEmpty()) {
			int indiceMin = 0;

			for (int i = 1; i < copieListe.size(); i++) {
				// On compare les noms des artistes (en ignorant la casse)
				String artisteI = copieListe.get(i).getNomArtiste();
				String artisteMin = copieListe.get(indiceMin).getNomArtiste();

				if (artisteI.compareToIgnoreCase(artisteMin) < 0) {
					indiceMin = i;
				}
			}

			// Déplacement du CD trouvé vers la liste triée
			listeTriee.add(copieListe.remove(indiceMin));
		}

		return listeTriee;
	}

	public void trier(ComparateurCd comp){


	}
}
