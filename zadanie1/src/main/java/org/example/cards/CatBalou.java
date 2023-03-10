package org.example.cards;

public class CatBalou {
    private double pCatBalou;
    private double deckCatBalou;
    private int heapCatBalou;
    public static final int NUM_OF_CARDS = 71;

    public CatBalou(){
        setDeckCatBalou(6);
        setHeapCatBalou(0);
    }

    public static void main(String[] args) {
        CatBalou a = new CatBalou();
        a.Card();
        System.out.println(a.getpCatBalou());
    }

    private void Card(){
        setpCatBalou(getDeckCatBalou()/NUM_OF_CARDS);
    }

    public double getpCatBalou() {
        return pCatBalou;
    }

    public void setpCatBalou(double pCatBalou) {
        this.pCatBalou = pCatBalou;
    }

    public double getDeckCatBalou() {
        return deckCatBalou;
    }

    public void setDeckCatBalou(double deckCatBalou) {
        this.deckCatBalou = deckCatBalou;
    }

    public int getHeapCatBalou() {
        return heapCatBalou;
    }

    public void setHeapCatBalou(int heapCatBalou) {
        this.heapCatBalou = heapCatBalou;
    }
}
