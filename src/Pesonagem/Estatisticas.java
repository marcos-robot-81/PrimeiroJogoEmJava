package Pesonagem;

import java.lang.reflect.Array;

public class Estatisticas {

    // declaração
    float hp;
    float hpMax;
    float mana;
    float manaMax;
    float xp;
    int leval;
    float akt;
    float def;
    float agilidade;
    Estacias estacias;

    // costruto
    public Estatisticas(float hpMax) {
        this.hpMax = hpMax;
    }
    // Set
    public void setHp(float hp) {
        this.hp = hp;
    }

    public void setHpMax(float hpMax) {
        this.hpMax = hpMax;
    }

    public void setMana(float mana) {
        this.mana = mana;
    }

    public void setManaMax(float manaMax) {
        this.manaMax = manaMax;
    }

    public void setXp(float xp) {
        this.xp = xp;
    }

    public void setLeval(int leval) {
        this.leval = leval;
    }

    public void setAkt(float akt) {
        this.akt = akt;
    }

    public void setDef(float def) {
        this.def = def;
    }

    public void setAgilidade(float agilidade) {
        this.agilidade = agilidade;
    }

    public void setEstacias(Estacias estacias) {
        this.estacias = estacias;
    }
    //get
    public float getHp() {
        return hp;
    }

    public float getHpMax() {
        return hpMax;
    }

    public float getMana() {
        return mana;
    }

    public float getManaMax() {
        return manaMax;
    }

    public float getXp() {
        return xp;
    }

    public int getLeval() {
        return leval;
    }

    public float getAkt() {
        return akt;
    }

    public float getDef() {
        return def;
    }

    public float getAgilidade() {
        return agilidade;
    }

    public Estacias getEstacias() {
        return estacias;
    }
    // outras Comados
}
