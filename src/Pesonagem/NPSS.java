package Pesonagem;

public class NPSS {
    private String nome;
    private float hp;
    float atk;
    float def;
    Float mana;
    String Profição;
    boolean carate ;

    //cria são base
    public NPSS(String nome, float hp, float atk, float def, float mana) {
        this.nome = nome;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.mana = mana;
    }
    //não atacavel
    public NPSS(String nome, float hp, float atk, float def,String profição) {
        this.nome = nome;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.Profição = profição;
    }
    //criação combleta
    public NPSS(String nome, float hp, float atk, float def,String profição,boolean carate,float mana) {
        this.nome = nome;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.Profição = profição;
        this.carate = carate;
        this.mana = mana;
    }
    // vendedo
    public NPSS(String nome, float hp, float atk, float def){
        this.nome = nome;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

}
