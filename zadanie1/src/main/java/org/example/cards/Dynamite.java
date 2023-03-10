package org.example.cards;

public class Dynamite {
    private double pDynamite;
    private double deckDynamite;
    private int heapDynamite;
    public static final int NUM_OF_CARDS = 71;

    public Dynamite(){
        setDeckDynamite(1);
        setHeapDynamite(0);
    }

    public static void main(String[] args) {
        Dynamite a = new Dynamite();
        a.Card();
        System.out.println(a.getpDynamite());
    }

    private void Card(){
        setpDynamite(getDeckDynamite()/NUM_OF_CARDS);
    }

    public double getpDynamite() {
        return pDynamite;
    }

    public void setpDynamite(double pDynamite) {
        this.pDynamite = pDynamite;
    }

    public double getDeckDynamite() {
        return deckDynamite;
    }

    public void setDeckDynamite(double deckDynamite) {
        this.deckDynamite = deckDynamite;
    }

    public int getHeapDynamite() {
        return heapDynamite;
    }

    public void setHeapDynamite(int heapDynamite) {
        this.heapDynamite = heapDynamite;
    }
}
