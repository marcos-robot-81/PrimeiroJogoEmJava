package ites.itesHP;

import ites.Iten;

public class itenSob extends Iten {

    public itenSob(String nomeIten, String tipo, float hpBonos, float manaBonos) {
        super(nomeIten, tipo);
        setHpBonos(hpBonos);
        setManaBonos(manaBonos);
    }
}
