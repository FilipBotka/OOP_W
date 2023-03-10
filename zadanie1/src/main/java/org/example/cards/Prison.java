package org.example.cards;

public class Prison {
    private double pPrison;
    private double deckPrison;
    private int heapPrison;
    public static final int NUM_OF_CARDS = 71;

    private Prison(){
        setDeckPrison(3);
        setHeapPrison(0);
    }

    public static void main(String[] args) {
        Prison a = new Prison();
        a.Card();
        System.out.println(a.getpPrison());
    }

    private  void Card(){
        setpPrison(getDeckPrison()/NUM_OF_CARDS);
    }

    public double getpPrison() {
        return pPrison;
    }

    public void setpPrison(double pPrison) {
        this.pPrison = pPrison;
    }

    public double getDeckPrison() {
        return deckPrison;
    }

    public void setDeckPrison(double deckPrison) {
        this.deckPrison = deckPrison;
    }

    public int getHeapPrison() {
        return heapPrison;
    }

    public void setHeapPrison(int heapPrison) {
        this.heapPrison = heapPrison;
    }
}
