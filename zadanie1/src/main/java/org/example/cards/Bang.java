package org.example.cards;

public class Bang {
    private double pBang;
    private double deckBang;
    private int heapBang;
    public static final int NUM_OF_CARDS = 71;

    public Bang() {
        setDeckBang(30);
        setHeapBang(0);
    }

    public static void main(String[] args) {
        Bang a = new Bang();
        a.Card();
        System.out.println(a.getpBang());
    }

    private void Card(){
        setpBang(getDeckBang()/NUM_OF_CARDS);
        //return 0;
    }

    public double getpBang() {
        return pBang;
    }

    public void setpBang(double pBang) {
        this.pBang = pBang;
    }

    public double getDeckBang() {
        return deckBang;
    }

    public void setDeckBang(double deckBang) {
        this.deckBang = deckBang;
    }

    public int getHeapBang() {
        return heapBang;
    }

    public void setHeapBang(int heapBang) {
        this.heapBang = heapBang;
    }
}
