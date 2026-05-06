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