package ites.itesATK;

import ites.Iten;

public class ItenDeATK extends Iten {


    public ItenDeATK(String nomeIten, String tipo, float atkBonos) {
        super(nomeIten, tipo);
        setAtkBonos(atkBonos);
    }
}
