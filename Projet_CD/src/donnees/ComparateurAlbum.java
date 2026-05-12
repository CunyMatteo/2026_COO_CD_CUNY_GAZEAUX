package donnees;

public class ComparateurAlbum implements ComparateurCd{

    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        boolean res = false;
        if (cd1.getNom().compareTo(cd2.getNom()) > 0) {
            res = true;
        }
        return res;
    }
}
