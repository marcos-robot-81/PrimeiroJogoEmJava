package ites.itesDef;

import ites.Iten;

public class ItenDeDefesa extends Iten {


    public ItenDeDefesa(String nomeIten, String tipo, float Def ) {
        super(nomeIten, tipo);
        setDefBonos(Def);
    }
}
