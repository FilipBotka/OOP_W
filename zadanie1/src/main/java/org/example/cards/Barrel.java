package org.example.cards;

public class Barrel {
    private double pBarrel;
    private double deckBarrel;
    private int heapBarrel;
    public static final int NUM_OF_CARDS = 71;

    public Barrel(){
        setDeckBarrel(2);
        setHeapBarrel(0);
    }

    public static void main(String[] args) {
        Barrel a = new Barrel();
        a.Card();
        System.out.println(a.getpBarrel());
    }

    private void Card(){
        setpBarrel(getDeckBarrel()/NUM_OF_CARDS);
    }

    public double getpBarrel() {
        return pBarrel;
    }

    public void setpBarrel(double pBarrel) {
        this.pBarrel = pBarrel;
    }

    public double getDeckBarrel() {
        return deckBarrel;
    }

    public void setDeckBarrel(double deckBarrel) {
        this.deckBarrel = deckBarrel;
    }

    public int getHeapBarrel() {
        return heapBarrel;
    }

    public void setHeapBarrel(int heapBarrel) {
        this.heapBarrel = heapBarrel;
    }
}
