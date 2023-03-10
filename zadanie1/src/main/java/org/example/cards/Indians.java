package org.example.cards;

public class Indians {

    private double pIndians;
    private double deckIndians;
    private int heapIndians;
    public static final int NUM_OF_CARDS = 71;

    public Indians(){
        setDeckIndians(2);
        setHeapIndians(0);
    }

    public static void main(String[] args) {
        Indians a = new Indians();
        a.Card();
        System.out.println(a.getpIndians());
    }

    private void Card(){
        setpIndians(getDeckIndians()/NUM_OF_CARDS);
    }

    public double getpIndians() {
        return pIndians;
    }

    public void setpIndians(double pIndians) {
        this.pIndians = pIndians;
    }

    public double getDeckIndians() {
        return deckIndians;
    }

    public void setDeckIndians(double deckIndians) {
        this.deckIndians = deckIndians;
    }

    public int getHeapIndians() {
        return heapIndians;
    }

    public void setHeapIndians(int heapIndians) {
        this.heapIndians = heapIndians;
    }
}
