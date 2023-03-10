package org.example.cards;

public class Stagecoach {
    private double pStagecoach;
    private double deckStagecoach;
    private int heapStagecoach;
    public static final int NUM_OF_CARDS = 71;

    public Stagecoach() {
        setDeckStagecoach(4);
        setHeapStagecoach(0);
    }

    public static void main(String[] args) {
        Stagecoach a = new Stagecoach();
        a.Card();
        System.out.println(a.getpStagecoach());
    }

    private void Card(){
        setpStagecoach(getDeckStagecoach()/NUM_OF_CARDS);
    }

    public double getpStagecoach() {
        return pStagecoach;
    }

    public void setpStagecoach(double pStagecoach) {
        this.pStagecoach = pStagecoach;
    }

    public double getDeckStagecoach() {
        return deckStagecoach;
    }

    public void setDeckStagecoach(double deckStagecoach) {
        this.deckStagecoach = deckStagecoach;
    }

    public int getHeapStagecoach() {
        return heapStagecoach;
    }

    public void setHeapStagecoach(int heapStagecoach) {
        this.heapStagecoach = heapStagecoach;
    }
}

