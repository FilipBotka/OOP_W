package org.example.cards;

public class Beer {
    private double pBeer;
    private double deckBeer;
    private int heapBeer;
    public static final int NUM_OF_CARDS = 71;

    public Beer(){
        setDeckBeer(8);
        setHeapBeer(0);
    }
    public static void main(String[] args) {
        Beer a = new Beer();
        a.Card();
        System.out.println(a.getpBeer());
    }

    private void Card(){
        setpBeer(getDeckBeer()/NUM_OF_CARDS);
    }

    public double getpBeer() {
        return pBeer;
    }

    public void setpBeer(double pBeer) {
        this.pBeer = pBeer;
    }

    public double getDeckBeer() {
        return deckBeer;
    }

    public void setDeckBeer(double deckBeer) {
        this.deckBeer = deckBeer;
    }

    public int getHeapBeer() {
        return heapBeer;
    }

    public void setHeapBeer(int heapBeer) {
        this.heapBeer = heapBeer;
    }
}
