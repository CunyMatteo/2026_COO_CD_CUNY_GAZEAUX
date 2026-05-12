import donnees.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMagasin {


    private Magasin magasin;

    @BeforeEach
    public void setUp() {
        magasin = new Magasin();
        magasin.ajouteCd(new CD("PLK", "Pocahontas"));
        magasin.ajouteCd(new CD("BOOBA", "Validee"));
        magasin.ajouteCd(new CD("GAZO", "Nanani Nanana"));
    }

    @Test
    public void testTrierParAlbum() {
        magasin.trier(new ComparateurAlbum());

        assertEquals("Nanani Nanana", magasin.getCd(0).getNom());
        assertEquals("Pocahontas", magasin.getCd(1).getNom());
        assertEquals("Validee", magasin.getCd(2).getNom());
    }

    @Test
    public void testTrierParArtiste() {
        magasin.trier(new ComparateurArtiste());

        assertEquals("BOOBA", magasin.getCd(0).getNomArtiste());
        assertEquals("GAZO", magasin.getCd(1).getNomArtiste());
        assertEquals("PLK",     magasin.getCd(2).getNomArtiste());
    }

}