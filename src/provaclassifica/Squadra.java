/*
 * Squadra con punti in classifica.
 */
package provaclassifica;

/**
 *
 * @author Docente
 */
public class Squadra implements Comparable<Squadra>{
    
    String nome;
    int punteggio;

    public Squadra(String nome, int punteggio) {
        this.nome = nome;
        this.punteggio = punteggio;
    }

    @Override
    public String toString() {
        return "Squadra{" + "nome=" + nome + ", punteggio=" + punteggio + '}';
    }

    public String getNome() {
        return nome;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    @Override
    public int compareTo(Squadra t) {
        // return this.nome.compareToIgnoreCase(t.getNome());
        if (this.punteggio>t.getPunteggio()) return 1;
        else if (this.punteggio<t.getPunteggio()) return -1;
        else return 0;
    }
    
    
    
    
}
