package ites;

public class Iten {
    private String nomeIten;
    private String tipo;
    private float atkBonos;
    private float defBonos;
    private float hpBonos;
    private float manaBonos;

    public float getManaBonos() {
        return manaBonos;
    }

    public void setManaBonos(float manaBonos) {
        this.manaBonos = manaBonos;
    }

    public Iten(){};
    public Iten(String nomeIten,String tipo){
        this.nomeIten = nomeIten;
        this.tipo = tipo;
    };


    // get e set//
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getAtkBonos() {
        return atkBonos;
    }

    public void setAtkBonos(float atkBonos) {
        this.atkBonos = atkBonos;
    }

    public float getDefBonos() {
        return defBonos;
    }

    public void setDefBonos(float defBonos) {
        this.defBonos = defBonos;
    }

    public float getHpBonos() {
        return hpBonos;
    }

    public void setHpBonos(float hpBonos) {
        this.hpBonos = hpBonos;
    }

    public String getNomeIten() {
        return nomeIten;
    }

    public void setNomeIten(String nomeIten) {
        this.nomeIten = nomeIten;
    }
}
