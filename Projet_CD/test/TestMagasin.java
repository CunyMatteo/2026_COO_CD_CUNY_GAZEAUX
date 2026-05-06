import donnees.CD;
import donnees.Magasin;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMagasin {

    @Test
    public void testTrierAlbum() {

        Magasin magasin = new Magasin();
        CD cd1 = new CD("plk", "Pocahotas");
        CD cd2 = new CD("booba", "Scarface");
        CD cd3 = new CD("gazo", "Nanani Nanana");

        magasin.ajouteCd(cd1); // R
        magasin.ajouteCd(cd2); // 2
        magasin.ajouteCd(cd3); // A

        magasin.trierAlbum();

        assertEquals("Nanani Nanana", magasin.getCd(0).getNom(), "Le deuxième CD devrait être Nanani Nanana");
        assertEquals("Pocahotas", magasin.getCd(1).getNom(), "Le troisième CD devrait être Pocahotas");
        assertEquals("Scarface", magasin.getCd(2).getNom(), "Le premier CD devrait être Scarface");
    }
    @Test
    public void testTrierArtiste() {
        // 1. Initialisation
        Magasin magasin = new Magasin();
        magasin.ajouteCd(new CD("plk", "Pocahontas"));
        magasin.ajouteCd(new CD("booba", "Scarface"));
        magasin.ajouteCd(new CD("gazo", "Nanani Nanana"));

        // 2. Action
        ArrayList<CD> resultat = magasin.trierParArtiste();

        // 3. Vérification de l'ordre (B -> G -> P)
        assertEquals("booba", resultat.get(0).getNomArtiste(), "Le premier artiste devrait être Booba");
        assertEquals("gazo", resultat.get(1).getNomArtiste(), "Le deuxième artiste devrait être Gazo");
        assertEquals("plk", resultat.get(2).getNomArtiste(), "Le troisième artiste devrait être PLK");
    }
}