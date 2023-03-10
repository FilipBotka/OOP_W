package org.example.cards;

public class Mancato {
    private double pMancato;
    private double deckMancato;
    private int heapMancato;
    public static final int NUM_OF_CARDS = 71;

    public Mancato(){
        setDeckMancato(15);
        setHeapMancato(0);
    }
    public static void main(String[] args) {
        Mancato a = new Mancato();
        a.Card();
        System.out.println(a.getpMancato());
    }

    private void Card(){
        setpMancato(getDeckMancato()/NUM_OF_CARDS);
    }


    public double getpMancato() {
        return pMancato;
    }

    public void setpMancato(double pMancato) {
        this.pMancato = pMancato;
    }

    public double getDeckMancato() {
        return deckMancato;
    }

    public void setDeckMancato(double deckMancato) {
        this.deckMancato = deckMancato;
    }

    public int getHeapMancato() {
        return heapMancato;
    }

    public void setHeapMancato(int heapMancato) {
        this.heapMancato = heapMancato;
    }
}
