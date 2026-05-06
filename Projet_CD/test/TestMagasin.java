import donnees.CD;
import donnees.Magasin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMagasin {

    @Test
    public void testTrierAlbum() {
        // 1. Création du magasin et des CDs
        Magasin magasin = new Magasin();
        CD cd1 = new CD("plk", "Pocahotas");
        CD cd2 = new CD("booba", "Scarface");
        CD cd3 = new CD("gazo", "Nanani Nanana");

        // 2. Ajout dans le désordre
        magasin.ajouteCd(cd1); // R
        magasin.ajouteCd(cd2); // 2
        magasin.ajouteCd(cd3); // A

        // 3. Appel de la méthode de tri[cite: 30]
        magasin.trierAlbum();

        // 4. Vérification de l'ordre alphabétique des titres[cite: 30]
        // L'ordre doit être : "21" (cd2), puis "Absolution" (cd3), puis "Recto Verso" (cd1)
        assertEquals("Scarface", magasin.getCd(0).getNom(), "Le premier CD devrait être Scarface");
        assertEquals("Nanani Nanana", magasin.getCd(1).getNom(), "Le deuxième CD devrait être Nanani Nanana");
        assertEquals("Pocahotas", magasin.getCd(2).getNom(), "Le troisième CD devrait être Pocahotas");
    }
}