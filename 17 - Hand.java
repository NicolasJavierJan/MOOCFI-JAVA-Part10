/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */

import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;
    
    public Hand(){
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        for (Card card : this.hand){
            System.out.println(card.toString());
        }
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    public int valueOfCards(){
        int sum = 0;
        for (Card card : this.hand){
            sum = sum + card.getValue();
        }
        
        return sum;
    }
    
    public int compareTo(Hand hand){
        return this.valueOfCards() - hand.valueOfCards();
    }
    
    public void sortBySuit(){
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
}
