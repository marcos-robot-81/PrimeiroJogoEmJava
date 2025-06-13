// o vedadeiro nome e Estácias.
package Pesonagem;

public class Estacias {
    String tipo;
    float valor;
    int tempo;

    //SET
    public void SetTipo(String tipo){
        this.tipo = tipo;
    }
    public void SetValor(float valor){
        this.valor = valor;
    }
    public void SetTempo(int tempo){
        this.tempo = tempo;
    }
    // GET
    public int getTempo() {
        return tempo;
    }

    public float getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }
    //roda estacias
    public void rodaEstacias(){
        if(valor > 0) {
            tempo--;
        }else {
            return;
        }
    }
    //
}