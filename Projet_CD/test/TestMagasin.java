import donnees.CD;
import donnees.Magasin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMagasin {

    @Test
    public void testTrierAlbum() {
        // Arrange : création du magasin et ajout de CDs dans le désordre
        Magasin magasin = new Magasin();
        magasin.ajouteCd(new CD("Zelda"));
        magasin.ajouteCd(new CD("Mario"));
        magasin.ajouteCd(new CD("Animal Crossing"));

        // Act : tri
        magasin.trierAlbum();

        // Assert : vérification de l'ordre alphabétique
        assertEquals("Animal Crossing", magasin.getNomCd(0));
        assertEquals("Mario", magasin.getNomCd(1));
        assertEquals("Zelda", magasin.getNomCd(2));
    }
}